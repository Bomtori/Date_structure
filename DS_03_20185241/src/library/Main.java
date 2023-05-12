package library;

public class Main {

	public static void main(String[] args) {
		Library lib = new Library();
		lib.add_book("해리포터 비밀의 방", "JK 롤링", 10110100);
		lib.add_book("다빈치코드", "댄 브라운", 10110011);
		lib.add_book("해리포터 죽음의 성물", "JK 롤링", 10110101);
		lib.add_book("어린 왕자", "생텍쥐페리", 10110010);
		
		lib.changeBookName("어린 왕자", "어른 왕자");
		
		lib.changeBookID(10110011, 10000000);
		
		lib.changeBookWriter("JK 롤링", "롤링");
		lib.print_book();
	}

}
