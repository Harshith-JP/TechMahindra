public class Main {
    public static void main(String[] args) {
       int [] arr1 = {10,20,30,40,70,100};
       int [] arr2 = new int[5];
       System.arraycopy(arr1,2,arr2,0,3);
       for(int i : arr2){
           System.out.println(i);
       }
       
    }
}
