import java.util.Scanner;
public class Array3 {
    public static void main (String [] args){
        Scanner input= new Scanner(System.in);
        int [] myArray = new int[10];
        int i;
        
        for(i = 0;i < myArray.length;i++){
            System.out.println("Enter a value for myArray[" + i + "] : ");
            myArray[i] = input.nextInt();
            input.close();
        }
        for(i = 9; i >= 0; i++){
            System.out.println("myArray[" + i + "] : " +myArray[i]);
            
        }
        
    } 
    
}
