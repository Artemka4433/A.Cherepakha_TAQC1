import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printMainMenu();
        int status = sc.nextInt();
        Bird d = new Bird("dasd");
        Activity activity;
        Employees_Activity employees_activity;
            while (status != 0) {
                if (status == 1) {
                    System.out.println("Choose bird type by entering type");
                    printBirdTypes();
                    String bird_type = sc.next();
                    printActions();
                    System.out.println("Choose action by entering number");
                    int action_code = sc.nextInt();
                    activity = new Activity(new Bird(bird_type), action_code);
                } else if (status == 2) {
                    System.out.println("Choose employee type");
                    System.out.println("1 - contract employee");
                    System.out.println("2 - salaried employee");
                    int type_code = sc.nextInt();
                    String type_name;
                    if (type_code == 1){
                        employees_activity = new Employees_Activity("contract employee", type_code);
                    }else if(type_code == 2){
                    employees_activity = new Employees_Activity("salaried employee", type_code);
                    }
                }
                printMainMenu();
                status = sc.nextInt();
            }
        }
    static void printBirdTypes(){
        System.out.println("bat");
        System.out.println("duck");
        System.out.println("eagle");
        System.out.println("kiwi");
        System.out.println("ostrich");
        System.out.println("penguin");
        System.out.println("swallow");
    }
    static void printActions(){
        System.out.println("1 - cry");
        System.out.println("2 - eat");
        System.out.println("3 - fly");
        System.out.println("4 - run");
        System.out.println("5 - swim");
    }
    static void printMainMenu(){
        System.out.println("1 - work with birds");
        System.out.println("2 - work with employees");
        System.out.println("0 - exit");
    }
}
