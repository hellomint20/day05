package while_;

public class TestClass02 {
	public static void main(String[] args) {
		/*
		break
		- switch 또는 반복문 안에서 사용가능하다.
		- break는 만나는 순간 해당 종속문장을 빠져나간다
		 */
		int i=0;
		while(true) {
			i++;
			System.out.println("i : "+i);
			if(i>3) {
				break;
			}
		}
		System.out.println("다음 문장 실행");
		
		for(;;) {
			System.out.println("for");
			if(i == 4)	break;
		}
		System.out.println("다음 문장 실행");
	}
}
