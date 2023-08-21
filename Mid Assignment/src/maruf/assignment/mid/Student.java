package maruf.assignment.mid;

public class Student extends Person{
    private double totalFees;
    private double paid_fees;
    private double remainingFees;

    public Student(String name, String id) {
        super(name,id);
        this.totalFees = 30000;
        this.paid_fees = 0 ;
        this.remainingFees = 30000;
    }

    public void payFees(double tk){
        remainingFees -= tk;
        paid_fees += tk;
        SchoolManagement.addIncome(tk);
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

    public double getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(double totalFees) {
        this.totalFees = totalFees;
    }

    public double getPaid_fees() {
        return paid_fees;
    }

    public void setPaid_fees(double paid_fees) {
        this.paid_fees = paid_fees;
    }

    public double getRemainingFees() {
        return remainingFees;
    }

    public void setRemainingFees(double remainingFees) {
        this.remainingFees = remainingFees;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", totalFees=" + totalFees +
                ", paid_fees=" + paid_fees +
                ", remainingFees=" + remainingFees +
                '}';
    }
}
