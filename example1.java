// write a java program declarre 3 methods with same name which helps to perform addition of ,2 numbers ,3 numbers ,4 number
public class example1 {
    public static int addition(int a) {        return a + a;}
    public static int addition(int a,int b) { return a+b;}
    public static int addition(int a,int b,int c) {return a+b+c; }
    public static int addition(int a,int b,int c,int d) { return  a+b+c+d; }


    public static void main(String[] args) {
        System.out.println("addition of 2 number:"+addition(1,3));


    }

    }
