import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prod implements Runnable{
    public static void main(String[] args) throws IOException {
        FileWriter myWriter = new FileWriter("score.txt");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter score: ");
        String score = myObj.nextLine();
        myWriter.write(score);
        myWriter.close();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("Producer");

    }
}