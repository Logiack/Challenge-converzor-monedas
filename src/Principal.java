import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 9) {
            System.out.println(Menu.menu);
            opcion = lectura.nextInt();
            String eleccion = "";

            switch (opcion) {
                case 1:
                    eleccion = "USD/CRC";
                    break;
                case 2:
                    eleccion = "CRC/USD";
                    break;
                case 3:
                    eleccion = "EUR/USD";
                    break;
                case 4:
                    eleccion = "USD/EUR";
                    break;
                case 5:
                    eleccion = "USD/ARS";
                    break;
                case 6:
                    eleccion = "ARS/USD";
                    break;
                case 7:
                    Moneda moneda = new Moneda();
                    System.out.println("Digite su divisa");
                    lectura.nextLine();
                    var divisa = lectura.nextLine().toUpperCase();
                    System.out.println("Digite su divisa de conversión");
                    var divisaConvert = lectura.nextLine().toUpperCase();

                    System.out.println("Elige un monto ");
                    double monto = lectura.nextDouble();
                    moneda.busquedaEspecifica(divisa, divisaConvert, monto);
                    break;
                case 9:
                    System.out.println("Gracias por su visita");
                    break;
                default:
                    break;
            }
            if (opcion != 9 && opcion != 7) {
                System.out.println("Elige el monto deseado");
                double monto = lectura.nextDouble();

                Moneda moneda = new Moneda();
                moneda.busqueda(eleccion, monto);
            } else if (opcion == 7) {
            } else {
                break;
            }

        }
    }
}
