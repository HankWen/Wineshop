package tree;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void test1() {

        HashMap ss = new HashMap(2);
        ss.put("22","22");

        int cap =13;

        cap |= cap>>>1;
        cap |= cap>>>4;
        cap |= cap>>>8;
        cap |= cap>>>16;

        System.out.println("cap"+cap);

    }
}