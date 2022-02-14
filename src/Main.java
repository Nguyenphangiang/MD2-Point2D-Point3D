public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1.2f,3.4f);
        point2D.setX(2.1f);
        System.out.println(point2D.getX());
        point2D.setY(4.3f);
        System.out.println(point2D.getY());
        point2D.setXY(5.6f,7.8f);
        float[] arr = point2D.getXY();
        for (float a: arr
             ) {
            System.out.println(a + "\t");
        }
        //test point3d
        Point3D point3D = new Point3D(1.1f,1.2f,1.3f);
        point3D.setX(1.2f);
        point3D.setY(2.3f);
        point3D.setZ(3.4f);
        float[] arr1 = point3D.getXYZ();
        for (float b : arr1
             ) {
            System.out.println(b + "\t");
        }
        System.out.println(point2D);
        System.out.println(point3D);
    }
}
