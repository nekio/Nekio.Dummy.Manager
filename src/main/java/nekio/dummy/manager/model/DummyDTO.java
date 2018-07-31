package nekio.dummy.manager.model;

/**
 * @owner MSIS. Sinesio Ivan Carrillo Heredia
 * @author Nekio <nekio@outlook.com>
 * @version 2018/06/16
 *
 * Dummy DTO Model
 */

// <editor-fold defaultstate="collapsed" desc="Libraries">
import java.time.LocalDate;
import java.time.LocalDateTime;
import nekio.library.common.enums.ComponentType;
import nekio.library.framework.component.ComponentDTO;
// </editor-fold>

public class DummyDTO extends ComponentDTO{
    // <editor-fold defaultstate="collapsed" desc="Constructors">
    public DummyDTO(){
        super.code = "DummyManager";
        super.version = "1";
        super.description = "Dummy Manager";
        super.comments = "Demonstrative Purposes";
        super.type = ComponentType.Manager;
        super.author = "MSIS. Sinesio Ivan Carrillo Heredia";
        super.creation = LocalDate.of(2018, 06, 16);
        super.lastUpdate = LocalDate.of(2018, 06, 16);
        super.binaryLocation = "";
        super.instanceCreation = LocalDateTime.now();
    }
    // </editor-fold>
}
