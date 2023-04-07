package dinesh.idfcmock.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class EmpDto {
     @Id
	private int empid;
	private String empname;
	private String roll;
	private long phoneno;
	private long sal;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmpDto [empid=" + empid + ", empname=" + empname + ", roll=" + roll + ", phoneno=" + phoneno + ", sal="
				+ sal + "]";
	}
	
	
	
	
}
