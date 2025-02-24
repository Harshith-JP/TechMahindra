class SortArrayThread extends Thread {
    private int[] array;

    public SortArrayThread(int[] array) {
        this.array = array;
    }

    public void run() {
       
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                   
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = {10, 3, 8, 12, 5, 7, 2, 6};

        SortArrayThread sortThread = new SortArrayThread(array);
        sortThread.start(); 
        sortThread.join();  

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
