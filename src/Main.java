public class Main {
    public static void main(String[] args) {

        System.out.println(add("hello","hi"));
        System.out.println(add(3,5));
    }
    static String add(String a, String b){
        for (int i = 0; i<a.length();i++){
            System.out.println(a.charAt(i));
        }
        return a+b;
    }
    static int add(int a, int b){
        return a+b;
    }
    static void test(){
        System.out.println("hi");
    }
}