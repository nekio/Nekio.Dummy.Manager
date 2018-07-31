package nekio.dummy.manager.ws;

/**
 * @owner MSIS. Sinesio Ivan Carrillo Heredia
 * @author Nekio <nekio@outlook.com>
 * @version 2018/06/16
 *
 * SOAP Publisher
 */

// <editor-fold defaultstate="collapsed" desc="Libraries">
import nekio.library.common.contracts.ws.IWebservicePublisher;
import nekio.library.framework.webservice.SoapPublisher;
// </editor-fold>

public class DummySOAP {
    // <editor-fold defaultstate="collapsed" desc="Static Behaviours">
    public static void main(String[] args) {
        IWebservicePublisher ws = publish();
        ws.dispose();
    }
    
    public static IWebservicePublisher publish(){
        //return new SoapPublisher("localhost", "8080", DummyPluginWS.class);
        return null;
    }
    // </editor-fold>
}
