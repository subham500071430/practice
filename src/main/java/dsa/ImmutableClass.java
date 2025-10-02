package dsa;

public final class ImmutableClass {

       private final StringBuilder field;

       public ImmutableClass(StringBuilder field) {
              this.field = new StringBuilder(field);
       }

      public StringBuilder getField() {
             return new StringBuilder(field);
      }
}
