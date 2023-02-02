public class test_varargs {
    public static void passVarArgs(int ...u){
        int total = 0;
        for (int i:u){
            System.out.println(i);
            total = total + i;
        }
        System.out.println("Total = "+total);


        for(int i =0; i< u.length;i++){
            System.out.println(u[i]);
        }
    }
}
