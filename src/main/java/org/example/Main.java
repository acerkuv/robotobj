package org.example;

import java.util.*;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Set<int[]> trek = new HashSet<>(){};
        Robot rb = new Robot(1, 1);

        List<Direct> directs = new ArrayList<>(Arrays.asList(Direct.UP,
                Direct.RIGHT,Direct.LEFT, Direct.DOWN));

        for(Direct d:directs){
            out.println(Arrays.toString(rb.getC()));
            if(!trek.add(rb.step(d))) {
                out.println("I was here earlier! " + Arrays.toString(rb.getC()));
                break;
            }
        }
    }

}
