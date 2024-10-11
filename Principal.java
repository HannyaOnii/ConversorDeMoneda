import java.net.URI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal implements Comparable<Conversion> {
    public static void main(String[] args) {

        ConvertirDivisa consulta = new ConvertirDivisa();
        Divisa divisa = consulta.conversion("USD", "MXN");
        Scanner lectura = new Scanner(System.in);

        Integer opcionSeleccionada = Integer.valueOf(1);


        while (opcionSeleccionada != 7) {
            System.out.println("*****************************************************");
            System.out.println("Bienvenido al conversor de Moneda");
            System.out.println("1) Dolar =>> Euro");
            System.out.println("2) Euro =>> Dolar");
            System.out.println("3) Dolar =>> Peso Mexicano");
            System.out.println("4) Peso Mexicano =>> Dolar");
            System.out.println("5) Dolar =>> Dolar Canadiense ");
            System.out.println("6) Dolar Canadiense =>> Dolar");
            System.out.println("7) Salir");
            System.out.println("*****************************************************");
            System.out.println("Elija una opcion: ");
            opcionSeleccionada = Integer.valueOf(lectura.nextLine());

           if (opcionSeleccionada == 1){
               System.out.println("Digite el monto a convertir: ");
               double montoConvertir = lectura.nextDouble();
               lectura.nextLine();
               divisa = consulta.conversion("USD", "EUR");
               System.out.println("El monto convertido es: "+montoConvertir*divisa.conversion_rate()+" EUR");
           }
           else if (opcionSeleccionada == 2) {
               System.out.println("Digite el monto a convertir: ");
               double montoConvertir = lectura.nextDouble();
               lectura.nextLine();
               divisa = consulta.conversion("EUR", "USD");
               System.out.println("El monto convertido es: "+montoConvertir*divisa.conversion_rate()+" USD");
           }
           else if (opcionSeleccionada == 3) {
               System.out.println("Digite el monto a convertir: ");
               double montoConvertir = lectura.nextDouble();
               lectura.nextLine();
               divisa = consulta.conversion("USD", "MXN");
               System.out.println("El monto convertido es: "+montoConvertir*divisa.conversion_rate()+" MXN");

           }
           else if (opcionSeleccionada == 4 ) {
               System.out.println("Digite el monto a convertir: ");
               double montoConvertir = lectura.nextDouble();
               lectura.nextLine();
               divisa = consulta.conversion("MXN", "USD");
               System.out.println("El monto convertido es: "+montoConvertir*divisa.conversion_rate()+" USD");
           }
           else if (opcionSeleccionada == 5 ) {
               System.out.println("Digite el monto a convertir: ");
               double montoConvertir = lectura.nextDouble();
               lectura.nextLine();
               divisa = consulta.conversion("USD", "CAD");
               System.out.println("El monto convertido es: "+montoConvertir*divisa.conversion_rate()+" CAD");
           }
           else if (opcionSeleccionada == 6 ) {
               System.out.println("Digite el monto a convertir: ");
               double montoConvertir = lectura.nextDouble();
               lectura.nextLine();
               divisa = consulta.conversion("CAD", "USD");
               System.out.println("El monto convertido es: "+montoConvertir*divisa.conversion_rate()+" USD");
           }
           else if (opcionSeleccionada == 7) {
                System.out.println("Sesion terminada");
                break;
            }
           else{
               System.out.println("Opcion invalida");
           }


        }

    }
    @Override
    public int compareTo(Conversion conversion) {
        return 0;
    }

}
