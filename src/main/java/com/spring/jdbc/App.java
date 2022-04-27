package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started.........." );
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		/* Insert
		 * Student student=new Student(); student.setId(3); student.setName("Vipin");
		 * student.setCity("Alwar"); int result = studentDao.insert(student);
		 * System.out.println(result);
		 */
        
//		Update
//		 Student student=new Student(); student.setId(3); student.setName("Sharad");
//		 student.setCity("Faridabad"); int result=studentDao.change(student);
//		 System.out.println("Data Changed "+result);
		
        
//        Delete
//        Scanner s=new Scanner(System.in);
//        int id=s.nextInt();
//        int result=studentDao.delete(id);
//        System.out.println("Deleted "+result);
        
//         Student student = studentDao.getStudent(1);
//         System.out.println(student);
        
        List<Student> students=studentDao.getAllStudent();
        for(Student s:students) {
        	System.out.println(s);
        }
    }
}
