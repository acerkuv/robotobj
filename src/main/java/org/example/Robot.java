package org.example;

public class Robot implements Move{
    private int x;
    private int y;
    private int[] c;
    Robot(int x, int y){
        this.x = x;
        this.y = y;
        setC();
    }
    @Override
    public int[] step(Direct d) {
            switch (d){
                case UP -> y++;
                case DOWN -> y--;
                case RIGHT -> x++;
                case LEFT -> x--;
            }
            setC();
            return getC();
    }
    public int[] getC() {
        return c;
    }
    private void setC() {
        this.c = new int[] {x, y};
    }

}
