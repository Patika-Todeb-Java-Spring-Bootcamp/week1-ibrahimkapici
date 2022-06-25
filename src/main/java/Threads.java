
public class Threads {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Cons());
        Thread t2 = new Thread(new Prod());

        t1.start();
        t2.start();

    }
}
