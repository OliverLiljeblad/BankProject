import java.util.Scanner;
public class Run extends Account{
    public void Program(){
        Scanner scanner = new Scanner(System.in);

        String name = getName();
        System.out.println(name);

        String number = scanner.next();
        switch (number){
            case "1":
                System.out.println("");
                break;
            case "2":
                System.out.println("");
                break;
        }
    }
}
