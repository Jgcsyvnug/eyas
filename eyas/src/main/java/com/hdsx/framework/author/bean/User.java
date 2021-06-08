package com.hdsx.framework.author.bean;
/**
 * 用户
 * @author xiongxt
 * @2015年3月15日
 */
public class User {
	//唯一标识
	private String id;
	//登录名
	private String userName;
	//唯一标识
	private String realName;
	//密码
	private String password;
	//单位标识
	private String deptId;
	//联系地址
	private String post;
	//手机
	private String mobile;
	//电子邮箱
	private String email;
	//所在单位
	private Dept dept;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", realName="
				+ realName + ", password=" + password + ", deptId=" + deptId
				+ ", post=" + post + ", mobile=" + mobile + ", email=" + email
				+ ", dept=" + dept + "]";
	}
}
