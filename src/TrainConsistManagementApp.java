import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // ===== UC1 =====
        System.out.println("===================================");
        System.out.println("  Train Consist Management App   ");
        System.out.println("===================================\n");

        List<String> trainConsist = new ArrayList<>();
        trainConsist.add("Bogie-1");
        trainConsist.add("Bogie-2");
        trainConsist.add("Bogie-3");
        trainConsist.add("Bogie-4");
        trainConsist.add("Bogie-5");
        trainConsist.add("Bogie-6");
        trainConsist.add("Bogie-7");
        trainConsist.add("Bogie-8");

        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count: " + trainConsist.size());
        System.out.println("Current Train Consist: " + trainConsist);
        System.out.println("\nSystem ready for operations...");

        // ===== UC2 =====
        System.out.println("\n===================================");
        System.out.println("  UC2 Add Passenger Bogies to Train  ");
        System.out.println("===================================\n");

        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");
        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + passengerBogies);

        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper?: " + passengerBogies.contains("Sleeper"));

        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);
        System.out.println("\nUC2 operations completed successfully...");

        // ===== UC3 =====
        System.out.println("\n===================================");
        System.out.println("  UC3 Track Unique Bogie IDs  ");
        System.out.println("===================================\n");

        Set<String> bogieIds = new HashSet<>();
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG104");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIds);
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        System.out.println("\nUC3 uniqueness validation completed...");

        // ===== UC4 =====
        System.out.println("\n===================================");
        System.out.println("  UC4 Maintain Ordered Bogie IDs  ");
        System.out.println("===================================\n");

        LinkedList<String> trainFormation = new LinkedList<>();
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("AC");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Initial Train Formation:");
        System.out.println(trainFormation);

        trainFormation.add(2, "Pantry Car");
        System.out.println("\nAfter Inserting Pantry Car at Position 2:");
        System.out.println(trainFormation);

        trainFormation.removeFirst();
        trainFormation.removeLast();
        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainFormation);
        System.out.println("\nUC4 operations completed successfully...");

        // ===== UC5 =====
        System.out.println("\n===================================");
        System.out.println("  UC5 Preserve Insertion Order of Bogies  ");
        System.out.println("===================================\n");

        // LinkedHashSet maintains insertion order + uniqueness
        Set<String> trainFormationSet = new LinkedHashSet<>();

        // Attach bogies
        trainFormationSet.add("Engine");
        trainFormationSet.add("Sleeper");
        trainFormationSet.add("Cargo");
        trainFormationSet.add("Guard");

        // Attempt duplicate attachment
        trainFormationSet.add("Sleeper"); // Duplicate - will be ignored

        // Display final formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormationSet);
        System.out.println("\nNote:");
        System.out.println("Duplicate 'Sleeper' was ignored automatically.");
        System.out.println("\nUC5 operations completed successfully...");
    }
}

