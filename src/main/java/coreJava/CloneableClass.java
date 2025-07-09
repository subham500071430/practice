package coreJava;

public class CloneableClass {

    public static void main(String[] args) {

        Vechile v = new Vechile("KA01JY0407", "Bike");

        try {
            Vechile copy = (Vechile) v.clone();
            System.out.println(copy.vechileNo + " " +copy.vechileType);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
