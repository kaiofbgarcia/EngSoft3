import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] codigos = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		System.out.println("Digite o RA do aluno: ");
		String RA = entrada.nextLine();
		System.out.println("Digite o numero de livros que deseja emprestar: ");
		int num = entrada.nextInt();
		int aux;
		for(int i = 0; i < num; i++){
			System.out.println("Digite o codigo do livro: ");
			aux = entrada.nextInt();
			codigos[i] = aux;
		}
		
		Controle controle = new Controle();
		controle.emprestar(RA, num, codigos);
		
		entrada.close();
		
		Emprestimo e = new Emprestimo();
		
		for(int j = 0; j < num; j++){
			Livro l = new Livro(codigos[j]);
			Item i = new Item(l);
			e.i.add(i);
		}

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		Date emprestimo = e.getDataEmprestimo();
		Date devolucao = e.CalculaDataDevolucao();

		System.out.print("Data de Emprestimo: " + format.format(emprestimo));
		System.out.print("\nData prevista de devolucao: " + format.format(devolucao));
	}
}