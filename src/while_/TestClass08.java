package while_;

public class TestClass08 {
	public static void main(String[] args) {
		String n1 = null, n2 ="test";
		System.out.println(n2.equals(n1));
		//System.out.println(n1.equals(n2));
		//null값을 가지고 있을 때는 .equsals 사용 불가 
		
		if(n1 == null) {
			System.out.println("n1에 값 입력 먼저 하세요");
		}else {
			System.out.println("else 비교 : "+n1.equals(n2));
		}
	}
}
