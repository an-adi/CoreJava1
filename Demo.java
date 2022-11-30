// Constructor & Method overloading
class Demo {
    Demo() {
        System.out.println("Default constructor executed");
    }
    Demo(int a, int b) {
        System.out.println("parameterised constructor executed");
    }
    void fun(int a, int b){
        System.out.println("fun method with integer arguments executed");
    }
    void fun(double a, double b){
        System.out.println("fun method with double arguments executed");
    }
    public static void main(String args[]) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo(10, 20);
        obj1.fun(10, 20);
        obj1.fun(10.5, 20.5);
    }
}