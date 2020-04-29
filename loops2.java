public class loops2 {
	public static void main(String[] args) {
		for(int teksayi=49;teksayi>=0;teksayi--) {
			System.out.println("tek "+((teksayi*2)+1));
		}
		int kalansiz;
		for(kalansiz=0;kalansiz<100;kalansiz++) {
			if((kalansiz%3)==0&&(kalansiz%7)==0)
				System.out.println(""+kalansiz);
		}
		for(int i=1;i<100;i*=2) {//arttırım kısmını iyi düşünmek lazım
			System.out.println(""+i);
		}
		//3 ün katlarını farklı bir yöntemle yapıyoruz
		int us=1;
		for(int i=0;i<4;i++) {
			us*=3;
			System.out.println(""+us);
		}
		//for döngüsünde incelenen aralık kullanılabileceği gibi step sayısı da kullanılabilir.
		//matematiksel formül ile yapımı
		for(int i=0;i<7;i++) {
			System.out.println(""+(int)Math.pow((int)2, i));
		}
	}

}
