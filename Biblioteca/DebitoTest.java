import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DebitoTest {
   @Test
   // Verifica se um débito com código 10 retorna true
   public void verificaDebitoComCodigo10() {
      int codigoValido10 = 10;
      Debito debito = new Debito(codigoValido10);
      boolean resultado = debito.verificaDebito();
      assertTrue(resultado, "Um débito com código 10 deveria retornar true");
   }
   @Test
   // Verifica se um débito com código 5 retorna false
   public void verificaDebitoComCodigo5() {
      int codigoValido5 = 5;
      Debito debito = new Debito(codigoValido5);
      boolean resultado = debito.verificaDebito();
      assertFalse(resultado, "Um débito com código 5 deveria retornar false");
   }
   @Test
   // Verifica se um débito com código diferente de 5 ou 10 retorna false
   public void verificaDebitoComOutroCodigo() {
      int codigoInvalido = 7;
      Debito debito = new Debito(codigoInvalido);
      boolean resultado = debito.verificaDebito();
      assertFalse(resultado, "Um débito com código diferente de 5 ou 10 deveria retornar false");
   }
}