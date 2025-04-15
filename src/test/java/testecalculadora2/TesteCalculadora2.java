package testecalculadora2;

import calculadora.Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Test;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestCalculadora2 {

    Calculadora calculadora;

    @BeforeAll
    void inicializacao() {
        calculadora = new Calculadora(4.0, 2.0);
    }

    @Test
    void testGetSoma() {
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getSoma();
        assertEquals(retornoEsperado, retornoFeito, 2);
    }

    @Test
    void testGetDiferenca() {
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getDiferenca();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testGetProduto() {
        double retornoEsperado = 8.0;
        double retornoFeito = calculadora.getProduto();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    public void testGetQuociente() {
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getQuociente();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @AfterAll
    public void finalizacao() {
        calculadora = null;
    }
}
