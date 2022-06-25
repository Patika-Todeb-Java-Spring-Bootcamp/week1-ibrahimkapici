import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cons implements Runnable {
    public static void main(String[] args) throws FileNotFoundException {
        File myObj = new File("score.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Consumer");
    }
}