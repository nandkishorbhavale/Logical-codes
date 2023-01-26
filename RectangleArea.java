class Area {
    int length;
    int breadth;

    public void getArea() {
        int area = length * breadth;
        System.out.println("Area of the Reactangle is: " + area);
    }

    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Area reactangle = new Area(3, 6);
        reactangle.getArea();
    }
}