public class A {
    int a =10;
    static int b=20;
{
    //non static
}
    static {
        System.out.println("H1");
    }
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        System.out.println(b);
    }
}
