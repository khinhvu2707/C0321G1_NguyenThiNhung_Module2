package _06_ke_thua.bai_tap;

public class MoveablePoint extends Point2D {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MoveablePoint Move() {
        super.setXY(super.getX()+xSpeed, super.getY()+ ySpeed);
        return this;
    }


    @Override
    public String toString() {
        return " \n MoveablePoint { " +
                " xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                " } ";
    }
}
