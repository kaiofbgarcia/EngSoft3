import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.Test;

class TesteDevolucao{
    @Test
    public void testeDevolucao(){
        Date data = new Date();
        Emprestimo emprestimo = new Emprestimo();
        Livro l1 = new Livro(1);
        Item i1 = new Item(l1);
        emprestimo.i.add(i1);

        assertEquals(emprestimo.CalculaDataDevolucao(), i1.calculaDataDevolucao(data));
        fail("Not yet implemented");
    }
}