//	@(#) $Header: /home/xubuntu/berlios_backup/github/tmp-cvs/kozsal/Repository/ks/src/hr/gracilis/ks/hibernate/Schedule.java,v 1.1 2004/04/11 09:25:30 obivatelj Exp $

package hr.gracilis.ks.hibernate;

public class Schedule {
	private Long schId=null;
	private Long cusId=null;
	private Long empId=null;
	
	public Long getSchId() {
		return schId;
	}
	
	public void setSchId(Long schId) {
		this.schId = schId;
	}
	
	public Long getCusId() {
		return cusId;
	}
	
	public void setCusId(Long cusId) {
		this.cusId = cusId;
	}
	
	public Long getEmpId() {
		return empId;
	}
	
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
}
