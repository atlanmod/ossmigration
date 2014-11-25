/**
 */
package Collaboration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wiki</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Collaboration.Wiki#getPages <em>Pages</em>}</li>
 *   <li>{@link Collaboration.Wiki#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see Collaboration.CollaborationPackage#getWiki()
 * @model
 * @generated
 */
public interface Wiki extends CommunicationChannel {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.WikiPage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getWiki_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<WikiPage> getPages();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.WikiLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getWiki_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<WikiLabel> getLabels();

} // Wiki
