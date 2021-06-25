import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int n, total=0;
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.println("Sayýyý giriniz: ");
			n= input.nextInt();
			
			if (n%4==0) {
				total +=n;
			}
			}while(n%2==0);
			System.out.println("Toplam= "+ total);
	}

}
