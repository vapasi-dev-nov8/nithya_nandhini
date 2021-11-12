public class Rectangle {

    // Method to calculate area of rectangle
    public static double calculateArea(double length, double breadth) {
        if(length!=0.0 && breadth !=0.0){
            double area = length * breadth;
            return area;
        }
        System.out.println("Length and breadth cannot be zero");
        return 0;
    }
}
