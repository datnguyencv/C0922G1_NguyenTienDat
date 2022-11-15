package ss6_inheritance.poin2dpoint3d.model;

import java.util.Arrays;
public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D(){

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    public void setXY(float x, float y) {
        this.y = y;
        this.x = x;
    }
    @Override
    public String toString() {
        return "Point2D{" +
                "X= " + x +
                "  Y= " + y +
                "  Array = " + Arrays.toString(getXY()) +
                '}';
    }
}
