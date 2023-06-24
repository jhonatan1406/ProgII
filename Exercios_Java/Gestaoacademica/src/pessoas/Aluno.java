package pessoas;

public class Aluno {

    private String mat;
    private String nome;
    private String curso;
    private String [] Listadisciplina = new String[10];
    private int indice=0;

    public void setMat (String mat){
        this.mat=mat;
    }

    public String getNome( ) {
        return nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMat() {
        return mat;
    }

    public String getCurso() {
        return curso;
    }


    public void matricular (String disciplina){
        if(this.estamat(disciplina)){
            System.out.println("o aluno ja esta matriculado na disciplina ");
            return;
        }
        if (indice < 10){
            this.Listadisciplina[indice] = disciplina;
        indice++;
    }
         else {
            System.out.println("aluno" +this.getNome()+" matriculou em mais de 10");
        }
    }

    public boolean estamat (String disciplina ){
        for(int i=0 ; i<indice ; i++){
            if(this.Listadisciplina[i].equals(disciplina))
                return true;

        }
        return false;

    }




    public void escreverdis ( ){

        for(int i=0 ; i<indice ; i++){
            System.out.println(Listadisciplina[i]);
        }
    }






}
