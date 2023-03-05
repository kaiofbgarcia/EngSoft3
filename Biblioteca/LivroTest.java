import static org.junit.Assert.*;
import org.junit.Test;

public class LivroTest {

	@Test
	public void testVerPrazo() {
		// Testa se o prazo de empréstimo de um livro é o esperado
		Livro livro = new Livro(1);

		// Verifica se o prazo real é igual ao prazo esperado
		int prazoEsperado = 15;
		int prazoReal = livro.verPrazo();
		String mensagem = String.format("O prazo real (%s) deveria ser igual ao prazo esperado (%s)", prazoReal, prazoEsperado);
		assertSame(mensagem, prazoEsperado, prazoReal);
	}
}