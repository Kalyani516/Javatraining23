public class Calculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int add = cal.add(10, 20);
        System.out.println("Addition of 10 and 20 is : " + add);

        int sub = cal.sub(20, 10);
        System.out.println("Subtraction of 20 and 10 is : " + sub);

        int mul = cal.mul(10, 20);
        System.out.println("Multiplication of 10 and 20 is : " + mul);

        System.out.println("Division of 20 by 10 is : " + cal.div(20, 10));

        System.out.println("Modulus of 20 by 10 is : " + cal.mod(20, 10));
    }

    int add (int a, int b) {
        int sum = a + b;
        return sum;
    }

    int sub (int b, int a) {
        int sub = a -b;
        return sub;
    }

    int mul (int a, int b) {
        int m = a * b;
        return m;

    }
    int div ( int a, int b) {
        int d = b / a;
        return d;
    }
    int mod ( int a, int b){
        int m = a /b;
        return m;
    }
}
