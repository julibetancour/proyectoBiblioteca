package proyecto_biblioteca;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();
        ArrayList<Prestamo> prestamos = new ArrayList<>();

        while (true) {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Agregar Nuevo Libro");
            System.out.println("2. Buscar Libro por Título");
            System.out.println("3. Buscar Libro por Autor");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Realizar Préstamo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los detalles del libro:");
                    System.out.print("Título: ");
                    scanner.nextLine();
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Número: ");
                    int numero = scanner.nextInt();
                    System.out.print("Editorial: ");
                    scanner.nextLine();
                    String editorial = scanner.nextLine();
                    System.out.print("Año de publicación: ");
                    int anoPublicacion = scanner.nextInt();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();

                    Libro nuevoLibro = new Libro(titulo, autor, numero, editorial, anoPublicacion, precio);
                    libreria.agregarLibro(nuevoLibro);
                    break;
                case 2:
                    System.out.print("Ingrese el título del libro a buscar: ");
                    scanner.nextLine();
                    String tituloBuscar = scanner.nextLine();
                    Libro libroEncontrado = libreria.buscarLibroPorTitulo(tituloBuscar);
                    if (libroEncontrado != null) {
                        System.out.println("Libro encontrado:");
                        System.out.println(libroEncontrado);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el autor del libro a buscar: ");
                    scanner.nextLine();
                    String autorBuscar = scanner.nextLine();
                    libreria.buscarLibroPorAutor(autorBuscar);
                    break;
                case 4:
                    libreria.mostrarInventario();
                    break;
                case 5:
                    System.out.println("Ingrese el título del libro:");
                    String tituloLibro = scanner.nextLine();
                    System.out.println("Ingrese el nombre del usuario:");
                    String usuario = scanner.nextLine();
                    System.out.println("Ingrese la fecha de préstamo (dd/MM/yyyy):");
                    String fechaPrestamo = scanner.nextLine();
                    System.out.println("Ingrese la fecha de devolución (dd/MM/yyyy):");
                    String fechaDevolucion = scanner.nextLine();

                    Prestamo nuevoPrestamo = new Prestamo(tituloLibro, fechaPrestamo, fechaDevolucion, usuario);
                    prestamos.add(nuevoPrestamo);
                    System.out.println("Préstamo registrado con éxito.");
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}
