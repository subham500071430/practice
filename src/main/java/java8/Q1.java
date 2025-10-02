package java8;

public class Q1 implements A,B{

    public static void main(String[] args) {

           Q1 obj = new Q1();

           obj.add(10,20);

    }

    @Override
    public int add(int x, int y) {
        return A.super.add(x, y);
    }
}

interface A {
     default int add(int x , int y) {
         return x+y;
     }
}

interface B{
    default int add(int x , int y) {
        return x-y;
    }
}

