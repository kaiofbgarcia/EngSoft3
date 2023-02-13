import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TituloTest {

	@Test
	void testTitulo() {
		int codigo = 1;
		Titulo titulo = new Titulo(codigo);
		assertEquals(2, titulo.getPrazo());
	}
	
	@Test
	void testSetPrazo() {
		int codigo = 1;
		int prazo = 3;
		Titulo titulo = new Titulo(codigo);
		titulo.setPrazo(prazo);
		assertEquals(3, titulo.getPrazo());
	}
}