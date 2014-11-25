/**
 */
package Collaboration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Collaboration.Issue#getNumber <em>Number</em>}</li>
 *   <li>{@link Collaboration.Issue#getTitle <em>Title</em>}</li>
 *   <li>{@link Collaboration.Issue#getBody <em>Body</em>}</li>
 *   <li>{@link Collaboration.Issue#getState <em>State</em>}</li>
 *   <li>{@link Collaboration.Issue#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link Collaboration.Issue#getClosed_at <em>Closed at</em>}</li>
 *   <li>{@link Collaboration.Issue#getSeverity <em>Severity</em>}</li>
 *   <li>{@link Collaboration.Issue#getClosed_by <em>Closed by</em>}</li>
 *   <li>{@link Collaboration.Issue#getCreated_by <em>Created by</em>}</li>
 *   <li>{@link Collaboration.Issue#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see Collaboration.CollaborationPackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(Integer)
	 * @see Collaboration.CollaborationPackage#getIssue_Number()
	 * @model
	 * @generated
	 */
	Integer getNumber();

	/**
	 * Sets the value of the '{@link Collaboration.Issue#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see Collaboration.CollaborationPackage#getIssue_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link Collaboration.Issue#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see Collaboration.CollaborationPackage#getIssue_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link Collaboration.Issue#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see Collaboration.CollaborationPackage#getIssue_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link Collaboration.Issue#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

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
	 * @see Collaboration.CollaborationPackage#getIssue_Created_at()
	 * @model
	 * @generated
	 */
	String getCreated_at();

	/**
	 * Sets the value of the '{@link Collaboration.Issue#getCreated_at <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created at</em>' attribute.
	 * @see #getCreated_at()
	 * @generated
	 */
	void setCreated_at(String value);

	/**
	 * Returns the value of the '<em><b>Closed at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed at</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed at</em>' attribute.
	 * @see #setClosed_at(String)
	 * @see Collaboration.CollaborationPackage#getIssue_Closed_at()
	 * @model
	 * @generated
	 */
	String getClosed_at();

	/**
	 * Sets the value of the '{@link Collaboration.Issue#getClosed_at <em>Closed at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed at</em>' attribute.
	 * @see #getClosed_at()
	 * @generated
	 */
	void setClosed_at(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(String)
	 * @see Collaboration.CollaborationPackage#getIssue_Severity()
	 * @model
	 * @generated
	 */
	String getSeverity();

	/**
	 * Sets the value of the '{@link Collaboration.Issue#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(String value);

	/**
	 * Returns the value of the '<em><b>Closed by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed by</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed by</em>' reference.
	 * @see #setClosed_by(Person)
	 * @see Collaboration.CollaborationPackage#getIssue_Closed_by()
	 * @model
	 * @generated
	 */
	Person getClosed_by();

	/**
	 * Sets the value of the '{@link Collaboration.Issue#getClosed_by <em>Closed by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed by</em>' reference.
	 * @see #getClosed_by()
	 * @generated
	 */
	void setClosed_by(Person value);

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
	 * @see Collaboration.CollaborationPackage#getIssue_Created_by()
	 * @model
	 * @generated
	 */
	Person getCreated_by();

	/**
	 * Sets the value of the '{@link Collaboration.Issue#getCreated_by <em>Created by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created by</em>' reference.
	 * @see #getCreated_by()
	 * @generated
	 */
	void setCreated_by(Person value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference list.
	 * The list contents are of type {@link Collaboration.IssueLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' reference list.
	 * @see Collaboration.CollaborationPackage#getIssue_Labels()
	 * @model
	 * @generated
	 */
	EList<IssueLabel> getLabels();

} // Issue
