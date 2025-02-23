import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray(); 
        StringBuilder st = new StringBuilder();

     
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
              
                st.append(Character.toUpperCase(arr[i]));
            } else {
              
                st.append(Character.toLowerCase(arr[i]));
            }
        }

      
        System.out.println(st.toString());

       
    }
}
