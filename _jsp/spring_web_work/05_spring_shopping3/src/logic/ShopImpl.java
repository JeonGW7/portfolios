package logic;
//구현 클래스
public class ShopImpl implements Shop{
	
	private UserCatalog userCatalog; //변수
	
	//setter만
	public void setUserCatalog(UserCatalog userCatalog) {
		this.userCatalog = userCatalog;
	}

	@Override
	public UserDTO getUserByUserIdAndPassword(String userId, String password) {
		return userCatalog.getUserByUserIdAndPassword(userId, password);
	}

}
