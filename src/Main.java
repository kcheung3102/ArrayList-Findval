import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int randomNum;
        int pick;
        ArrayList<Integer> randomNumList = new ArrayList<Integer>();

        for(int i = 0; i < 10;i++) {
            randomNum = r.nextInt(49) + 1;
            randomNumList.add(randomNum);
        }
            System.out.println(randomNumList);
            for(int i = 0; i < 10;i++) {
                System.out.println("Value to Find: ");
                pick = input.nextInt();
                if(randomNumList.contains(pick)) {
                    System.out.println(pick + " is in the arraylist");
                } else {
                    System.out.println(pick + "is not in the arraylist");
                }
            }
        }
    }


