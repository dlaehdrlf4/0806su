import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		//문자열 배열을 생성
		String [] ar = {"르브론","스테판커리","코비브라이언트"};
		
		//문자열 리스트 생성
		List<String> list = new ArrayList<>();
		
		list.add("데릭로즈");
		list.add("제임스하든");
		list.add("케빈 러브");
		list.add("크리스폴");
		list.add("아이버슨");
		list.add("스티브내쉬");
		
		//문자열 배열을 가지고 스트림 만들기
		Stream<String> st = Arrays.stream(ar); // 대괄호는 int가 안된다. integer이 가능
		//작업 수행
		st.forEach(name -> {System.out.println(name);});

		//List를 가지고 스트림 만들기
		st = list.stream();
		st.forEach(name -> {System.out.println(name);});
		
		
	}

}
