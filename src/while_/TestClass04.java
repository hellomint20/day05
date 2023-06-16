package while_;

public class TestClass04 {
	public static void main(String[] args) {
		//무조건 1번 실행된다.
		int su = 5, i =1;
		do {
			//종속문장
			System.out.println(i);
			i++;
		}while(i < su);	//조건식
			System.out.println("다음 문장 실행");
	}
}
