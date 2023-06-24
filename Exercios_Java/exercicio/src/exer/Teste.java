package exer;

public class Teste {
    public static void main(String[] args) {
        Curso computacao = new Curso("Computação");
        Curso producao = new Curso("produção");


        computacao.setDuracao(5);
        producao.setDuracao(6);

        Pessoa a1 = new Aluno ("jhon",Sexo.MASCULINO,computacao);
        Pessoa a2 = new Aluno ("paty",Sexo.FEMININO,producao);
        Pessoa a3 = new Aluno ("Laura",Sexo.FEMININO,computacao);
        Pessoa a4 = new Aluno ("kecia",Sexo.FEMININO,producao);
        Pessoa a5 = new Aluno ("Dio",Sexo.MASCULINO,producao);
        Pessoa a6 = new Aluno ("hud",Sexo.MASCULINO,computacao);
        Pessoa a7 = new Aluno ("joao",Sexo.MASCULINO,computacao);

        SalaDeAula sala307= new SalaDeAula(7);

        sala307.adicionaraluno((Aluno)a1);
        sala307.adicionaraluno((Aluno)a2);
        sala307.adicionaraluno((Aluno)a3);
        sala307.adicionaraluno((Aluno)a4);
        sala307.adicionaraluno((Aluno)a5);
        sala307.adicionaraluno((Aluno)a6);
        sala307.adicionaraluno((Aluno)a7);


        sala307.imprimiraluno(computacao);



    }
}
