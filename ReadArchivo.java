import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadArchivo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escriba el nombre del archivo a leer(agregar al final \".txt\"): ");
            String nombreArchivo = scanner.nextLine();

            File objetoLeerArchivo = new File(nombreArchivo);
            Scanner miLector = new Scanner(objetoLeerArchivo);

            while (miLector.hasNextLine()) {
                String data = miLector.nextLine();
                System.out.println(data);
            }
            scanner.close();
            miLector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Un error ha ocurrido");
            e.printStackTrace();
        }
    }
}
