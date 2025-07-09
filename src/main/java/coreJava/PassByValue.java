package coreJava;

public class PassByValue {

    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println("Before: " + point);
        modifyPoint(point);
        System.out.println("After: " + point);
    }

    public static void modifyPoint(Point point) {
        point = null;
        System.out.println(point);
    }

    static class Point {

        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}

