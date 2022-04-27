package dao;
import logic.UserDTO;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
//DAO=DB처리=비지니스로직
public class UserDaoImpl implements UserDao{
	//applicationContext.xml 참조
	private SimpleJdbcTemplate template; //변수
	
	//setter메서드만
	public void setTemplate(SimpleJdbcTemplate template) {
		this.template = template;
	}
	//변수
	private static final String SELECT_ID_PWD="select user_id,password,user_name,postCode,address,email,job,birthday from user_account where user_id=? and password=?";
	@Override
	public UserDTO findByUserIdAndPassword(String userId, String password) {
		// BeanPropertyRowMapper클래스는
		// 테이블의 컬럼명과 UserDTO클래스의 필드 이름을 맵핑시켜 값을 지정한다
		//
		RowMapper<UserDTO> rmapper=new BeanPropertyRowMapper<UserDTO>(UserDTO.class);
		
		return this.template.queryForObject(UserDaoImpl.SELECT_ID_PWD, rmapper, userId, password);
	}

}
