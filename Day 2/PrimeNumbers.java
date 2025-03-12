import java.util.*;
public class PrimeNumbers{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("enter an interger:");
int n= scanner.nextInt();
System.out.println("prime numbers up to"+n+"are:");
for(int i =2;i<=n;i++)
{
boolean isPrime=true;
for(int j=2;j*j<=i;j++){
if(i%j==0){
isPrime=false;
break;
}
}
if(isPrime){
System.out.print(i+" ");
}}
scanner.close();
}
}
