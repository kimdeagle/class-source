package com.test.memo;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MemoDAO implements IMemo {

	//JDBC -> Spring JDBC(This File) -> MyBatis
	
	private DriverManagerDataSource dataSource; //Connection 역할
	private JdbcTemplate template; //Statement(PreparedStatement) + ResultSet 역할
	
	public MemoDAO() {
		this.dataSource = new DriverManagerDataSource();
		this.dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		this.dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		this.dataSource.setUsername("hr");
		this.dataSource.setPassword("java1234");
		
		this.template = new JdbcTemplate(this.dataSource);
	}
	
	@Override
	public int add(MemoDTO dto) {

		//Spring JDBC -> PreparedStatement 유사
		String sql = "insert into tblMemo (seq, name, memo, regdate) values (seqMemo.nextVal, ?, ?, default)";
		
		//this.template.query() -> stat.executeQuery()
		//this.template.update() -> stat.executeUpdate()
		//안에 try catch 포함되어 있어서 따로 작성X
		
		return this.template.update(sql, new Object[] { dto.getName(), dto.getMemo() });
	}

	@Override
	public List<MemoDTO> list() {
		
		//1. SQL
		//2. 매개 변수
		//3. rs = executeQuery()
		//4. ArrayList 생성
		//5. while (rs.next())
		//6. DTO 생성
		//7. dto.setxxx(rs.getxxx())
		//8. return list
		
		String sql = "select * from tblMemo order by seq desc";
		
		//BeanPropertyRowMapper
		//1. select 결과셋 컬럼명 확인
		//2. DTO의 setter명 확인
		//3. 서로 일치하는 항목을 연결 + 대입
		
		return this.template.query(sql, new BeanPropertyRowMapper<MemoDTO>(MemoDTO.class));
	}
	
}
