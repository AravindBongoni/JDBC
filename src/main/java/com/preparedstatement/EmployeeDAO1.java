package com.preparedstatement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class EmployeeDAO1 {
	private JdbcTemplate temp;

	public void setTemp(JdbcTemplate temp) {
		this.temp = temp;
	}
	public Boolean bypreparedstatement(Employee e) {
		String q = "delete from springjdbc where id=?";
		return temp.execute(q,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1,e.getId());
				return ps.execute();
			}
			
		});
	}

}
