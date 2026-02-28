import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Mascota m1 = new Mascota();
        List<Mascota>lstLista = new ArrayList<>();

        int opc ;
        System.out.println("-----------//---------///--------");
        System.out.println("   Sistema de la Veterinaria   ");
        System.out.println("");

        do {
            System.out.println("Elige una opción: ");
            System.out.println("");
            System.out.println("1. Registrar a tu mascota ");
            System.out.println("2. Mostrar la lista de las mascotas registradas");
            System.out.println("3. Buscar  y Modificar Informacion de la mascota Registrada ");
            System.out.println("4. Mostrar informacion Actualizada");
            System.out.println("5. Salir");
            opc = teclado.nextInt();
            teclado.nextLine();

            switch (opc){

                case 1:/*crear la mascota*/
                    System.out.println(" Ingresa el Nombre de tu mascota: ");
                    String nombre = teclado.next();
                    System.out.println("Ingrese el tipo de Especie de su mascota: ");
                    String especie = teclado.next();
                    System.out.println("Ingrese la edad (Años): ");
                    int edad = teclado.nextInt();
                    System.out.println(" Ingrese el peso de su mascota (Kg): ");
                    double peso = teclado.nextDouble();
                    Mascota M1 = new Mascota(nombre, especie, edad, peso);
                    System.out.println(" Ingrese el indice de salud de su mascota (0-100): ");
                    int salud = teclado.nextInt();
                    String estado = M1.evaluarSalud(salud);
                    lstLista.add(M1);
                    System.out.println(" Mascota Registrada.....");

                    break;
                case 2: /* Lista*/
                    System.out.println(" LISTA DE LAS MASCOTAS REGISTRADAS ");
                    System.out.println(" //___//___//___//___//___//___//___//___//___//___//");
                    for (Mascota m : lstLista){
                        System.out.println(m);
                    }
                    System.out.println(" //___//___//___//___//___//___//___//___//___//___//");
                    System.out.println("");
                    break;

                case 3:/*Buscar mascota*/
                    int opc1 = 0;
                    String Nombre1;
                    System.out.println(" Cual es el nombre de la mascota:");
                    Nombre1= teclado.next();

                    if (lstLista.isEmpty()){
                        System.out.println("La lista no tiene elementos");
                    }
                    Mascota pet1 = null;
                    for (Mascota m : lstLista){
                        if(m.getNombre().equalsIgnoreCase(Nombre1)){
                            pet1 = m;
                            System.out.println(pet1.mostrarFicha());
                        }
                    }

                   do {
                       System.out.println("Ahora que deseas modificarle a la mascota ");
                       System.out.println("1. Modificar Edad");
                       System.out.println("2. Modificar peso");
                       System.out.println("3. modificar estado de salud");
                       System.out.println("4.Salir ");
                       opc1= teclado.nextInt();
                       switch (opc1){
                           case 1:/* modificar edad*/

                               System.out.println("Nueva Edad: ");
                               int nuevaEdad = teclado.nextInt();
                               pet1.cumplirAnios(nuevaEdad);
                               System.out.println("Edad Actualizada.....");

                               break;

                           case 2:/*modificar peso*/
                               int opcPeso;
                               System.out.println(" Desea que la mascota 1.Adelgaze 2. Engorde:");
                               opcPeso= teclado.nextInt();
                               switch (opcPeso){
                                   case 1://adelgazar
                                       System.out.println("Nuevo Peso: ");
                                       double nuevoPesoa = teclado.nextDouble();
                                       pet1.adelgazar(nuevoPesoa);
                                       System.out.println("Peso Actualizado");

                                   break;
                                   case 2://engordar
                                       System.out.println("Nueva Peso: ");
                                       double nuevoPesoe = teclado.nextDouble();
                                       pet1.engordar(nuevoPesoe);
                                       System.out.println("Peso Actualizado");
                                   break;

                                   default:
                                       System.out.println("Error");
                               }

                               break;
                           case 3:/*modificar estado de salud*/
                               System.out.println("Nuevo Estado de Salud: ");
                               int nuevaSalud = teclado.nextInt();
                               String estadoActual = pet1.evaluarSalud(nuevaSalud);
                               System.out.println("Estado de salud: " + estadoActual + " (saludable=" + pet1.isSaludable() + ")");
                               break;
                           case 4:
                               System.out.println(" Saliendo del sistema de modificación.....");
                               System.out.println("..........///.......///.......////....//");
                               break;
                           default:
                               System.out.println(" Error ");


                       }

                   }while (opc1 != 4);
                    break;
                case 4:
                    System.out.println(" LISTA ACTUALIZADA");
                    System.out.println("//____//____//____//____//____//____//____//");

                    if (lstLista.isEmpty()) {
                        System.out.println("(Sin registros)");
                    } else {
                        for (Mascota m : lstLista) {
                            System.out.println(m);
                        }
                    }

                    System.out.println("//____//____//____//____//____//____//____//");

                    break;

                case 5:
                    System.out.println(" Saliendo del sistema.....");
                    break;

                default:
                    System.out.println("No existe");

            }

        }while (opc !=5);



    }
}