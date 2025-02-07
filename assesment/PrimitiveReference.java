class PrimitiveReferenceDemo {
    static void modify(int x, int[] arr) {
        x = 100;
        arr[0] = 100;
    }

    public static void main(String[] args) {
        int a = 50;
        int[] b = {50};
        modify(a, b);
        System.out.println("Integer: " + a + ", Array: " + b[0]);
    }
}
