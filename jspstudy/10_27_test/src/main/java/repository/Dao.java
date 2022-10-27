package repository;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.Board;

public class Dao  {

	private SqlSessionFactory factory;
	private static Dao dao = new Dao();
	
	private Dao() {		
		try {
			// SqlSessionFactory 빌드
			String resource = "mybatis/config/mybatis-config.xml";
			InputStream in = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static Dao getInstance() {
		return dao;
	}
	
	String mapper = "mybatis.mapper.board.";
	public List<Board> selectAllBoards(){
		SqlSession ss = factory.openSession();  // SELECT(커밋이 필요 없는 경우)
		List<Board> boards = ss.selectList("mybatis.mapper.board.selectAllBoards");  // mybatis.mapper.board 매퍼의 selectAllBoards 아이디를 가진 쿼리문 실행
		ss.close();  // 메소드마다 닫아 주어야 한다.
		return boards;
	}
	
	
	public Board selectBoardByNo(int boardNo) {
		SqlSession ss = factory.openSession();
		Board board = ss.selectOne("mybatis.mapper.board.selectBoardByNo", boardNo);  // boardNo를 파라미터로 전달
		ss.close();
		return board;
	}
	
	public int insertBoard(Board board) {
		SqlSession ss = factory.openSession(false);
		int result = ss.insert("mybatis.mapper.board.insertBoard", board);
		if( result > 0 ) {
			ss.commit();
		}
		ss.close();
		return result;
		
		
	}
	
	public int selectAllUserCount() {
		SqlSession ss = factory.openSession();
		int count = ss.selectOne(mapper + "selectAllUserCount");
		ss.close();
		return count;
	}
	
	
	
	
}
