package exer;

public class Aluno extends Pessoa{
    private Curso curso;
    private String mat;


    public Aluno(String nome , Sexo s, Curso c ){
        super(nome,s);
        this.curso=c;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public boolean equals (Object b){
        return this.getMat()==((Aluno)b).getMat();
    }

    @Override
    public String toString(){
        return "\nAluno\n-------------\n"+"Nome:"+getNome()+"\nidade:"+getIdade()+"\nCurso:"+getCurso().getNome();
    }
}
