
public class Array4 {
    public static void main (String [] args){

        int [] myArray = {34,56,78,98,22};
        for(int i: myArray){
            System.out.println("i:=" + i);
        }

        for (int i =0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}
