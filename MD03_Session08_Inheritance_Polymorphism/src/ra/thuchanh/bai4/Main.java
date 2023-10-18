package ra.thuchanh.bai4;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------SHAPE----------");
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        System.out.println("---------CIRCLE----------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("red", true, 3.5);
        System.out.println(circle);

        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 2.5, 3.8);
        System.out.println(rectangle);

        System.out.println("---------SQUARE----------");

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow", true, 5.8);
        System.out.println(square);

        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║           MAIN MENU                ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ 1. 📁 Open File                    ║");
        System.out.println("║ 2. ✏️ Edit Text                    ║");
        System.out.println("║ 3. 🖨️ Print Document               ║");
        System.out.println("║ 4. 📂 Manage Files                 ║");
        System.out.println("║ 5. 🔄 Refresh                      ║");
        System.out.println("║ 0. ❌ Exit                         ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println("Please enter your choice: ");

        System.out.println("╔═════════════════════════════════════╗");
        System.out.println("║             MAIN MENU               ║");
        System.out.println("╠═════════════════════════════════════╣");
        System.out.println("║ 1. 📁 Open File                     ║");
        System.out.println("║ 2. ✏️ Edit Text                     ║");
        System.out.println("║ 3. 🖨️ Print Document                ║");
        System.out.println("║ 4. 📂 Manage Files                  ║");
        System.out.println("║ 5. 🔄 Refresh                       ║");
        System.out.println("║ 0. ❌ Exit                          ║");
        System.out.println("╚═════════════════════════════════════╝");
        System.out.println("Please enter your choice: ");
    }

}
