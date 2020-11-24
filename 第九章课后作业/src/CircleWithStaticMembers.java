/**
 * @author chen
 */
public class CircleWithStaticMembers{
    double radius;
    static int numberOfobjects=0;
    CircleWithStaticMembers(){
        radius=1;
        numberOfobjects++;
    }
    CircleWithStaticMembers(double newRadius){
        radius=newRadius;
        numberOfobjects++;
    }
    static int getNumberOfobjects(){
        return numberOfobjects;
    }
    double getArea(){
        return radius*radius*Math.PI;
    }
}
