package Reader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ListFiles {
	private static List<String> list_final;

    public static List<String> getFiles( String dir_path ) {

    	List<String> array_final = new ArrayList<String>();
        File file = new File( dir_path );
        
        if ( file.isDirectory( )) {

            List<String> res   = new ArrayList<>();
            File[] arr_content = file.listFiles();
            int size = arr_content.length;
            
            for ( int i = 0; i < size; i ++ ) { //Es un for entre todos los archivos
                if ( arr_content[ i ].isDirectory( )) {//Compara si el archivo en la posición i es un directorio
                	 res.addAll(getFiles(arr_content[i].toString()));
                }
                else res.add( arr_content[ i ].toString( ));
            }
            array_final.addAll(res);
        } else
            System.err.println( "¡ Path NO válido !" );
        list_final = array_final;
        return array_final;
    }
    
    /*Por si quiere probarlo
    
    public static void main( String[] args ) {

        String path = "C:\\Users\\usuario\\Desktop\\TEC";


        List<String> files = getFiles( path );

        if ( files != null ) {

            int size = files.size();

            for ( int i = 0; i < size; i ++ ) {

                System.out.println( files.get(i) );
            }
        }
        System.out.println(list_final);
        
    }*/
    
}