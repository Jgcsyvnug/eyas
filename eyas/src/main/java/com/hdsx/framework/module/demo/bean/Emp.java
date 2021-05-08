package com.hdsx.framework.module.demo.bean;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the EMP database table.
 * 
 */
public class Emp implements Serializable {
	private static final long serialVersionUID = 1L;

	private int empno;

	private double comm;

	private int deptno;

	private String ename;

	private Date hiredate;

	private String job;

	private int mgr;

	private double sal;

	public Emp() {
	}



	public int getEmpno() {
		return empno;
	}



	public void setEmpno(int empno) {
		this.empno = empno;
	}



	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Date getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}


}