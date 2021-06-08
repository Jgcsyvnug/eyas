package com.hdsx.framework.author.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 单位
 * @author xiongxt
 * @2015年3月13日
 */

public class Dept {
	//唯一标识
	private String id;
	//名称
	private String deptName;
	//地址
	private String address;
	//负责人
	private String leader;
	//电话
	private String tel;
	//行政区划编码
	private String distCode;
	//行政区划编码对象
	private DistCode xzqhbm;
	//邮编
	private String postcode;
	//传真
	private String fax;
	//上级标识
	private String pid;
	//下级单位
	private List<Dept> children = new ArrayList<Dept>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDistCode() {
		return distCode;
	}
	public void setDistCode(String distCode) {
		this.distCode = distCode;
	}
	public DistCode getXzqhbm() {
		return xzqhbm;
	}
	public void setXzqhbm(DistCode xzqhbm) {
		this.xzqhbm = xzqhbm;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public List<Dept> getChildren() {
		return children;
	}
	public void setChildren(List<Dept> children) {
		this.children = children;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptName=" + deptName + ", address="
				+ address + ", leader=" + leader + ", tel=" + tel
				+ ", distCode=" + distCode + ", postcode=" + postcode
				+ ", fax=" + fax + ", pid=" + pid + ", children=" + children+ ", xzqhbm=" + xzqhbm
				+ "]";
	}
}
