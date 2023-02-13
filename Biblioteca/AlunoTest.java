
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class AlunoTest {

    @Test
    public void testVerificaAluno() {
        Aluno aluno = new Aluno("10");
        assertTrue(aluno.verificaAluno("10"));

        Aluno aluno2 = new Aluno("5");
        assertTrue(aluno2.verificaAluno("5"));

        Aluno aluno3 = new Aluno("20");
        assertFalse(aluno3.verificaAluno("20"));
    }

    @Test
    public void testVerificaDebito() {
        Aluno aluno = new Aluno("10");
        Debito debito = new Debito(10);
        assertTrue(aluno.verificaDebito());
    }

    @Test
    public void testEmprestarLivro() {
        Aluno aluno = new Aluno("10");

        Livro livro1 = new Livro("Livro1", 20);
        Livro livro2 = new Livro("Livro2", 30);
        Livro livro3 = new Livro("Livro3", 40);

        List<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        assertTrue(aluno.emprestarLivro(livros));
    }
}