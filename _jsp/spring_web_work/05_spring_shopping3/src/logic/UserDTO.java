package logic;
import java.util.Date;
import java.io.Serializable; //객체 직렬화
//DTO:모델빈
public class UserDTO implements Serializable{
  //전역변수=property
  private String userId;
  private String password;
  private String userName;
  private String postCode;
  private String address;
  private String email;
  private String job;
  private Date birthDay;
  //getter,setter
  public String getUserId() {
	  return userId;
  }
  public void setUserId(String userId) {
	  this.userId = userId;
  }
  public String getPassword() {
	  return password;
  }
  public void setPassword(String password) {
	  this.password = password;
  }
  public String getUserName() {
	  return userName;
  }
  public void setUserName(String userName) {
	  this.userName = userName;
  }
  public String getPostCode() {
	  return postCode;
  }
  public void setPostCode(String postCode) {
	  this.postCode = postCode;
  }
  public String getAddress() {
	  return address;
  }
  public void setAddress(String address) {
	  this.address = address;
  }
  public String getEmail() {
	  return email;
  }
  public void setEmail(String email) {
	  this.email = email;
  }
  public String getJob() {
	  return job;
  }
  public void setJob(String job) {
	  this.job = job;
  }
  public Date getBirthDay() {
	  return birthDay;
  }
  public void setBirthDay(Date birthDay) {
	  this.birthDay = birthDay;
  }
  
}//class-end
