public class Main implements Runnable {
    public void run() {
        System.out.println("From ThreadTwo!");
        System.out.println("From ThreadTwo!");
        try{
            System.out.println(10 / 0);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: " + e);
        }

    }

    public static void main(String[] args) {
        Main threadTwo = new Main();

       
        Thread t1 = new Thread(threadTwo);
        Thread t2 = new Thread(threadTwo);

       
        t1.start();
        t2.start();

        
        threadTwo.run();
    }
}
