
import java.io.FileReader;
import java.net.URL;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class Adventure {

    public void Coordinate(){
        
    }
    
    public void StartPos(){
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //create a blank a file reader
        FileReader file = null;
        try {
            //Fix this proper loading later
            URL url = Adventure.class.getResource("Images.zip");

            // creating the file reader
            file = new FileReader(url.getFile());
        } catch (Exception e) {
            //handle any errors
            //print out the red errors
            e.printStackTrace();
            //exit the program 
            System.exit(0);
        }
        
        
        
    }
}
