package library;

public class Library {
	public static final int BOOK_DEFALUT_MAX = 10;
	public static final int ARRAY_INCREASE_RATE = 2;
	
	private Book[] book_list;
	private int num_of_book;
	
	public Library() {
		book_list = new Book[BOOK_DEFALUT_MAX];
		num_of_book = 0;
	}
	
	public void add_book(String name, String writer, int ID) {
		if (num_of_book >= book_list.length) {
			book_list = newBookList(book_list);
		}
		book_list[num_of_book] = new Book(name, writer, ID);
		num_of_book++;
	}
	
	public void add_book(Book newBook) {
		if (num_of_book >= book_list.length) {
			book_list = newBookList(book_list);
		}
		book_list[num_of_book] = newBook;
		num_of_book++;
	}
	
	public void print_book() {
		for(int i = 0; i < num_of_book; i++) {
			book_list[i].print_info();
		}
	}
	
	private Book[] newBookList(Book[] old_book_list) {
		Book[] new_Book_List = new Book[old_book_list.length * ARRAY_INCREASE_RATE];
		for (int i = 0; i < old_book_list.length; i++) {
			new_Book_List[i] = old_book_list[i];
		}
		return new_Book_List;
	}
	
	//과제 1
	public Book find_book(String name) {
		for (int i = 0; i < num_of_book; i++) {
			if (book_list[i].get_name().equals(name)) {
				return book_list[i];
			}
		}
		return null;
	}

	public Book find_book(int ID) {
		for (int i = 0; i < num_of_book; i++) {
			if (book_list[i].get_ID() == ID) {
				return book_list[i];
			}
		}
		return null;
	}

	public void find_writer(String writer) {
		for (int i = 0; i < num_of_book; i++) {
			if (book_list[i].get_writer().equals(writer)) {
				book_list[i].print_info();
			}
		}
	}

	//과제2
	public void sort_ID() {
        for (int i = 0; i < num_of_book - 1; i++) {
            for (int j = i + 1; j < num_of_book; j++) {
                if (book_list[i].get_ID() > book_list[j].get_ID()) {
                    Book temp = book_list[i];
                    book_list[i] = book_list[j];
                    book_list[j] = temp;
                }
            }
        }
    }

    public void reverse_book_list() {
        for (int i = 0; i < num_of_book / 2; i++) {
            Book temp = book_list[i];
            book_list[i] = book_list[num_of_book - i - 1];
            book_list[num_of_book - i - 1] = temp;
        }
    }
    
    //과제3
    public void changeBookName(String oldName, String newName) {
        Book book = find_book(oldName);
        if (book != null) {
            book.change_name(newName);
        }
    }

    public void changeBookID(int oldID, int newID) {
        Book book = find_book(oldID);
        if (book != null) {
            book.change_ID(newID);
        }
    }

    public void changeBookWriter(String oldWriter, String newWriter) {
        Book book = find_book(oldWriter);
        if (book != null) {
            book.change_writer(newWriter);
        }
    }
}


