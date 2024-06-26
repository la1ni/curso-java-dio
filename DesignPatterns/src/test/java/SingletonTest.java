import org.example.Singleton.SingletonEager;
import org.example.Singleton.SingletonLazy;
import org.example.Singleton.SingletonLazyHolder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    void deveRetornarInstanciaUnicaLazy(){
        SingletonLazy lazy = SingletonLazy.getInstancia();
        SingletonLazy segundoLazy = SingletonLazy.getInstancia();
        Assertions.assertSame(lazy, segundoLazy);
    }
    @Test
    void deveRetornarInstanciaUnicaEager(){
        SingletonEager eager = SingletonEager.getInstancia();
        SingletonEager segundoEager = SingletonEager.getInstancia();
        Assertions.assertSame(eager, segundoEager);
    }
    @Test
    void deveRetornarInstanciaUnicaLazyHolder(){
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        SingletonLazyHolder segundoLazyHolder = SingletonLazyHolder.getInstancia();
        Assertions.assertSame(lazyHolder, segundoLazyHolder);
    }

}
