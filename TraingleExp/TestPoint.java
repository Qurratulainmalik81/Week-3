public class TestPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2,2);
         MyPoint p2 = new MyPoint(3,3);
          MyPoint p3 = new MyPoint(4,4);
         MyTriangle T = new MyTriangle(p1, p2, p3);
         System.out.println(T.getPerimeter());
       /* p1.setXY(7,8);
        System.out.println(p1);

         System.out.printf("Distance = %.2f",p1.distance(2,4));
         MyPoint p2 = new MyPoint(2, 4);
         System.out.printf("\nDistance = %.2f",p1.distance(p2));

         System.out.printf("\nDistance = %.2f",p1.distance());
         System.out.printf("\nDistance = %.2f",p2.distance());*/


    }
}
