/**
 * ch8_p3
 */
class C1{                                  //public private protected default

        public int x = 5;                    //open to all
        protected int y =45;               // close to global open to all
        int z = 6;                         // close to subclass and global open to rest 
        private int a = 78;               // open to class close to all other 
        
        public void meth1(){             
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            System.out.println(a);
        }
    }
public class ch8_p3 {

        public static void main (String [] args ) {
                C1 c = new C1();
                // c.meth1();
                System.out.println(c.x);
                System.out.println(c.y);
                System.out.println(c.z);
                // System.out.println(c.a);
        }
}