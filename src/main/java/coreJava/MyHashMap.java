package coreJava;

import java.lang.Object;
import java.util.Objects;

public class MyHashMap {

       String name;
       int roll_no;

       @Override
       public boolean equals(Object obj) {

              if(obj == this) return true;

              MyHashMap object = (MyHashMap) obj;

              if(obj == null || obj.getClass() != getClass()) return false;

              if(object.name.equals(this.name) && object.roll_no == roll_no) return true;

              return false;
       }

       @Override
       public int hashCode() {
           return Objects.hash(name,roll_no);
       }
}
