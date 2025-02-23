package Task3;
import java.io.File;
import java.io.FileNotFoundException;


public class FileException {

	public static void main(String[] args) {
		
		

		    
		        try {
		            
		            readFile("C:\\Users\\USER\\AppData\\Local\\Temp\\.arduinoIDE-unsaved202491-3176-i5po94.evczd");  
		        } catch (FileNotFoundException e) {
		        	System.out.println("File not found: " + e.getMessage());
		        }
		    }

		    
		    public static void readFile(String fileName) throws FileNotFoundException {
		        File file = new File(fileName);

		        
		        if (!file.exists()) {
		            throw new FileNotFoundException(fileName);
		        }else if(file.exists()) {
		        	System.out.println("file is available");
		        }
		    }
		}
