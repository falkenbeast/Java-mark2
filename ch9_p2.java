public class ch9_p2     //this keyword
{
        int a ;   //instace variable 
        ch9_p2(int a)  //local variable
        {
               // a=a;     
                this.a=a;                   //refering to the instance variable
        }
        void show()
        {
                System.out.println(a);
                System.out.println(this);   //proofs that it refers to the class same as an object
        
        }
        public static void main(String[] args) {
             ch9_p2 obj = new ch9_p2(5);
             
             System.out.println(obj);   //to proof
             System.out.println("after envoking this");
             obj.show();
        }
}
