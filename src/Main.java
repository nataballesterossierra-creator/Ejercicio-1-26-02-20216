import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opc = 0 ;
        Mascota m1 = new Mascota();

        System.out.println("   Sistema de la Veterinaria   ");
        System.out.println("");
        System.out.println("Para registrar a tu mascota por fa escoge alguna de las opciones: ");
        System.out.println("");


        opc = teclado.nextInt();
        teclado.nextLine();
        while (true){
            System.out.println("1. Registrar Nombre de tu mascota ");
            System.out.println("2. Mostrar informacion sobre el peso de tu mascota");
            System.out.println("3. Mostrar la ficha Medica de tu mascota ");
            System.out.println("4. Modificar el peso y la edad de tu mascota");
            System.out.println("5. Salir");
            opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc){

                case 1:
                    System.out.println(" Ingresa el nombre de tu mascota: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el tipo de Especie de su mascota: ");
                    String especie = teclado.nextLine();
                    System.out.println("Ingrese la edad: ");
                    int edad = teclado.nextInt();
                    System.out.println(" Ingrese el peso de su mascota: ");
                    double peso = teclado.nextDouble();
                    break;
                case 2:
                    m1.mostrarFicha();

                    break;
                case 3:
                    m1.mostrarFicha();
                    m1.adelgazar();
                    m1.engordar();

                    break;
                case 4:
                    System.out.println("modificar el peso ");

                    break;
                case 5:
                    System.out.println("");
                    break;

                default:
                    System.out.println("No existe");

            }
        }



    }
}