public class ch5_p1 //array 
{
        public static void main(String[] args) {
                //creating array objects
                String[] cities = {"Delhi", "Mumbai", "Lucknow", "Pune", "Chennai"};
                int[] numbers = {25,93,48,95,74,63,87,11,36};
        
                //accessing array elements using indexing
                System.out.println(cities[3]);
                System.out.println(numbers[2]);
                cities[2] = "Bangalore";
                 System.out.println(cities[2]);
                 System.out.println(numbers[2]);
            }
}
