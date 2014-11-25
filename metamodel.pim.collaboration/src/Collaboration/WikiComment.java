/**
 */
package Collaboration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wiki Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Collaboration.WikiComment#getCreated_by <em>Created by</em>}</li>
 *   <li>{@link Collaboration.WikiComment#getContent <em>Content</em>}</li>
 *   <li>{@link Collaboration.WikiComment#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link Collaboration.WikiComment#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see Collaboration.CollaborationPackage#getWikiComment()
 * @model
 * @generated
 */
public interface WikiComment extends EObject {
	/**
	 * Returns the value of the '<em><b>Created by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created by</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created by</em>' reference.
	 * @see #setCreated_by(Person)
	 * @see Collaboration.CollaborationPackage#getWikiComment_Created_by()
	 * @model
	 * @generated
	 */
	Person getCreated_by();

	/**
	 * Sets the value of the '{@link Collaboration.WikiComment#getCreated_by <em>Created by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created by</em>' reference.
	 * @see #getCreated_by()
	 * @generated
	 */
	void setCreated_by(Person value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see Collaboration.CollaborationPackage#getWikiComment_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link Collaboration.WikiComment#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

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
	 * @see Collaboration.CollaborationPackage#getWikiComment_Created_at()
	 * @model
	 * @generated
	 */
	String getCreated_at();

	/**
	 * Sets the value of the '{@link Collaboration.WikiComment#getCreated_at <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created at</em>' attribute.
	 * @see #getCreated_at()
	 * @generated
	 */
	void setCreated_at(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(WikiComment)
	 * @see Collaboration.CollaborationPackage#getWikiComment_Parent()
	 * @model
	 * @generated
	 */
	WikiComment getParent();

	/**
	 * Sets the value of the '{@link Collaboration.WikiComment#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(WikiComment value);

} // WikiComment
