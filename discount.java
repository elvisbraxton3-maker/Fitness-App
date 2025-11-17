//program to compute discount
import java.util.scanner;
public class Discount{
public static void main(String[] args){
Scanner scanner=new scanner(System.in);
double discount;
//prompt user to enter the amount
System.out.println("Enter your name:");
String name =Scanner.nextline();


System.out.println("Enter the amount purchased:");
double amount=scanner.nextDouble();//nextint,nextline,nextfloat
if(amount>5000){
 discount=amount*0.1;
}
else if(amount>=1000 && amount<=5000){
   discount=0.05*amount;
}
else{
discount=0;
}

double amountTopay=amount-discount;
system.out.println("initial amount"+amount);
system.out.println("Discount"+discount);
system.out.println("Amount to pay"+amountTopay);
scanner.close();
}
} 