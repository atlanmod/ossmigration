/**
 */
package Collaboration.impl;

import Collaboration.CollaborationPackage;
import Collaboration.Issue;
import Collaboration.IssueLabel;
import Collaboration.Person;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Collaboration.impl.IssueImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link Collaboration.impl.IssueImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link Collaboration.impl.IssueImpl#getBody <em>Body</em>}</li>
 *   <li>{@link Collaboration.impl.IssueImpl#getState <em>State</em>}</li>
 *   <li>{@link Collaboration.impl.IssueImpl#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link Collaboration.impl.IssueImpl#getClosed_at <em>Closed at</em>}</li>
 *   <li>{@link Collaboration.impl.IssueImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link Collaboration.impl.IssueImpl#getClosed_by <em>Closed by</em>}</li>
 *   <li>{@link Collaboration.impl.IssueImpl#getCreated_by <em>Created by</em>}</li>
 *   <li>{@link Collaboration.impl.IssueImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IssueImpl extends MinimalEObjectImpl.Container implements Issue {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

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
	 * The default value of the '{@link #getClosed_at() <em>Closed at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosed_at()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOSED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClosed_at() <em>Closed at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosed_at()
	 * @generated
	 * @ordered
	 */
	protected String closed_at = CLOSED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected String severity = SEVERITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClosed_by() <em>Closed by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosed_by()
	 * @generated
	 * @ordered
	 */
	protected Person closed_by;

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
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueLabel> labels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollaborationPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(Integer newNumber) {
		Integer oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.ISSUE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.ISSUE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.ISSUE__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.ISSUE__STATE, oldState, state));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.ISSUE__CREATED_AT, oldCreated_at, created_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClosed_at() {
		return closed_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosed_at(String newClosed_at) {
		String oldClosed_at = closed_at;
		closed_at = newClosed_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.ISSUE__CLOSED_AT, oldClosed_at, closed_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(String newSeverity) {
		String oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.ISSUE__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getClosed_by() {
		if (closed_by != null && closed_by.eIsProxy()) {
			InternalEObject oldClosed_by = (InternalEObject)closed_by;
			closed_by = (Person)eResolveProxy(oldClosed_by);
			if (closed_by != oldClosed_by) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationPackage.ISSUE__CLOSED_BY, oldClosed_by, closed_by));
			}
		}
		return closed_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetClosed_by() {
		return closed_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosed_by(Person newClosed_by) {
		Person oldClosed_by = closed_by;
		closed_by = newClosed_by;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.ISSUE__CLOSED_BY, oldClosed_by, closed_by));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationPackage.ISSUE__CREATED_BY, oldCreated_by, created_by));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.ISSUE__CREATED_BY, oldCreated_by, created_by));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IssueLabel> getLabels() {
		if (labels == null) {
			labels = new EObjectResolvingEList<IssueLabel>(IssueLabel.class, this, CollaborationPackage.ISSUE__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollaborationPackage.ISSUE__NUMBER:
				return getNumber();
			case CollaborationPackage.ISSUE__TITLE:
				return getTitle();
			case CollaborationPackage.ISSUE__BODY:
				return getBody();
			case CollaborationPackage.ISSUE__STATE:
				return getState();
			case CollaborationPackage.ISSUE__CREATED_AT:
				return getCreated_at();
			case CollaborationPackage.ISSUE__CLOSED_AT:
				return getClosed_at();
			case CollaborationPackage.ISSUE__SEVERITY:
				return getSeverity();
			case CollaborationPackage.ISSUE__CLOSED_BY:
				if (resolve) return getClosed_by();
				return basicGetClosed_by();
			case CollaborationPackage.ISSUE__CREATED_BY:
				if (resolve) return getCreated_by();
				return basicGetCreated_by();
			case CollaborationPackage.ISSUE__LABELS:
				return getLabels();
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
			case CollaborationPackage.ISSUE__NUMBER:
				setNumber((Integer)newValue);
				return;
			case CollaborationPackage.ISSUE__TITLE:
				setTitle((String)newValue);
				return;
			case CollaborationPackage.ISSUE__BODY:
				setBody((String)newValue);
				return;
			case CollaborationPackage.ISSUE__STATE:
				setState((String)newValue);
				return;
			case CollaborationPackage.ISSUE__CREATED_AT:
				setCreated_at((String)newValue);
				return;
			case CollaborationPackage.ISSUE__CLOSED_AT:
				setClosed_at((String)newValue);
				return;
			case CollaborationPackage.ISSUE__SEVERITY:
				setSeverity((String)newValue);
				return;
			case CollaborationPackage.ISSUE__CLOSED_BY:
				setClosed_by((Person)newValue);
				return;
			case CollaborationPackage.ISSUE__CREATED_BY:
				setCreated_by((Person)newValue);
				return;
			case CollaborationPackage.ISSUE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends IssueLabel>)newValue);
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
			case CollaborationPackage.ISSUE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case CollaborationPackage.ISSUE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CollaborationPackage.ISSUE__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case CollaborationPackage.ISSUE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case CollaborationPackage.ISSUE__CREATED_AT:
				setCreated_at(CREATED_AT_EDEFAULT);
				return;
			case CollaborationPackage.ISSUE__CLOSED_AT:
				setClosed_at(CLOSED_AT_EDEFAULT);
				return;
			case CollaborationPackage.ISSUE__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case CollaborationPackage.ISSUE__CLOSED_BY:
				setClosed_by((Person)null);
				return;
			case CollaborationPackage.ISSUE__CREATED_BY:
				setCreated_by((Person)null);
				return;
			case CollaborationPackage.ISSUE__LABELS:
				getLabels().clear();
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
			case CollaborationPackage.ISSUE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case CollaborationPackage.ISSUE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CollaborationPackage.ISSUE__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case CollaborationPackage.ISSUE__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case CollaborationPackage.ISSUE__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? created_at != null : !CREATED_AT_EDEFAULT.equals(created_at);
			case CollaborationPackage.ISSUE__CLOSED_AT:
				return CLOSED_AT_EDEFAULT == null ? closed_at != null : !CLOSED_AT_EDEFAULT.equals(closed_at);
			case CollaborationPackage.ISSUE__SEVERITY:
				return SEVERITY_EDEFAULT == null ? severity != null : !SEVERITY_EDEFAULT.equals(severity);
			case CollaborationPackage.ISSUE__CLOSED_BY:
				return closed_by != null;
			case CollaborationPackage.ISSUE__CREATED_BY:
				return created_by != null;
			case CollaborationPackage.ISSUE__LABELS:
				return labels != null && !labels.isEmpty();
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
		result.append(" (number: ");
		result.append(number);
		result.append(", title: ");
		result.append(title);
		result.append(", body: ");
		result.append(body);
		result.append(", state: ");
		result.append(state);
		result.append(", created_at: ");
		result.append(created_at);
		result.append(", closed_at: ");
		result.append(closed_at);
		result.append(", severity: ");
		result.append(severity);
		result.append(')');
		return result.toString();
	}

} //IssueImpl
