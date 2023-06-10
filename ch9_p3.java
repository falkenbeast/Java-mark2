
class base     //super keyword
{
        int a =10;
        int b = 100;
        void show()
        {
                System.out.println("this is a base class");
                System.out.println(a);
        }
}
class derived extends base
{
        int a = 50;
        int b = 500;
        void show()
        {
                System.out.println("this is a derived class");
                System.out.println(a);
                System.out.println(b);
                super.show();
                System.out.println(super.b);
        }
}
public class ch9_p3 {
        public static void main(String[] args) {
              derived obj = new derived();
              obj.show();
        }
}
