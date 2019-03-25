package oxy.dto;

public class UserLoginDto {
	private String userCode;
	private String name;
	private String loginTime;
	private String role;
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public UserLoginDto(String userCode, String name, String loginTime, String role) {
		super();
		this.userCode = userCode;
		this.name = name;
		this.loginTime = loginTime;
		this.role = role;
	}
}
