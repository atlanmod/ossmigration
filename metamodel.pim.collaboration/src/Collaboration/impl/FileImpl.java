/**
 */
package Collaboration.impl;

import Collaboration.CollaborationPackage;
import Collaboration.File;
import Collaboration.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Collaboration.impl.FileImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link Collaboration.impl.FileImpl#getSize <em>Size</em>}</li>
 *   <li>{@link Collaboration.impl.FileImpl#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link Collaboration.impl.FileImpl#isIsDirectory <em>Is Directory</em>}</li>
 *   <li>{@link Collaboration.impl.FileImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link Collaboration.impl.FileImpl#getChilds <em>Childs</em>}</li>
 *   <li>{@link Collaboration.impl.FileImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link Collaboration.impl.FileImpl#getPath <em>Path</em>}</li>
 *   <li>{@link Collaboration.impl.FileImpl#getName <em>Name</em>}</li>
 *   <li>{@link Collaboration.impl.FileImpl#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link Collaboration.impl.FileImpl#getModified_at <em>Modified at</em>}</li>
 *   <li>{@link Collaboration.impl.FileImpl#getCreated_by <em>Created by</em>}</li>
 *   <li>{@link Collaboration.impl.FileImpl#getModified_by <em>Modified by</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileImpl extends MinimalEObjectImpl.Container implements File {
	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_SUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected String checkSum = CHECK_SUM_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDirectory() <em>Is Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIRECTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDirectory() <em>Is Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDirectory()
	 * @generated
	 * @ordered
	 */
	protected boolean isDirectory = IS_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermission() <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected static final String PERMISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPermission() <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermission()
	 * @generated
	 * @ordered
	 */
	protected String permission = PERMISSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChilds() <em>Childs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChilds()
	 * @generated
	 * @ordered
	 */
	protected EList<File> childs;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated_at() <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated_at()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreated_at() <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated_at()
	 * @generated
	 * @ordered
	 */
	protected String created_at = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified_at() <em>Modified at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified_at()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified_at() <em>Modified at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified_at()
	 * @generated
	 * @ordered
	 */
	protected String modified_at = MODIFIED_AT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreated_by() <em>Created by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated_by()
	 * @generated
	 * @ordered
	 */
	protected Person created_by;

	/**
	 * The cached value of the '{@link #getModified_by() <em>Modified by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified_by()
	 * @generated
	 * @ordered
	 */
	protected Person modified_by;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollaborationPackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.FILE__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.FILE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckSum() {
		return checkSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckSum(String newCheckSum) {
		String oldCheckSum = checkSum;
		checkSum = newCheckSum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.FILE__CHECK_SUM, oldCheckSum, checkSum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDirectory() {
		return isDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDirectory(boolean newIsDirectory) {
		boolean oldIsDirectory = isDirectory;
		isDirectory = newIsDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.FILE__IS_DIRECTORY, oldIsDirectory, isDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPermission() {
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermission(String newPermission) {
		String oldPermission = permission;
		permission = newPermission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.FILE__PERMISSION, oldPermission, permission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getChilds() {
		if (childs == null) {
			childs = new EObjectContainmentWithInverseEList<File>(File.class, this, CollaborationPackage.FILE__CHILDS, CollaborationPackage.FILE__PARENT);
		}
		return childs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getParent() {
		if (eContainerFeatureID() != CollaborationPackage.FILE__PARENT) return null;
		return (File)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(File newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, CollaborationPackage.FILE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(File newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != CollaborationPackage.FILE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, CollaborationPackage.FILE__CHILDS, File.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.FILE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.FILE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.FILE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreated_at() {
		return created_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated_at(String newCreated_at) {
		String oldCreated_at = created_at;
		created_at = newCreated_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.FILE__CREATED_AT, oldCreated_at, created_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModified_at() {
		return modified_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified_at(String newModified_at) {
		String oldModified_at = modified_at;
		modified_at = newModified_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.FILE__MODIFIED_AT, oldModified_at, modified_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getCreated_by() {
		if (created_by != null && created_by.eIsProxy()) {
			InternalEObject oldCreated_by = (InternalEObject)created_by;
			created_by = (Person)eResolveProxy(oldCreated_by);
			if (created_by != oldCreated_by) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationPackage.FILE__CREATED_BY, oldCreated_by, created_by));
			}
		}
		return created_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetCreated_by() {
		return created_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated_by(Person newCreated_by) {
		Person oldCreated_by = created_by;
		created_by = newCreated_by;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.FILE__CREATED_BY, oldCreated_by, created_by));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getModified_by() {
		if (modified_by != null && modified_by.eIsProxy()) {
			InternalEObject oldModified_by = (InternalEObject)modified_by;
			modified_by = (Person)eResolveProxy(oldModified_by);
			if (modified_by != oldModified_by) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationPackage.FILE__MODIFIED_BY, oldModified_by, modified_by));
			}
		}
		return modified_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetModified_by() {
		return modified_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified_by(Person newModified_by) {
		Person oldModified_by = modified_by;
		modified_by = newModified_by;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.FILE__MODIFIED_BY, oldModified_by, modified_by));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationPackage.FILE__CHILDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChilds()).basicAdd(otherEnd, msgs);
			case CollaborationPackage.FILE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((File)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationPackage.FILE__CHILDS:
				return ((InternalEList<?>)getChilds()).basicRemove(otherEnd, msgs);
			case CollaborationPackage.FILE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CollaborationPackage.FILE__PARENT:
				return eInternalContainer().eInverseRemove(this, CollaborationPackage.FILE__CHILDS, File.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollaborationPackage.FILE__EXTENSION:
				return getExtension();
			case CollaborationPackage.FILE__SIZE:
				return getSize();
			case CollaborationPackage.FILE__CHECK_SUM:
				return getCheckSum();
			case CollaborationPackage.FILE__IS_DIRECTORY:
				return isIsDirectory();
			case CollaborationPackage.FILE__PERMISSION:
				return getPermission();
			case CollaborationPackage.FILE__CHILDS:
				return getChilds();
			case CollaborationPackage.FILE__PARENT:
				return getParent();
			case CollaborationPackage.FILE__PATH:
				return getPath();
			case CollaborationPackage.FILE__NAME:
				return getName();
			case CollaborationPackage.FILE__CREATED_AT:
				return getCreated_at();
			case CollaborationPackage.FILE__MODIFIED_AT:
				return getModified_at();
			case CollaborationPackage.FILE__CREATED_BY:
				if (resolve) return getCreated_by();
				return basicGetCreated_by();
			case CollaborationPackage.FILE__MODIFIED_BY:
				if (resolve) return getModified_by();
				return basicGetModified_by();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CollaborationPackage.FILE__EXTENSION:
				setExtension((String)newValue);
				return;
			case CollaborationPackage.FILE__SIZE:
				setSize((Integer)newValue);
				return;
			case CollaborationPackage.FILE__CHECK_SUM:
				setCheckSum((String)newValue);
				return;
			case CollaborationPackage.FILE__IS_DIRECTORY:
				setIsDirectory((Boolean)newValue);
				return;
			case CollaborationPackage.FILE__PERMISSION:
				setPermission((String)newValue);
				return;
			case CollaborationPackage.FILE__CHILDS:
				getChilds().clear();
				getChilds().addAll((Collection<? extends File>)newValue);
				return;
			case CollaborationPackage.FILE__PARENT:
				setParent((File)newValue);
				return;
			case CollaborationPackage.FILE__PATH:
				setPath((String)newValue);
				return;
			case CollaborationPackage.FILE__NAME:
				setName((String)newValue);
				return;
			case CollaborationPackage.FILE__CREATED_AT:
				setCreated_at((String)newValue);
				return;
			case CollaborationPackage.FILE__MODIFIED_AT:
				setModified_at((String)newValue);
				return;
			case CollaborationPackage.FILE__CREATED_BY:
				setCreated_by((Person)newValue);
				return;
			case CollaborationPackage.FILE__MODIFIED_BY:
				setModified_by((Person)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CollaborationPackage.FILE__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case CollaborationPackage.FILE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case CollaborationPackage.FILE__CHECK_SUM:
				setCheckSum(CHECK_SUM_EDEFAULT);
				return;
			case CollaborationPackage.FILE__IS_DIRECTORY:
				setIsDirectory(IS_DIRECTORY_EDEFAULT);
				return;
			case CollaborationPackage.FILE__PERMISSION:
				setPermission(PERMISSION_EDEFAULT);
				return;
			case CollaborationPackage.FILE__CHILDS:
				getChilds().clear();
				return;
			case CollaborationPackage.FILE__PARENT:
				setParent((File)null);
				return;
			case CollaborationPackage.FILE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CollaborationPackage.FILE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CollaborationPackage.FILE__CREATED_AT:
				setCreated_at(CREATED_AT_EDEFAULT);
				return;
			case CollaborationPackage.FILE__MODIFIED_AT:
				setModified_at(MODIFIED_AT_EDEFAULT);
				return;
			case CollaborationPackage.FILE__CREATED_BY:
				setCreated_by((Person)null);
				return;
			case CollaborationPackage.FILE__MODIFIED_BY:
				setModified_by((Person)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CollaborationPackage.FILE__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case CollaborationPackage.FILE__SIZE:
				return size != SIZE_EDEFAULT;
			case CollaborationPackage.FILE__CHECK_SUM:
				return CHECK_SUM_EDEFAULT == null ? checkSum != null : !CHECK_SUM_EDEFAULT.equals(checkSum);
			case CollaborationPackage.FILE__IS_DIRECTORY:
				return isDirectory != IS_DIRECTORY_EDEFAULT;
			case CollaborationPackage.FILE__PERMISSION:
				return PERMISSION_EDEFAULT == null ? permission != null : !PERMISSION_EDEFAULT.equals(permission);
			case CollaborationPackage.FILE__CHILDS:
				return childs != null && !childs.isEmpty();
			case CollaborationPackage.FILE__PARENT:
				return getParent() != null;
			case CollaborationPackage.FILE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case CollaborationPackage.FILE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CollaborationPackage.FILE__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? created_at != null : !CREATED_AT_EDEFAULT.equals(created_at);
			case CollaborationPackage.FILE__MODIFIED_AT:
				return MODIFIED_AT_EDEFAULT == null ? modified_at != null : !MODIFIED_AT_EDEFAULT.equals(modified_at);
			case CollaborationPackage.FILE__CREATED_BY:
				return created_by != null;
			case CollaborationPackage.FILE__MODIFIED_BY:
				return modified_by != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extension: ");
		result.append(extension);
		result.append(", size: ");
		result.append(size);
		result.append(", checkSum: ");
		result.append(checkSum);
		result.append(", isDirectory: ");
		result.append(isDirectory);
		result.append(", permission: ");
		result.append(permission);
		result.append(", path: ");
		result.append(path);
		result.append(", name: ");
		result.append(name);
		result.append(", created_at: ");
		result.append(created_at);
		result.append(", modified_at: ");
		result.append(modified_at);
		result.append(')');
		return result.toString();
	}

} //FileImpl
