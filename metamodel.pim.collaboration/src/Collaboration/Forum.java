/**
 */
package Collaboration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Collaboration.Forum#getPosts <em>Posts</em>}</li>
 * </ul>
 * </p>
 *
 * @see Collaboration.CollaborationPackage#getForum()
 * @model
 * @generated
 */
public interface Forum extends CommunicationChannel {
	/**
	 * Returns the value of the '<em><b>Posts</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.Post}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Posts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posts</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getForum_Posts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Post> getPosts();

} // Forum
