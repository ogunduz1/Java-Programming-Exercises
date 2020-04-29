public class operator {
	public static void main(String[] args) {
		int a=10, b=20, c=30;
		System.out.println("sonuc 1:"+(a+b));
		System.out.println("sonuc 2:"+a+b);//parantezsiz
		System.out.println("sonuc 3:"+a*b);
		System.out.println("sonuc 4:"+a/b);//integer olduğu için 0,5 yerine 0 getiriyor
		System.out.println("sonuc 5:"+ (float)((float)a/(float)b));//float çevirimi ile virgüllü sonuç yazılır
		System.out.println("sonuc 6:" + (a-b));
		System.out.println("sonuc 7:"+(10>>2));//1010 0101 0010
		System.out.println("sonuc 8:"+(10<<2));
		System.out.println("sonuc 9:"+(10>>>2));
		System.out.println("sonuc 10:"+(a==b));
		System.out.println("sonuc 11:"+(a!=b));
		System.out.println("sonuc 12:"+(a<b));
		System.out.println("sonuc 13:"+(a>b));
		
	}

}
