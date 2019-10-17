import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.java.springboot.controller.TopicController;


public class CourseAPITest {
	

	TopicController tc=new TopicController();
	

	
	@Test
	public void getAllTopicsTest()
	{
		tc.getAllTopics();
		System.err.println(tc.getAllTopics().size());
		assertEquals(tc.getAllTopics().size(),3);
	}
}
