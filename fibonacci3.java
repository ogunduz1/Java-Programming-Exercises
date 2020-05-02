import java.util.Scanner;

public class fibonacci3 {
	public static void main(String[] args) {
		int a=1;
		int b=1;
		int c, n;
		System.out.println("Lütfen Bir sayı giriniz :");
		Scanner tara=new Scanner(System.in);
		n=tara.nextInt();
		tara.close();
		System.out.println(""+a);
		System.out.println(""+b);
		int i=2;
		while(i<n) {
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
			i++;
		}
	
	}
}
