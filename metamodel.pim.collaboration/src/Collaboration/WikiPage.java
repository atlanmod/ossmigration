/**
 */
package Collaboration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wiki Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Collaboration.WikiPage#getLabels <em>Labels</em>}</li>
 *   <li>{@link Collaboration.WikiPage#getUpdated_at <em>Updated at</em>}</li>
 *   <li>{@link Collaboration.WikiPage#getUpdated_by <em>Updated by</em>}</li>
 *   <li>{@link Collaboration.WikiPage#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see Collaboration.CollaborationPackage#getWikiPage()
 * @model
 * @generated
 */
public interface WikiPage extends Item {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference list.
	 * The list contents are of type {@link Collaboration.WikiLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' reference list.
	 * @see Collaboration.CollaborationPackage#getWikiPage_Labels()
	 * @model
	 * @generated
	 */
	EList<WikiLabel> getLabels();

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
	 * @see Collaboration.CollaborationPackage#getWikiPage_Updated_at()
	 * @model
	 * @generated
	 */
	String getUpdated_at();

	/**
	 * Sets the value of the '{@link Collaboration.WikiPage#getUpdated_at <em>Updated at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated at</em>' attribute.
	 * @see #getUpdated_at()
	 * @generated
	 */
	void setUpdated_at(String value);

	/**
	 * Returns the value of the '<em><b>Updated by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated by</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated by</em>' reference.
	 * @see #setUpdated_by(Person)
	 * @see Collaboration.CollaborationPackage#getWikiPage_Updated_by()
	 * @model
	 * @generated
	 */
	Person getUpdated_by();

	/**
	 * Sets the value of the '{@link Collaboration.WikiPage#getUpdated_by <em>Updated by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated by</em>' reference.
	 * @see #getUpdated_by()
	 * @generated
	 */
	void setUpdated_by(Person value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.WikiComment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getWikiPage_Comments()
	 * @model containment="true"
	 * @generated
	 */
	EList<WikiComment> getComments();

} // WikiPage
