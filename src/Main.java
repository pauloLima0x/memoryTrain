import java.io.IOException;

public class Main {

  public static void main(String[] args) throws InterruptedException {
     try {
         MemoryTester.startMemoryGame();
     } catch(InterruptedException e) {
         System.out.println("Error while running the memoryGame. Details: " + e.getMessage());
     }

  }

}
