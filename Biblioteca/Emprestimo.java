import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Emprestimo {

	Date dataEmprestimo = new Date();
	/*metodo para gegar a variavel dataEmprestimo*/
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	/*metodo para setar a variavel dataEmprestimo*/
	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	/*utilize essas váriaveis para calcular a data final de devolução*/
    Date dataPrevista = new Date();
	Date data_aux = new Date();
	String nome;

        /*Cada Emprestimo é composto de varios itens*/
	List<Item> i = new ArrayList<Item>();
	
        //Metodo responsável por calcular a data de devolucao
	public Date CalculaDataDevolucao(){   
		Date date = new Date();
		
		int tamanho = i.size();
		Date maior = data_aux;
		for(int j = 0; j < i.size(); j++){
			Date data = i.get(j).calculaDataDevolucao(date);
			if(data.compareTo(maior)==1){
				maior = data;
			}
		}

	 	Calendar calendar = Calendar.getInstance();
		
		if(tamanho>2){
			int dias = (tamanho - 2)*2;
			calendar.setTime(maior);
			calendar.add(Calendar.DAY_OF_MONTH, dias);
			dataPrevista = calendar.getTime();
		} else {
			dataPrevista = maior;
		}
		System.out.println(dataPrevista);
		return dataPrevista;
	}
}


@Test
public void testCalculaDataDevolucao() {
    //testa a data de devolução
    Emprestimo emprestimo = new Emprestimo();
    Date expected = new Date(System.currentTimeMillis() + (3 * (24 * 60 * 60 * 1000))); //3 dias depois

    Date data = emprestimo.CalculaDataDevolucao();
    assertEquals(expected, data);
}