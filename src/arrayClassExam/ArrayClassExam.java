package arrayClassExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayClassExam {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		int[] arr3 = new int[5];
		
		// 배열의 모든 요소를 하나의 값으로 채움
		Arrays.fill(arr3, 8);
		System.out.println(Arrays.toString(arr3)); // [8, 8, 8, 8, 8]
		// 매개변수로 함수형 인터페이스로 받아서 값을 채운다(혹은 람다식)
		Arrays.setAll(arr3, (i) -> (int)(Math.random()*5)+1);
		System.out.println(Arrays.toString(arr3)); // [2, 1, 4, 5, 4]
		
		// 배열전체를 복사한다.
		arr2 = Arrays.copyOf(arr3, arr3.length);
		System.out.println(Arrays.toString(arr2)); //[2, 1, 4, 5, 4]
		// 인덱스 2 전까지 복사한다.
		arr2 = Arrays.copyOf(arr3, 2);
		System.out.println(Arrays.toString(arr2)); //[2, 1]
		// 지정된 범위만 복사
		arr1 = Arrays.copyOfRange(arr3, 1, 2);
		System.out.println(Arrays.toString(arr1)); //[1]
		
		// 배열을 정렬한다.
		int[] arr4 = {5,4,3,2,1};
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4)); //[1, 2, 3, 4, 5]
		
		// 배열의 요소의 인덱스번호를 탐색한다.
		// 함수를 사용하기 전에 정렬을 해놓아야한다.
		// linearSearch같은 경우에는 정렬을 할 필요가 없지만 하나씩 비교하기 때문에 속도가 느리다
		int idx = Arrays.binarySearch(arr4, 3);
		System.out.println(idx); // 2
		
		int[] arr5 = {1,2,3,4,5};
		int[] arr6 = {1,2,3,4,5};
		// 배열의 요소들을 비교
		boolean check = Arrays.equals(arr5, arr6);
		System.out.println(check); // true
		
		// 배열을 리스트로 변환해서 출력
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		//list.add(6); // 리스트 크기 변견 불가능, 추가, 삭제가 불가능
		
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		list2.add(6);
		// 리스트 인스턴스에 리스트를 대입하는 형식으로 생성하면 추가,삭제,크기변경이 가능하다.
		
		
		
		
	}

}












