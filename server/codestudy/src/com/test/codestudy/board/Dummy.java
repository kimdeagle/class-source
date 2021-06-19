package com.test.codestudy.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;

import com.test.codestudy.DBUtil;

public class Dummy {

	public static void main(String[] args) {
		
		//게시판 더미
		String[] subject = { "게시판 테스트입니다.", "JSP 수업입니다.", "Servlet 수업입니다.", "게시판 만들기 테스트", "게시판 제목으로 씁니다.", "페이징 처리하는 방법", "페이징을 해봅시다.", "에러메시지 확인하기", "아파치 톰캣 8.5", "게시판인가요?",};
		String content = "게시판 내용입니다.";
		String[] mseq = { "1", "3", "4", "21", "22", "23" };
		
		Connection conn = null;
		PreparedStatement stat = null;
		Random rnd = new Random();
		
		try {
			
			String sql = "insert into tblBoard (seq, subject, content, regdate, readcount, mseq, filename, orgfilename, downloadcount, thread, depth) values (seqBoard.nextVal, ?, ?, default, default, ?, null, null, default, ?, 0)";
			
			conn = DBUtil.open();
			stat = conn.prepareStatement(sql);
			
			for (int i=0; i<200; i++) {
				stat.setString(1, subject[rnd.nextInt(subject.length)]);
				stat.setString(2, content);
				stat.setString(3, mseq[rnd.nextInt(mseq.length)]);
				stat.setInt(4, i * 1000);
				
				System.out.println(i + ":" + stat.executeUpdate());
				
			}
			
			stat.close();
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}


