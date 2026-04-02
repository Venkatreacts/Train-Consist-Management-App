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
```

        ---

        ## 🔵 STEP 7 — Run the Program

Click the **green ▶️ button** at top right!

        ### ✅ Expected Output:
        ```
        ===================================
Train Consist Management App
===================================

Train initialized successfully...
Initial Bogie Count: 8
Current Train Consist: [Bogie-1, Bogie-2, Bogie-3,
Bogie-4, Bogie-5, Bogie-6, Bogie-7, Bogie-8]

System ready for operations...