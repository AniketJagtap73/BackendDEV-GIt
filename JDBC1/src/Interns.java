public class Interns {

    private int id;
    private String name;
    private String eMail;
    private int salary;

    public Interns(int id,String name,String eMail,int salary){
        this.id = id;
        this.name = name;
        this.eMail = eMail;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Interns [id=" + id + ", name=" + name + ", eMail=" + eMail + ", salary=" + salary + "]";
    }
    
}
