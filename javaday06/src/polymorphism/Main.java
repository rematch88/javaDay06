package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Star s = new Terran();
		s.attack();
		
		s = new Zerg();
		s.attack();
		
		s = new Protoss();
		s.attack();
		
		//키보드 a를 누르면 s.attack() 이 호출되도록 연결

		
		
		
	}

}
