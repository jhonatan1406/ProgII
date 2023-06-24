package exer;

import java.util.ArrayList;

public class SalaDeAula {

    private  int limite =50;
    private ArrayList<Aluno> ListadeAlunos = new ArrayList<>();

    public SalaDeAula(){

    }
    public SalaDeAula(int cap){
        this.limite=cap;
    }
    public void adicionaraluno (Aluno a){
        ListadeAlunos.add(a);
    }
    public Aluno removeAluno (int indice ) {

        if (indice >= 0 && indice < ListadeAlunos.size()) {
            return ListadeAlunos.remove(indice);
        } else {
            System.out.println("Indice indicado invalido");
            return null;
        }
    }

        public void imprimiraluno() {
            for (Aluno aluno : ListadeAlunos) {
                System.out.println(aluno);
            }
        }
    public void imprimiraluno(Sexo sexo) {

        for (Aluno aluno : ListadeAlunos) {
            if (aluno.getS() == sexo) {
                System.out.println(aluno);
            }
        }

    }
    public void imprimiraluno(Curso curso) {
        System.out.println("LISTANDO ALUNOS DO CURSO " + curso.getNome().toUpperCase());
        for (Aluno aluno : ListadeAlunos) {
            if (aluno.getCurso().getNome().equals(curso.getNome())) {
                System.out.println(aluno);
            }
        }

    }






}
