public class App {
    public static void main(String[] args) throws Exception {

        // int numeroIf = 0;
        // int numeroIf = -1;
        int numeroIf = 1;

        if (numeroIf < 0) {

            System.out.println("El número es negativo");

        } else if (numeroIf > 0) {

            System.out.println("El número es positivo");

        } else {

            System.out.println("El número es igual a 0");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3) {

            numeroWhile++;

            System.out.println(numeroWhile);
        }

        int numeroWhile2 = 0;

        do {

            numeroWhile2++;
            
            System.out.println(numeroWhile2);

        } while (numeroWhile2 < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {

            System.out.println(numeroFor);

        }

        // var estacion = "VERANO";
        // var estacion = "INVIERNO";
        // var estacion = "PRIMAVERA";
        // var estacion = "OTOÑO";
        var estacion = "CUALQUIER COSA";


        switch(estacion) {

            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            
            case "INVIERNO":
                System.out.println("Estamos en invierno");
                break;

            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
                
            case "OTOÑO":
                System.out.println("Estamos en otoño");
                break;

            default:
                System.out.println("Esto no es una estación");
        }


    }




}


