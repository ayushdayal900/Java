package clg.FDS_ASSIGN;

public class Assignment_03 {
    public static void main(String[] args) {
        // Create an array to hold pointers to strings
        String[] vegetables = new String[5];

        // Assign vegetable names to array elements
        vegetables[0] = "Carrot";
        vegetables[1] = "Tomato";
        vegetables[2] = "Broccoli";
        vegetables[3] = "Lettuce";
        vegetables[4] = "Cucumber";

        // Display the list of vegetables
        System.out.println("List of vegetables:");
        for (int i = 0; i < vegetables.length; i++) {
            System.out.println(vegetables[i]);
        }
    }
}
