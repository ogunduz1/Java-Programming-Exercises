import java.util.Scanner;

public class kosul2 {
	public static void main(String[] args) {
		System.out.println("Lütfen not giriniz :");
		Scanner s=new Scanner(System.in);//giriş yapmak için kullanılır. C deki Scanf
		int not=s.nextInt();
		char puan;
		/* 100-91 arası A
		 * 90-81 arası B
		 * 80-71 arası C
		 * 70-60 arası D
		 * 60 altı F
		 */
		if(not<=100 && not>90)
			puan ='A';
		else if(not<=90&&not>80)
			puan='B';
		else if(not<=80&&not>70)
			puan='C';
		else if(not<=70&&not>=60)
			puan='D';
		else if(not<60)
			puan='F';
		else {
			puan=' ';
			System.out.println("Geçersiz giriş yaptınız");}
		System.out.println("Puanınız : "+puan);
		System.out.println("");
		switch(puan) {
		case 'A':
			System.out.println("Tebrikler Mükemmel başarı");
			break;
		case 'B':
			System.out.println("Tebrikler Çok iyi Başarı");
			break;
		case 'C':
			System.out.println("Tebrikler iyi başarı");
		case 'D':
			System.out.println("Geçtiniz");
			break;
		case 'F':
			System.out.println("Başarılı olamadınız!");
			break;
			default:
				System.out.println("Hatalı giriş yaptınız!");
		}
		
		
	
	}

}
