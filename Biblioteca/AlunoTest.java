
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class AlunoTest {
    @Test
    public void testVerificaAlunoComCodigoValido() {
        Aluno alunoComCodigo10 = new Aluno("10");
        assertTrue(alunoComCodigo10.verificaAluno("10"));

        Aluno alunoComCodigo5 = new Aluno("5");
        assertTrue(alunoComCodigo5.verificaAluno("5"));
    }
    @Test
    public void testVerificaAlunoComCodigoInvalido() {
        Aluno alunoComCodigo20 = new Aluno("20");
        assertFalse(alunoComCodigo20.verificaAluno("20"));
    }
    @Test
    public void testVerificaDebitoSemDebito() {
        Aluno alunoSemDebito = new Aluno("10");
        assertFalse(alunoSemDebito.verificaDebito());
    }
    @Test
    public void testVerificaDebitoComDebito() {
        Aluno alunoComDebito = new Aluno("10");
        Debito debito = new Debito(10);
        alunoComDebito.adicionarDebito(debito);
        assertTrue(alunoComDebito.verificaDebito());
    }
    @Test
    public void testEmprestarLivrosComListaVazia() {
        Aluno alunoComCodigo10 = new Aluno("10");
        List<Livro> livrosVazia = new ArrayList<>();
        assertFalse(alunoComCodigo10.emprestarLivro(livrosVazia));
    }
    @Test
    public void testEmprestarLivrosComListaValida() {
        Aluno alunoComCodigo10 = new Aluno("10");

        Livro livro1 = new Livro("Livro1", 20);
        Livro livro2 = new Livro("Livro2", 30);
        Livro livro3 = new Livro("Livro3", 40);

        List<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        assertTrue(alunoComCodigo10.emprestarLivro(livros));
    }
}