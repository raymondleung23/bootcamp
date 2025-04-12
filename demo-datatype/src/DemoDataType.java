public class DemoDataType {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Data Type: Primitives
        // 1. (Store Integer) byte, short, int, long
        // 2. (Store number with decial place) float, double
        // 3. (Store Single Character) char
        // 4. (Store true or false) boolean

        // Variable
        //Integer (+ve =ve)

        //"x"  --> assignment
        // ! int
        int x = 3;
        // put 7 into y
        int y = 7;
        System.out.println("x");
        System.out.println(x); //3
        System.out.println(y);

        //re-assign value 10 into variable x
        x = 10;
        System.out.println(x); //10

        // re-assign y to 100
        y = 100;
        //shortcut: sysout --> System.out.println();
        System.out.println(y);

        int age = 65;
        int salary = 20000;

        // variable name convention
        // 1. must be started with a-z
        // 2. Camel Case
        int w1 = 2;

        int tutorFirstName = 3;
        System.out.println(tutorFirstName);

        // Declaration for variable type
        // Same variable name can be declared once only
        int a;
        a = 4;
        System.out.println(a);  //4

        // declaration and assignment
        int w = 20;

        // ! double
        double d1 = 4.4;
        System.out.println(d1);
        double d2 = 9.9999;
        System.out.println(d2);

        double d3;
        d3 = 10.4;
        System.out.println(d3);

        // + - * /
        int x2 = 6 + 1;
        System.out.println(x2); // 7

        int x3 = 9;

        //! put x3 value into variable x2
        x2 = x3;

        System.out.println(x2); // 9
        System.out.println(x3); // 9

        int x4 = 10;
        x2 = 7 + x4;

        System.out.println(x2);  // 17

        // ! add 3 to itself
        x2 = x2 + 8;  // 25
        System.out.println(x2);



    }
}
