package com.work.dto;

public class Employee {
	
	private int empNum;
	private String empNm;
	private String empRrn;
	private String empEdulevel;
	private String empId;
	private String empPwd;
	private String empExe;
	private String positionCode;
	
	public Employee() {
		super();
	}
	public Employee(int empNum, String empNm, String empRrn, String empEdulevel, String empId, String empPwd,
			String empExe, String positionCode) {
		super();
		this.empNum = empNum;
		this.empNm = empNm;
		this.empRrn = empRrn;
		this.empEdulevel = empEdulevel;
		this.empId = empId;
		this.empPwd = empPwd;
		this.empExe = empExe;
		this.positionCode = positionCode;
	}
	
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	public String getEmpRrn() {
		return empRrn;
	}
	public void setEmpRrn(String empRrn) {
		this.empRrn = empRrn;
	}
	public String getEmpEdulevel() {
		return empEdulevel;
	}
	public void setEmpEdulevel(String empEdulevel) {
		this.empEdulevel = empEdulevel;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	public String getEmpExe() {
		return empExe;
	}
	public void setEmpExe(String empExe) {
		this.empExe = empExe;
	}
	public String getPositionCode() {
		return positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empNum=");
		builder.append(empNum);
		builder.append(", empNm=");
		builder.append(empNm);
		builder.append(", empRrn=");
		builder.append(empRrn);
		builder.append(", empEdulevel=");
		builder.append(empEdulevel);
		builder.append(", empId=");
		builder.append(empId);
		builder.append(", empPwd=");
		builder.append(empPwd);
		builder.append(", empExe=");
		builder.append(empExe);
		builder.append(", positionCode=");
		builder.append(positionCode);
		builder.append("]");
		return builder.toString();
	}

}
