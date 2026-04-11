package OOPS.Inheritance;
class Circle
{
    public double radius;
    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double parameter()
    {
        return 2*Math.PI* radius;
    }
    public double Circumference()
    {
        return parameter();
    }
}
class Cyclinder extends Circle{
    public double height;
    public double volume()
    {
        return area()*height;
    }
}
public class Cricle1 {
    public static void main(String[] args) {
        Cyclinder c = new Cyclinder();
        c.radius = 3;
        c.height = 4;
        System.out.println(c.volume());
        System.out.println(c.area());
    }

}
