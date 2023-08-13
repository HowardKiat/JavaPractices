import java.util.Scanner; 

public class Temp {
    public static void main(String[] args) 
    {
        final double degreeF, degreeC;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Degrees: ");
        
        degreeF = input.nextDouble();
        degreeC = 5 * ( degreeF - 32) / 9; 

        if(degreeC >75)
            System.out.print("Temperature Exceeded 75 degrees");
        else{
            System.out.print(degreeC);
        }
        input.close();



       
    }
}
