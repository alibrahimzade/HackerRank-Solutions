import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {
            String command = sc.nextLine();

            if (command.equals("Insert")){
                String[] insertLine = sc.nextLine().split(" ");
                int index = Integer.parseInt(insertLine[0]);
                int value = Integer.parseInt(insertLine[1]);
                list.add(index,value);
            } else if (command.equals("Delete")) {
                int index = Integer.parseInt(sc.nextLine());
                list.remove(index);
            }
        }
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
