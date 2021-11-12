public class Rectangle {

    // Method to calculate area of rectangle
    public static double calculateArea(Double length, Double breadth) {
        if(length!=null && breadth !=null){
            double area = length * breadth;
            return area;
        }
        System.out.println("Inputs cannot be null");
        return 0;
    }
}
