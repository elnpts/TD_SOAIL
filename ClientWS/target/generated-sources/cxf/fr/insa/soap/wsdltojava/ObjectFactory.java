
package fr.insa.soap.wsdltojava;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.insa.soap.wsdltojava package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddPeopleInNeed_QNAME = new QName("http://Service_web/", "add-people-in-need");
    private final static QName _AddPeopleInNeedResponse_QNAME = new QName("http://Service_web/", "add-people-in-needResponse");
    private final static QName _AddValidators_QNAME = new QName("http://Service_web/", "add-validators");
    private final static QName _AddValidatorsResponse_QNAME = new QName("http://Service_web/", "add-validatorsResponse");
    private final static QName _AddVolunteers_QNAME = new QName("http://Service_web/", "add-volunteers");
    private final static QName _AddVolunteersResponse_QNAME = new QName("http://Service_web/", "add-volunteersResponse");
    private final static QName _Compare_QNAME = new QName("http://Service_web/", "compare");
    private final static QName _CompareResponse_QNAME = new QName("http://Service_web/", "compareResponse");
    private final static QName _GetUsers_QNAME = new QName("http://Service_web/", "getUsers");
    private final static QName _GetUsersResponse_QNAME = new QName("http://Service_web/", "getUsersResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.insa.soap.wsdltojava
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPeopleInNeed }
     * 
     */
    public AddPeopleInNeed createAddPeopleInNeed() {
        return new AddPeopleInNeed();
    }

    /**
     * Create an instance of {@link AddPeopleInNeedResponse }
     * 
     */
    public AddPeopleInNeedResponse createAddPeopleInNeedResponse() {
        return new AddPeopleInNeedResponse();
    }

    /**
     * Create an instance of {@link AddValidators }
     * 
     */
    public AddValidators createAddValidators() {
        return new AddValidators();
    }

    /**
     * Create an instance of {@link AddValidatorsResponse }
     * 
     */
    public AddValidatorsResponse createAddValidatorsResponse() {
        return new AddValidatorsResponse();
    }

    /**
     * Create an instance of {@link AddVolunteers }
     * 
     */
    public AddVolunteers createAddVolunteers() {
        return new AddVolunteers();
    }

    /**
     * Create an instance of {@link AddVolunteersResponse }
     * 
     */
    public AddVolunteersResponse createAddVolunteersResponse() {
        return new AddVolunteersResponse();
    }

    /**
     * Create an instance of {@link Compare }
     * 
     */
    public Compare createCompare() {
        return new Compare();
    }

    /**
     * Create an instance of {@link CompareResponse }
     * 
     */
    public CompareResponse createCompareResponse() {
        return new CompareResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPeopleInNeed }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPeopleInNeed }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service_web/", name = "add-people-in-need")
    public JAXBElement<AddPeopleInNeed> createAddPeopleInNeed(AddPeopleInNeed value) {
        return new JAXBElement<AddPeopleInNeed>(_AddPeopleInNeed_QNAME, AddPeopleInNeed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPeopleInNeedResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddPeopleInNeedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service_web/", name = "add-people-in-needResponse")
    public JAXBElement<AddPeopleInNeedResponse> createAddPeopleInNeedResponse(AddPeopleInNeedResponse value) {
        return new JAXBElement<AddPeopleInNeedResponse>(_AddPeopleInNeedResponse_QNAME, AddPeopleInNeedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddValidators }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddValidators }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service_web/", name = "add-validators")
    public JAXBElement<AddValidators> createAddValidators(AddValidators value) {
        return new JAXBElement<AddValidators>(_AddValidators_QNAME, AddValidators.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddValidatorsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddValidatorsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service_web/", name = "add-validatorsResponse")
    public JAXBElement<AddValidatorsResponse> createAddValidatorsResponse(AddValidatorsResponse value) {
        return new JAXBElement<AddValidatorsResponse>(_AddValidatorsResponse_QNAME, AddValidatorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVolunteers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddVolunteers }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service_web/", name = "add-volunteers")
    public JAXBElement<AddVolunteers> createAddVolunteers(AddVolunteers value) {
        return new JAXBElement<AddVolunteers>(_AddVolunteers_QNAME, AddVolunteers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVolunteersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddVolunteersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service_web/", name = "add-volunteersResponse")
    public JAXBElement<AddVolunteersResponse> createAddVolunteersResponse(AddVolunteersResponse value) {
        return new JAXBElement<AddVolunteersResponse>(_AddVolunteersResponse_QNAME, AddVolunteersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compare }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Compare }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service_web/", name = "compare")
    public JAXBElement<Compare> createCompare(Compare value) {
        return new JAXBElement<Compare>(_Compare_QNAME, Compare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompareResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompareResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service_web/", name = "compareResponse")
    public JAXBElement<CompareResponse> createCompareResponse(CompareResponse value) {
        return new JAXBElement<CompareResponse>(_CompareResponse_QNAME, CompareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service_web/", name = "getUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<GetUsers>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Service_web/", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

}
