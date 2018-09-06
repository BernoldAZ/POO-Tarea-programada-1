package Reader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



public class jsonReader{
	

	   public Object readJSON(String nombre) throws FileNotFoundException { 
	      GsonBuilder builder = new GsonBuilder(); 
	      Gson gson = builder.create(); 
	      BufferedReader bufferedReader = new BufferedReader(
	         new FileReader(nombre));   
	      
	      return gson; 
	   } 
	   
	   //Asi se hace la instancia que se toma del json
	   //Lector tester = new Lector();
	   // FootballPlayer Jugador1 = (FootballPlayer) tester.readJSON("archivo.json"); 

}
