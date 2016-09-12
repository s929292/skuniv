package kr.capa.acip.dao.reple;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.capa.acip.vo.reple.ComplainreVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/Spring/applicationContext.xml" })
public class ComplainreDAOImplTest {
	@Autowired
	private ComplainreDAO complainreDAO;
	 //@Test
		public void insertComplainre() throws Exception {
			ComplainreVO complainre = new ComplainreVO();
						
			complainre.setCnum(41);
			complainre.setCrecontent("마자마자 개더움2");
			complainre.setLnum(1);
			
			int count = complainreDAO.insertComplainre(complainre);
			assertEquals(1, count); 
		}
	 
		//@Test
		public void Complainrelist() throws Exception {
			ComplainreVO complainre = new ComplainreVO();
			
			complainre.setCnum(41);
			complainre.setLnum(1);
			List<ComplainreVO> complainrelist = complainreDAO.selectComplainrelist(complainre);
			System.out.println(complainrelist);
//			System.out.println(guestbooklist.get(1));
			assertNotNull(complainrelist);
		}  
		
		@Test  
		public void updateComplainre() throws Exception{
			ComplainreVO complainre = new ComplainreVO();
			complainre.setCrecontent("바꿈123123");
			complainre.setCrenum(2);
			int count = complainreDAO.updateComplainre(complainre);
			assertEquals(1, count);		
		}
		
		//@Test
		public void deleteComplainre() throws Exception {
			int count = complainreDAO.deleteComplainre(3);
			assertEquals(1, count);
		}
}


//	// @Test
//	public void modifyGuestbook() throws Exception {
//		GuestBookVO guestbook = new GuestBookVO();
//		guestbook.setName("뱅");
//		guestbook.setPassword("1234");
//		guestbook.setContent("1111");
//		guestbook.setNo(22);
//		int count = guestbookDAO.updateGuestbook(guestbook);
//		assertEquals(1, count);
//
//	}
//
//	// @Test
//	public void deleteGuestbook() throws Exception {
//		int count = guestbookDAO.deleteGuestbook(23);
//		assertEquals(1, count);
//	}
//
//	//@Test
//	public void Guestbooklist() throws Exception {
//		List<GuestBookVO> guestbooklist = guestbookDAO.selectGuestbooklist();
//		System.out.println(guestbooklist);
////		System.out.println(guestbooklist.get(1));
//		assertNotNull(guestbooklist);
//	}  
//	//@Test 
//	public void selectGuestbookNO() throws Exception {
//		System.out.println(guestbookDAO.selGuestbookNo(22));
//		assertNotNull(guestbookDAO);
//	}
//	//@Test
//	public void selectGuestbookContent() throws Exception {
//		List<GuestBookVO> guestbooklist = guestbookDAO.selGuestbookcontent("%안녕%");
//		System.out.println(guestbooklist); 
//		assertNotNull(guestbooklist);
//	}
//	@Test
//	public void selectGuestbookID() throws Exception {
//		List<GuestBookVO> guestbooklist = guestbookDAO.selGuestbookID("s929292");
//		System.out.println(guestbooklist);
//		assertNotNull(guestbooklist);
//	}
//	
//}
