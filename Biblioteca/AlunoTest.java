
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class AlunoTest {
    @Test
    public void testVerificaAlunoComCodigoValido() {
        // Verifica se o aluno é valido com os codigos validos 10 e 5
        int codigoValido10 = 10;
        Aluno alunoComCodigo10 = new Aluno(codigoValido10);
        assertTrue(alunoComCodigo10.verificaAluno(codigoValido10));

        int codigoValido5 = 5;
        Aluno alunoComCodigo5 = new Aluno(codigoValido5);
        assertTrue(alunoComCodigo5.verificaAluno(codigoValido5));
    }
    @Test
    public void testVerificaAlunoComCodigoInvalido() {
        // Verifica se o aluno é valido com o codigo invalido 20
        int codigoInvalido20 = 20;
        Aluno alunoComCodigo20 = new Aluno(codigoInvalido20);
        assertFalse(alunoComCodigo20.verificaAluno(codigoInvalido20));
    }
    @Test
    public void testVerificaDebitoSemDebito() {
        int codigoValido10 = 10;
        Aluno alunoSemDebito = new Aluno(codigoValido10);
        assertFalse(alunoSemDebito.verificaDebito());
    }
    @Test
    public void testVerificaDebitoComDebito() {
        int codigoValido10 = 10;
        Aluno alunoComDebito = new Aluno(codigoValido10);
        Debito debito = new Debito(10);
        alunoComDebito.adicionarDebito(debito);
        assertTrue(alunoComDebito.verificaDebito());
    }
    @Test
    public void testEmprestarLivrosComListaVazia() {
        int codigoValido10 = 10;
        Aluno alunoComCodigo10 = new Aluno(codigoValido10);
        List<Livro> livrosVazia = new ArrayList<>();
        assertFalse(alunoComCodigo10.emprestarLivro(livrosVazia));
    }
    @Test
    public void testEmprestarLivrosComListaValida() {
        int codigoValido10 = 10;
        Aluno alunoComCodigo10 = new Aluno(codigoValido10);

        int codigoLivro1 = 20;
        int codigoLivro2 = 30;
        int codigoLivro3 = 40;
        Livro livro1 = new Livro("Livro1", codigoLivro1);
        Livro livro2 = new Livro("Livro2", codigoLivro2);
        Livro livro3 = new Livro("Livro3", codigoLivro3);

        List<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        assertTrue(alunoComCodigo10.emprestarLivro(livros));
    }
}