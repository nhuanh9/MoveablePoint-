public class main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3,4);
        System.out.println(point2D.toString());
        MoveablePoint moveablePoint = new MoveablePoint(4,5,1,1);
        System.out.println(moveablePoint.toString());
        moveablePoint.move();
        System.out.println(moveablePoint.toString());
    }
}
