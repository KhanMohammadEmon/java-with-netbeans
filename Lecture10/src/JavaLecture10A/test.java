package JavaLecture10A;

public class test {
    public static void main(String[] args) {
        julia a =new julia(10 ,20);
        julia b =new julia(10 ,20);
       // if(a.equals(b))
        if(a==b)
        {
            System.out.println("Values are Same!");
        }
        else
            System.out.println("Values are not same!");
    }
}
