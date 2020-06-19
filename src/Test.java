public class Test {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(90, 60, 30);
        RightTriangle triangle = new RightTriangle();
        triangle.isRightTriangle(triangle1);
        System.out.println(triangle.isRightTriangle(triangle1));
    }
}
