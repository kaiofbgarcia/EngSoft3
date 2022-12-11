import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Emprestimo e = new Emprestimo();

		Livro l1 = new Livro(1);
		
		Livro l2 = new Livro(2);
		
		 Livro l3 = new Livro(3); 
		
		Item i1 = new Item(l1);
		Item i2 = new Item(l2);
		Item i3 = new Item(l3);
		e.i.add(i1);
		e.i.add(i2);
		e.i.add(i3);

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		Date emprestimo = e.getDataEmprestimo();
		Date devolucao = e.CalculaDataDevolucao();

		System.out.print("Data de Emprestimo: " + format.format(emprestimo));
		System.out.print("\nData prevista de devolucao: " + format.format(devolucao));
	}
}