import java.util.*;
public class ch15_p1    //old date class of util 
{
        public static void main(String[] args) {
                System.out.println(System.currentTimeMillis()/1000/3600/24/365);
                //        System.out.println(Long.MAX_VALUE);
                //        System.out.println(System.currentTimeMillis());
                Date d = new Date();
                System.out.println(d);
                System.out.println(d.getTime());
                System.out.println(d.getDate());
                System.out.println(d.getSeconds());
                System.out.println(d.getYear()); 
                System.out.println();
            }
        }

