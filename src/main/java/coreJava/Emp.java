package coreJava;

import java.io.Serializable;

public class Emp implements Serializable {

    String name;
    int id;

    Emp(String name,int id){
        this.name = name;
        this.id = id;
    }
}
