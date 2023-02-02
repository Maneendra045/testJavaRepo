public class Main {
    public static void main(String[] args) {

        sum(new int[]{1,2,3});

        sort_acs_arrays.sortArr();

        test_varargs.passVarArgs(6,8);

        for(int i=0;i<args.length;i++){
            System.out.println("Number of args ----> " + args[i]);
        }
        System.out.println("check");

        test_static_vars tst = new test_static_vars();
        test_static_vars tst1 = new test_static_vars();


        int c = tst.a;
        c = 5;
        test_static_vars.b = 10;

        System.out.println("initial ====> "+ c);
//        System.out.println("initial ====> "+ d);

        System.out.println("check ====> "+ tst.a);

      int x =10;
      int y =15;

//      System.out.println(++y);

      if(++x > 10 && 16 < 15){
          ++x;
      }else {
          ++y;
      }

      System.out.println(x+"........"+y);

    int day = 3;

    switch (day){
        case 1: {
            System.out.println("Mon");
            break;
        }
        case 2: {
            System.out.println("Tues");
            break;
        }
        case 3: {
            System.out.println("WED");
            break;
        }
        case 4: {
            System.out.println("Thrs");

        }
        case 5: {
            System.out.println("Fri");
            break;
        }
    }

        int a = 5;








    }
    public static void sum(int[] x){

        int total = 0;

        for(int x1 : x){
            total = total + x1;
        }
        System.out.println("Total SUM = " + total);
    }
}