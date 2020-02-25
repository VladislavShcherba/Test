package main;

public class Main {
    public static void main(String... args) {
        p("common line 1");
        p("common line 2");
        p("common line 3");
    }

    private static void p(Object o) {
        System.out.println(o);
    }
}
