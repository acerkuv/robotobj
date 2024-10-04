package org.example;

public interface Move {
    Object step(Direct d);

    boolean equals(Object o);
}

