public class SortingDemoWithoutImport {
    public static void main(String [] args){
        //Define an array and initialize with value
        int myArray [] = {53,46,24,5,30};
        int myResult = 0;
        System.out.println("Before Sorting: ");
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");

        }
        for (int i = 0; i < myArray.length; i++){
            for(int x = i + 1; x < myArray.length; x++){
                if(myArray[i] > myArray[x]){
                    myResult = myArray[i];
                    myArray[i] = myArray[x];
                    myArray[x] = myResult;
                }
            }
        }
            System.out.println("\n After: Array sorted acending: ");
            for (int i = 0; i < myArray.length; i++){
                System.out.print(myArray[i] + " ");
            }
    }
}