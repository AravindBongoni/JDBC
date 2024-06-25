package com.Student;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO {
	private JdbcTemplate temp;
	
		public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
//		public int insert(Student s) {
//			String q = "insert into springjdbc values('"+s.getId()+"','"+s.getName()+"','"+s.getHallticket()+"','"+s.getBranch()+"')";
//			return temp.update(q);
//		}
		public int update(Student s) {
			String q = "update springjdbc set name='"+s.getName()+"',hallticket='"+s.getHallticket()+"',branch='"+s.getBranch()+"' where id='"+s.getId()+"'";
			return temp.update(q);
		}
		public int delete(Student s) {
			String q = "delete from springjdbc where id='"+s.getId()+"'";
			return temp.update(q);
		}
		

}
