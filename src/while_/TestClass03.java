package while_;

public class TestClass03 {
	public static void main(String[] args) {
		/*
		continue
		- 반복문 안에서 사용가능하다
		- continue를 만나는 순간 반복문이 위로 올라간다.
		 */
		int i=0;
		while(i<5) {
			i++;
			if(i==3) {
				System.out.println("33333");
				continue;
			}
			System.out.println("i : "+i);
		}
		System.out.println("다음 문장 실행");	
	}
}
