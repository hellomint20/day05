package while_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, tmp;
		System.out.print("수 입력: ");
		i = sc.nextInt();
		
		boolean bool = true;
		while(bool) {
			tmp = i%10;
			i = i/10;
			System.out.println(tmp);
			if(i == 0) {
				bool = false;
			}
		}
		System.out.println("다음 문장 실행");
	}
}
