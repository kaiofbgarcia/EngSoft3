import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testCalculaDataDevolucao() {
        // Verifica se a data de devolução é diferente da data atual
        Emprestimo emprestimo = new Emprestimo();
        Date dataDevolucao = emprestimo.CalculaDataDevolucao();
        Date dataAtual = new Date();
        assertFalse("A data de devolução deveria ser diferente da data atual", dataDevolucao.equals(dataAtual));
    }
    @Test
    public void testGetDataEmprestimo() {
        // Verifica se a data de empréstimo é igual à data atual
        Emprestimo emprestimo = new Emprestimo();
        Date dataEmprestimo = emprestimo.getDataEmprestimo();
        Date dataAtual = new Date();
        assertTrue("A data de empréstimo deveria ser igual à data atual", dataEmprestimo.equals(dataAtual));
    }
}
