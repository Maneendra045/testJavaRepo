public class sort_acs_arrays {
    public static void sortArr() {
        int[] intArray = new int[]{4,2,1,3};

        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
                if(intArray[i]>intArray[j]){
                    int temp = intArray[j];
                    intArray[j] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i] + "\n");
        }
    }
}
