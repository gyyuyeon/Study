package study.Algorithm.basic;

import java.util.Scanner;

public class Main008 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

//		int a ,b ;		
//		a = sc.nextInt();
//		b = sc.nextInt();
//		int one,ten,hun,multi;
//		one = a*(b%10);
//		ten = a*(b%100/10);
//		hun = a*(b/100);
//		multi = hun*100 + ten*10 + one;
//		
//		
//		System.out.println(one);
//		System.out.println(ten);
//		System.out.println(hun);
//		System.out.println(multi);
		
		
		int a ,b ;		
		a = sc.nextInt();
		b = sc.nextInt();
		int result = a*b;
		for(int i =0; i<3 ; i++) {
			int temp = b%10;
			System.out.println(a*temp);
			b = b/10;
			
		}
		System.out.println(result);
		
		
		
		
	}
}
