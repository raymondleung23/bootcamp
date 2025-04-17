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

        // byte, short, int, long (Store Integer)
        byte b1 = 3;
        short s1 = 3;
        int i1 = 3;
        long l1 = 3;

        // byte (-128 ~127)
        // short (-32xxx - 32xxx)
        // int (-21 - 21)
        // long (-2^63 - 2^63)

        b1 = -127;
        //b1 = 127;

        s1 = 32767;
        //s1 = s1 + 1;

        i1 = 2_147_483_647;
        i1 = i1 + 1;
        System.out.println(i1); // -2147483648 (overflow)

        //1. Prepare in int value 22 (right hand side)
        //2. Assign a value into long variable (left hand side);
        // l1 = 2_200_000_000L;
        l1 = 2_200_000_000L;
        l1 = l1 + 3;
        System.out.println(l1);
        long l2 = 2_200_222_0000L + 5;
        System.out.println(l2);

        int i8 = 9;
        //what is the type of i8? ... it is int, sorry not OK;
        // byte b9 = i8; // int variable --> unsafe.

        byte b10 = 3; // direct value--> safe.
        // short s11 = i8; //unsafe

        // 2 @ !the range of int value should solve the majority of the problems in system.
        // so we won't use long as a default type f variable for staring integer.

        // boolean (either true or false)
        boolean b9 = true;
        b9 = false;

        int result = 5;
        // "result % 2 == 1" --> true
        boolean isResultOddNumber = result % 2 == 1;  // "xx" --> checking if equals to
        System.out.println(isResultOddNumber);

        int johnAge = 65;
        boolean isElderly = johnAge >= 65; // forumla / definition
        System.out.println(isElderly); // false

        // char
        // single quote
        //assign char value 'a' into char variable
        char c1 = 'a';
        System.out.println(c1);  // a
        c1 = '$';
        c1 = '+';
        c1 = 'a';
        char c2 = 'A';

        System.out.println(c1 == c2);  // false, because Java is case sensitive

        char lastName = '陳';
        System.out.println(lastName);
        // we cannot assign a bigger range of variable to smailler range of variable

        //force assignment
        byte b40 = (byte) 129L;
        System.out.println(b40); // -127 (overflow)


        // float (store decimal number)
        // 3.14159 is double value
        // so unsafe (assign double value to float variable)
        float f1 = 3.14159f;
        f1 = 0.1f + 0.2f;
        System.out.println(f1);

        
    }
}
