
class Shape {
    public double getVolume() {
        return 0.0;
    }
}


class Cube extends Shape {
    private double side; 

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }
}


class Cuboid extends Shape {
    private double length, width, height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return length * width * height;
    }
}


class Cylinder extends Shape {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}


public class shapesproj {
    public static void main(String[] args) {
        
        Shape myCube = new Cube(5);
        Shape myCuboid = new Cuboid(10, 5, 2);
        Shape myCylinder = new Cylinder(3, 7);

        System.out.println("volume of Cube: " + myCube.getVolume());
        System.out.println("volume of Cuboid: " + myCuboid.getVolume());
        System.out.printf("volume of Cylinder: %.2f\n", myCylinder.getVolume());
    }
}