/**
 */
package Collaboration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Collaboration.Project#getShortName <em>Short Name</em>}</li>
 *   <li>{@link Collaboration.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link Collaboration.Project#getYear <em>Year</em>}</li>
 *   <li>{@link Collaboration.Project#isActive <em>Active</em>}</li>
 *   <li>{@link Collaboration.Project#getParent <em>Parent</em>}</li>
 *   <li>{@link Collaboration.Project#getVcsRepositories <em>Vcs Repositories</em>}</li>
 *   <li>{@link Collaboration.Project#getCommunicationChannels <em>Communication Channels</em>}</li>
 *   <li>{@link Collaboration.Project#getBugTrackingSystems <em>Bug Tracking Systems</em>}</li>
 *   <li>{@link Collaboration.Project#getPersons <em>Persons</em>}</li>
 *   <li>{@link Collaboration.Project#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link Collaboration.Project#getHomePage <em>Home Page</em>}</li>
 *   <li>{@link Collaboration.Project#getCompanies <em>Companies</em>}</li>
 *   <li>{@link Collaboration.Project#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Collaboration.CollaborationPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see Collaboration.CollaborationPackage#getProject_ShortName()
	 * @model
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link Collaboration.Project#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Collaboration.CollaborationPackage#getProject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Collaboration.Project#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see Collaboration.CollaborationPackage#getProject_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link Collaboration.Project#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see Collaboration.CollaborationPackage#getProject_Active()
	 * @model default="true"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link Collaboration.Project#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Project)
	 * @see Collaboration.CollaborationPackage#getProject_Parent()
	 * @model
	 * @generated
	 */
	Project getParent();

	/**
	 * Sets the value of the '{@link Collaboration.Project#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Project value);

	/**
	 * Returns the value of the '<em><b>Vcs Repositories</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.VcsRepository}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vcs Repositories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vcs Repositories</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getProject_VcsRepositories()
	 * @model containment="true"
	 * @generated
	 */
	EList<VcsRepository> getVcsRepositories();

	/**
	 * Returns the value of the '<em><b>Communication Channels</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.CommunicationChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication Channels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Channels</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getProject_CommunicationChannels()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationChannel> getCommunicationChannels();

	/**
	 * Returns the value of the '<em><b>Bug Tracking Systems</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.BugTrackingSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bug Tracking Systems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bug Tracking Systems</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getProject_BugTrackingSystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<BugTrackingSystem> getBugTrackingSystems();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' reference list.
	 * The list contents are of type {@link Collaboration.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' reference list.
	 * @see Collaboration.CollaborationPackage#getProject_Persons()
	 * @model
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Licenses</b></em>' reference list.
	 * The list contents are of type {@link Collaboration.License}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Licenses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Licenses</em>' reference list.
	 * @see Collaboration.CollaborationPackage#getProject_Licenses()
	 * @model
	 * @generated
	 */
	EList<License> getLicenses();

	/**
	 * Returns the value of the '<em><b>Home Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Page</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Page</em>' attribute.
	 * @see #setHomePage(String)
	 * @see Collaboration.CollaborationPackage#getProject_HomePage()
	 * @model
	 * @generated
	 */
	String getHomePage();

	/**
	 * Sets the value of the '{@link Collaboration.Project#getHomePage <em>Home Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home Page</em>' attribute.
	 * @see #getHomePage()
	 * @generated
	 */
	void setHomePage(String value);

	/**
	 * Returns the value of the '<em><b>Companies</b></em>' reference list.
	 * The list contents are of type {@link Collaboration.Company}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Companies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Companies</em>' reference list.
	 * @see Collaboration.CollaborationPackage#getProject_Companies()
	 * @model
	 * @generated
	 */
	EList<Company> getCompanies();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Collaboration.CollaborationPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Collaboration.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Project
