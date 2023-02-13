import java.util.ArrayList;
import java.util.List;

public class Controle {
    public boolean emprestar ( String RA, int num, int[] prazos){
        boolean retorno = true;
        Aluno aluno = new Aluno(RA);
        if(aluno.verificaAluno(RA)){
            System.out.println("Aluno cadastrado!");
            retorno = false;
        } else {
            System.out.println("Aluno não cadastrado!!");
        }
        if(aluno.verificaDebito()){
            System.out.println("Aluno com débito!!");
            retorno = false;
        } else {
            System.out.println("Aluno sem débito!");
        }
        if(retorno){
            List<Livro> livros = new ArrayList<Livro>();
            for(int i = 0; i < num; i++){
                Livro livro = new Livro(prazos[i]);
                livros.add(livro);
            }
            if(livros.size() > 0){
                retorno = aluno.emprestarLivro(livros);
                return retorno;
            }
            else{
                System.out.println("Não há livros para emprestar");
                retorno = false;
            }
        }
        return retorno;
    }
}


@Test
public void emprestarTest(){
  Controle controle = new Controle();
  String RA = "123";
  int num = 2;
  int[] prazos = {5, 10};
  boolean expected = true;
  boolean actual = controle.emprestar(RA, num, prazos);
  assertEquals(expected, actual);
}