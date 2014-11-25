/**
 */
package Collaboration.impl;

import Collaboration.CollaborationPackage;
import Collaboration.Commit;
import Collaboration.Person;
import Collaboration.VcsRepository;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vcs Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Collaboration.impl.VcsRepositoryImpl#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link Collaboration.impl.VcsRepositoryImpl#getUpdated_at <em>Updated at</em>}</li>
 *   <li>{@link Collaboration.impl.VcsRepositoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link Collaboration.impl.VcsRepositoryImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link Collaboration.impl.VcsRepositoryImpl#getCommits <em>Commits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VcsRepositoryImpl extends MinimalEObjectImpl.Container implements VcsRepository {
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
	 * The default value of the '{@link #getUpdated_at() <em>Updated at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated_at()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdated_at() <em>Updated at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated_at()
	 * @generated
	 * @ordered
	 */
	protected String updated_at = UPDATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The cached value of the '{@link #getCommits() <em>Commits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommits()
	 * @generated
	 * @ordered
	 */
	protected EList<Commit> commits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VcsRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollaborationPackage.Literals.VCS_REPOSITORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.VCS_REPOSITORY__CREATED_AT, oldCreated_at, created_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUpdated_at() {
		return updated_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdated_at(String newUpdated_at) {
		String oldUpdated_at = updated_at;
		updated_at = newUpdated_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.VCS_REPOSITORY__UPDATED_AT, oldUpdated_at, updated_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.VCS_REPOSITORY__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectResolvingEList<Person>(Person.class, this, CollaborationPackage.VCS_REPOSITORY__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Commit> getCommits() {
		if (commits == null) {
			commits = new EObjectContainmentEList<Commit>(Commit.class, this, CollaborationPackage.VCS_REPOSITORY__COMMITS);
		}
		return commits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationPackage.VCS_REPOSITORY__COMMITS:
				return ((InternalEList<?>)getCommits()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollaborationPackage.VCS_REPOSITORY__CREATED_AT:
				return getCreated_at();
			case CollaborationPackage.VCS_REPOSITORY__UPDATED_AT:
				return getUpdated_at();
			case CollaborationPackage.VCS_REPOSITORY__URL:
				return getUrl();
			case CollaborationPackage.VCS_REPOSITORY__PERSONS:
				return getPersons();
			case CollaborationPackage.VCS_REPOSITORY__COMMITS:
				return getCommits();
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
			case CollaborationPackage.VCS_REPOSITORY__CREATED_AT:
				setCreated_at((String)newValue);
				return;
			case CollaborationPackage.VCS_REPOSITORY__UPDATED_AT:
				setUpdated_at((String)newValue);
				return;
			case CollaborationPackage.VCS_REPOSITORY__URL:
				setUrl((String)newValue);
				return;
			case CollaborationPackage.VCS_REPOSITORY__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case CollaborationPackage.VCS_REPOSITORY__COMMITS:
				getCommits().clear();
				getCommits().addAll((Collection<? extends Commit>)newValue);
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
			case CollaborationPackage.VCS_REPOSITORY__CREATED_AT:
				setCreated_at(CREATED_AT_EDEFAULT);
				return;
			case CollaborationPackage.VCS_REPOSITORY__UPDATED_AT:
				setUpdated_at(UPDATED_AT_EDEFAULT);
				return;
			case CollaborationPackage.VCS_REPOSITORY__URL:
				setUrl(URL_EDEFAULT);
				return;
			case CollaborationPackage.VCS_REPOSITORY__PERSONS:
				getPersons().clear();
				return;
			case CollaborationPackage.VCS_REPOSITORY__COMMITS:
				getCommits().clear();
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
			case CollaborationPackage.VCS_REPOSITORY__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? created_at != null : !CREATED_AT_EDEFAULT.equals(created_at);
			case CollaborationPackage.VCS_REPOSITORY__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? updated_at != null : !UPDATED_AT_EDEFAULT.equals(updated_at);
			case CollaborationPackage.VCS_REPOSITORY__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case CollaborationPackage.VCS_REPOSITORY__PERSONS:
				return persons != null && !persons.isEmpty();
			case CollaborationPackage.VCS_REPOSITORY__COMMITS:
				return commits != null && !commits.isEmpty();
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
		result.append(" (created_at: ");
		result.append(created_at);
		result.append(", updated_at: ");
		result.append(updated_at);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //VcsRepositoryImpl
