/**
 */
package Collaboration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Collaboration.ProjectRepository#getProjects <em>Projects</em>}</li>
 *   <li>{@link Collaboration.ProjectRepository#getRoles <em>Roles</em>}</li>
 *   <li>{@link Collaboration.ProjectRepository#getPersons <em>Persons</em>}</li>
 *   <li>{@link Collaboration.ProjectRepository#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link Collaboration.ProjectRepository#getCompanies <em>Companies</em>}</li>
 * </ul>
 * </p>
 *
 * @see Collaboration.CollaborationPackage#getProjectRepository()
 * @model
 * @generated
 */
public interface ProjectRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getProjectRepository_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getProjectRepository_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getProjectRepository_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Licenses</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.License}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Licenses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Licenses</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getProjectRepository_Licenses()
	 * @model containment="true"
	 * @generated
	 */
	EList<License> getLicenses();

	/**
	 * Returns the value of the '<em><b>Companies</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.Company}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Companies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Companies</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getProjectRepository_Companies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Company> getCompanies();

} // ProjectRepository
