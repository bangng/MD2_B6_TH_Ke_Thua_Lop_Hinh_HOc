package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        System.out.println("================ Shape =============");
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        System.out.println("============== Circle =============");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("indigo", false,3.5);
        System.out.println(circle);


        System.out.println("================Rectangle==============");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle =new Rectangle(3.0,5.0);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange",true,5.0,8.9);
        System.out.println(rectangle);


        System.out.println("=============Square==============");
        Square square = new Square();
        System.out.println(square);
        square = new Square(3.2);
        System.out.println(square);
        square = new Square("yellow",true,6.3);
        System.out.println(square);




    }

}
