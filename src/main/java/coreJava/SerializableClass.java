package coreJava;

import java.io.*;

public class SerializableClass {

       public static void main(String[] args) {

           try{
               FileInputStream fileInputStream = new FileInputStream("C:/Users/subha/IdeaProjects/Work/src/main/java/coreJava/text");
               ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
               System.out.println(objectInputStream.readObject());
             /*
               FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/subha/IdeaProjects/Work/src/main/java/coreJava/text");
               ObjectOutputStream obj = new ObjectOutputStream(fileOutputStream);
               obj.writeObject(new Emp("Subham",1));
               obj.close();
               fileOutputStream.close();*/
           } catch (FileNotFoundException e) {
               throw new RuntimeException(e);
           } catch (IOException e) {
               throw new RuntimeException(e);
           } catch (ClassNotFoundException e) {
               throw new RuntimeException(e);
           }

       }
}
