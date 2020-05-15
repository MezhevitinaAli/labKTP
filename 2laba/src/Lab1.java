import com.vogella.build.maven.java.Point3d;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point3d[] Points = new Point3d[3];
        for (int i=0;i<3;i++){
            System.out.println("Введите координату точки:");
            while (true) {
                int k=0;
                Points[i] = new Point3d(sc.nextInt(),sc.nextInt(),sc.nextInt());
                for (int n=0;n<i;n++){
                    if (Point3d.eq(Points[i],Points[n])){
                        k=1;
                    }
                }
                if (k==1){
                    System.out.println("Данная точка уже существует.");
                    System.out.println("Введите координату точки:");
                } else {
                    break;
                }
            }
            System.out.println("Координата точки по " +"х: " + Points[i].getX() + " у: "+ Points[i].getY() + " z: " + Points[i].getZ());
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        for (int i=0;i<=2;i++) {
            System.out.println("Координата точки "+ i + " х: " + Points[i].getX() + " у: " + Points[i].getY() + " z: " + Points[i].getZ());
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        if (computeArea(Points[0],Points[1],Points[2])>0){
            System.out.format("Площадь данного треугольнка = %.2f",computeArea(Points[0],Points[1],Points[2]));
        } else {
            System.out.println("Данного треугольника не существует");
        }
    }
    public static double computeArea(Point3d a,Point3d b, Point3d c){
        double AB=Point3d.distanceTo(a,b);
        double BC=Point3d.distanceTo(b,c);
        double CA= Point3d.distanceTo(a,c);
        double Pp=(AB+BC+CA)/2;
        return Math.sqrt(Pp*(Pp-AB)*(Pp-BC)*(Pp-CA));
    }
}