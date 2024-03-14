public class SumOfPerfectNum {
    public static void main (String [] args){
       int num, sum;
       for(num = 2; num <=10000; num++);
        sum = 0 ;
        for(int d=1; d <= (num/2)+1; d++){
            if(num % d == 0) {
                sum += d;

            }
             if(sum == num) {
                System.out.println(num + "is a perfect number");
            }
        } 
    }
}


            
