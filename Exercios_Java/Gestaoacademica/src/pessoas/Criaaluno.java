package pessoas;

public class Criaaluno {

    public static void main(String[] args) {
        Aluno c1 = new Aluno();

        c1.setCurso("computação");
        c1.setMat("20.18164");
        c1.setNome("jhon");


         for(int i=0 ; i<12 ; i++){
             c1.matricular("prog2");
         }
        c1.escreverdis();

    }
}
