public class ch4_p5    //continue statement
{
        public static void main(String[] args) {
                for(int n=1; n<=20; n++) {
                    if(n%2 == 0) {
                        if (n == 12) {
                            continue;
                        }
                        System.out.println(n);
                    }
                }
            }
}
