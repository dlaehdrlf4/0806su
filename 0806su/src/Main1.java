import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Main1 {

	public static void main(String[] args) {
		
		/*Connection con = null;
		CallableStatement call = null;
		
		try {
			//데이터베이스 드라이버 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//데이터베이스 연결
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			//실행할 Statement 객체 만들기
			call = con.prepareCall("{call insertDeptProc(?,?,?)}");
			//물음표에 실제 값 바인딩
			call.setInt(1,12);
			call.setString(2, "비서");
			call.setString(3, "보성");
			
			//삽입구문 실행
			int r = call.executeUpdate();
			if(r > 0) {
				System.out.println("삽입 성공");
			} else {
				System.out.println("삽입 실패");
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			try {
			if(call != null) call.close();
			if(con != null) con.close();
			}catch(Exception e) {}
		}*/
		
		Connection con = null;
		CallableStatement call = null;
		
		try {
			//데이터베이스 드라이버 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//데이터베이스 연결
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			//실행할 Statement 객체 만들기
			call = con.prepareCall("{call deleteDeptProc(?)}");
			//물음표에 실제 값 바인딩
			call.setInt(1,12);
		
			//삭제구문 실행
			int r = call.executeUpdate();
			if(r > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			try {
			if(call != null) call.close();
			if(con != null) con.close();
			}catch(Exception e) {}
		}
		
		
		
	}

}
