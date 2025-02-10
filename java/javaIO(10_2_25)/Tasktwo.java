class Tasktwo{
    public static void main(String[] args) {
        print();
        printnextline();
        Tasktwo t = new Tasktwo();
        t.printwitherror();

    }
    static void print(){
        System.out.println("Hello World");
        System.out.println("this is line 2 in println");
    }
    static void printnextline(){
        System.out.println("this is line 1 in println");
        System.out.println("this is line 2 in println");
    }
     void printwitherror(){
        System.err.println("this is line 1 with error");
        System.err.println("this is line 2 with error");
     }
}