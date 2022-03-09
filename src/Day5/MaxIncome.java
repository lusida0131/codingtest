package Day5;

import java.util.Scanner;

public class MaxIncome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] arr = new int [n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0, answer = 0;
		for(int i = 0; i < m; i++) {
			sum += arr[i];
			answer = sum;
		}
		for(int i = m; i < n; i++) {
			sum += arr[i] - arr[i-m];
			answer = Math.max(answer, sum);
		}
		System.out.println(answer);
	}
}
