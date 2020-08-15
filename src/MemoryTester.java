import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MemoryTester {

  public static ArrayList<Integer> shuffle(int numberOfElem) {
      ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
      Random random = new Random();
      for(int i = 0; i < numberOfElem; i++ )
          randomNumbers.add(random.nextInt(10));
      return randomNumbers;
  }

  public static int getResult(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray) {
      int hits = 0;
      for(int number : secondArray) {
          if(firstArray.contains(number))
              hits++;
      }
      return hits;
  }

  public static void eraser() {
      System.out.println();
  }


  public static void startMemoryGame() throws InterruptedException {
      System.out.println("Memorize the numbers that will appear and then write it again");
      System.out.println("First, how many numbers do you want memorize?");
      Scanner scan = new Scanner(System.in);
      int quantNumber = scan.nextInt();
      System.out.println("Generating the random numbers...");
      ArrayList<Integer> randomNumbers = shuffle(quantNumber);
      ArrayList<Integer> userAnwser = new ArrayList<Integer>();

      for(int number : randomNumbers) {
          System.out.print(number);
          Thread.sleep(5000);
          System.out.println("\b");
      }
      System.out.println("Now, it's your turn. Write a number and then press enter");
      for(int i = 0; i < quantNumber; i++)
          userAnwser.add(scan.nextInt());
      int result = getResult(randomNumbers, userAnwser);
      System.out.println("You got " + result);
      if(result == quantNumber)
          System.out.println("You got the max score!!!");
  }

}
