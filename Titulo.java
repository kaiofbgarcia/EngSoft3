
public class Titulo {
int prazo;
public Titulo(int codigo)
{
	//Da o prazo de devolucao como sendo o codigo do livro mais 1
 	this.prazo = codigo+1;
}
public int getPrazo() {
	return prazo;
}

public void setPrazo(int prazo) {
	this.prazo = prazo;
}

}
