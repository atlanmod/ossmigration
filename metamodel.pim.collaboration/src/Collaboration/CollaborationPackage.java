/**
 */
package Collaboration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Collaboration.CollaborationFactory
 * @model kind="package"
 * @generated
 */
public interface CollaborationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Collaboration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Collaboration";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Collaboration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollaborationPackage eINSTANCE = Collaboration.impl.CollaborationPackageImpl.init();

	/**
	 * The meta object id for the '{@link Collaboration.impl.ProjectRepositoryImpl <em>Project Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.ProjectRepositoryImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getProjectRepository()
	 * @generated
	 */
	int PROJECT_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REPOSITORY__PROJECTS = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REPOSITORY__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REPOSITORY__PERSONS = 2;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REPOSITORY__LICENSES = 3;

	/**
	 * The feature id for the '<em><b>Companies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REPOSITORY__COMPANIES = 4;

	/**
	 * The number of structural features of the '<em>Project Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REPOSITORY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Project Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.ProjectImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SHORT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__YEAR = 2;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ACTIVE = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PARENT = 4;

	/**
	 * The feature id for the '<em><b>Vcs Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VCS_REPOSITORIES = 5;

	/**
	 * The feature id for the '<em><b>Communication Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__COMMUNICATION_CHANNELS = 6;

	/**
	 * The feature id for the '<em><b>Bug Tracking Systems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BUG_TRACKING_SYSTEMS = 7;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PERSONS = 8;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LICENSES = 9;

	/**
	 * The feature id for the '<em><b>Home Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__HOME_PAGE = 10;

	/**
	 * The feature id for the '<em><b>Companies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__COMPANIES = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 12;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.CommunicationChannelImpl <em>Communication Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.CommunicationChannelImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getCommunicationChannel()
	 * @generated
	 */
	int COMMUNICATION_CHANNEL = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CHANNEL__URL = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CHANNEL__PERSONS = 1;

	/**
	 * The number of structural features of the '<em>Communication Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CHANNEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Communication Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.VcsRepositoryImpl <em>Vcs Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.VcsRepositoryImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getVcsRepository()
	 * @generated
	 */
	int VCS_REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_REPOSITORY__CREATED_AT = 0;

	/**
	 * The feature id for the '<em><b>Updated at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_REPOSITORY__UPDATED_AT = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_REPOSITORY__URL = 2;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_REPOSITORY__PERSONS = 3;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_REPOSITORY__COMMITS = 4;

	/**
	 * The number of structural features of the '<em>Vcs Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_REPOSITORY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Vcs Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCS_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.CommitImpl <em>Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.CommitImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getCommit()
	 * @generated
	 */
	int COMMIT = 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__OWNER = 0;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__FILES = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__DATE = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__PARENT = 4;

	/**
	 * The number of structural features of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.FileImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 5;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__EXTENSION = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CHECK_SUM = 2;

	/**
	 * The feature id for the '<em><b>Is Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__IS_DIRECTORY = 3;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PERMISSION = 4;

	/**
	 * The feature id for the '<em><b>Childs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CHILDS = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PARENT = 6;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CREATED_AT = 9;

	/**
	 * The feature id for the '<em><b>Modified at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MODIFIED_AT = 10;

	/**
	 * The feature id for the '<em><b>Created by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CREATED_BY = 11;

	/**
	 * The feature id for the '<em><b>Modified by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__MODIFIED_BY = 12;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.BugTrackingSystemImpl <em>Bug Tracking System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.BugTrackingSystemImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getBugTrackingSystem()
	 * @generated
	 */
	int BUG_TRACKING_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUG_TRACKING_SYSTEM__URL = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUG_TRACKING_SYSTEM__PERSONS = 1;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUG_TRACKING_SYSTEM__ISSUES = 2;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUG_TRACKING_SYSTEM__LABELS = 3;

	/**
	 * The number of structural features of the '<em>Bug Tracking System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUG_TRACKING_SYSTEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bug Tracking System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUG_TRACKING_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.IssueLabelImpl <em>Issue Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.IssueLabelImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getIssueLabel()
	 * @generated
	 */
	int ISSUE_LABEL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LABEL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Issue Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LABEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Issue Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.IssueImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 8;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__BODY = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__STATE = 3;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CREATED_AT = 4;

	/**
	 * The feature id for the '<em><b>Closed at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CLOSED_AT = 5;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SEVERITY = 6;

	/**
	 * The feature id for the '<em><b>Closed by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CLOSED_BY = 7;

	/**
	 * The feature id for the '<em><b>Created by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CREATED_BY = 8;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LABELS = 9;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.PersonImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 9;

	/**
	 * The feature id for the '<em><b>Home Page</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__HOME_PAGE = 0;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ROLES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 2;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.RoleImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.LicenseImpl <em>License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.LicenseImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getLicense()
	 * @generated
	 */
	int LICENSE = 11;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__URL = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__NAME = 2;

	/**
	 * The number of structural features of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.CompanyImpl <em>Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.CompanyImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getCompany()
	 * @generated
	 */
	int COMPANY = 12;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__URL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.ForumImpl <em>Forum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.ForumImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getForum()
	 * @generated
	 */
	int FORUM = 13;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__URL = COMMUNICATION_CHANNEL__URL;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__PERSONS = COMMUNICATION_CHANNEL__PERSONS;

	/**
	 * The feature id for the '<em><b>Posts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM__POSTS = COMMUNICATION_CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Forum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM_FEATURE_COUNT = COMMUNICATION_CHANNEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Forum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORUM_OPERATION_COUNT = COMMUNICATION_CHANNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.NewsGroupImpl <em>News Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.NewsGroupImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getNewsGroup()
	 * @generated
	 */
	int NEWS_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_GROUP__URL = COMMUNICATION_CHANNEL__URL;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_GROUP__PERSONS = COMMUNICATION_CHANNEL__PERSONS;

	/**
	 * The feature id for the '<em><b>News</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_GROUP__NEWS = COMMUNICATION_CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>News Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_GROUP_FEATURE_COUNT = COMMUNICATION_CHANNEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>News Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_GROUP_OPERATION_COUNT = COMMUNICATION_CHANNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.WikiImpl <em>Wiki</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.WikiImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getWiki()
	 * @generated
	 */
	int WIKI = 15;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI__URL = COMMUNICATION_CHANNEL__URL;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI__PERSONS = COMMUNICATION_CHANNEL__PERSONS;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI__PAGES = COMMUNICATION_CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI__LABELS = COMMUNICATION_CHANNEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Wiki</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_FEATURE_COUNT = COMMUNICATION_CHANNEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Wiki</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_OPERATION_COUNT = COMMUNICATION_CHANNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.WikiLabelImpl <em>Wiki Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.WikiLabelImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getWikiLabel()
	 * @generated
	 */
	int WIKI_LABEL = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_LABEL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Wiki Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_LABEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Wiki Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.MailingListImpl <em>Mailing List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.MailingListImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getMailingList()
	 * @generated
	 */
	int MAILING_LIST = 17;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST__URL = COMMUNICATION_CHANNEL__URL;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST__PERSONS = COMMUNICATION_CHANNEL__PERSONS;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST__MESSAGES = COMMUNICATION_CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mailing List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST_FEATURE_COUNT = COMMUNICATION_CHANNEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mailing List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAILING_LIST_OPERATION_COUNT = COMMUNICATION_CHANNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.QuestionAnswerImpl <em>Question Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.QuestionAnswerImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getQuestionAnswer()
	 * @generated
	 */
	int QUESTION_ANSWER = 24;

	/**
	 * The meta object id for the '{@link Collaboration.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.ItemImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 23;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CREATED_AT = 0;

	/**
	 * The feature id for the '<em><b>Created by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CREATED_BY = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__CONTENT = 3;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.MessageImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 18;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CREATED_AT = ITEM__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Created by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CREATED_BY = ITEM__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TITLE = ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__CONTENT = ITEM__CONTENT;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.WikiPageImpl <em>Wiki Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.WikiPageImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getWikiPage()
	 * @generated
	 */
	int WIKI_PAGE = 19;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PAGE__CREATED_AT = ITEM__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Created by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PAGE__CREATED_BY = ITEM__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PAGE__TITLE = ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PAGE__CONTENT = ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PAGE__LABELS = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Updated at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PAGE__UPDATED_AT = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Updated by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PAGE__UPDATED_BY = ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PAGE__COMMENTS = ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Wiki Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PAGE_FEATURE_COUNT = ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Wiki Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_PAGE_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.WikiCommentImpl <em>Wiki Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.WikiCommentImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getWikiComment()
	 * @generated
	 */
	int WIKI_COMMENT = 20;

	/**
	 * The feature id for the '<em><b>Created by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_COMMENT__CREATED_BY = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_COMMENT__CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_COMMENT__CREATED_AT = 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_COMMENT__PARENT = 3;

	/**
	 * The number of structural features of the '<em>Wiki Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_COMMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Wiki Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIKI_COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.NewsImpl <em>News</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.NewsImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getNews()
	 * @generated
	 */
	int NEWS = 21;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS__CREATED_AT = ITEM__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Created by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS__CREATED_BY = ITEM__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS__TITLE = ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS__CONTENT = ITEM__CONTENT;

	/**
	 * The number of structural features of the '<em>News</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>News</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEWS_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.PostImpl <em>Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.PostImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getPost()
	 * @generated
	 */
	int POST = 22;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CREATED_AT = ITEM__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Created by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CREATED_BY = ITEM__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__TITLE = ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CONTENT = ITEM__CONTENT;

	/**
	 * The number of structural features of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ANSWER__URL = COMMUNICATION_CHANNEL__URL;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ANSWER__PERSONS = COMMUNICATION_CHANNEL__PERSONS;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ANSWER__QUESTIONS = COMMUNICATION_CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Question Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ANSWER_FEATURE_COUNT = COMMUNICATION_CHANNEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Question Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_ANSWER_OPERATION_COUNT = COMMUNICATION_CHANNEL_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link Collaboration.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.QuestionImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 26;

	/**
	 * The meta object id for the '{@link Collaboration.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.AnswerImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 25;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__CREATED_AT = ITEM__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Created by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__CREATED_BY = ITEM__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__TITLE = ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__CONTENT = ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Votes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__VOTES = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__COMMENTS = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__ACCEPTED = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CREATED_AT = ITEM__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Created by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CREATED_BY = ITEM__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TITLE = ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__CONTENT = ITEM__CONTENT;

	/**
	 * The feature id for the '<em><b>Votes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__VOTES = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ANSWERS = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__COMMENTS = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Collaboration.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Collaboration.impl.CommentImpl
	 * @see Collaboration.impl.CollaborationPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 27;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CREATED_AT = ITEM__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Created by</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CREATED_BY = ITEM__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TITLE = ITEM__TITLE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CONTENT = ITEM__CONTENT;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Collaboration.ProjectRepository <em>Project Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Repository</em>'.
	 * @see Collaboration.ProjectRepository
	 * @generated
	 */
	EClass getProjectRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.ProjectRepository#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see Collaboration.ProjectRepository#getProjects()
	 * @see #getProjectRepository()
	 * @generated
	 */
	EReference getProjectRepository_Projects();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.ProjectRepository#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see Collaboration.ProjectRepository#getRoles()
	 * @see #getProjectRepository()
	 * @generated
	 */
	EReference getProjectRepository_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.ProjectRepository#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see Collaboration.ProjectRepository#getPersons()
	 * @see #getProjectRepository()
	 * @generated
	 */
	EReference getProjectRepository_Persons();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.ProjectRepository#getLicenses <em>Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Licenses</em>'.
	 * @see Collaboration.ProjectRepository#getLicenses()
	 * @see #getProjectRepository()
	 * @generated
	 */
	EReference getProjectRepository_Licenses();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.ProjectRepository#getCompanies <em>Companies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Companies</em>'.
	 * @see Collaboration.ProjectRepository#getCompanies()
	 * @see #getProjectRepository()
	 * @generated
	 */
	EReference getProjectRepository_Companies();

	/**
	 * Returns the meta object for class '{@link Collaboration.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see Collaboration.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Project#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see Collaboration.Project#getShortName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ShortName();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Collaboration.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Description();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Project#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see Collaboration.Project#getYear()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Year();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Project#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see Collaboration.Project#isActive()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Active();

	/**
	 * Returns the meta object for the reference '{@link Collaboration.Project#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see Collaboration.Project#getParent()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Parent();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.Project#getVcsRepositories <em>Vcs Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vcs Repositories</em>'.
	 * @see Collaboration.Project#getVcsRepositories()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_VcsRepositories();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.Project#getCommunicationChannels <em>Communication Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communication Channels</em>'.
	 * @see Collaboration.Project#getCommunicationChannels()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_CommunicationChannels();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.Project#getBugTrackingSystems <em>Bug Tracking Systems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bug Tracking Systems</em>'.
	 * @see Collaboration.Project#getBugTrackingSystems()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_BugTrackingSystems();

	/**
	 * Returns the meta object for the reference list '{@link Collaboration.Project#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Persons</em>'.
	 * @see Collaboration.Project#getPersons()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Persons();

	/**
	 * Returns the meta object for the reference list '{@link Collaboration.Project#getLicenses <em>Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Licenses</em>'.
	 * @see Collaboration.Project#getLicenses()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Licenses();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Project#getHomePage <em>Home Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Page</em>'.
	 * @see Collaboration.Project#getHomePage()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_HomePage();

	/**
	 * Returns the meta object for the reference list '{@link Collaboration.Project#getCompanies <em>Companies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Companies</em>'.
	 * @see Collaboration.Project#getCompanies()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Companies();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Collaboration.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for class '{@link Collaboration.CommunicationChannel <em>Communication Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Channel</em>'.
	 * @see Collaboration.CommunicationChannel
	 * @generated
	 */
	EClass getCommunicationChannel();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.CommunicationChannel#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see Collaboration.CommunicationChannel#getUrl()
	 * @see #getCommunicationChannel()
	 * @generated
	 */
	EAttribute getCommunicationChannel_Url();

	/**
	 * Returns the meta object for the reference list '{@link Collaboration.CommunicationChannel#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Persons</em>'.
	 * @see Collaboration.CommunicationChannel#getPersons()
	 * @see #getCommunicationChannel()
	 * @generated
	 */
	EReference getCommunicationChannel_Persons();

	/**
	 * Returns the meta object for class '{@link Collaboration.VcsRepository <em>Vcs Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vcs Repository</em>'.
	 * @see Collaboration.VcsRepository
	 * @generated
	 */
	EClass getVcsRepository();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.VcsRepository#getCreated_at <em>Created at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created at</em>'.
	 * @see Collaboration.VcsRepository#getCreated_at()
	 * @see #getVcsRepository()
	 * @generated
	 */
	EAttribute getVcsRepository_Created_at();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.VcsRepository#getUpdated_at <em>Updated at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated at</em>'.
	 * @see Collaboration.VcsRepository#getUpdated_at()
	 * @see #getVcsRepository()
	 * @generated
	 */
	EAttribute getVcsRepository_Updated_at();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.VcsRepository#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see Collaboration.VcsRepository#getUrl()
	 * @see #getVcsRepository()
	 * @generated
	 */
	EAttribute getVcsRepository_Url();

	/**
	 * Returns the meta object for the reference list '{@link Collaboration.VcsRepository#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Persons</em>'.
	 * @see Collaboration.VcsRepository#getPersons()
	 * @see #getVcsRepository()
	 * @generated
	 */
	EReference getVcsRepository_Persons();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.VcsRepository#getCommits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commits</em>'.
	 * @see Collaboration.VcsRepository#getCommits()
	 * @see #getVcsRepository()
	 * @generated
	 */
	EReference getVcsRepository_Commits();

	/**
	 * Returns the meta object for class '{@link Collaboration.Commit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commit</em>'.
	 * @see Collaboration.Commit
	 * @generated
	 */
	EClass getCommit();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Commit#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see Collaboration.Commit#getMessage()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Message();

	/**
	 * Returns the meta object for the reference '{@link Collaboration.Commit#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see Collaboration.Commit#getOwner()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.Commit#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see Collaboration.Commit#getFiles()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Files();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Commit#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see Collaboration.Commit#getDate()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Date();

	/**
	 * Returns the meta object for the reference '{@link Collaboration.Commit#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see Collaboration.Commit#getParent()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Parent();

	/**
	 * Returns the meta object for class '{@link Collaboration.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see Collaboration.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.File#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see Collaboration.File#getExtension()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Extension();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.File#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see Collaboration.File#getSize()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Size();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.File#getCheckSum <em>Check Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Sum</em>'.
	 * @see Collaboration.File#getCheckSum()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_CheckSum();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.File#isIsDirectory <em>Is Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Directory</em>'.
	 * @see Collaboration.File#isIsDirectory()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_IsDirectory();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.File#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see Collaboration.File#getPermission()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Permission();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.File#getChilds <em>Childs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Childs</em>'.
	 * @see Collaboration.File#getChilds()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Childs();

	/**
	 * Returns the meta object for the container reference '{@link Collaboration.File#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see Collaboration.File#getParent()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Parent();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.File#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see Collaboration.File#getPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Path();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Collaboration.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.File#getCreated_at <em>Created at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created at</em>'.
	 * @see Collaboration.File#getCreated_at()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Created_at();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.File#getModified_at <em>Modified at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified at</em>'.
	 * @see Collaboration.File#getModified_at()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Modified_at();

	/**
	 * Returns the meta object for the reference '{@link Collaboration.File#getCreated_by <em>Created by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created by</em>'.
	 * @see Collaboration.File#getCreated_by()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Created_by();

	/**
	 * Returns the meta object for the reference '{@link Collaboration.File#getModified_by <em>Modified by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modified by</em>'.
	 * @see Collaboration.File#getModified_by()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Modified_by();

	/**
	 * Returns the meta object for class '{@link Collaboration.BugTrackingSystem <em>Bug Tracking System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bug Tracking System</em>'.
	 * @see Collaboration.BugTrackingSystem
	 * @generated
	 */
	EClass getBugTrackingSystem();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.BugTrackingSystem#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see Collaboration.BugTrackingSystem#getUrl()
	 * @see #getBugTrackingSystem()
	 * @generated
	 */
	EAttribute getBugTrackingSystem_Url();

	/**
	 * Returns the meta object for the reference list '{@link Collaboration.BugTrackingSystem#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Persons</em>'.
	 * @see Collaboration.BugTrackingSystem#getPersons()
	 * @see #getBugTrackingSystem()
	 * @generated
	 */
	EReference getBugTrackingSystem_Persons();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.BugTrackingSystem#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issues</em>'.
	 * @see Collaboration.BugTrackingSystem#getIssues()
	 * @see #getBugTrackingSystem()
	 * @generated
	 */
	EReference getBugTrackingSystem_Issues();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.BugTrackingSystem#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see Collaboration.BugTrackingSystem#getLabels()
	 * @see #getBugTrackingSystem()
	 * @generated
	 */
	EReference getBugTrackingSystem_Labels();

	/**
	 * Returns the meta object for class '{@link Collaboration.IssueLabel <em>Issue Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Label</em>'.
	 * @see Collaboration.IssueLabel
	 * @generated
	 */
	EClass getIssueLabel();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.IssueLabel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Collaboration.IssueLabel#getName()
	 * @see #getIssueLabel()
	 * @generated
	 */
	EAttribute getIssueLabel_Name();

	/**
	 * Returns the meta object for class '{@link Collaboration.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see Collaboration.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Issue#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Collaboration.Issue#getNumber()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Number();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Issue#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Collaboration.Issue#getTitle()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Title();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Issue#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see Collaboration.Issue#getBody()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Body();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Issue#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see Collaboration.Issue#getState()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_State();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Issue#getCreated_at <em>Created at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created at</em>'.
	 * @see Collaboration.Issue#getCreated_at()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Created_at();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Issue#getClosed_at <em>Closed at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed at</em>'.
	 * @see Collaboration.Issue#getClosed_at()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Closed_at();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Issue#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see Collaboration.Issue#getSeverity()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Severity();

	/**
	 * Returns the meta object for the reference '{@link Collaboration.Issue#getClosed_by <em>Closed by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Closed by</em>'.
	 * @see Collaboration.Issue#getClosed_by()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Closed_by();

	/**
	 * Returns the meta object for the reference '{@link Collaboration.Issue#getCreated_by <em>Created by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created by</em>'.
	 * @see Collaboration.Issue#getCreated_by()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Created_by();

	/**
	 * Returns the meta object for the reference list '{@link Collaboration.Issue#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labels</em>'.
	 * @see Collaboration.Issue#getLabels()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Labels();

	/**
	 * Returns the meta object for class '{@link Collaboration.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see Collaboration.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Person#getHomePage <em>Home Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home Page</em>'.
	 * @see Collaboration.Person#getHomePage()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_HomePage();

	/**
	 * Returns the meta object for the reference list '{@link Collaboration.Person#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see Collaboration.Person#getRoles()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Roles();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Collaboration.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for class '{@link Collaboration.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see Collaboration.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Collaboration.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class '{@link Collaboration.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License</em>'.
	 * @see Collaboration.License
	 * @generated
	 */
	EClass getLicense();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.License#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see Collaboration.License#getUrl()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Url();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.License#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see Collaboration.License#getContent()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Content();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.License#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Collaboration.License#getName()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Name();

	/**
	 * Returns the meta object for class '{@link Collaboration.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company</em>'.
	 * @see Collaboration.Company
	 * @generated
	 */
	EClass getCompany();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Company#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see Collaboration.Company#getUrl()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Url();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Company#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Collaboration.Company#getName()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_Name();

	/**
	 * Returns the meta object for class '{@link Collaboration.Forum <em>Forum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forum</em>'.
	 * @see Collaboration.Forum
	 * @generated
	 */
	EClass getForum();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.Forum#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Posts</em>'.
	 * @see Collaboration.Forum#getPosts()
	 * @see #getForum()
	 * @generated
	 */
	EReference getForum_Posts();

	/**
	 * Returns the meta object for class '{@link Collaboration.NewsGroup <em>News Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>News Group</em>'.
	 * @see Collaboration.NewsGroup
	 * @generated
	 */
	EClass getNewsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.NewsGroup#getNews <em>News</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>News</em>'.
	 * @see Collaboration.NewsGroup#getNews()
	 * @see #getNewsGroup()
	 * @generated
	 */
	EReference getNewsGroup_News();

	/**
	 * Returns the meta object for class '{@link Collaboration.Wiki <em>Wiki</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wiki</em>'.
	 * @see Collaboration.Wiki
	 * @generated
	 */
	EClass getWiki();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.Wiki#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see Collaboration.Wiki#getPages()
	 * @see #getWiki()
	 * @generated
	 */
	EReference getWiki_Pages();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.Wiki#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see Collaboration.Wiki#getLabels()
	 * @see #getWiki()
	 * @generated
	 */
	EReference getWiki_Labels();

	/**
	 * Returns the meta object for class '{@link Collaboration.WikiLabel <em>Wiki Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wiki Label</em>'.
	 * @see Collaboration.WikiLabel
	 * @generated
	 */
	EClass getWikiLabel();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.WikiLabel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Collaboration.WikiLabel#getName()
	 * @see #getWikiLabel()
	 * @generated
	 */
	EAttribute getWikiLabel_Name();

	/**
	 * Returns the meta object for class '{@link Collaboration.MailingList <em>Mailing List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mailing List</em>'.
	 * @see Collaboration.MailingList
	 * @generated
	 */
	EClass getMailingList();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.MailingList#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messages</em>'.
	 * @see Collaboration.MailingList#getMessages()
	 * @see #getMailingList()
	 * @generated
	 */
	EReference getMailingList_Messages();

	/**
	 * Returns the meta object for class '{@link Collaboration.QuestionAnswer <em>Question Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Answer</em>'.
	 * @see Collaboration.QuestionAnswer
	 * @generated
	 */
	EClass getQuestionAnswer();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.QuestionAnswer#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see Collaboration.QuestionAnswer#getQuestions()
	 * @see #getQuestionAnswer()
	 * @generated
	 */
	EReference getQuestionAnswer_Questions();

	/**
	 * Returns the meta object for class '{@link Collaboration.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see Collaboration.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for class '{@link Collaboration.WikiPage <em>Wiki Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wiki Page</em>'.
	 * @see Collaboration.WikiPage
	 * @generated
	 */
	EClass getWikiPage();

	/**
	 * Returns the meta object for the reference list '{@link Collaboration.WikiPage#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Labels</em>'.
	 * @see Collaboration.WikiPage#getLabels()
	 * @see #getWikiPage()
	 * @generated
	 */
	EReference getWikiPage_Labels();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.WikiPage#getUpdated_at <em>Updated at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated at</em>'.
	 * @see Collaboration.WikiPage#getUpdated_at()
	 * @see #getWikiPage()
	 * @generated
	 */
	EAttribute getWikiPage_Updated_at();

	/**
	 * Returns the meta object for the reference '{@link Collaboration.WikiPage#getUpdated_by <em>Updated by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Updated by</em>'.
	 * @see Collaboration.WikiPage#getUpdated_by()
	 * @see #getWikiPage()
	 * @generated
	 */
	EReference getWikiPage_Updated_by();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.WikiPage#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see Collaboration.WikiPage#getComments()
	 * @see #getWikiPage()
	 * @generated
	 */
	EReference getWikiPage_Comments();

	/**
	 * Returns the meta object for class '{@link Collaboration.WikiComment <em>Wiki Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wiki Comment</em>'.
	 * @see Collaboration.WikiComment
	 * @generated
	 */
	EClass getWikiComment();

	/**
	 * Returns the meta object for the reference '{@link Collaboration.WikiComment#getCreated_by <em>Created by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created by</em>'.
	 * @see Collaboration.WikiComment#getCreated_by()
	 * @see #getWikiComment()
	 * @generated
	 */
	EReference getWikiComment_Created_by();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.WikiComment#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see Collaboration.WikiComment#getContent()
	 * @see #getWikiComment()
	 * @generated
	 */
	EAttribute getWikiComment_Content();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.WikiComment#getCreated_at <em>Created at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created at</em>'.
	 * @see Collaboration.WikiComment#getCreated_at()
	 * @see #getWikiComment()
	 * @generated
	 */
	EAttribute getWikiComment_Created_at();

	/**
	 * Returns the meta object for the reference '{@link Collaboration.WikiComment#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see Collaboration.WikiComment#getParent()
	 * @see #getWikiComment()
	 * @generated
	 */
	EReference getWikiComment_Parent();

	/**
	 * Returns the meta object for class '{@link Collaboration.News <em>News</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>News</em>'.
	 * @see Collaboration.News
	 * @generated
	 */
	EClass getNews();

	/**
	 * Returns the meta object for class '{@link Collaboration.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post</em>'.
	 * @see Collaboration.Post
	 * @generated
	 */
	EClass getPost();

	/**
	 * Returns the meta object for class '{@link Collaboration.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see Collaboration.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Item#getCreated_at <em>Created at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created at</em>'.
	 * @see Collaboration.Item#getCreated_at()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Created_at();

	/**
	 * Returns the meta object for the reference '{@link Collaboration.Item#getCreated_by <em>Created by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created by</em>'.
	 * @see Collaboration.Item#getCreated_by()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Created_by();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Item#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Collaboration.Item#getTitle()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Title();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Item#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see Collaboration.Item#getContent()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Content();

	/**
	 * Returns the meta object for class '{@link Collaboration.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see Collaboration.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.Question#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see Collaboration.Question#getAnswers()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Answers();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.Question#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see Collaboration.Question#getComments()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Comments();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Question#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Votes</em>'.
	 * @see Collaboration.Question#getVotes()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Votes();

	/**
	 * Returns the meta object for class '{@link Collaboration.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see Collaboration.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the containment reference list '{@link Collaboration.Answer#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comments</em>'.
	 * @see Collaboration.Answer#getComments()
	 * @see #getAnswer()
	 * @generated
	 */
	EReference getAnswer_Comments();

	/**
	 * Returns the meta object for the attribute '{@link Collaboration.Answer#isAccepted <em>Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted</em>'.
	 * @see Collaboration.Answer#isAccepted()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Accepted();

	/**
	 * Returns the meta object for the attribute list '{@link Collaboration.Answer#getVotes <em>Votes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Votes</em>'.
	 * @see Collaboration.Answer#getVotes()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Votes();

	/**
	 * Returns the meta object for class '{@link Collaboration.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see Collaboration.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CollaborationFactory getCollaborationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Collaboration.impl.ProjectRepositoryImpl <em>Project Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.ProjectRepositoryImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getProjectRepository()
		 * @generated
		 */
		EClass PROJECT_REPOSITORY = eINSTANCE.getProjectRepository();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_REPOSITORY__PROJECTS = eINSTANCE.getProjectRepository_Projects();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_REPOSITORY__ROLES = eINSTANCE.getProjectRepository_Roles();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_REPOSITORY__PERSONS = eINSTANCE.getProjectRepository_Persons();

		/**
		 * The meta object literal for the '<em><b>Licenses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_REPOSITORY__LICENSES = eINSTANCE.getProjectRepository_Licenses();

		/**
		 * The meta object literal for the '<em><b>Companies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_REPOSITORY__COMPANIES = eINSTANCE.getProjectRepository_Companies();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.ProjectImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__SHORT_NAME = eINSTANCE.getProject_ShortName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__YEAR = eINSTANCE.getProject_Year();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ACTIVE = eINSTANCE.getProject_Active();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PARENT = eINSTANCE.getProject_Parent();

		/**
		 * The meta object literal for the '<em><b>Vcs Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__VCS_REPOSITORIES = eINSTANCE.getProject_VcsRepositories();

		/**
		 * The meta object literal for the '<em><b>Communication Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__COMMUNICATION_CHANNELS = eINSTANCE.getProject_CommunicationChannels();

		/**
		 * The meta object literal for the '<em><b>Bug Tracking Systems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__BUG_TRACKING_SYSTEMS = eINSTANCE.getProject_BugTrackingSystems();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PERSONS = eINSTANCE.getProject_Persons();

		/**
		 * The meta object literal for the '<em><b>Licenses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__LICENSES = eINSTANCE.getProject_Licenses();

		/**
		 * The meta object literal for the '<em><b>Home Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__HOME_PAGE = eINSTANCE.getProject_HomePage();

		/**
		 * The meta object literal for the '<em><b>Companies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__COMPANIES = eINSTANCE.getProject_Companies();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.CommunicationChannelImpl <em>Communication Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.CommunicationChannelImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getCommunicationChannel()
		 * @generated
		 */
		EClass COMMUNICATION_CHANNEL = eINSTANCE.getCommunicationChannel();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_CHANNEL__URL = eINSTANCE.getCommunicationChannel_Url();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_CHANNEL__PERSONS = eINSTANCE.getCommunicationChannel_Persons();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.VcsRepositoryImpl <em>Vcs Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.VcsRepositoryImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getVcsRepository()
		 * @generated
		 */
		EClass VCS_REPOSITORY = eINSTANCE.getVcsRepository();

		/**
		 * The meta object literal for the '<em><b>Created at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCS_REPOSITORY__CREATED_AT = eINSTANCE.getVcsRepository_Created_at();

		/**
		 * The meta object literal for the '<em><b>Updated at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCS_REPOSITORY__UPDATED_AT = eINSTANCE.getVcsRepository_Updated_at();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCS_REPOSITORY__URL = eINSTANCE.getVcsRepository_Url();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCS_REPOSITORY__PERSONS = eINSTANCE.getVcsRepository_Persons();

		/**
		 * The meta object literal for the '<em><b>Commits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCS_REPOSITORY__COMMITS = eINSTANCE.getVcsRepository_Commits();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.CommitImpl <em>Commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.CommitImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getCommit()
		 * @generated
		 */
		EClass COMMIT = eINSTANCE.getCommit();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__MESSAGE = eINSTANCE.getCommit_Message();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__OWNER = eINSTANCE.getCommit_Owner();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__FILES = eINSTANCE.getCommit_Files();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__DATE = eINSTANCE.getCommit_Date();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__PARENT = eINSTANCE.getCommit_Parent();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.FileImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__EXTENSION = eINSTANCE.getFile_Extension();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__SIZE = eINSTANCE.getFile_Size();

		/**
		 * The meta object literal for the '<em><b>Check Sum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__CHECK_SUM = eINSTANCE.getFile_CheckSum();

		/**
		 * The meta object literal for the '<em><b>Is Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__IS_DIRECTORY = eINSTANCE.getFile_IsDirectory();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__PERMISSION = eINSTANCE.getFile_Permission();

		/**
		 * The meta object literal for the '<em><b>Childs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__CHILDS = eINSTANCE.getFile_Childs();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__PARENT = eINSTANCE.getFile_Parent();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__PATH = eINSTANCE.getFile_Path();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NAME = eINSTANCE.getFile_Name();

		/**
		 * The meta object literal for the '<em><b>Created at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__CREATED_AT = eINSTANCE.getFile_Created_at();

		/**
		 * The meta object literal for the '<em><b>Modified at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__MODIFIED_AT = eINSTANCE.getFile_Modified_at();

		/**
		 * The meta object literal for the '<em><b>Created by</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__CREATED_BY = eINSTANCE.getFile_Created_by();

		/**
		 * The meta object literal for the '<em><b>Modified by</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__MODIFIED_BY = eINSTANCE.getFile_Modified_by();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.BugTrackingSystemImpl <em>Bug Tracking System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.BugTrackingSystemImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getBugTrackingSystem()
		 * @generated
		 */
		EClass BUG_TRACKING_SYSTEM = eINSTANCE.getBugTrackingSystem();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUG_TRACKING_SYSTEM__URL = eINSTANCE.getBugTrackingSystem_Url();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUG_TRACKING_SYSTEM__PERSONS = eINSTANCE.getBugTrackingSystem_Persons();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUG_TRACKING_SYSTEM__ISSUES = eINSTANCE.getBugTrackingSystem_Issues();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUG_TRACKING_SYSTEM__LABELS = eINSTANCE.getBugTrackingSystem_Labels();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.IssueLabelImpl <em>Issue Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.IssueLabelImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getIssueLabel()
		 * @generated
		 */
		EClass ISSUE_LABEL = eINSTANCE.getIssueLabel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_LABEL__NAME = eINSTANCE.getIssueLabel_Name();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.IssueImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__NUMBER = eINSTANCE.getIssue_Number();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__TITLE = eINSTANCE.getIssue_Title();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__BODY = eINSTANCE.getIssue_Body();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__STATE = eINSTANCE.getIssue_State();

		/**
		 * The meta object literal for the '<em><b>Created at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__CREATED_AT = eINSTANCE.getIssue_Created_at();

		/**
		 * The meta object literal for the '<em><b>Closed at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__CLOSED_AT = eINSTANCE.getIssue_Closed_at();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__SEVERITY = eINSTANCE.getIssue_Severity();

		/**
		 * The meta object literal for the '<em><b>Closed by</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__CLOSED_BY = eINSTANCE.getIssue_Closed_by();

		/**
		 * The meta object literal for the '<em><b>Created by</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__CREATED_BY = eINSTANCE.getIssue_Created_by();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__LABELS = eINSTANCE.getIssue_Labels();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.PersonImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Home Page</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__HOME_PAGE = eINSTANCE.getPerson_HomePage();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ROLES = eINSTANCE.getPerson_Roles();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.RoleImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.LicenseImpl <em>License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.LicenseImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getLicense()
		 * @generated
		 */
		EClass LICENSE = eINSTANCE.getLicense();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__URL = eINSTANCE.getLicense_Url();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__CONTENT = eINSTANCE.getLicense_Content();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__NAME = eINSTANCE.getLicense_Name();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.CompanyImpl <em>Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.CompanyImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getCompany()
		 * @generated
		 */
		EClass COMPANY = eINSTANCE.getCompany();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__URL = eINSTANCE.getCompany_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__NAME = eINSTANCE.getCompany_Name();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.ForumImpl <em>Forum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.ForumImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getForum()
		 * @generated
		 */
		EClass FORUM = eINSTANCE.getForum();

		/**
		 * The meta object literal for the '<em><b>Posts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORUM__POSTS = eINSTANCE.getForum_Posts();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.NewsGroupImpl <em>News Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.NewsGroupImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getNewsGroup()
		 * @generated
		 */
		EClass NEWS_GROUP = eINSTANCE.getNewsGroup();

		/**
		 * The meta object literal for the '<em><b>News</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEWS_GROUP__NEWS = eINSTANCE.getNewsGroup_News();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.WikiImpl <em>Wiki</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.WikiImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getWiki()
		 * @generated
		 */
		EClass WIKI = eINSTANCE.getWiki();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI__PAGES = eINSTANCE.getWiki_Pages();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI__LABELS = eINSTANCE.getWiki_Labels();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.WikiLabelImpl <em>Wiki Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.WikiLabelImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getWikiLabel()
		 * @generated
		 */
		EClass WIKI_LABEL = eINSTANCE.getWikiLabel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIKI_LABEL__NAME = eINSTANCE.getWikiLabel_Name();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.MailingListImpl <em>Mailing List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.MailingListImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getMailingList()
		 * @generated
		 */
		EClass MAILING_LIST = eINSTANCE.getMailingList();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAILING_LIST__MESSAGES = eINSTANCE.getMailingList_Messages();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.QuestionAnswerImpl <em>Question Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.QuestionAnswerImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getQuestionAnswer()
		 * @generated
		 */
		EClass QUESTION_ANSWER = eINSTANCE.getQuestionAnswer();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_ANSWER__QUESTIONS = eINSTANCE.getQuestionAnswer_Questions();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.MessageImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.WikiPageImpl <em>Wiki Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.WikiPageImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getWikiPage()
		 * @generated
		 */
		EClass WIKI_PAGE = eINSTANCE.getWikiPage();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI_PAGE__LABELS = eINSTANCE.getWikiPage_Labels();

		/**
		 * The meta object literal for the '<em><b>Updated at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIKI_PAGE__UPDATED_AT = eINSTANCE.getWikiPage_Updated_at();

		/**
		 * The meta object literal for the '<em><b>Updated by</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI_PAGE__UPDATED_BY = eINSTANCE.getWikiPage_Updated_by();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI_PAGE__COMMENTS = eINSTANCE.getWikiPage_Comments();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.WikiCommentImpl <em>Wiki Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.WikiCommentImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getWikiComment()
		 * @generated
		 */
		EClass WIKI_COMMENT = eINSTANCE.getWikiComment();

		/**
		 * The meta object literal for the '<em><b>Created by</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI_COMMENT__CREATED_BY = eINSTANCE.getWikiComment_Created_by();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIKI_COMMENT__CONTENT = eINSTANCE.getWikiComment_Content();

		/**
		 * The meta object literal for the '<em><b>Created at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIKI_COMMENT__CREATED_AT = eINSTANCE.getWikiComment_Created_at();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIKI_COMMENT__PARENT = eINSTANCE.getWikiComment_Parent();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.NewsImpl <em>News</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.NewsImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getNews()
		 * @generated
		 */
		EClass NEWS = eINSTANCE.getNews();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.PostImpl <em>Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.PostImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getPost()
		 * @generated
		 */
		EClass POST = eINSTANCE.getPost();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.ItemImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Created at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__CREATED_AT = eINSTANCE.getItem_Created_at();

		/**
		 * The meta object literal for the '<em><b>Created by</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__CREATED_BY = eINSTANCE.getItem_Created_by();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__TITLE = eINSTANCE.getItem_Title();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__CONTENT = eINSTANCE.getItem_Content();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.QuestionImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ANSWERS = eINSTANCE.getQuestion_Answers();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__COMMENTS = eINSTANCE.getQuestion_Comments();

		/**
		 * The meta object literal for the '<em><b>Votes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__VOTES = eINSTANCE.getQuestion_Votes();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.AnswerImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER__COMMENTS = eINSTANCE.getAnswer_Comments();

		/**
		 * The meta object literal for the '<em><b>Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__ACCEPTED = eINSTANCE.getAnswer_Accepted();

		/**
		 * The meta object literal for the '<em><b>Votes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__VOTES = eINSTANCE.getAnswer_Votes();

		/**
		 * The meta object literal for the '{@link Collaboration.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Collaboration.impl.CommentImpl
		 * @see Collaboration.impl.CollaborationPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

	}

} //CollaborationPackage
