public class Main {
    public static void main(String[] args) {

        int x=30;
        String a =  (x>25) ? "x is greater than 25" : "x is less than or equal to 25";
        System.out.println(a);

        int b = 5;
        do{
            System.out.println(b);
            b++;
        }while(b<7);

        int[] ints = {1,2,3};
        for (int c:ints){
            /*
            For each loops
             */
            System.out.println(c);
        }

    }
}