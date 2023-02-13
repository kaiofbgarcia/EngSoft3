import java.util.List;

public class Aluno{
    String RA;

    public Aluno(String RA){
        super();
        this.RA = RA;
    }

    public String getRA(){
        return RA;
    }

    public void setRA(String RA){
        this.RA = RA;
    }

    public boolean verificaAluno(String RA){
        if(this.RA.equals("10")){
            return true;
        } else if(this.RA.equals("5")){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean verificaDebito(){
        Debito debito = new Debito(Integer.parseInt(this.RA));
        if(debito.verificaDebito() == true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean emprestarLivro(List<Livro> livros){
        Emprestimo emprestimo = new Emprestimo();
        for(Livro livro : livros){
            Item item = new Item(livro);
            emprestimo.i.add(item);
        }
        return true;
    }
}