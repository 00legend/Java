
// create 3 methods with same name it help to identify area of circel and square and rectangle based on diameter


public class example {

    int radius;
    int length;
    int breadth;
    double l;

    public double area(int radius) {
        return 3.14 * radius * radius;
    }

    public double area(int length, int breadth) {
        return length * breadth;
    }

    public double area(double l) {
        return l * l;
    }
    example(int radius,int length,int breadth,double l){
        this.radius=radius;
        this.length=length;
        this.breadth=breadth;
        this.l=l;



    }


    public static void main(String[] args) {
        example e= new example(2,3,5,7.00);
        System.out.println(e);

//        System.out.println("THE AREA OF CIRCLE :"+e.area(5));
//        System.out.println("THE AREA OF RECATNGLE:"+e.area(5,6));
//        System.out.println("THE AREA OF SQUARE :"+e.area(4.00));


//        example.area(radius);
//        System.out.println(example.area(radius));
//        System.out.println(example.area(length,breadth));
//        System.out.println(example.area(l));



    }
}
