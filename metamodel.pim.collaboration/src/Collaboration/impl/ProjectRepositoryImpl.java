/**
 */
package Collaboration.impl;

import Collaboration.CollaborationPackage;
import Collaboration.Company;
import Collaboration.License;
import Collaboration.Person;
import Collaboration.Project;
import Collaboration.ProjectRepository;
import Collaboration.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Collaboration.impl.ProjectRepositoryImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectRepositoryImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectRepositoryImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectRepositoryImpl#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectRepositoryImpl#getCompanies <em>Companies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectRepositoryImpl extends MinimalEObjectImpl.Container implements ProjectRepository {
	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> projects;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The cached value of the '{@link #getLicenses() <em>Licenses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenses()
	 * @generated
	 * @ordered
	 */
	protected EList<License> licenses;

	/**
	 * The cached value of the '{@link #getCompanies() <em>Companies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanies()
	 * @generated
	 * @ordered
	 */
	protected EList<Company> companies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollaborationPackage.Literals.PROJECT_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentEList<Project>(Project.class, this, CollaborationPackage.PROJECT_REPOSITORY__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, CollaborationPackage.PROJECT_REPOSITORY__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this, CollaborationPackage.PROJECT_REPOSITORY__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<License> getLicenses() {
		if (licenses == null) {
			licenses = new EObjectContainmentEList<License>(License.class, this, CollaborationPackage.PROJECT_REPOSITORY__LICENSES);
		}
		return licenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Company> getCompanies() {
		if (companies == null) {
			companies = new EObjectContainmentEList<Company>(Company.class, this, CollaborationPackage.PROJECT_REPOSITORY__COMPANIES);
		}
		return companies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationPackage.PROJECT_REPOSITORY__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case CollaborationPackage.PROJECT_REPOSITORY__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case CollaborationPackage.PROJECT_REPOSITORY__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
			case CollaborationPackage.PROJECT_REPOSITORY__LICENSES:
				return ((InternalEList<?>)getLicenses()).basicRemove(otherEnd, msgs);
			case CollaborationPackage.PROJECT_REPOSITORY__COMPANIES:
				return ((InternalEList<?>)getCompanies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollaborationPackage.PROJECT_REPOSITORY__PROJECTS:
				return getProjects();
			case CollaborationPackage.PROJECT_REPOSITORY__ROLES:
				return getRoles();
			case CollaborationPackage.PROJECT_REPOSITORY__PERSONS:
				return getPersons();
			case CollaborationPackage.PROJECT_REPOSITORY__LICENSES:
				return getLicenses();
			case CollaborationPackage.PROJECT_REPOSITORY__COMPANIES:
				return getCompanies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CollaborationPackage.PROJECT_REPOSITORY__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case CollaborationPackage.PROJECT_REPOSITORY__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case CollaborationPackage.PROJECT_REPOSITORY__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case CollaborationPackage.PROJECT_REPOSITORY__LICENSES:
				getLicenses().clear();
				getLicenses().addAll((Collection<? extends License>)newValue);
				return;
			case CollaborationPackage.PROJECT_REPOSITORY__COMPANIES:
				getCompanies().clear();
				getCompanies().addAll((Collection<? extends Company>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CollaborationPackage.PROJECT_REPOSITORY__PROJECTS:
				getProjects().clear();
				return;
			case CollaborationPackage.PROJECT_REPOSITORY__ROLES:
				getRoles().clear();
				return;
			case CollaborationPackage.PROJECT_REPOSITORY__PERSONS:
				getPersons().clear();
				return;
			case CollaborationPackage.PROJECT_REPOSITORY__LICENSES:
				getLicenses().clear();
				return;
			case CollaborationPackage.PROJECT_REPOSITORY__COMPANIES:
				getCompanies().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CollaborationPackage.PROJECT_REPOSITORY__PROJECTS:
				return projects != null && !projects.isEmpty();
			case CollaborationPackage.PROJECT_REPOSITORY__ROLES:
				return roles != null && !roles.isEmpty();
			case CollaborationPackage.PROJECT_REPOSITORY__PERSONS:
				return persons != null && !persons.isEmpty();
			case CollaborationPackage.PROJECT_REPOSITORY__LICENSES:
				return licenses != null && !licenses.isEmpty();
			case CollaborationPackage.PROJECT_REPOSITORY__COMPANIES:
				return companies != null && !companies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectRepositoryImpl
