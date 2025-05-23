public class FuncSecEx {
    public static void main(String[] args) {
        FuncSecEx obj = new FuncSecEx();
        
        // Call Area of Circle
        obj.AreaofCircle(6);
        
        // Call Area of Rectangle
        int res = obj.AreaofRectangle(5, 7);
        System.out.println(res);
        
        // Call Area of Square
        int squareRes = obj.Areaofsquare(4);
        System.out.println(squareRes);
    }

    public void AreaofCircle(int r) {
        double area = 3.14f * r * r;
        System.out.println("Area of Circle is: " + area);
    }

    public int AreaofRectangle(int l, int b) {
        int area = l * b;
        System.out.print("Area of Rectangle is: ");
        return area;
    }

    public int Areaofsquare(int s) {
        int Area = s * s;
        System.out.print("Area of square is: ");
        return Area;
    }
}
