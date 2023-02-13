import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        int id=input.nextInt();
        String title=input2.nextLine();
        int price=input.nextInt();
        String description=input2.nextLine();
        String category =input2.nextLine();
        System.out.println("Id: "+id);
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("Description: "+description);
        System.out.println("Category: "+category);
    }
}