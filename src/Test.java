public class Test {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(4,5,2);
        RightTriangle triangle = new RightTriangle();
        triangle.isRightTriangle(triangle1);
        /*
        triangle.isRightTriangle1(triangle1);
        triangle.isRightTriangle2(triangle1);

         */
        System.out.println(triangle.isRightTriangle(triangle1));
        /*
        System.out.println(triangle.isRightTriangle1(triangle1));
        System.out.println(triangle.isRightTriangle2(triangle1));

         */
    }
}
