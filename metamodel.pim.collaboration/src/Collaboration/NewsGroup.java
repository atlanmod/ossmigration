/**
 */
package Collaboration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>News Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Collaboration.NewsGroup#getNews <em>News</em>}</li>
 * </ul>
 * </p>
 *
 * @see Collaboration.CollaborationPackage#getNewsGroup()
 * @model
 * @generated
 */
public interface NewsGroup extends CommunicationChannel {
	/**
	 * Returns the value of the '<em><b>News</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.News}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>News</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>News</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getNewsGroup_News()
	 * @model containment="true"
	 * @generated
	 */
	EList<News> getNews();

} // NewsGroup
