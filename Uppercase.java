import java.util.Scanner;
public class Uppercase {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String txt = input.next();
        System.out.println(txt.toLowerCase());
        input.close();
}
}