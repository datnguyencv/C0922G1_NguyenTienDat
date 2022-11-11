package ss6_inheritance.poin2dpoint3d.model;

public class Point2D {
    private float x;
    private float y;

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

    public void setXY(float x, float y) {
        this.y = y;
        this.x = x;
    }

    public float getXY() {
        float[] arr = new float[]{x, y};
        return arr[2];
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "X= " + x +
                "  Y= " + y +
                '}';
    }
}
