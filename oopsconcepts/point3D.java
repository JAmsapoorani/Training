package oopsconcepts;

public class point3D extends point2D {
    private int z;

    public point3D(int x,int y,int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {

        return super.toString()+
                ",z=" + z ;
    }
}
