package condition;

import java.util.Scanner;

public class ForEx8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
//		for(int i=1;i<=num;i++) {			// 내방법
//			for(int j=1;j<=(5-i);j++) {
//				System.out.print((" "));
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<=5;i++) {				// 수업할때 사용한 방식
			for(int j=5;j>=1;j--) {
				System.out.print(j<=i?"*" : " ");
//				if(j<=i) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
			}
			System.out.println();
		}
	}

}
