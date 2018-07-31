package nekio.dummy.manager.test;

/**
 * @owner MSIS. Sinesio Ivan Carrillo Heredia
 * @author Nekio <nekio@outlook.com>
 * @version 2018/06/17
 *
 * Dummy Manager Test
 */

// <editor-fold defaultstate="collapsed" desc="Libraries">
import nekio.dummy.manager.contract.IDummyManager;
import nekio.dummy.manager.host.DummyManager;
import nekio.library.common.contracts.IFactory;
import nekio.library.common.contracts.component.IComponent;
import nekio.library.common.contracts.component.IManager;
import nekio.library.framework.adapters.ManagerAdapter;
import nekio.library.framework.component.ComponentTest;
import nekio.library.framework.dp.factory.ComponentFactory;
import nekio.library.framework.dp.factory.GenericFactory;
import nekio.library.log.Logger;
// </editor-fold>

public class DummyManagerTest extends ComponentTest{
    // <editor-fold defaultstate="collapsed" desc="Main">
    public static void main(String[] args) {
        DummyManagerTest test = new DummyManagerTest();
        test.start();
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Behaviours">
    private void start(){
        //Global.DEBUG = true;
        
        IManager instance = getSingleInstanceWay();
        super.processComponent(instance);
        
        //IManager instance = this.getInstanceSingletonWay();
        //super.processComponent(instance);
        
        //IManager instance = this.getInstanceGenericFactoryWay();
        //super.processComponent(instance);
        
        //IManager instance = this.getInstanceComponentFactoryWay();
        //super.processComponent(instance);
        
        // Webservice Test
        //super.publishComponent(instance);
        //instance.getWebservicePublisher().dispose();
    }
    
    private IDummyManager getSingleInstanceWay(){
        Logger.brace("get Single Instance Way");
        
        return new DummyManager();
    }
    
    private IDummyManager getInstanceSingletonWay(){
        Logger.brace("get Instance Singleton Way");
        
        IDummyManager instance = DummyManager.getInstance();
        
        return instance;
    }
    
    @Override
    public IDummyManager getInstanceGenericFactoryWay(){
        Logger.brace("get Instance Generic Factory Way");
        
        IFactory<IComponent> factory = new GenericFactory<IDummyManager>(DummyManager.class);
        IDummyManager instance = (IDummyManager)factory.create();
        
        return instance;
    }
    
    @Override
    public IComponent getInstanceComponentFactoryWay(){
        Logger.brace("get Instance Component Factory Way");
        
        IComponent instance = ComponentFactory.getInstance(DummyManager.class);
        
        return (DummyManager)instance;
    }
    // </editor-fold>
}