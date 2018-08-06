
public class Main2 {

	public static void main(String[] args) { // 클래스를 만듬으로써 재사용이 좋다.
		//implement는 객체를 만들고 run을 돌려야한다. // 별도의 클래스를 만들어서 이용
		/*Runnableempl r = new Runnableempl();
		Thread th = new Thread(r);
		th.start();
		
		Runnableempl r1 = new Runnableempl();
		Thread th1 = new Thread(r);
		th1.start();*/
		
		
		
		//익명 클래스 이용하기 // 재사용이 안좋다.
		Runnable r = () -> {
				//1초마다 쉬면서 1부터 10까지 출력
				int i = 1;
				while(i<=10) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("i:" + i);
					i= i+1;
					
				}
		};
		
		Thread th = new Thread(r);
		th.start();
	}
}
			
		



