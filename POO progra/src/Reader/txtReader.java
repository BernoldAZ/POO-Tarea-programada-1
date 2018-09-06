package Reader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class txtReader {


//recibe la dirección de un archivo de texto y pasa a string lo que tenga.
	public static void muestraContenido(String address) throws FileNotFoundException, IOException {
		String cadena;
		FileReader f = new FileReader(address);
		BufferedReader b = new BufferedReader(f);
		while((cadena = b.readLine())!=null) {
			System.out.println(cadena);
			}
		b.close();
	}

	public static void main(String[] args) throws IOException {
	    muestraContenido("C:\\Users\\usuario\\Desktop\\POO progra\\hola.txt");
	}
	   


}
