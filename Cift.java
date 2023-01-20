package patika1;

import java.util.Scanner;

public class Cift {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i ;
		int toplam=0 ;
		
		while (true) {
			
			System.out.println("Bir sayi giriniz :");
			i=scan.nextInt();
			
			if(i%2 ==1 ) {
				System.out.println("Tek bir sayi girdiniz");
				System.out.println("Girilen sayilarindan 4 un kati olanlarin toplami " + toplam);
				break;
			}
			if(i %4==0) {
				toplam=toplam+i;

	}

}
}
}