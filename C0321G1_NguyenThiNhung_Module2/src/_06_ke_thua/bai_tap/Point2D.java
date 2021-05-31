package _06_ke_thua.bai_tap;

import java.sql.Array;
import java.util.Arrays;

public class Point2D {
private float x=0.0f;
private float y=0.0f;
public Point2D(){
}
public Point2D(float x,float y){
    this.x = x;
    this.y = y;
}

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] result = new float[]{x,y};
        return result;
    }
    public void setXY(float x,float y){
    this.x=x;
    this.y=y;
    }
    public String toString(){
    return " Point2D : x= "
            + getX()
            +" y= "
            + getY();
    }
}
