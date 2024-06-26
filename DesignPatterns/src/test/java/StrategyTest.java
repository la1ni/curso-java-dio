
import org.example.Strategy.ComportamentoAgressivo;
import org.example.Strategy.ComportamentoDefensivo;
import org.example.Strategy.ComportamentoNormal;
import org.example.Strategy.Robo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StrategyTest {
    @Test
    void deveAlterarOComportamento(){
        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        Assertions.assertTrue(normal.mover() == robo.mover());

        robo.setComportamento(agressivo);
        Assertions.assertTrue(agressivo.mover() == robo.mover());

        robo.setComportamento(defensivo);
        Assertions.assertTrue(defensivo.mover() == robo.mover());

    }


}
