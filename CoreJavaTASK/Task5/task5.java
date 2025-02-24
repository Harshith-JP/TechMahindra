class Prime extends Thread {
    private int limit;
    private long sum;

    public Prime(int limit) {
        this.limit = limit;
    }

    public long getSum() {
        return sum;
    }

    public void run() {
        sum = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws InterruptedException {
        int limit = 100;
        Prime primeThread = new Prime(limit);
        primeThread.start();
        primeThread.join();  

        System.out.println("Sum of all prime numbers up to " + limit + " is: " + primeThread.getSum());
    }
}
