package nekio.dummy.manager.host;

/**
 * @owner MSIS. Sinesio Ivan Carrillo Heredia
 * @author Nekio <nekio@outlook.com>
 * @version 2018/06/16
 *
 * Dummy Manager.
 * 
 * Uses ComponentAdapter handling (by inheritance).
 * By the way, it is not necessary to overrides Component's abstract methods,
 * but it does for additional processing and customization purposes.
 */

// <editor-fold defaultstate="collapsed" desc="Libraries">
import nekio.dummy.manager.P;
import nekio.dummy.manager.contract.IDummyManager;
import nekio.dummy.manager.model.DummyDTO;
import nekio.dummy.manager.ws.DummySOAP;
import nekio.library.common.contracts.IProperties;
import nekio.library.framework.adapters.ManagerAdapter;
// </editor-fold>

public class DummyManager extends ManagerAdapter implements IDummyManager{
    // <editor-fold defaultstate="collapsed" desc="Singleton">
    private static IDummyManager instance;
    
    public static IDummyManager getInstance(){
        if(instance == null){
            instance = new DummyManager(new DummyDTO());
        }
        
        return instance;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Constructor">
    public DummyManager(){
        super(new DummyDTO());
    }
    
    private DummyManager(DummyDTO dto){
        super(dto);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Overrides">        
    @Override
    public boolean activate(){
        boolean result = false;
        
        if(super.activate()){
            P.Log.i("Activated");
            result = true;
        }
        
        return result;
    }    
    
    @Override
    public boolean activate(IProperties properties){
        boolean result = false;
        
        if(super.activate(properties)){
            P.Log.i("Activated with Properties");
            result = true;
        }
        
        return result;
    }
    
    @Override
    public boolean initialize(){
        boolean result = false;
        
        if(super.initialize()){
            P.Log.i("Initialized");
            result = true;
        }
        
        return result;
    }
    
    @Override
    public boolean publish(){
        boolean result = false;
        
        if(super.publish()){
            P.Log.i("Published");

            if(super.canPublish){
                super.websersvicePublisher = DummySOAP.publish();
                if(websersvicePublisher != null){
                    if(super.websersvicePublisher.isPublished()){
                        P.Log.i("Successfully published");
                        result = true;
                    }else{
                        P.Log.w("Unsuccessfully published");
                    }
                }else{
                    P.Log.w("Websersvice Publisher is null");
                }
            }
        }
        
        return result;
    } 
    
    @Override
    public boolean restart(){
        boolean result = false;
        
        if(super.restart()){
            P.Log.i("Restarted");
            result = true;
        }
        
        return result;
    }
    
    @Override
    public boolean reloadProperties(IProperties properties){
        boolean result = false;
        
        if(super.reloadProperties(properties)){
            P.Log.i("Reloaded Properties");
            result = true;
        }
        
        return result;
    }
    
    @Override
    public boolean uninitialize(){
        boolean result = false;
        
        if(super.uninitialize()){
            P.Log.i("Uninitialized");
            result = true;
        }
        
        return result;
    }
    
    @Override
    public boolean deactivate(){
        boolean result = false;
        
        if(super.deactivate()){
            P.Log.i("Deactivated");
            result = true;
        }
        
        return result;
    }
    
    @Override
    public boolean dispose(){
        boolean result = false;
        
        if(super.dispose()){
            P.Log.i("Disposed");
            result = true;
        }
        
        return result;
    }
    // </editor-fold>

    @Override
    public void doDummy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
