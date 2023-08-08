import java.util.Scanner;
public class Week3QuickReview {
    public static void main(String[] args){

        double Child = 0, Senior = 1.50, Adult = 2.00;
       //Combine double to entryfee
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = sc.nextInt();
        System.out.println(age);

        if( age < 5){
            System.out.println("Ticket Price: " + Child);
        } else if( age >=65 ) {
            System.out.println("Ticket Price: " + Senior);
        }else{
            System.out.println("Ticket Price: " + Adult);
        }
        
        }
}





            

      
    
         



        
        
 

            
            
        
        
        
        