package library;

public class Book {
	private String name;
	private String writer;
	private int ID;
	
	// book 클래스 내부 변수를 저장합니다
	public Book(String name, String writer, int ID) {
		this.name = name;
		this.writer = writer;
		this.ID = ID;
	}
	
	//출력을 도와주는 메소드를 생성합니다.
	public void print_info() {
		System.out.println("----------------------------");
		System.out.println("이름 : " + name);
		System.out.println("작가 : " + writer);
		System.out.println("ID : " + ID);
		System.out.println("----------------------------");
	}
	
	//private이 붙어있기 때문에, 외부에서 접근을 하려면 get_~()메소드가 필요합니다.
	public String get_name() {
		return name;
	}
	
	public void set_name(String name) {
	    this.name = name;
	}

	public String get_writer() {
		return writer;
	}
	
	public void set_writer(String writer) {
	    this.writer = writer;
	}
	public int get_ID() {
		return ID;
	}
	
	public void set_ID(int ID) {
	    this.ID = ID;
	}
	
	// 저장된 변수의 값을 바꾸는 메소드입니다.
	public void change_name(String name) {
		this.name = name;
	}
	
	public void change_writer(String writer) {
		this.writer = writer;
	}
	
	public void change_ID(int ID) {
		this.ID = ID;
	}
}
