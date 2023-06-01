public class ch3_p1    //if-else function
 {
    public static void main(String[] args) {
        String name[] = {"Mohan", "Rohan", "Soham"};
        int Roll[] = {25, 36, 71};
        if (name[0] == "Mohan" && Roll[1] == 25) {
            System.out.println("Details of Mohan.");
        } else if (name[2] == "Rohan" && Roll[1] == 36) {
            System.out.println("Details of Rohan.");
        } else if (name[2] == "Soham" && Roll[2] == 71) {
            System.out.println("Details of Soham.");
        } else {
            System.out.println("Invalid details.");
        }
    }
        
}
