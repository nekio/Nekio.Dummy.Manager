package nekio.dummy.manager.contract;

/**
 * @owner MSIS. Sinesio Ivan Carrillo Heredia
 * @author Nekio <nekio@outlook.com>
 * @version 2018/06/16
 *
 * Dummy Manager Contract
 */

// <editor-fold defaultstate="collapsed" desc="Libraries">
import nekio.library.common.contracts.component.IManager;
// </editor-fold>

public interface IDummyManager extends IManager{
    // <editor-fold defaultstate="collapsed" desc="Abstract">
    public abstract void doDummy();
    // </editor-fold>
}
