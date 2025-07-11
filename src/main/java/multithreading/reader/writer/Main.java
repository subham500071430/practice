package multithreading.reader.writer;

public class Main {

    public static void main(String[] args) {

        Resource resource = new Resource();

        Thread threadA = new Thread( () -> {
              for(int i=0;i<10;i++)
                   resource.readData();
        });

        Thread threadB = new Thread( () -> {
               for(int i=0;i<10;i++)
                   resource.writeData();
        });

        threadA.start();
        threadB.start();

    }
}
