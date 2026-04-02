import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return "Bogie{name='" + name + "', capacity=" + capacity + "}";
    }
}

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

        Set<String> trainFormationSet = new LinkedHashSet<>();
        trainFormationSet.add("Engine");
        trainFormationSet.add("Sleeper");
        trainFormationSet.add("Cargo");
        trainFormationSet.add("Guard");
        trainFormationSet.add("Sleeper"); // Duplicate

        System.out.println("Final Train Formation (Insertion Order Preserved):");
        System.out.println(trainFormationSet);
        System.out.println("\nNote:");
        System.out.println("Duplicate 'Sleeper' was ignored automatically.");
        System.out.println("\nUC5 operations completed successfully...");

        // ===== UC6 =====
        System.out.println("\n===================================");
        System.out.println("  UC6 Map Bogie to Capacity  ");
        System.out.println("===================================\n");

        Map<String, Integer> bogieCapacity = new HashMap<>();
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 64);
        bogieCapacity.put("First Class", 18);

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue() + " seats");
        }
        System.out.println("\nUC6 mapping completed successfully...");

        // ===== UC7 =====
        System.out.println("\n===================================");
        System.out.println("  UC7 Sort Bogies by Capacity  ");
        System.out.println("===================================\n");

        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 18));

        System.out.println("Before Sorting:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }
        System.out.println("\nUC7 sorting completed successfully...");

        // ===== UC8 =====
        System.out.println("\n===================================");
        System.out.println("  UC8 Filter Passenger Bogies Using Streams  ");
        System.out.println("===================================\n");

        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("Original Bogie List:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }
        System.out.println("\nUC8 stream filtering completed successfully...");

        // ===== UC9 =====
        System.out.println("\n===================================");
        System.out.println("  UC9 Group Bogies by Type  ");
        System.out.println("===================================\n");

        List<Bogie> allBogies = new ArrayList<>();
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("AC Chair", 56));
        allBogies.add(new Bogie("AC Chair", 56));
        allBogies.add(new Bogie("First Class", 18));

        Map<String, List<Bogie>> groupedBogies = allBogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("Bogies Grouped by Type:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  -> " + b);
            }
        }
        System.out.println("\nUC9 grouping completed successfully...");

        // ===== UC10 =====
        System.out.println("\n===================================");
        System.out.println("  UC10 Count Total Seats in Train  ");
        System.out.println("===================================\n");

        int totalSeats = bogieList.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Bogie List Used for Calculation:");
        for (Bogie b : bogieList) {
            System.out.println(b);
        }

        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats + " seats");
        System.out.println("\nUC10 aggregation completed successfully...");

        // ===== UC11 =====
        System.out.println("\n===================================");
        System.out.println("  UC11 Validate Train ID & Cargo Codes  ");
        System.out.println("===================================\n");

        // Define regex patterns
        Pattern trainIdPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoCodePattern = Pattern.compile("PET-[A-Z]{2}");

        // Test Train IDs
        String[] trainIds = {"TRN-1234", "TRAIN12", "TRN12A", "1234-TRN"};
        System.out.println("Train ID Validation:");
        for (String id : trainIds) {
            Matcher matcher = trainIdPattern.matcher(id);
            if (matcher.matches()) {
                System.out.println("  " + id + " -> VALID ✔");
            } else {
                System.out.println("  " + id + " -> INVALID ✘");
            }
        }

        // Test Cargo Codes
        String[] cargoCodes = {"PET-AB", "PET-ab", "PET123", "AB-PET"};
        System.out.println("\nCargo Code Validation:");
        for (String code : cargoCodes) {
            Matcher matcher = cargoCodePattern.matcher(code);
            if (matcher.matches()) {
                System.out.println("  " + code + " -> VALID ✔");
            } else {
                System.out.println("  " + code + " -> INVALID ✘");
            }
        }

        System.out.println("\nUC11 validation completed successfully...");
    }
}
