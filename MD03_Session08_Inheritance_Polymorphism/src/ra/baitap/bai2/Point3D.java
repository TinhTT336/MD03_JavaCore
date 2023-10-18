package ra.baitap.bai2;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), this.z};
    }

    public void setXYZ( float z) {
        super.setXY(getX(),getY());
        this.z=z;
    }

    @Override
    public String toString() {
        return (super.toString()+" z = "+z);
    }
}
