public class RightTriangle {

    boolean isRightTriangle(Triangle triangle) {
        return triangle.angle1 == 90 || triangle.angle2 == 90 || triangle.angle3 == 90;
    }
}
