import java.util.Scanner;

public class SearchingDemo {
    public static void main(String[] args) {
        int[] myArray = {65, 45, 98, 2, 34};
        int ind = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value to search: ");
        int searchKey = input.nextInt();

        for (int i = 0; i < myArray.length; i++) {
            if (searchKey == myArray[i]) {
                ind = i;
                break;
                
            }
            input.close();
        }

        if (ind != -1) {
            System.out.println("Value " + searchKey + " found at index " + ind);
        } else {
            System.out.println("Value " + searchKey + " not found in the array.");
        }
    }
    
}

