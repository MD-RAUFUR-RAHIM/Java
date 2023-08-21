package maruf.assignment.mid;

public class SchoolManagement {

    static double totalIncome=0;
    static double totalExpense=0;
    static double profit=0;

    public static void addIncome(double tk){
        totalIncome+=tk;
        profit+=tk;
    }

    public static void looseIncome(double tk){
        totalExpense+=tk;
        profit-=tk;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public double getTotalExpense() {
        return totalExpense;
    }

    public static double getProfit() {
        return profit;
    }

    @Override
    public String toString() {
        return "SchoolManagement{" +
                "totalIncome=" + totalIncome +
                ", totalExpense=" + totalExpense +
                ", profit=" + profit +
                '}';
    }
}

