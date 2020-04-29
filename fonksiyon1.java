public class fonksiyon1 {

	/*fonksiyon bir değer geri getirmek veya parametrik olmak zorunda değil
	 * aşağıdaki ilk fonksiyon bunun örneğidir.
	 * void geri dönüş olmayacağı manasına gelir*/
	static void yaz() {
		System.out.println("Merhaba fonksiyon");
	}
	//f(x,y)=5x+10 fonksiyonun kod uygulaması
	static int f(int x) {
		return (5*x+10);
	}
	/*bir fonkisyonun içine başka fonsiyon sokulup işlem yapılabilir,
	 * matematikteki f o g(x) 
	 * aşağıdaki fonksiyon bu duruma örnektir*/ 
	static int g(int x,int y) {
		return 	f(y+2*x);
	}
	public static void main(String[] args) {
		System.out.println(g(5,3));
		yaz();
	}
}
