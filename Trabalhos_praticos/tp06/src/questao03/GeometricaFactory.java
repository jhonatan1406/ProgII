package questao03;

public class GeometricaFactory {

    public static FormaGeometrica Forma(String forma) {
        if (forma == null) {
            return null;
        }
        if (forma.equalsIgnoreCase("Triangulo")) {
            return new Traingulo();
        } else if (forma.equalsIgnoreCase("Quadrado")) {
            return new quadrado();
        } else if (forma.equalsIgnoreCase("Circulo")) {
            return new Circulo();
        } else {
            return  null;
        }
    }

    
}
