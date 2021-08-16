package AssignmentKibria;

public class Box {
    public float length;
    public float width;
    public float heigth;

    public Box(float length, float width, float heigth) {
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }

    float getVolume()
{
    float volume = length*width*heigth;
   return volume;
}

    public static void main(String[] args) {
        Box box1 = new Box(10,20,2);
        Box box2 = new Box(10.2f,3,6.7f);
    float box1volume = box1.getVolume();
    float box2volume = box2.getVolume();
        System.out.println("Box1 : "+box1volume);
        System.out.printf("Box2 : %.2f \n",box2volume);
    }
}
