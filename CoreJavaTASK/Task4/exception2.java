package Task3;
import java.util.*;

public class oddexception {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        try {
            
            checkEvenNumber(n);  
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
    }
    public static void checkEvenNumber(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception("The number is odd.");
        }else System.out.println("it is even");
    }
    
}

