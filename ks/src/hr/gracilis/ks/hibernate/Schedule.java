//	@(#) $Header: /home/xubuntu/berlios_backup/github/tmp-cvs/kozsal/Repository/ks/src/hr/gracilis/ks/hibernate/Schedule.java,v 1.2 2004/04/12 20:41:18 obivatelj Exp $

package hr.gracilis.ks.hibernate;

public class Schedule {
	private Long schId=null;
	private User customer=null;
	private User employee=null;
	
	public Long getSchId() {
		return schId;
	}
	
	public void setSchId(Long schId) {
		this.schId = schId;
	}
	
	public User getCustomer() {
		return customer;
	}
	
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	
	public User getEmployee() {
		return employee;
	}
	
	public void setEmployee(User employee) {
		this.employee = employee;
	}
}
