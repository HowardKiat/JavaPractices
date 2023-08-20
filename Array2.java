public class Array2 {
   public static void main (String [] args){
    int myArray1 [];
    myArray1 = new int [10];
    //int [] myArray2 = new int[10];
    int intArray[] = {23,35,70,99,45,77};
    for(int i = 0; i < myArray1.length;i++){
        myArray1[i] = (int) Math.random() * 1000;
        System.out.println("myArray1[" + i + "] : " + myArray1[i]);
    }
    for (int i : intArray){
        System.out.println("intArray : " + i);
    }
   } 
}
