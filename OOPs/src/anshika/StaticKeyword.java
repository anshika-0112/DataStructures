package anshika;

public class StaticKeyword {
    static int c=0;
    static void increment()
    {
        c++;
        System.out.println(c);
    }

    public static void main(String[] args) {
        StaticKeyword sk=new StaticKeyword();
        sk.increment();
        sk.increment();
        sk.increment();
    }

}