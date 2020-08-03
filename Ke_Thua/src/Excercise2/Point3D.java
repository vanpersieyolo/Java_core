package Excercise2;

public class Point3D extends Point2D {
    float z = 0.0f;
    public Point3D(){
    }
    public Point3D(float x, float y , float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
      float[] showXYZ = {x,y,z};
      return showXYZ;
    }

    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y =y;
        this.z = z;
    }

    @Override
    public String toString() {
        return " z=" + z + super.toString();
    }
}
