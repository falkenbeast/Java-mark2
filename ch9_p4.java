class EkClass    //super and this keyword
 { 
int a; 
public int getA() { 
return a; 
} 
EkClass(int a){ 
this.a = a;
 } 
public int returnone(){
 return 1; 
} 
} 
class DoClass extends EkClass{ DoClass(int c){ super(c); 
System.out.println("I am a constructor"); } 
} 
public class ch9_p4{ 
public static void main(String[] args) {
 EkClass e = new EkClass(65); 
DoClass d = new DoClass(5); 
System.out.println(e.getA()); 
   System.out.println(d.getA());       //for the fix of yellow 
}
 }