import java.util.Scanner;

import alumnado.Alumno;
import alumnado.AlumnoException;
public class App {
    public static Scanner sc;
    public static Alumno[] clase; 
    protected   static void inicializar(){//Iniciar Scanner
        sc = new Scanner(System.in);
        System.out.println("Cuántos alumnos ma¡áximo quiere gestionar?");
        clase = new Alumno[Integer.parseInt(sc.nextLine())];
    }

    protected static void finalizar(){//Fin Scanner
        
            sc.close();
        
    }
    public static void muestraMenu() {
        System.out.println("1. Crear alumno");
        System.out.println("2. Modificar alumno");
        System.out.println("3. Borrar alumno");
        System.out.println("4. Listar alumnos");
        System.out.println("5. Salir");
    }

    public static int leerOpcion() {
        return Integer.parseInt(sc.nextLine());
        
    }

    private static int buscaHueco(){
        for (int i = 0; i < clase.length; i++) {
            if(clase[i] == null){
                return i;
            }
        }
        return -1;
    }
    private static int buscaAlumno(int id){
        for (int i = 0; i < clase.length; i++) {
            if(clase[i].getId() == id){
                return i;
            }
        }
        return -1;
    }

    public static void CrearAlumno() {
        int index = buscaHueco();

        if(index != -1){
            System.out.print("Introduzca el nombre del alumno que quiere añadir: ");
            String nombre = sc.nextLine();
            System.out.println();
            System.out.print("Introduzca el apellido del alumno que quiere añadir: ");
            String apellido = sc.nextLine();
            System.out.println();
            System.out.print("Introduzca la edad del alumno que quiere añadir: ");
            int edad = Integer.parseInt(sc.nextLine());
            System.out.println();

            clase[index] = new Alumno(nombre, apellido, edad);
        }else{
            System.out.println("La clase está llena");
        }
    }

    public static void ModificarAlumno() {
        
    }

    public static void BorrarAlumno() {
        System.out.println("Introduce el id del alumno que desee borrar: ");
        int index = Integer.parseInt(sc.nextLine());

        if(index != -1){
            clase[index] = null;
        }else{
            System.out.println("La clase está vacía");
        }
        
    }

    public static void ListarAlumno() {
        System.out.println("******* LISTADO DE ALUMNOS  ******");
        for (int i = 0; i < clase.length; i++) {
            if(clase[i] != null){
                System.out.println(clase[i]);
            }
        }
        System.out.println("**********************************");
    }
    public static void main(String[] args) throws Exception{
        inicializar();
        
        int opcion = 0;
        do {
            muestraMenu();
            opcion = leerOpcion();
            switch(opcion){
                case 1:
                    CrearAlumno();
                    break;
                case 2:
                    ModificarAlumno();
                    break;
                case 3:
                    BorrarAlumno();
                    break;
                case 4:
                    ListarAlumno();
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion!=5);
    }
}