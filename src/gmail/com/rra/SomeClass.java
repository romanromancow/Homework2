package gmail.com.rra;

public class SomeClass {
    @Test(a = 2, b = 5)
    public static void sumTest(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
}
