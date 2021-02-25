package com.hank.jvm;

import java.util.ArrayList;
import java.util.List;

public class OomTest {
    static class OomObject{

    }

    public static void main(String[] args) {
        //*VM Args:-Xms20m-Xmx20m-XX:+HeapDumpOnOutOfMemoryError

        List<OomObject> list = new ArrayList<OomObject>();
        while (true){
            list.add(new OomObject());
        }

    }
}
