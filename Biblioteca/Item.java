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
	// Testa o cálculo da data de devolução de um item
	Date dataAtual = new Date();
	Livro livro = new Livro(10, "Title");
	Item item = new Item(livro);

	// Calcula a data de devolução esperada
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(dataAtual);
	int prazoDias = livro.verPrazo();
	calendar.add(Calendar.DAY_OF_MONTH, prazoDias);
	Date dataEsperada = calendar.getTime();

	// Verifica se a data de devolução calculada é igual à data de devolução esperada
	Date dataCalculada = item.calculaDataDevolucao(dataAtual);
	String mensagem = String.format("A data de devolução calculada (%s) deveria ser igual à data de devolução esperada (%s)",
	dataCalculada, dataEsperada);
	assertEquals(dataEsperada, dataCalculada, mensagem);
}