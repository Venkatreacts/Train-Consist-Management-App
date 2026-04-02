import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("===================================");
        System.out.println("  Train Consist Management App   ");
        System.out.println("===================================\n");

        // Create a dynamic List to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Pre-load with 8 initial bogies
        trainConsist.add("Bogie-1");
        trainConsist.add("Bogie-2");
        trainConsist.add("Bogie-3");
        trainConsist.add("Bogie-4");
        trainConsist.add("Bogie-5");
        trainConsist.add("Bogie-6");
        trainConsist.add("Bogie-7");
        trainConsist.add("Bogie-8");

        // Display initial consist information
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count: " + trainConsist.size());
        System.out.println("Current Train Consist: " + trainConsist);
        System.out.println("\nSystem ready for operations...");
    }
}