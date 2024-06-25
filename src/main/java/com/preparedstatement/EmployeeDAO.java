package com.preparedstatement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeeDAO {
	private JdbcTemplate temp;

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	public Boolean bypreparedstatement(Employee e) {
		String query = "insert into springjdbc values(?,?,?,?)";
		return temp.execute(query,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1,e.getId());
				ps.setString(2,e.getName());
				ps.setFloat(3,e.getSalary());
				ps.setString(4,e.getDesig());
				return ps.execute();
			}
			
		});
	}
	

}
