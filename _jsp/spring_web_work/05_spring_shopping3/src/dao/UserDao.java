package dao;

import logic.UserDTO;

//메서드 선언만
public interface UserDao {
	public UserDTO findByUserIdAndPassword(String userId,String password); //추상메서드
}
