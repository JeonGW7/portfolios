package comm.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Assert.*;


class CommandUtilTest {
	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	@Test
	public void test() {
		CommandUtil commandUtil=new CommandUtil(); //객체생성
		//assertEquals(100,commandUtil.add(70, 30));
		//assertEquals(200,commandUtil.add(70, 30));
		//           결과
		
		//예상 데이터와 실제 실행시 데이터가 일치하면 녹색 
		//일치하지 않으면 빨강
	}
	
	@Test
	public void testString() {
		//assertEquals("홍길동",CommandUtil.getString());
	}
	
	@Test
	public void testISNumber() {
		//assertEquals(false,CommandUtil.isNumber("숫자가 아님"));
		assertEquals(true,CommandUtil.isNumber("숫자가 아님"));
	}
	
}
