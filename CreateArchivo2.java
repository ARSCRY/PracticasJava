import java.io.File;
import java.io.IOException;

public class CreateArchivo2 {
    public static void main(String[] args) {
        try {
            File miObjeto = new File("C:\\Users\\USUARIO\\OneDrive\\Desktop\\ProgramasJava\\archivoNuevo2");
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