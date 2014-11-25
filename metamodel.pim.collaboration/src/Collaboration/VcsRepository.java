/**
 */
package Collaboration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vcs Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Collaboration.VcsRepository#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link Collaboration.VcsRepository#getUpdated_at <em>Updated at</em>}</li>
 *   <li>{@link Collaboration.VcsRepository#getUrl <em>Url</em>}</li>
 *   <li>{@link Collaboration.VcsRepository#getPersons <em>Persons</em>}</li>
 *   <li>{@link Collaboration.VcsRepository#getCommits <em>Commits</em>}</li>
 * </ul>
 * </p>
 *
 * @see Collaboration.CollaborationPackage#getVcsRepository()
 * @model
 * @generated
 */
public interface VcsRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created at</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created at</em>' attribute.
	 * @see #setCreated_at(String)
	 * @see Collaboration.CollaborationPackage#getVcsRepository_Created_at()
	 * @model
	 * @generated
	 */
	String getCreated_at();

	/**
	 * Sets the value of the '{@link Collaboration.VcsRepository#getCreated_at <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created at</em>' attribute.
	 * @see #getCreated_at()
	 * @generated
	 */
	void setCreated_at(String value);

	/**
	 * Returns the value of the '<em><b>Updated at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated at</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated at</em>' attribute.
	 * @see #setUpdated_at(String)
	 * @see Collaboration.CollaborationPackage#getVcsRepository_Updated_at()
	 * @model
	 * @generated
	 */
	String getUpdated_at();

	/**
	 * Sets the value of the '{@link Collaboration.VcsRepository#getUpdated_at <em>Updated at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated at</em>' attribute.
	 * @see #getUpdated_at()
	 * @generated
	 */
	void setUpdated_at(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see Collaboration.CollaborationPackage#getVcsRepository_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link Collaboration.VcsRepository#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

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
	 * @see Collaboration.CollaborationPackage#getVcsRepository_Persons()
	 * @model
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Commits</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.Commit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commits</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getVcsRepository_Commits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Commit> getCommits();

} // VcsRepository
