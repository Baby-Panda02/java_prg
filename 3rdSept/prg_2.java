class Overloading {

    // Valid: different number of parameters
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }

    // Valid: different data types
    void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5, 20.5);
    }
}
