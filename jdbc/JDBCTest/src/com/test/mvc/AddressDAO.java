package com.test.mvc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

//Data Access Object
// - 주로 데이터베이스와 관련된 비즈니스 업무를 담당하는 역할
public class AddressDAO {

	private Connection conn;
	private Statement stat; //매개변수 X
	private PreparedStatement pstat; //매개변수 O
	private CallableStatement cstat; //프로시저
	private ResultSet rs;
	
	public AddressDAO() {
		
		try {
			this.conn = DBUtil.open();
			this.stat = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int add(String name, String age, String gender, String tel, String address) {
		
		return 0;
		
	} //add

	public int add(AddressDTO dto) {
		
		try {
			
			String sql = "insert into tblAddress (seq, name, age, gender, tel, address, regdate) values (seqAddress.nextVal, ?, ?, ?, ?, ?, default)";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, dto.getName());
			pstat.setString(2, dto.getAge());
			pstat.setString(3, dto.getGender());
			pstat.setString(4, dto.getTel());
			pstat.setString(5, dto.getAddress());
			
			return pstat.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("AddressDAO.add()");
			e.printStackTrace();
		}
		
		return 0;
	}

	public ArrayList<AddressDTO> list(String word) {
		
		//word -> null -> 목록 보기
		//word -> "???" -> 검색하기
		
		//select -> ResultSet -> ArrayList<AddressDTO> -> 반환
		
		try {
			
			String where = "";
			
			if (word != null) {
				where = String.format("where address like '%%%s%%'", word);
			}
			
			String sql = String.format("select * from tblAddress %s order by seq desc", where);
			
			rs = stat.executeQuery(sql);
			
			//ResultSet -> ArrayList<AddressDTO>
			ArrayList<AddressDTO> list = new ArrayList<AddressDTO>();
			
			while (rs.next()) {
				//레코드 1개 -> AddressDTO 1개
				AddressDTO dto = new AddressDTO();
				
				dto.setSeq(rs.getString("seq"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getString("age"));
				dto.setGender(rs.getString("gender"));
				dto.setTel(rs.getString("tel"));
				dto.setAddress(rs.getString("address"));
				dto.setRegdate(rs.getString("regdate"));
				
				list.add(dto);
			}
			
			//list = rs
			return list;
			
		} catch (Exception e) {
			System.out.println("AddressDAO.list()");
			e.printStackTrace();
		}
		
		
		return null;
	}

	public int delete(String seq) {
		
		try {
			
			String sql = "delete from tblAddress where seq = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, seq);
			
			return pstat.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println("AddressDAO.delete()");
			e.printStackTrace();
		}
		
		return 0;
	}

	public AddressDTO get(String seq) {
		
		try {
			
			String sql = "select * from tblAddress where seq = ?";
			
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, seq);
			
			rs = pstat.executeQuery();
			
			if (rs.next()) {
				//레코드 1개 -> AddressDTO 1개
				AddressDTO dto = new AddressDTO();
				
				dto.setSeq(rs.getString("seq"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getString("age"));
				dto.setGender(rs.getString("gender"));
				dto.setTel(rs.getString("tel"));
				dto.setAddress(rs.getString("address"));
				dto.setRegdate(rs.getString("regdate"));
				
				return dto;
				
			}
			
		} catch (Exception e) {
			System.out.println("AddressDAO.get()");
			e.printStackTrace();
		}
		
		return null;
	}

	public int edit(AddressDTO dto2) {
		
		try {
			
			String sql = "update tblAddress set name = ?, age = ?, gender = ?, tel = ?, address = ? where seq = ?";
			
			pstat = conn.prepareStatement(sql);
			
			pstat.setString(1, dto2.getName());
			pstat.setString(2, dto2.getAge());
			pstat.setString(3, dto2.getGender());
			pstat.setString(4, dto2.getTel());
			pstat.setString(5, dto2.getAddress());
			pstat.setString(6, dto2.getSeq());
			
			return pstat.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("AddressDAO.edit()");
			e.printStackTrace();
		}
		
		return 0;
	}

} //AddressDAO.java
