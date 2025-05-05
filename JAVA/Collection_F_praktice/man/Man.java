package Collection_F_praktice.man;

public class Man {
    private String name;
    private int id;
    private int age;


    public Man(String cname, int cid, int cage){
        this.name=cname;
        this.id=cid;
        this.age=cage;
    }

    
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Man [name=" + name + ", id=" + id + ", age=" + age + "]";
    }

    
    

    
}
