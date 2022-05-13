package cg.park.testSpringBoot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootTest
class TestSpringBootApplicationTests {

	@Test
	void contextLoads() {
	}

	private static final String DRIVER = "org.mariadb.jdbc.Driver";
	// DB 경로
	private static final String URL = "jdbc:mariadb://localhost:3306/pcg";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";

	@Test
	public void testConnection() throws Exception {
		System.out.println("testConnection ========== START ==========");
		Class.forName(DRIVER);
		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
			System.out.println(connection);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
