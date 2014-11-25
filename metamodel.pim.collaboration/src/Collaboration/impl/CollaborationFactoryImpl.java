/**
 */
package Collaboration.impl;

import Collaboration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborationFactoryImpl extends EFactoryImpl implements CollaborationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CollaborationFactory init() {
		try {
			CollaborationFactory theCollaborationFactory = (CollaborationFactory)EPackage.Registry.INSTANCE.getEFactory(CollaborationPackage.eNS_URI);
			if (theCollaborationFactory != null) {
				return theCollaborationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CollaborationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CollaborationPackage.PROJECT_REPOSITORY: return createProjectRepository();
			case CollaborationPackage.PROJECT: return createProject();
			case CollaborationPackage.COMMUNICATION_CHANNEL: return createCommunicationChannel();
			case CollaborationPackage.VCS_REPOSITORY: return createVcsRepository();
			case CollaborationPackage.COMMIT: return createCommit();
			case CollaborationPackage.FILE: return createFile();
			case CollaborationPackage.BUG_TRACKING_SYSTEM: return createBugTrackingSystem();
			case CollaborationPackage.ISSUE_LABEL: return createIssueLabel();
			case CollaborationPackage.ISSUE: return createIssue();
			case CollaborationPackage.PERSON: return createPerson();
			case CollaborationPackage.ROLE: return createRole();
			case CollaborationPackage.LICENSE: return createLicense();
			case CollaborationPackage.COMPANY: return createCompany();
			case CollaborationPackage.FORUM: return createForum();
			case CollaborationPackage.NEWS_GROUP: return createNewsGroup();
			case CollaborationPackage.WIKI: return createWiki();
			case CollaborationPackage.WIKI_LABEL: return createWikiLabel();
			case CollaborationPackage.MAILING_LIST: return createMailingList();
			case CollaborationPackage.MESSAGE: return createMessage();
			case CollaborationPackage.WIKI_PAGE: return createWikiPage();
			case CollaborationPackage.WIKI_COMMENT: return createWikiComment();
			case CollaborationPackage.NEWS: return createNews();
			case CollaborationPackage.POST: return createPost();
			case CollaborationPackage.ITEM: return createItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectRepository createProjectRepository() {
		ProjectRepositoryImpl projectRepository = new ProjectRepositoryImpl();
		return projectRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationChannel createCommunicationChannel() {
		CommunicationChannelImpl communicationChannel = new CommunicationChannelImpl();
		return communicationChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VcsRepository createVcsRepository() {
		VcsRepositoryImpl vcsRepository = new VcsRepositoryImpl();
		return vcsRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commit createCommit() {
		CommitImpl commit = new CommitImpl();
		return commit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BugTrackingSystem createBugTrackingSystem() {
		BugTrackingSystemImpl bugTrackingSystem = new BugTrackingSystemImpl();
		return bugTrackingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueLabel createIssueLabel() {
		IssueLabelImpl issueLabel = new IssueLabelImpl();
		return issueLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue createIssue() {
		IssueImpl issue = new IssueImpl();
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public License createLicense() {
		LicenseImpl license = new LicenseImpl();
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company createCompany() {
		CompanyImpl company = new CompanyImpl();
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forum createForum() {
		ForumImpl forum = new ForumImpl();
		return forum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewsGroup createNewsGroup() {
		NewsGroupImpl newsGroup = new NewsGroupImpl();
		return newsGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wiki createWiki() {
		WikiImpl wiki = new WikiImpl();
		return wiki;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikiLabel createWikiLabel() {
		WikiLabelImpl wikiLabel = new WikiLabelImpl();
		return wikiLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MailingList createMailingList() {
		MailingListImpl mailingList = new MailingListImpl();
		return mailingList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikiPage createWikiPage() {
		WikiPageImpl wikiPage = new WikiPageImpl();
		return wikiPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikiComment createWikiComment() {
		WikiCommentImpl wikiComment = new WikiCommentImpl();
		return wikiComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public News createNews() {
		NewsImpl news = new NewsImpl();
		return news;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Post createPost() {
		PostImpl post = new PostImpl();
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationPackage getCollaborationPackage() {
		return (CollaborationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CollaborationPackage getPackage() {
		return CollaborationPackage.eINSTANCE;
	}

} //CollaborationFactoryImpl
