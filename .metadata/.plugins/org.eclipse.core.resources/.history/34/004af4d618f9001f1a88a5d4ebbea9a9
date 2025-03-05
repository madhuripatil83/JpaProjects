import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
	            new String[] { "/**/config.xml", "/**/xxx.xml"});
		
	//ApplicationContext ctx = new 
		//ClassPathXmlApplicationContext("config.xml");
		
		Student s = (Student) ctx.getBean("stud");
		
		
		System.out.println(s.getName());
	}

}