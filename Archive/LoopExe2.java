import java.util.Scanner;

public class LoopExe2 {
    
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println(" Please Enter a number: ");
        int num = input.nextInt();
        int flg = -1;
        for(int x = 2; x <= (num/2)+ 1; x++){
            if(num % x == 0){
                flg = 1;
                break;
            }
        }
        if(flg == -1){
            System.out.println(num + " is a prime number");
        }else {
            System.out.println(num + "is not a prime number");
            input.close();
        }
        }
    }

