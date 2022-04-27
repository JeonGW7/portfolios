package logic;

import dao.UserDao;

public class UserCatalogImpl implements UserCatalog{
	
	private UserDao userDao; //변수
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public UserDTO getUserByUserIdAndPassword(String userId, String password) {
		return userDao.findByUserIdAndPassword(userId, password);
	}

}
