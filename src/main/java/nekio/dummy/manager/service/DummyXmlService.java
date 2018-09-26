package nekio.dummy.manager.service;

/**
 * @owner MSIS. Sinesio Ivan Carrillo Heredia
 * @author Nekio <nekio@outlook.com>
 * @version 2018/09/19
 *
 * {Class Description}
 */

// <editor-fold defaultstate="collapsed" desc="Libraries">
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import nekio.library.utils.dummy.DummyXmlEntity;
// </editor-fold>

@Path(ServiceKeys.XmlClassDummyTarget)
public class DummyXmlService {

    // <editor-fold defaultstate="collapsed" desc="Webmethods">
    @GET
    @Path(ServiceKeys.XmlMethodTargetGET)
    @Produces(ServiceKeys.XmlServicesProduces)
    public DummyXmlEntity getXmlEntityGET() {
        DummyXmlEntity dummyXmlEntity = new DummyXmlEntity();
        
        dummyXmlEntity.setId(8);
        dummyXmlEntity.setName("Sinesio Ivan Carrillo Heredia");
        dummyXmlEntity.setEmail("nekio@outlook.com");
        dummyXmlEntity.setNickname("Nekio");
        dummyXmlEntity.setHiddenValue("XML file don’t have this field");
        
        return dummyXmlEntity;
    }
    
    @POST
    @Path("/add")
    public DummyXmlEntity getXmlEntityPOST(
            @FormParam("name") String name,
            @FormParam("age") int age) {

            return Response.status(200)
                    .entity("addUser is called, name : " + name + ", age : " + age)
                    .build();

    }
    // </editor-fold>
}
