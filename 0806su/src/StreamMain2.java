import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMain2 {

	public static void main(String[] args) {

		String[] ar = { "요넥스", "빅터", "주봉", "헤드", "아디다스", "르까프", "주봉" };

		// 스트림 변환
		Stream<String> a = Arrays.stream(ar);
		// 모든 데이터 출력 forEach
		// a.forEach(name -> {System.out.println(name);});
		// 중복 제거
		/*
		 * a.distinct().skip(2).limit(2).forEach(name->{System.out.println(name);});
		 * //이렇게 쓰면 한줄에 간단하게 사용가능해서 좋은듯 // 중간처리 메소드 부분임
		 */
		// 김으로 시작하는 데이터만 찾아서 출력
		// return 문장 하나 빡에 없을 때는 return 이라는 단어를 생략 가능
		// 수행되는 코드가 한 줄 일때는 {} 생략 가능
		//a.filter(name -> name.startsWith("주")).forEach(name -> System.out.println(name));
		
		//a.filter(name -> name.length() == 3).forEach(name -> System.out.println(name)); //3자인것만 필터링
		a.filter(name -> name.length() != 3).forEach(name -> System.out.println(name));// 3자가 아닌것을 필터링한다.
		
	}
}
