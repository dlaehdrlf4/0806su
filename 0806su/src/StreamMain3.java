import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain3 {

	public static void main(String[] args) {
		/*Student st = new Student();
		st.setName("동길");
		st.setGender("남자");
		st.setAge(13);
		st.setScore(50);
		st.setSubject("수학");
		
		Student student1 = new Student("나다","여자",30,25,"사회다");

		System.out.println(st);
		System.out.println(student1);*/
		
		//Student 클래스의 인스턴스의 배열
		Student [] ar = new Student[5];
		         //     =[null,null,null,null,null] 처음 만들면 주소가 저장 참조형은 null이 생긴다.
		ar[0] = new Student("Faker", "남자", 30, 24, "MID");
		ar[1] = new Student("Bang", "여자", 70, 30, "bot");
		ar[2] = new Student("Thal", "여자", 60, 28, "TOP");
		ar[3] = new Student("Blank", "여자", 100, 29, "JUNGGLE");
		ar[4] = new Student("Wolf", "남자", 45, 34, "bot");
		
		//성별이 남자인 데이터만 출력 
		// 성별이 여자이고 나이가 30이상인 데이터
		//Stream <Student> st = Arrays.stream(ar);
		//st.filter(student -> student.getGender().equals("남자")).forEach(student -> System.out.println(student));
		
		// 성별이 여자이고 나이가 30이상인 데이터
		//Stream <Student> st1 = Arrays.stream(ar);
		//st1.filter(student -> student.getGender().equals("여자") && student.getAge()>= 30).forEach(student -> System.out.println(student));
		
		//student를 score로 변경 // 맵은 바꿀 때 사용한다.
		//Stream <Student> st = Arrays.stream(ar);
		//st.mapToInt(Student::getScore).forEach(student -> System.out.println(student));
		
		/*int [] array = {30,20,31,78,12};
		
		IntStream stream = Arrays.stream(array);
		stream.sorted().forEach(su -> System.out.println(su));
		
		String [] ar = {"Moning","Afternoon","Evening","Night"};
		
		//문자열 배열을 정렬해서 출력
		Stream<String> s = Arrays.stream(ar);
		//s.sorted().forEach(su -> System.out.println(su));
		//내림차순 밑에 뒤에 있는 것을 앞에 비교
		s.sorted((n1, n2)->n2.compareTo(n1)).forEach(su -> System.out.println(su));*/
		
		//Stream<Student> stream = Arrays.stream(ar);
		//stream.sorted((n1, n2) -> -(n1.getName().compareTo(n2.getName()))).forEach(student -> System.out.println(student));
		// -넣으면 뒤집는다.
		Stream<Student> stream = Arrays.stream(ar);
		stream.sorted((n1, n2) -> n2.getAge()-n1.getAge()).forEach(student -> System.out.println(student));
		
		
	}

}
