import java.util.Scanner;

public class Main {

    public void calcularIndicaMasaCoporal (){
        Scanner scanner = new Scanner(System.in);

        // Peso en KG / altura en metros al cuadrado
        System.out.println("Ingrese su peso:");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese su altura:");
        double altura = scanner.nextDouble();

        double indiceMasaCorportal = peso / (altura * altura);

        System.out.println("Tu índice de masa coportal es: " + indiceMasaCorportal);

        // Mayor a 30 -> Obesidad
        if ( indiceMasaCorportal >= 30){
            System.out.println("Estás en estado de obesidad");
        }
        if (indiceMasaCorportal >= 25 && indiceMasaCorportal < 30){
            System.out.println("Estás en estado de sobrepeso");
        }
        if (indiceMasaCorportal >= 10.5 && indiceMasaCorportal< 25){
            System.out.println("Estás en estado Normal");
        }
        if (indiceMasaCorportal < 18.5){
            System.out.println("Estás en un estado por debajo de lo normal");
        }
        // Entre 25 a 30 -> Sobrepeso
        // Entre 18.5 y 25 normal
        // Menor a 18.6 debajo de normal
    }
    public void cacularEdadPerro(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad del perro:");
        int edad = scanner.nextInt();
        System.out.println("El perro tiene " + edad * 7 + " años en edad canina");
    }
    public void convertirMillas_a_Kilometros(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una distancia en Millas:");
        double millas = scanner.nextDouble();
        double kilometros = millas * 1.60934;
        System.out.println("La distancia en Kilómetros es: " + kilometros);

    }
    public void calculadoraPropinas(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta:");
        double total = scanner.nextDouble();
        System.out.println("Ingrese el % de la propina");
        double propina = scanner.nextDouble();

        double totalPropina = (total * propina) / 100;
        System.out.println("La propina a pagar es: " + totalPropina);
    }
    public void adivinaElNumero(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Número Aleatorio Generado!");
        System.out.println("==========================)");

        long nroAleatorio = Math.round( Math.random() * 100 );
        if ( nroAleatorio == 0 ){
            nroAleatorio++;
        }

        System.out.println("Ingrese un número para adivinarlo:");
        int nroIngresado = scanner.nextInt();

        if ( nroAleatorio == nroIngresado){
            System.out.println("Adivinaste al número: " + nroAleatorio + "!.  Congratulation 8-) ");
        } else{
            System.out.println("No adivinaste al número: [" + nroAleatorio + "] 8-(, Mejor suerte para la proxima.");
        }

    }

    public static void main(String[] args){
        Main main = new Main();
        //main.calcularIndicaMasaCoporal();
        //main.cacularEdadPerro();
        //main.convertirMillas_a_Kilometros();
        //main.calculadoraPropinas();
        main.adivinaElNumero();

    }

}
