import static org.junit.Assert.*;
import org.junit.Test;

public class LivroTest {

	@Test
	public void testVerPrazo() {
		Livro livro = new Livro(1);
		int prazoEsperado = 15;
		int prazoReal = livro.verPrazo();
		assertEquals(prazoEsperado, prazoReal);
	}
}