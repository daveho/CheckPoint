package ycp.cs320.spring15.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	private User user1;
	private User user2;
	private User user3;
	
	@Before
	public void setUp() {
		user1 = new User("testuser", "mypassword");
		user2 = new User("zaphod", "beeblebrox");
		user3 = new User("arthur", "dent");
	}
	
	@Test
	public void testGetUsername() {
		assertEquals("testuser", user1.getUsername());
		assertEquals("zaphod", user2.getUsername());
		assertEquals("arthur", user3.getUsername());
	}
	
	@Test
	public void testGetPassword(){
		assertEquals("mypassword", user1.getPassword());
		assertEquals("beeblebrox", user2.getPassword());
		assertEquals("dent", user3.getPassword());
	}
	
	@Test
	public void testSetPassword(){
		user1.setPassword("notmypassword");
		assertEquals("notmypassword", user1.getPassword());
		user2.setPassword("trillian");
		assertEquals("trillian", user2.getPassword());
		user3.setPassword("slartibartfast");
		assertEquals("slartibartfast", user3.getPassword());
	}
}
