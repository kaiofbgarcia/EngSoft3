import java.util.Calendar;
import java.util.Date;

public class Item {
   /*Cada Item é associado a um livro*/
	Livro livro;
    Date dataDevolucao;
 
    /*Constructor, quando uma instancia do item � criada
     * já é associada a ela o livro*/
    public Item(Livro livro) {
		super();
		this.livro = livro;
	}
    
    /*Método getDataDevolucao*/
	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	/*Método setDataDevolucao*/
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	/*Método getLivro*/
	public Livro getLivro() {
		return livro;
	}
	
	/*Método setLivro*/
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	/*Voce deve implementar o método Date calculaDataDevolucao(Date data)*/
	public Date calculaDataDevolucao(Date data){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.DAY_OF_MONTH, livro.verPrazo());
		dataDevolucao = calendar.getTime();
		return dataDevolucao;
	}
		
}

@Test
public void testCalculaDataDevolucao() {
  Date data = new Date();
  Livro livro = new Livro(10, "Title");
  Item item = new Item(livro);
  Date dateDevolucao = item.calculaDataDevolucao(data);
  Calendar calendar = Calendar.getInstance();
  calendar.setTime(data);
  calendar.add(Calendar.DAY_OF_MONTH, livro.verPrazo());
  Date expectedResult = calendar.getTime();
  assertEquals(expectedResult, dateDevolucao);
}