public class Debito {
    int codigoAluno;
    public Debito(int codigoAluno){
        this.codigoAluno = codigoAluno;
    }

    public boolean verificaDebito(){
        if(this.codigoAluno == 10){
            return true;
        } else if(this.codigoAluno == 5){
            return false;
        }
        else{
            return false;
        }
    }
}
