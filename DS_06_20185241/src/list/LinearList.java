package list;

class LinearList {
	private String strArray[];
	private int size;
	public static int MAX = 100;
	
	public LinearList() {
		size = 0;
		strArray = new String[MAX];
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public int length() {
		return size;
	}
	
	public String retrieve(int i) {
		if(strArray[i] != null)
			return strArray[i];
		else 
			return i + " index is empty";
	}
	
	public int find(String str) {
		for(int i = 0; i < size; i++) {
			if(strArray[i].equals(str))
				return i;
		}
		return -1;
	}
	
	public void replace(int i, String str) {
		if(strArray[i]!=null)
			strArray[i]=str;
	else
		throw new ArrayIndexOutOfBoundsException(i+" index is empty");
	}
	
	public void replace(String str1, String str2) {
	    int index = find(str1);
	    if(index != -1) {
	        strArray[index] = str2;
	    }
	}

	
	public void delete(int i) {
		if(i<=-1)
			throw new ArrayIndexOutOfBoundsException("Don't exist data");
		else {
			if(strArray[i]!=null) {
				for(int j=i; j<size-1; j++)
					strArray[j]=strArray[j+1];
				strArray[size--]=null;
			}else
				throw new ArrayIndexOutOfBoundsException(i+" index is empty");
		}
	}
	
	public void delete(String str) {
		delete(find(str));
	}
	
	public void insert(int i, String str) {
		try {
			for(int j=size+1; j>i; j--)
				strArray[j]=strArray[j-1];
			strArray[i]=str;
			size++;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is overflowed, Don't insert data");
		}
	}
	
	public void insert(String str) {
		try {
			strArray[size++]=str;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index is overflowed, Don't insert data");
		}
	}
	
	public void printArray() {
		for(int i=0; i<size; i++)
			System.out.println("["+i+"] : "+strArray[i]);
	
	}
	
}
