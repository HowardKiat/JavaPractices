import java.util.Scanner;
public class MedicalReport {
    public static void main(String [] args) {
        System.out.println("BODY MASS CALCULATION");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your gender(0 for male, 1 for female): ");
        int gender = sc.nextInt();

        System.out.print("Enter your height in inches: ");
        int inches = sc.nextInt();
        double height;
        height = 2.54 * inches;
        
        System.out.print("Enter your weight in pounds: ");
        int pounds = sc.nextInt();
        double weight;
        weight = 0.4536 * pounds;

        double BMI = weight / (height * height);
        System.out.print("Your body-mass-index is: " + BMI);

        if (gender == 0){
            if ( BMI >=27.8 )
                System.out.println(" This is high");
            else 
                System.out.println(" This is not considered high");
        }else{
            if (gender == 1){
                if( BMI >= 27.3)
                 System.out.println(" This is high");
            else 
                System.out.println(" This is not considered high.");
            }
            sc.close();
        }

        }    

        

        }

        //dev logs overview
        // system working as intended however there is some math issues pls ask usman 