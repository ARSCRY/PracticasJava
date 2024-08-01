import java.io.File;
import java.util.Scanner;

public class GetInfoArchivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre del archivo a leer(agregar al final \".txt\"): ");
        String nombreArchivo = scanner.nextLine();

        File objetoArchivo = new File(nombreArchivo);
        if (objetoArchivo.exists()) {
            System.out.println("Nombre del archivo: " + objetoArchivo.getName());
            System.out.println("Direccion Ubicada: " + objetoArchivo.getAbsolutePath());
            System.out.println("Grabable: " + objetoArchivo.canWrite());
            System.out.println("Legible: " + objetoArchivo.canRead());
            System.out.println("Tamaño del archivo en bytes: " + objetoArchivo.length());

        } else {
            System.out.println("El archivo no existe");
        }
        scanner.close();
    }
}
