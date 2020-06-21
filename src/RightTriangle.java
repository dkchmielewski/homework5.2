public class RightTriangle {

    boolean isRightTriangle(Triangle triangle) {
        int result = triangle.side2 * triangle.side2 + triangle.side3 * triangle.side3;
        int hypotenuse = triangle.side1 * triangle.side1;
        int result2 = triangle.side3 * triangle.side3 + triangle.side1 * triangle.side1;
        int hypotenuse2 = triangle.side2 * triangle.side2;
        int result3 = triangle.side1 * triangle.side1 + triangle.side2 * triangle.side2;
        int hypotenuse3 = triangle.side3 * triangle.side3;
        return (hypotenuse == result) || (hypotenuse2 == result2) || (hypotenuse3 == result3);
    }
    /*
    boolean isRightTriangle1(Triangle triangle) {
        int result2 = triangle.side3 * triangle.side3 + triangle.side1 * triangle.side1;
        int hypotenuse2 = triangle.side2 * triangle.side2;
        return hypotenuse2 == result2;
    }
    boolean isRightTriangle2(Triangle triangle) {
        int result3 = triangle.side1 * triangle.side1 + triangle.side2 * triangle.side2;
        int hypotenuse3 = triangle.side3 * triangle.side3;
        return hypotenuse3 == result3;
    }
*/

    }
