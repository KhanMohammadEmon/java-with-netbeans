package JavaLecture10A;

public class julia extends Object {
    public  int x,y;

    public julia(int x , int y) {
        this.x = x;
        this.y = y;

    }
    public boolean equals(Object obj) {
    boolean return_Value = false;
    if (obj!=null && obj instanceof julia)
    if (((julia)obj).x== x &&((julia)obj).y==y)
    {
        return_Value = true;
    }
    return return_Value;
    }
}
