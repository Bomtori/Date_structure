package fibo;

public class CheckTime {
	public static final int MAX_N = 43;
	public static void main(String[] args) {
		
		long beforeTime = System.currentTimeMillis();
		
		for (int i = 0; i <= MAX_N; i++)
			Fibo.fib(i);
		
		long afterTime = System.currentTimeMillis();
		
		System.out.println("재귀함수 : " + (double)(afterTime - beforeTime) / 1000 + "s");
		
		beforeTime = System.currentTimeMillis();
		
		for(int i = 0; i <= MAX_N; i++)
			Fibo.fibIter(i);
		
		afterTime = System.currentTimeMillis();
		
		System.out.println("반복문 : " + (double)(afterTime - beforeTime) / 1000 + "s");
	}
}
/*
	실행시간 차이를 알기위해 재귀함수가 무엇인지부터 살펴보자면,
	프로그래밍에서 재귀는 자기 자신을 호출하는 것을 의미한다.
	이러한 재귀의 의미를 사용하여 자기 자신을 다시 호출하여 재참조하는 구조의 함수를 재귀함수라고 한다.
	특징으로는 코드의 가독성이 좋고, 스택 메모리를 사용한다.
	
	재귀함수는 함수를 호출할 때, 스택 메모리에 이전 프레임을 저장 후 새로운 프레임이 생성된다.
	재귀 호출이 많아질수록, 더욱 많은 프레임이 생성하게 되어 메모리가 부하되고, 스택오버플로우를 발생시킬 수 있다.
	
	하지만 반복문은 힙 메모리를 사용합니다. 필요한 변수들을 내부 안에서 지속적으로 업데이트를 합니다.
	이 덕분에 재귀함수와 달리 실행 시간이 짧습니다.
*/