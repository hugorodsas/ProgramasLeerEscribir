import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Escribir {
    public static void main(String[] args) throws IOException {
        List<String> nombres = Arrays.asList(
                "Ana",
                "Carlos",
                "Lucía",
                "Pedro",
                "María");

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("nombres.txt"))){
            for(String nombre : nombres){
                writer.write(nombre);
                writer.newLine();
            }

            System.out.println("Archivo creado");
        }catch (IIOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
