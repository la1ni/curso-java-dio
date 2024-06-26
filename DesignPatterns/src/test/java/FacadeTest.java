import org.example.Facade.Facade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FacadeTest {

    @Test
    void deveRetornarMensagemDeSucesso(){
        Facade facade = new Facade();

        Assertions.assertTrue("Cliente Salvo" == facade.migrarCliente("Paulo", "30410659"));
    }
}
