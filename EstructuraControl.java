public class EstructuraControl {
    public static void main(String[] args) {
        int numeroIf = 10;
        int numeroWhile = -2;
        String estacion = "verano";

        if (numeroIf == 0) {
            System.out.println("El número es " + numeroIf);
        } else if (numeroIf < 0) {
            System.out.println("El número " + numeroIf + " es negativo.");
        } else {
            System.out.println("El número " + numeroIf + " es positivo.");
        }

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
        } while (numeroWhile > 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        switch (estacion) {
            case "verano":
                System.out.println("Está usted en la estación de " + estacion.toUpperCase());
                break;
            case "otoño":
                System.out.println("Está usted en la estación de " + estacion.toUpperCase());
                break;
            case "invierno":
                System.out.println("Está usted en la estación de " + estacion.toUpperCase());
                break;
            case "primavera":
                System.out.println("Está usted en la estación de " + estacion.toUpperCase());
                break;
            default:
                System.out.println(estacion + " no es ninguna estación");
                break;
        }

    }
}
