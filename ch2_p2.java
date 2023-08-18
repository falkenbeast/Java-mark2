public class ch2_p2 {                             //operator precedence 
    public static void main(String[] args) {
        //  Precedence & Associativity

        // int a = 65-342;
        
        // Highest precedence goes to  and . They are then evaluated on the basis
        // of left to right associativity
        //     =30-342
        //     =30-17
        //     =13
         
        // int b = 605-342;
        
        //     = 12-342
        //     =12-68
        //     =-56
         

        // System.out.println(a);
        // System.out.println(b);

        //  Quick Quiz
        //int x =6;
        //int y = 1;
         // int k = x * y/2;

        int b = 0;
        int c = 0;
        int a = 10;
        int k = b*b - (4*a*c)/(2*a);       // order is 1st it is (*,/,%)  then 2nd is (+,-) and at last (=)
        System.out.println(k);               //in the case of a tie we move left to right

    }
}
