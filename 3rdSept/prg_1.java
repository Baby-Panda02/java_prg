interface IDE {
    int add(int a, int b);
}

class C implements IDE {
    public int add(int a, int b) {
        return a + b;
    }
}

class Python implements IDE {
    public int add(int a, int b) {
        return a + b;
    }
}

class CPP implements IDE {
    public int add(int a, int b) {
        return a + b;
    }
}

class R implements IDE {
    public int add(int a, int b) {
        return a + b;
    }
}

class Java implements IDE {
    public int add(int a, int b) {       // Overriding
        return a + b;
    }

    int add(int a, int b, int c) {       // Overloading
        return a + b + c;
    }
}

class Main {
    public static void main(String[] args) {
        Java j = new Java();

        System.out.println(j.add(10, 20));
        System.out.println(j.add(10, 20, 30));
    }
}
