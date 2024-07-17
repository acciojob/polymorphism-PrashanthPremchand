package com.driver;

public class Main {
    static class  Product{
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;
        }
    }
    public static void main(String[] args) {
        Product p = new Product();
        int p1 = p.product(10, 20);
        int p2 = p.product(10, 20, 30);
        double p3 = p.product(10d, 20d);
    }
}
