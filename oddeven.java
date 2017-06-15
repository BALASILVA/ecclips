import java.util.Scanner;
public class oddeven {
public static void main(String[]args){
	System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
sc.close();
int temp;
temp=num%2;
if(temp==0){
	System.out.println("even number");//zero is even number
}
else{
	System.out.println("odd number");
}
}
}
