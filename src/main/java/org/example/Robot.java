package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Robot implements Move{
    private int x;
    private int y;

    public Robot(int x, int y){
        this.x = x;
        this.y = y;

    }

    public String getCord(){
        return Arrays.toString(new int[] {x, y});
    }

    public Object step(Direct d) {
            switch (d){
                case UP -> y++;
                case DOWN -> y--;
                case RIGHT -> x++;
                case LEFT -> x--;
            }
            return new Robot(x, y);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Robot robot= (Robot) obj;
        return x == robot.x && y == robot.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
