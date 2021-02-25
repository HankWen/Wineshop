package com.hank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //BinaryTree.test();
        //CountDownLatchTest.test();

        List<String> names = new ArrayList<>(8);
        names.add("Hank");
        names.add("Joy");
        List<String> replica = names;
        names.add("Jim");

        System.out.println("name:" + names + ", replica:" + replica);
        List<String> tempNames = new ArrayList<String>(){{add("Zues");}};
        names = tempNames;
        System.out.println("name:" + names + ", replica:" + replica);


    }


}

