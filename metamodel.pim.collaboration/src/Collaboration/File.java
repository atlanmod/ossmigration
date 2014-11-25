/**
 */
package Collaboration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Collaboration.File#getExtension <em>Extension</em>}</li>
 *   <li>{@link Collaboration.File#getSize <em>Size</em>}</li>
 *   <li>{@link Collaboration.File#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link Collaboration.File#isIsDirectory <em>Is Directory</em>}</li>
 *   <li>{@link Collaboration.File#getPermission <em>Permission</em>}</li>
 *   <li>{@link Collaboration.File#getChilds <em>Childs</em>}</li>
 *   <li>{@link Collaboration.File#getParent <em>Parent</em>}</li>
 *   <li>{@link Collaboration.File#getPath <em>Path</em>}</li>
 *   <li>{@link Collaboration.File#getName <em>Name</em>}</li>
 *   <li>{@link Collaboration.File#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link Collaboration.File#getModified_at <em>Modified at</em>}</li>
 *   <li>{@link Collaboration.File#getCreated_by <em>Created by</em>}</li>
 *   <li>{@link Collaboration.File#getModified_by <em>Modified by</em>}</li>
 * </ul>
 * </p>
 *
 * @see Collaboration.CollaborationPackage#getFile()
 * @model
 * @generated
 */
public interface File extends EObject {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see Collaboration.CollaborationPackage#getFile_Extension()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link Collaboration.File#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see Collaboration.CollaborationPackage#getFile_Size()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link Collaboration.File#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Sum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Sum</em>' attribute.
	 * @see #setCheckSum(String)
	 * @see Collaboration.CollaborationPackage#getFile_CheckSum()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCheckSum();

	/**
	 * Sets the value of the '{@link Collaboration.File#getCheckSum <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Sum</em>' attribute.
	 * @see #getCheckSum()
	 * @generated
	 */
	void setCheckSum(String value);

	/**
	 * Returns the value of the '<em><b>Is Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Directory</em>' attribute.
	 * @see #setIsDirectory(boolean)
	 * @see Collaboration.CollaborationPackage#getFile_IsDirectory()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDirectory();

	/**
	 * Sets the value of the '{@link Collaboration.File#isIsDirectory <em>Is Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Directory</em>' attribute.
	 * @see #isIsDirectory()
	 * @generated
	 */
	void setIsDirectory(boolean value);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' attribute.
	 * @see #setPermission(String)
	 * @see Collaboration.CollaborationPackage#getFile_Permission()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getPermission();

	/**
	 * Sets the value of the '{@link Collaboration.File#getPermission <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' attribute.
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(String value);

	/**
	 * Returns the value of the '<em><b>Childs</b></em>' containment reference list.
	 * The list contents are of type {@link Collaboration.File}.
	 * It is bidirectional and its opposite is '{@link Collaboration.File#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' containment reference list.
	 * @see Collaboration.CollaborationPackage#getFile_Childs()
	 * @see Collaboration.File#getParent
	 * @model opposite="parent" containment="true" ordered="false"
	 * @generated
	 */
	EList<File> getChilds();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Collaboration.File#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(File)
	 * @see Collaboration.CollaborationPackage#getFile_Parent()
	 * @see Collaboration.File#getChilds
	 * @model opposite="childs" transient="false" ordered="false"
	 * @generated
	 */
	File getParent();

	/**
	 * Sets the value of the '{@link Collaboration.File#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(File value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see Collaboration.CollaborationPackage#getFile_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link Collaboration.File#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

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
	 * @see Collaboration.CollaborationPackage#getFile_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Collaboration.File#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see Collaboration.CollaborationPackage#getFile_Created_at()
	 * @model
	 * @generated
	 */
	String getCreated_at();

	/**
	 * Sets the value of the '{@link Collaboration.File#getCreated_at <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created at</em>' attribute.
	 * @see #getCreated_at()
	 * @generated
	 */
	void setCreated_at(String value);

	/**
	 * Returns the value of the '<em><b>Modified at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified at</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified at</em>' attribute.
	 * @see #setModified_at(String)
	 * @see Collaboration.CollaborationPackage#getFile_Modified_at()
	 * @model
	 * @generated
	 */
	String getModified_at();

	/**
	 * Sets the value of the '{@link Collaboration.File#getModified_at <em>Modified at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified at</em>' attribute.
	 * @see #getModified_at()
	 * @generated
	 */
	void setModified_at(String value);

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
	 * @see Collaboration.CollaborationPackage#getFile_Created_by()
	 * @model
	 * @generated
	 */
	Person getCreated_by();

	/**
	 * Sets the value of the '{@link Collaboration.File#getCreated_by <em>Created by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created by</em>' reference.
	 * @see #getCreated_by()
	 * @generated
	 */
	void setCreated_by(Person value);

	/**
	 * Returns the value of the '<em><b>Modified by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified by</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified by</em>' reference.
	 * @see #setModified_by(Person)
	 * @see Collaboration.CollaborationPackage#getFile_Modified_by()
	 * @model
	 * @generated
	 */
	Person getModified_by();

	/**
	 * Sets the value of the '{@link Collaboration.File#getModified_by <em>Modified by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified by</em>' reference.
	 * @see #getModified_by()
	 * @generated
	 */
	void setModified_by(Person value);

} // File
