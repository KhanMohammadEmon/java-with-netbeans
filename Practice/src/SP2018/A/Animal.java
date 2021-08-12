package SP2018.A;

public class Animal {
    private String name;
    private String id;
    private int cp;

    public Animal(String name, String id, int cp) {
        this.name = name;
        this.id = id;
        this.cp = cp;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getCp() {
        return cp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

   /* @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", cp=" + cp +
                '}';
    }*/
}
