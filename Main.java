import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
	int N = 0;
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("N�� ���� a,b�� �Է��ϼ���: ");
		int N = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a > b){
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�. (a<b)");
		}
		int x [] = new int [N];
		
		//  N���� ������ �����Լ��� ����
		Random random = new Random();
		for(int i = 0; i<N; i++) {
			x[i] = random.nextInt(b)+a;
		}
		Arrays.sort(x);
		
		int max = x[N-1]; // �ִ�
		int min = x[0]; // �ּڰ�
		
		int hap = max+ min;
		
		System.out.println("�ִ񰪰� �ּڰ��� �� =" + hap);
	}

}
