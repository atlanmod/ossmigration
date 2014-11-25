/**
 */
package Collaboration.impl;

import Collaboration.CollaborationPackage;
import Collaboration.Person;
import Collaboration.WikiComment;
import Collaboration.WikiLabel;
import Collaboration.WikiPage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wiki Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Collaboration.impl.WikiPageImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link Collaboration.impl.WikiPageImpl#getUpdated_at <em>Updated at</em>}</li>
 *   <li>{@link Collaboration.impl.WikiPageImpl#getUpdated_by <em>Updated by</em>}</li>
 *   <li>{@link Collaboration.impl.WikiPageImpl#getComments <em>Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WikiPageImpl extends ItemImpl implements WikiPage {
	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<WikiLabel> labels;

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
	 * The cached value of the '{@link #getUpdated_by() <em>Updated by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated_by()
	 * @generated
	 * @ordered
	 */
	protected Person updated_by;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<WikiComment> comments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WikiPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollaborationPackage.Literals.WIKI_PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WikiLabel> getLabels() {
		if (labels == null) {
			labels = new EObjectResolvingEList<WikiLabel>(WikiLabel.class, this, CollaborationPackage.WIKI_PAGE__LABELS);
		}
		return labels;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.WIKI_PAGE__UPDATED_AT, oldUpdated_at, updated_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getUpdated_by() {
		if (updated_by != null && updated_by.eIsProxy()) {
			InternalEObject oldUpdated_by = (InternalEObject)updated_by;
			updated_by = (Person)eResolveProxy(oldUpdated_by);
			if (updated_by != oldUpdated_by) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationPackage.WIKI_PAGE__UPDATED_BY, oldUpdated_by, updated_by));
			}
		}
		return updated_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetUpdated_by() {
		return updated_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdated_by(Person newUpdated_by) {
		Person oldUpdated_by = updated_by;
		updated_by = newUpdated_by;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.WIKI_PAGE__UPDATED_BY, oldUpdated_by, updated_by));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WikiComment> getComments() {
		if (comments == null) {
			comments = new EObjectContainmentEList<WikiComment>(WikiComment.class, this, CollaborationPackage.WIKI_PAGE__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationPackage.WIKI_PAGE__COMMENTS:
				return ((InternalEList<?>)getComments()).basicRemove(otherEnd, msgs);
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
			case CollaborationPackage.WIKI_PAGE__LABELS:
				return getLabels();
			case CollaborationPackage.WIKI_PAGE__UPDATED_AT:
				return getUpdated_at();
			case CollaborationPackage.WIKI_PAGE__UPDATED_BY:
				if (resolve) return getUpdated_by();
				return basicGetUpdated_by();
			case CollaborationPackage.WIKI_PAGE__COMMENTS:
				return getComments();
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
			case CollaborationPackage.WIKI_PAGE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends WikiLabel>)newValue);
				return;
			case CollaborationPackage.WIKI_PAGE__UPDATED_AT:
				setUpdated_at((String)newValue);
				return;
			case CollaborationPackage.WIKI_PAGE__UPDATED_BY:
				setUpdated_by((Person)newValue);
				return;
			case CollaborationPackage.WIKI_PAGE__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends WikiComment>)newValue);
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
			case CollaborationPackage.WIKI_PAGE__LABELS:
				getLabels().clear();
				return;
			case CollaborationPackage.WIKI_PAGE__UPDATED_AT:
				setUpdated_at(UPDATED_AT_EDEFAULT);
				return;
			case CollaborationPackage.WIKI_PAGE__UPDATED_BY:
				setUpdated_by((Person)null);
				return;
			case CollaborationPackage.WIKI_PAGE__COMMENTS:
				getComments().clear();
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
			case CollaborationPackage.WIKI_PAGE__LABELS:
				return labels != null && !labels.isEmpty();
			case CollaborationPackage.WIKI_PAGE__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? updated_at != null : !UPDATED_AT_EDEFAULT.equals(updated_at);
			case CollaborationPackage.WIKI_PAGE__UPDATED_BY:
				return updated_by != null;
			case CollaborationPackage.WIKI_PAGE__COMMENTS:
				return comments != null && !comments.isEmpty();
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
		result.append(" (updated_at: ");
		result.append(updated_at);
		result.append(')');
		return result.toString();
	}

} //WikiPageImpl
