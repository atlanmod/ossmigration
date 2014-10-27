package m2m.googlecode2github;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

public class GoogleCode2GitHub {

	
	public void transform(String googlecodeMM, 
						  String githubMM, 
						  String googlecodeM, 
						  String githubM, 
						  String transformationAsm) {
	
		try {
			/*
			 * Initializations
			 */
			ILauncher transformationLauncher = new EMFVMLauncher();
			ModelFactory modelFactory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			IExtractor extractor = new EMFExtractor();
			
			/*
			 * Load metamodels
			 */
			IReferenceModel googlecodeMetamodel = modelFactory.newReferenceModel();
			injector.inject(googlecodeMetamodel, googlecodeMM);
			IReferenceModel githubMetamodel = modelFactory.newReferenceModel();
			injector.inject(githubMetamodel, githubMM);
			
			/*
			 * Run transformation
			 */
			IModel googleCodeModel = modelFactory.newModel(googlecodeMetamodel);
			injector.inject(googleCodeModel, googlecodeM);
			
			IModel githubCodeModel = modelFactory.newModel(githubMetamodel);
			
			transformationLauncher.initialize(new HashMap<String,Object>());
			transformationLauncher.addInModel(googleCodeModel, "IN", "GC");
			transformationLauncher.addOutModel(githubCodeModel, "OUT", "GH");
			transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String,Object>(),
				new FileInputStream(transformationAsm));
			
			extractor.extract(githubCodeModel, githubM);
			
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
