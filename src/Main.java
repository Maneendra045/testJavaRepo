public class Main {
    public static void main(String[] args) {

//        sum(new int[]{1,2,3});

        sort_acs_arrays.sortArr();

    }
    public static void sum(int[] x){

        int total = 0;

        for(int x1 : x){
            total = total + x1;
        }
        System.out.println("Total SUM = " + total);
    }
}