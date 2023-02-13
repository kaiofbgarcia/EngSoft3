import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DebitoTest {
 
   @Test
   public void verificaDebito_Codigo10_ReturnsTrue(){
      Debito debito = new Debito(10);
      boolean result = debito.verificaDebito();
      assertTrue(result);
   }
 
   @Test
   public void verificaDebito_Codigo5_ReturnsFalse(){
      Debito debito = new Debito(5);
      boolean result = debito.verificaDebito();
      assertFalse(result);
   }
 
   @Test
   public void verificaDebito_CodigoOtherThan5Or10_ReturnsFalse(){
      Debito debito = new Debito(7);
      boolean result = debito.verificaDebito();
      assertFalse(result);
   }
}