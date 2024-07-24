import java.util.Scanner;
public class loop{

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		int c = 0 ;
		for(int i=0; i <= num; i++) {

			for(int j = 0 ; j < i ; j++) {
				c = j;
				System.out.print(" ");
				System.out.print(c);
				System.out.print(" ");
			} ;
			System.out.println();

		}
		sc.close();
	}
}
