public class Array {
    public static void main(String[] args) {
        int [] myArray = new int[100];
        for(int i = 0; i < 100; i++){
            myArray[i] = (int)(Math.random()*100);
        }
        int sum=0;
        for(int i: myArray){
            System.out.println("myArray[" + i +"]: " + myArray[i]);
            sum += i;
        }
        System.out.println("The total: " +sum);

    }
    
}
