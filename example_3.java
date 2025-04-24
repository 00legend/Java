
// create 3 methods with same name it help to identify area of circel and square and rectangle based on diameter


public class example_3 {

        public static double area(int radius) {
            return 3.14 * radius * radius;
        }

        public static  double area(int length, int breadth) {
            return length * breadth;
        }

        public static double area(double l) {
            return l * l;
        }



    public static void main(String[] args) {
         int radius=3;
         int length = 5;
         int breadth = 6;
         double l=6;

         example_3.area(radius);



    }
}
