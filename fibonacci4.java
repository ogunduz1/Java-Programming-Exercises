/*Her döngü bir recursive fonksiyon,
 * her recursive fonksiyon bir döngü 
 * olarak yazılabilir.
 */
import java.util.Scanner;

public class fibonacci4 {
	
	public static int fib(int n) {
		if(n==0) return 1;
		if(n==1) return 1;
		return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		System.out.println("Lütfen bir sayı giriniz : ");
		Scanner tara=new Scanner(System.in);//C de Scanf
		int n=tara.nextInt();//Resource leak hatası veriyor
		tara.close();//Resource leak olmaması için değişken kapatma
		for(int i=0;i<n;i++) {
			System.out.println("dizinin "+(i+1)+". terimi "+ fib(i));
		}
	}
}
