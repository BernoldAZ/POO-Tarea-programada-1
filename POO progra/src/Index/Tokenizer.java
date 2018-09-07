package Index;

import java.util.StringTokenizer;
import java.util.List;

public class Tokenizer {
	
	public static List<String> BagOfWords(String line, List<String> list) {
		StringTokenizer tokens=new StringTokenizer(line);
		 while(tokens.hasMoreTokens()){
			 list.add(tokens.nextToken());
		 }
		 return list;
	}
	/*
	public static void main(String[] args) {
	    String nombre="Angel Franco García";
	    StringTokenizer tokens=new StringTokenizer(nombre);
        while(tokens.hasMoreTokens()){
            System.out.println(tokens.nextToken());
        }
        
        List<String> doc1 = Arrays.asList(nombre);
        System.out.println(BagOfWords(nombre, doc1));
	}
	*/
}

