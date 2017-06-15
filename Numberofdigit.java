import java.util.Scanner;
public class Numberofdigit {
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int num=sc.nextInt();
	sc.close();int temp=0;
	while(num!=0){
	 num=num/10;
	 temp++;
	}
System.out.println(temp+" number of digits");
}
}
