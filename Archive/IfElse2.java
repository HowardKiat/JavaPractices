public class IfElse2 {
    public static void main(String[] args) {
        double x = 5, y = 6, z = 69;
     
        if (x >= y){
            if (x >= z)
                System.out.println(x + " is the largest number.");
            else
                System.out.println(z + " is the largest number.");
        }else{
            if(y >= z)
                System.out.println(y + " is the largest number.");
            else
                System.out.println(z + " is the largest number.");
        }
    }
}

 


