import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class MainTest {

 @Test
 public void CalculaDataDevolucaoTest() {
  Emprestimo e = new Emprestimo();
  Date expected = e.CalculaDataDevolucao();
  Date actual = new Date();
  assertNotEquals(expected, actual);
 }

 @Test
 public void getDataEmprestimoTest() {
  Emprestimo e = new Emprestimo();
  Date expected = e.getDataEmprestimo();
  Date actual = new Date();
  assertEquals(expected, actual);
 }
}