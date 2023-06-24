package questão01;

import java.util.Scanner;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data (){

        Scanner ler = new Scanner(System.in);

        System.out.println("Dia:");
        this.dia=ler.nextInt();
        while (this.dia <=0 || this.dia > 30){
            System.out.println("Dia inavlido , digite novamente:");

            this.dia=ler.nextInt();
        }
        System.out.println("Mes:");
        this.mes=ler.nextInt();
        while (this.mes<=0|| this.mes >12){
            System.out.println("mes inavlido , digite novamente:");

            this.mes=ler.nextInt();
        }
        System.out.println("ano:");
        this.ano = ler.nextInt();

        while (this.ano<=0 ){
            System.out.println("ano inavlido , digite novamente:");

            this.ano=ler.nextInt();
        }



    }


    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return  ""+this.dia+"/"+this.mes+"/"+this.ano;
    }


    public void Diaseguinte (){
        this.dia++;
        if(this.dia >31){
            this.dia=1;
            this.mes++;
                if(mes>12){
                    this.mes=1;
                    this.ano++;
                    }
                }
        System.out.println("dia seguinte");
    }
}
