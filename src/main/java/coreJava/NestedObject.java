package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class NestedObject {

    public static void main(String[] args) {

        List<Object> list = Arrays.asList(1, 2, new Object[]{3, 4, 5, new Object[]{10, 12}}, 6, 9);
        List<Object> res = new ArrayList<>();

        NestedObject object = new NestedObject();

        object.flatten(list , res);
        res.stream().forEach(System.out::println);
    }

    public List<Object> flatten(Object element, List<Object> res) {

        if (element instanceof Object[]) {
            for (Object o : (Object[]) element) {
                flatten(o, res);
            }
        } else if (element instanceof Integer) {
            res.add(element);
        } else {
            for (Object o : (Collection) element){
                flatten(o , res);
            }
        }

        return res;

    }
}
