package maruf.assignment.mid;

public class Teacher extends Person{
    private double salary;
    private double received_salary;
    private double salaryYetToReceive;

    public Teacher(String name, String id, double salary) {
        super(name,id);
        this.salary = salary;
        this.received_salary = 0;
        this.salaryYetToReceive = salary;
    }

    public void receiveSalary(double tk){
        if(salaryYetToReceive >= tk && SchoolManagement.totalIncome >= tk ) {
            received_salary += tk;
            salaryYetToReceive -= tk;
            SchoolManagement.looseIncome(tk);
        }
    }

    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        super.name = name;
    }

    public String getId() {
        return super.id;
    }

    public void setId(String id) {
        super.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getReceived_salary() {
        return received_salary;
    }

    public void setReceived_salary(double received_salary) {
        this.received_salary = received_salary;
    }

    public double getSalaryYetToReceive() {
        return salaryYetToReceive;
    }

    public void setSalaryYetToReceive(double salaryYetToReceive) {
        this.salaryYetToReceive = salaryYetToReceive;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", received_salary=" + received_salary +
                ", salaryYetToReceive=" + salaryYetToReceive +
                '}';
    }
}
