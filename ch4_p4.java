public class ch4_p4     //break statement 
{
        public static void main(String[] args) {
                for(int n=1; n<=20; n++) {
                    if(n%2 == 0) {
                        System.out.println(n);
                        if (n == 12) {
                            break;
                        }
                    }
                }
            }
}
