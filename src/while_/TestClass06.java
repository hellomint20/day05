package while_;

public class TestClass06 {
	public static void main(String[] args) {
		/*for(int i=0; i<3; i++) {
			for(int k=0; k<5; k++) {
				System.out.println(i+" , "+k);
			}
		}*/
		
		for(int i=2; i<10; i++) {
			System.out.println("===== "+i+" 단 =====");
			for(int j=1; j<10; j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
	}
}
