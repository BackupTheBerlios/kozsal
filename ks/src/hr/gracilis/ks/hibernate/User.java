//	@(#) $Header: /home/xubuntu/berlios_backup/github/tmp-cvs/kozsal/Repository/ks/src/hr/gracilis/ks/hibernate/User.java,v 1.1 2004/04/11 09:25:30 obivatelj Exp $

package hr.gracilis.ks.hibernate;

import java.util.Set;

public class User {
	private Long useId=null;
	private String userName=null;
	private Set schedCustomers=null;
	private Set schedEmployees=null;
	
	public Long getUseId() {
		return useId;
	}
	
	public void setUseId(Long useId) {
		this.useId = useId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Set getSchedCustomers() {
		return schedCustomers;
	}
	
	public void setSchedCustomers(Set schedCustomers) {
		this.schedCustomers = schedCustomers;
	}
	
	public Set getSchedEmployees() {
		return schedEmployees;
	}
	
	public void setSchedEmployees(Set schedEmployees) {
		this.schedEmployees = schedEmployees;
	}
}
