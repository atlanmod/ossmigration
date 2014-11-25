/**
 */
package Collaboration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mailing List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Collaboration.MailingList#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see Collaboration.CollaborationPackage#getMailingList()
 * @model
 * @generated
 */
public interface MailingList extends CommunicationChannel {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getMailingList_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

} // MailingList
