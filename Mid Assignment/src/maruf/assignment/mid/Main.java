package maruf.assignment.mid;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Md. Maruf ","S0001");
        Student s2 = new Student("Shaykat Khan","S0002");
        Student s3 = new Student("Shafinur Rahman","S0003");

        Teacher t1 = new Teacher("Md. Ismail Hossen","T0001",150000);
        Teacher t2 = new Teacher("Monirul Hasan","T0002",55000);

        SchoolManagement sm = new SchoolManagement();

        s1.payFees(20000);
        s2.payFees(30000);
        s3.payFees(25000);

        t1.receiveSalary(30000);
        t2.receiveSalary(20000);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(t1);
        System.out.println(t2);

        //System.out.println(SchoolManagement.totalIncome);
        //System.out.println(SchoolManagement.totalExpense);
        //System.out.println(SchoolManagement.profit);

        System.out.println(sm);
    }
}
