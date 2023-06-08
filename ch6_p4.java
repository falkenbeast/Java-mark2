public class ch6_p4 {
        int h ()
        {
         int a =20;
         System.out.println("this is a non static + int type return method ");
         return a;
        }
        public static void main(String[] args) 
        {       System.out.println("this is main method ");
                ch6_p4 d = new ch6_p4();
                d.h();
        }
}
