import java.util.ArrayList;
import java.util.List;

//아래와 같은 인터페이스가 있는경우
public class LambdaMain {

	interface T {
		public void method(int n);
	}

	interface V {
		public int add(int n1, int n2);
	}

	public static void main(String[] args) {
		// 위와 같은 인터페이스 T를 구현해서 사용해야 하는 경우

		T obj = (n) -> {
			System.out.println(n);
		};
		obj.method(10);

		V ob = (n1, n2) -> {
			return n1 + n2;
		};
		System.out.println(ob.add(100, 200));
		
		//배열은 [인데스]를 통해서 각각의 데이터에 접근합니다.
		int [] ar = {10,30,20};
		for(int i = 0 ; i<ar.length;i=i+1) {
			System.out.println(ar[i]);
		}
		//for(int temp : ar){
		//System.out.println(temp);
	    //}
		System.out.println("=================================");
		
		//List는 get(인덱스)를 통해서 각각의 데이터에 접근합니다.
		List<Integer> list = new ArrayList<>();
		
		list.add(30);
		list.add(300);
		list.add(200);
		
		for(int i = 0 ; i <list.size(); i = i+ 1) {
			System.out.println(list.get(i));
		}
		
		/*// 빠른 열거
		for(Integer temp : list) { // Integer을 int로 써도 된다.
			System.out.println(temp);
		}*/
		
		
	}
}
