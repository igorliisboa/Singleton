package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @Test
    public void deveRetornarNomeMercado() {
        Database.getInstance().setNomeMercado("Mercado 1");
        assertEquals("Mercado 1", Database.getInstance().getNomeMercado());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Database.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", Database.getInstance().getUsuarioLogado());
    }

}