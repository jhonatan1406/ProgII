package Questao6;

public class Main {
    public static void main(String[] args) {
        Conta minhaconta= new Conta();

        minhaconta.depositar(100);
        minhaconta.setlimite(100);
        minhaconta.sacar(1000);
    }
}
