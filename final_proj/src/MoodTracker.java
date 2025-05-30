import java.util.Scanner

public class MoodTracker{
    public static void main(String s[]){
        Scanner scanner = new Scanner(System.in);
        Mood[] moods = new Mood[10];

        while(true){
            System.out.println("Press 'a' to add mood\n" +
                                "'d' to delete mood(s)\n" +
                                "'e' to edit mood\n" +
                                "'s' to search for moods\n" +
                                "'M' to get all moods\n" +
                                "'w' to write the moods to a file\n" +
                                "Type 'Exit' to exit");
            String menuOption = scanner.nextLine();

            switch(menuOption){
                case "a":
                case "d":
                case "e":
                case "s":
                case "w":
                case "Exit": 	System.out.println("Thank you for using the MoodTracker. Goodbye!");
                                break;
                default: 	System.out.println("Not a valid input!");
                            continue;

            }
        }
        }



    }
}