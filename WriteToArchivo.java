import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToArchivo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escriba el nombre del archivo a escribir sobre el: ");
            String nombreArchivo = scanner.nextLine();
    
            System.out.println("Escriba lo que quiere ver en el archivo: ");
            String frase = scanner.nextLine();

            FileWriter escribirArchivo = new FileWriter(nombreArchivo);
            escribirArchivo.write(frase);
            escribirArchivo.close();
            System.out.println("Escritura de archivo Exitosa");
            scanner.close();
        } catch (IOException e) {
            System.out.println("Un error ha ocurrido");
            e.printStackTrace();
        }
    }
}
