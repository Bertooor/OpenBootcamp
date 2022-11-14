public class App {
    public static void main(String[] args) throws Exception {

        suma(4, 2, 7);

        Coche miCoche = new Coche();

        miCoche.IncrementarPuerta();

        System.out.println(miCoche.puertas);
    }
    
    public static void suma(int a, int b, int c) {

        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

class Coche {

    public int puertas = 2;

    public void IncrementarPuerta() {
        this.puertas++;
    }
}
