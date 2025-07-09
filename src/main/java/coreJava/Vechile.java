package coreJava;

public class Vechile implements Cloneable {

      String vechileNo;
      String vechileType;

      Vechile(String vechileNo, String vechileType){
          this.vechileNo = vechileNo;
          this.vechileType = vechileType;
      }

      @Override
      protected Object clone() throws CloneNotSupportedException {
             return super.clone();
      }
}
