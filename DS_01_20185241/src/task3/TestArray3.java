package task3;

public class TestArray3 {
	public static void main(String[] args) {
		int number1 = 1;
		int number2 = number1;
		System.out.println("number 1 == number 2 : " + (number1 == number2));
		
		number2 = 3;
		
		System.out.printf("number 1 : %d, number2 : %d \n", number1, number2);
		System.out.println("number 1 == number2 : " + (number1 == number2));
		System.out.println();
		
		int [] array1 = {1, 3, 5, 6};
		int [] array2 = array1;
		System.out.println(" array1[0] == array2[0] : " +(array1 == array2));
		
		array2[0] = 9;
		
		System.out.printf("array1[0] : %d, array2[0] : %d \n", array1[0], array2[0]);
		System.out.println("array1[0] == array2[0] : " +(array1 == array2));	
	}

}
/* 
number1, number2는 원시 타입(Primitive Type)입니다.
원시 타입은 정수, 실수, 문자, 논리 리터럴 등 실제 데이터 값을 저장하는 타입입니다.
그러므로 처음 number2에 number1을 대입하면 값을 그대로 가지고 와서 true값을 반환합니다.
number2에는 3이라는 새로운 숫자를 원시타입으로 값 자체를 변수에 저장했으므로 값이 변해 false값을 반환합니다.

array1, array2는 참조 타입(Reference Type)입니다. 
참조 타입은 객체의 번지를 참조하는 타입으로 메모리 번지 값을 통해 객체를참조하는 타입입니다.
그러므로 처음 array2 = array1을 배열에 대입하면 array2는 array1과 같은 배열을 참조하게 되기 때문에 true값을 반환합니다.
array2에 를 넣어 배열의 요소를 변경해도 참조하는 배열은 같기 때문에 같이 변경됩니다.
그러므로 값이 함께 9로 변환되어 true를 반환합니다.
 */