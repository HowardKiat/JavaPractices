

public class SumOfPrime {
    public static void main (String [] args){
        int sum = 0;
        for(int num = 2; num <= 100; num++){
            int flg = -1;
            for(int x = 2; x <= (num/2)+ 1; x++){
                if(num % x == 0){
                    flg = 1;
                    break;
                }
            }
            if(flg == -1){
                sum += num;
            }
            
        
        
        }
            System.out.println("The Sum of all the prime numbers: " + sum);
    }
    
}
