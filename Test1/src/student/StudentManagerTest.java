package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentManagerTest {

	StudentManager Stest;
	
	@BeforeEach
	void setUp() {
		Stest = new StudentManager();
		Stest.addStudent("신경철");
		Stest.addStudent("서종원");
		Stest.addStudent("이수민");
		Stest.addStudent("석채원");
	}
	
	@Test
	void testAddStudent() {
		Stest.addStudent("구재혁");
		assertTrue(Stest.hasStudent("구재혁"));
	}
	
	@Test
	void testDeleteStudent() {
		Stest.removeStudent("신경철");
		assertFalse(Stest.hasStudent("신경철"));
	}
	
	@Test
	void testAddException() {
		assertThrows(IllegalArgumentException.class, ()->{Stest.addStudent("서종원");});
	}
	
	@Test
	void testNotexist() {
		assertThrows(IllegalArgumentException.class, ()->{Stest.removeStudent("김동건");});
	}

}
/*학생 추가
학생 제거
중복 추가 예외 처리
존재하지 않는 학생 제거 예외 처리
각 테스트는 assertTrue, assertFalse, assertThrows 중 하나를 사용할 것
*/