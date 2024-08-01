import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateArchivo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escriba el nombre del archivo (agregar al final \".txt\"): ");
            String nombreArchivo = scanner.nextLine();
            scanner.close();

            File miObjeto = new File(nombreArchivo);
            if (miObjeto.createNewFile()) {
                System.out.println("Archivo creado: " + miObjeto.getName());
            } else {
                System.out.println("El archivo ya ha sido creado");
            }
        } catch (IOException e) {
            System.out.println("Un error ha ocurrido");
            e.printStackTrace();
        }
    }
}
