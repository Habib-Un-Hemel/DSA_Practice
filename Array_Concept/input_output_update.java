import java.util.*;

public class input_output_update {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int phy;
        // phy = sc.nextInt();

        int marks[] = new int[100];
        marks[0] = sc.nextInt(); 
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics:"+ marks[0]);
        System.out.println("Physics:"+ marks[1]);
        System.out.println("Physics:"+ marks[2]);

        marks[2] = 100;
        System.out.println("New Physics:"+ marks[2]);



    }
}

