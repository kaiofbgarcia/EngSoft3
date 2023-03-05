import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Before;
import org.junit.jupiter.api.Test;

public class ControleTest {
    private Controle controleBiblioteca;

    @Before
    public void setUp() {
        controleBiblioteca = new Controle();
    }

    @Test
    public void testEmprestarComSucesso() {
        // Configuração do teste
        String RA = "123";
        int numLivros = 2;
        int[] prazos = {5, 10};
        boolean expected = true;

        // Execução do teste
        boolean actual = controleBiblioteca.emprestar(RA, numLivros, prazos);

        // Verificação do resultado
        assertEquals(expected, actual, "O empréstimo deve ser bem sucedido.");
    }
}