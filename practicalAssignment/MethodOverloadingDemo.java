public class MethodOverloadingDemo {

    // Method with one parameter
    public void display(int num) {
        System.out.println("Method with one parameter: " + num);
    }

    // Method with two parameters
    public void display(int num1, int num2) {
        System.out.println("Method with two parameters: " + num1 + ", " + num2);
    }

    // Method with three parameters
    public void display(int num1, int num2, int num3) {
        System.out.println("Method with three parameters: " + num1 + ", " + num2 + ", " + num3);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        // Calling methods with different number of parameters
        obj.display(10);
        obj.display(20, 30);
        obj.display(40, 50, 60);
    }
}
