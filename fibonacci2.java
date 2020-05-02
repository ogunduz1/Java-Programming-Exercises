import java.util.Scanner; 

public class fibonacci2 {
	public static void main(String[] args) {
		System.out.println("Lütfen bir sayı giriniz : ");
		Scanner tara=new Scanner(System.in);//C de Scanf
		int n=tara.nextInt();//Resource leak hatası veriyor
		tara.close();//Resource leak olmaması için değişken kapatma
		int fib[] = new int[n];
		fib[0]=1;
		fib[1]=1;
		for(int i=2;i<n;i++) {
			fib[i]=fib[i-1]+fib[i-2];
		}
		for(int i=0;i<n;i++) {
			System.out.println("Fibonacci serisinin "+(i+1)+".nci elemanı "+fib[i]+" dır.");
		}
	}

}
