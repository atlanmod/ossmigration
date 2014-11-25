/**
 */
package Collaboration.impl;

import Collaboration.BugTrackingSystem;
import Collaboration.CollaborationPackage;
import Collaboration.CommunicationChannel;
import Collaboration.Company;
import Collaboration.License;
import Collaboration.Person;
import Collaboration.Project;
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
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Collaboration.impl.ProjectImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectImpl#getYear <em>Year</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectImpl#isActive <em>Active</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectImpl#getVcsRepositories <em>Vcs Repositories</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectImpl#getCommunicationChannels <em>Communication Channels</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectImpl#getBugTrackingSystems <em>Bug Tracking Systems</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectImpl#getLicenses <em>Licenses</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectImpl#getHomePage <em>Home Page</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectImpl#getCompanies <em>Companies</em>}</li>
 *   <li>{@link Collaboration.impl.ProjectImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Project parent;

	/**
	 * The cached value of the '{@link #getVcsRepositories() <em>Vcs Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcsRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<VcsRepository> vcsRepositories;

	/**
	 * The cached value of the '{@link #getCommunicationChannels() <em>Communication Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationChannel> communicationChannels;

	/**
	 * The cached value of the '{@link #getBugTrackingSystems() <em>Bug Tracking Systems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBugTrackingSystems()
	 * @generated
	 * @ordered
	 */
	protected EList<BugTrackingSystem> bugTrackingSystems;

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
	 * The cached value of the '{@link #getLicenses() <em>Licenses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenses()
	 * @generated
	 * @ordered
	 */
	protected EList<License> licenses;

	/**
	 * The default value of the '{@link #getHomePage() <em>Home Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomePage()
	 * @generated
	 * @ordered
	 */
	protected static final String HOME_PAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomePage() <em>Home Page</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomePage()
	 * @generated
	 * @ordered
	 */
	protected String homePage = HOME_PAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompanies() <em>Companies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanies()
	 * @generated
	 * @ordered
	 */
	protected EList<Company> companies;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollaborationPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.PROJECT__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.PROJECT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.PROJECT__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.PROJECT__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Project)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollaborationPackage.PROJECT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Project newParent) {
		Project oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.PROJECT__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VcsRepository> getVcsRepositories() {
		if (vcsRepositories == null) {
			vcsRepositories = new EObjectContainmentEList<VcsRepository>(VcsRepository.class, this, CollaborationPackage.PROJECT__VCS_REPOSITORIES);
		}
		return vcsRepositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationChannel> getCommunicationChannels() {
		if (communicationChannels == null) {
			communicationChannels = new EObjectContainmentEList<CommunicationChannel>(CommunicationChannel.class, this, CollaborationPackage.PROJECT__COMMUNICATION_CHANNELS);
		}
		return communicationChannels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BugTrackingSystem> getBugTrackingSystems() {
		if (bugTrackingSystems == null) {
			bugTrackingSystems = new EObjectContainmentEList<BugTrackingSystem>(BugTrackingSystem.class, this, CollaborationPackage.PROJECT__BUG_TRACKING_SYSTEMS);
		}
		return bugTrackingSystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectResolvingEList<Person>(Person.class, this, CollaborationPackage.PROJECT__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<License> getLicenses() {
		if (licenses == null) {
			licenses = new EObjectResolvingEList<License>(License.class, this, CollaborationPackage.PROJECT__LICENSES);
		}
		return licenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHomePage() {
		return homePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHomePage(String newHomePage) {
		String oldHomePage = homePage;
		homePage = newHomePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.PROJECT__HOME_PAGE, oldHomePage, homePage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Company> getCompanies() {
		if (companies == null) {
			companies = new EObjectResolvingEList<Company>(Company.class, this, CollaborationPackage.PROJECT__COMPANIES);
		}
		return companies;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CollaborationPackage.PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CollaborationPackage.PROJECT__VCS_REPOSITORIES:
				return ((InternalEList<?>)getVcsRepositories()).basicRemove(otherEnd, msgs);
			case CollaborationPackage.PROJECT__COMMUNICATION_CHANNELS:
				return ((InternalEList<?>)getCommunicationChannels()).basicRemove(otherEnd, msgs);
			case CollaborationPackage.PROJECT__BUG_TRACKING_SYSTEMS:
				return ((InternalEList<?>)getBugTrackingSystems()).basicRemove(otherEnd, msgs);
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
			case CollaborationPackage.PROJECT__SHORT_NAME:
				return getShortName();
			case CollaborationPackage.PROJECT__DESCRIPTION:
				return getDescription();
			case CollaborationPackage.PROJECT__YEAR:
				return getYear();
			case CollaborationPackage.PROJECT__ACTIVE:
				return isActive();
			case CollaborationPackage.PROJECT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CollaborationPackage.PROJECT__VCS_REPOSITORIES:
				return getVcsRepositories();
			case CollaborationPackage.PROJECT__COMMUNICATION_CHANNELS:
				return getCommunicationChannels();
			case CollaborationPackage.PROJECT__BUG_TRACKING_SYSTEMS:
				return getBugTrackingSystems();
			case CollaborationPackage.PROJECT__PERSONS:
				return getPersons();
			case CollaborationPackage.PROJECT__LICENSES:
				return getLicenses();
			case CollaborationPackage.PROJECT__HOME_PAGE:
				return getHomePage();
			case CollaborationPackage.PROJECT__COMPANIES:
				return getCompanies();
			case CollaborationPackage.PROJECT__NAME:
				return getName();
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
			case CollaborationPackage.PROJECT__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case CollaborationPackage.PROJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CollaborationPackage.PROJECT__YEAR:
				setYear((Integer)newValue);
				return;
			case CollaborationPackage.PROJECT__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case CollaborationPackage.PROJECT__PARENT:
				setParent((Project)newValue);
				return;
			case CollaborationPackage.PROJECT__VCS_REPOSITORIES:
				getVcsRepositories().clear();
				getVcsRepositories().addAll((Collection<? extends VcsRepository>)newValue);
				return;
			case CollaborationPackage.PROJECT__COMMUNICATION_CHANNELS:
				getCommunicationChannels().clear();
				getCommunicationChannels().addAll((Collection<? extends CommunicationChannel>)newValue);
				return;
			case CollaborationPackage.PROJECT__BUG_TRACKING_SYSTEMS:
				getBugTrackingSystems().clear();
				getBugTrackingSystems().addAll((Collection<? extends BugTrackingSystem>)newValue);
				return;
			case CollaborationPackage.PROJECT__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case CollaborationPackage.PROJECT__LICENSES:
				getLicenses().clear();
				getLicenses().addAll((Collection<? extends License>)newValue);
				return;
			case CollaborationPackage.PROJECT__HOME_PAGE:
				setHomePage((String)newValue);
				return;
			case CollaborationPackage.PROJECT__COMPANIES:
				getCompanies().clear();
				getCompanies().addAll((Collection<? extends Company>)newValue);
				return;
			case CollaborationPackage.PROJECT__NAME:
				setName((String)newValue);
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
			case CollaborationPackage.PROJECT__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case CollaborationPackage.PROJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CollaborationPackage.PROJECT__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case CollaborationPackage.PROJECT__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case CollaborationPackage.PROJECT__PARENT:
				setParent((Project)null);
				return;
			case CollaborationPackage.PROJECT__VCS_REPOSITORIES:
				getVcsRepositories().clear();
				return;
			case CollaborationPackage.PROJECT__COMMUNICATION_CHANNELS:
				getCommunicationChannels().clear();
				return;
			case CollaborationPackage.PROJECT__BUG_TRACKING_SYSTEMS:
				getBugTrackingSystems().clear();
				return;
			case CollaborationPackage.PROJECT__PERSONS:
				getPersons().clear();
				return;
			case CollaborationPackage.PROJECT__LICENSES:
				getLicenses().clear();
				return;
			case CollaborationPackage.PROJECT__HOME_PAGE:
				setHomePage(HOME_PAGE_EDEFAULT);
				return;
			case CollaborationPackage.PROJECT__COMPANIES:
				getCompanies().clear();
				return;
			case CollaborationPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
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
			case CollaborationPackage.PROJECT__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case CollaborationPackage.PROJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CollaborationPackage.PROJECT__YEAR:
				return year != YEAR_EDEFAULT;
			case CollaborationPackage.PROJECT__ACTIVE:
				return active != ACTIVE_EDEFAULT;
			case CollaborationPackage.PROJECT__PARENT:
				return parent != null;
			case CollaborationPackage.PROJECT__VCS_REPOSITORIES:
				return vcsRepositories != null && !vcsRepositories.isEmpty();
			case CollaborationPackage.PROJECT__COMMUNICATION_CHANNELS:
				return communicationChannels != null && !communicationChannels.isEmpty();
			case CollaborationPackage.PROJECT__BUG_TRACKING_SYSTEMS:
				return bugTrackingSystems != null && !bugTrackingSystems.isEmpty();
			case CollaborationPackage.PROJECT__PERSONS:
				return persons != null && !persons.isEmpty();
			case CollaborationPackage.PROJECT__LICENSES:
				return licenses != null && !licenses.isEmpty();
			case CollaborationPackage.PROJECT__HOME_PAGE:
				return HOME_PAGE_EDEFAULT == null ? homePage != null : !HOME_PAGE_EDEFAULT.equals(homePage);
			case CollaborationPackage.PROJECT__COMPANIES:
				return companies != null && !companies.isEmpty();
			case CollaborationPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (shortName: ");
		result.append(shortName);
		result.append(", description: ");
		result.append(description);
		result.append(", year: ");
		result.append(year);
		result.append(", active: ");
		result.append(active);
		result.append(", homePage: ");
		result.append(homePage);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
