import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
	int N = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("N과 구간 a,b를 입력하세요: ");
		int N = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a > b){
			System.out.println("구간을 잘못 입력하셨습니다. (a<b)");
		}
		int x [] = new int [N];
		
		//  N개의 데이터 랜덤함수로 생성
		Random random = new Random();
		for(int i = 0; i<N; i++) {
			x[i] = random.nextInt(b)+a;
		}
		Arrays.sort(x);
		
		int max = x[N-1]; // 최댓값
		int min = x[0]; // 최솟값
		
		int hap = max+ min;
		
		System.out.println("최댓값과 최솟값의 합 =" + hap);
	}

}
