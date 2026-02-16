import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer {
    public static void main (String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader("nombres.txt"))){
            String linea;

            while ((linea = reader.readLine())!= null){
                System.out.println(linea);
            }
        }catch (IIOException e){
            System.out.println("Error al leer el archivo");
        }
    }
}