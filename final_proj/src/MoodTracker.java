import java.util.Scanner;
import java.util.ArrayList;

public class MoodTracker{

    public static boolean isMoodValid(Mood mood, ArrayList<Mood> moods) throws InvalidMoodException {
        for(Mood tempMood: moods) {
            if (tempMood.equals(mood)) {
                throw new InvalidMoodException(); 
            }
        }
        return true;
    }


    public static void main(String s[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mood> moods = new ArrayList<>();

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
                    System.out.println("Enter mood's name:");
                    String moodName = scanner.nextLine();
                    System.out.println("Are you tracking the mood for a current day? y/n");
                    String isForCurrentDate = scanner.nextLine();
                    Mood moodToAdd = null;
                    if(isForCurrentDate.equalsIgnoreCase("n")) {
                        try {
                            System.out.println("Input the date in MM/dd/yyyy format:");
                            String moodDateStr = scanner.nextLine();
                            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                            LocalDate moodDate = LocalDate.parse(moodDateStr, dateFormatter);
                            System.out.println("Input the time in HH:mm:ss format:");
                            String moodTimeStr = scanner.nextLine();
                            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                            LocalTime moodTime = LocalTime.parse(moodTimeStr, timeFormatter);
                            System.out.println("Add notes about this mood");
                            String moodNotes = scanner.nextLine();
                            if(moodNotes.strip().equalsIgnoreCase("")) {
                                moodToAdd = new Mood(moodName, moodDate, moodTime);
                            } else {
                                moodToAdd = new Mood(moodName, moodDate, moodTime, moodNotes);
                            }
                        } catch (DateTimeParseException dfe) {
                            System.out.println("Incorrect format of date or time. Cannot create mood.\n"+dfe);
                            continue;
                        }
                    } else {
                        System.out.println("Add notes about this mood");
                        String moodNotes = scanner.nextLine();
                        if(moodNotes.strip().equalsIgnoreCase("")) {
                            moodToAdd = new Mood(moodName);
                        } else {
                            moodToAdd = new Mood(moodName, moodNotes);
                        }
                    }
                    try {
                        boolean isValid = isMoodValid(moodToAdd, moods);
                        if(isValid) {
                            moods.add(moodToAdd);
                            System.out.println("The mood has been added to the tracker");
                            continue;
                        }
                    } catch(InvalidMoodException ime) {
                        System.out.println("The mood is not valid");
                    }
                    continue;
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
