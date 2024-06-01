package study.Algorithm.basic;

import java.util.Scanner;

// float와 double 차이
// 상대오차 10^-9 ??
// float는 소숫점 7자리 까지 32비트
// double은 소숫점 15자리까지 64비트
public class Main003 {

	public static void main(String[] args) {
		double A=0, B=0;
		
		Scanner scanner = new Scanner(System.in);
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		System.out.println(A/B);
		}

}
