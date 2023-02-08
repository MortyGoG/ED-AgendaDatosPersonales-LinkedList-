package AgendaLinkedList;
import java.util.Scanner;
/**
 *
 * @author Morty
 */
public class Main {
    public static void main(String[] args){
        	    
	    ListaLigada llista = new ListaLigada();
	    Scanner op = new Scanner(System.in);
	    Scanner scanner = new Scanner(System.in);
	    int opcion = 0;
            String Nombre = "", Genero = "", Correo = "", Ciudad = "", Edad = "", Inicial = "";
            
	    do {
                    System.out.println("Opciones. ");
                    System.out.println("1. Insertar Nueva Persona ");
                    System.out.println("2. Eliminar una Persona");
                    System.out.println("3. Mostrar Agenda por Letra Inicial");
                    System.out.println("4. Mostrar Agenda Completa");

                    opcion = op.nextInt();
                    
                    switch (opcion) {
                        case 1:
                                System.out.println("Introduce los siguientes datos de la persona");
                                System.out.println("Nombre:");
                                Nombre = scanner.nextLine();
                                System.out.println("Edad:");
                                Edad = scanner.nextLine();
                                System.out.println("Genero:");
                                Genero = scanner.nextLine();
                                System.out.println("Correo:");
                                Correo = scanner.nextLine();
                                System.out.println("Ciudad:");
                                Ciudad = scanner.nextLine();
                                llista.insertarPersona(Nombre, Edad, Genero, Correo, Ciudad);
                                System.out.println("Presione Enter...");
                                scanner.nextLine();
                            break;
                        case 2:
                                System.out.println("Introduce el Nombre de la Persona a Eliminar: ");
                                Nombre = scanner.nextLine();    
                                llista.eliminarPersona(Nombre);
                                System.out.println("Presione Enter...");
                                scanner.nextLine();
                            break;
                        case 3:
                                System.out.println("Introduce la Inicial a Mostrar: ");
                                Inicial = scanner.nextLine(); 
                                llista.mostrarListaPorInicial(Inicial);
                                System.out.println("Presione Enter...");
                                scanner.nextLine();
                            break;
                        case 4:
                                llista.mostrarLista();
                                System.out.println("Presione Enter...");
                                scanner.nextLine();
                            break;
                        case 5:
                                System.out.println("ADIOS");
                            break;
                        default:
                            System.out.println("\nIngrese una opcion valida. ");
                    }
            } while (opcion != 5);
    }
}
