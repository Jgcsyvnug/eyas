package com.hdsx.framework.author.bean;
/**
 * 角色
 * @author xiongxt
 * @2015年3月15日
 */
public class Role {
	//唯一标识
	private String id;
	//角色名称
	private String roleName;
	//角色描述
	private String describe;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", describe="
				+ describe + "]";
	}
	
}
