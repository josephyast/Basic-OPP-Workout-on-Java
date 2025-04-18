import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Workout Programm");

        String Workouts = "Workout Types\n"+
                "Burpee\n"+
                "Pushup\n"+
                "Situp\n"+
                "Squat";
        System.out.println(Workouts);

        System.out.println("Create a Workout");
        System.out.print("Burpee Amount : ");
        int burpee = scanner.nextInt();
        System.out.print("Pushup Amount : ");
        int pushup = scanner.nextInt();
        System.out.print("Situp Amount : ");
        int situp = scanner.nextInt();
        System.out.print("Squad Amount : ");
        int squad = scanner.nextInt();
        scanner.nextLine();

        Workout workout = new Workout(burpee,pushup,situp,squad);
        System.out.println("Workout beginning!");

        while(workout.workOut_Done() == false){
            System.out.print("Workout Type : (Burpee,Pushup,Situp,Squad) ");
            String type = scanner.nextLine();
            System.out.print("How many reps would you do ? ");
            int amount = scanner.nextInt();
            scanner.nextLine();
            workout.workOut(type,amount);
        }
        System.out.println("You finished your Workout. Congratulations!");
    }
}
