package org.example;

import java.util.*;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Set<Object> trek = new HashSet<>(){};
        Robot rb = new Robot(1, 1);

        out.println(trek.add(rb));
        out.println(trek.add(new Robot(1, 1)));

        out.println( "Check equals() "  + rb.equals(new Robot(1, 2)));

        List<Direct> directs = new ArrayList<>(Arrays.asList(Direct.UP,  Direct.RIGHT,Direct.LEFT,
                Direct.DOWN, Direct.RIGHT, Direct.RIGHT, Direct.UP, Direct.DOWN));


        for(Direct d:directs){
            out.println("Coordinates of the unique steps "  + trek.add(rb.step(d)) + " " + rb.getCord() );
            }
        }
    }


