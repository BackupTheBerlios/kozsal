//	@(#) $Header: /home/xubuntu/berlios_backup/github/tmp-cvs/kozsal/Repository/ks/src/hr/gracilis/ks/hibernate/Customer.java,v 1.2 2004/04/09 14:40:38 obivatelj Exp $

package hr.gracilis.ks.hibernate;

import java.util.List;
 
public class Customer {
	private long cusId;
	private List customerAdd;
	
	public long getCusId() {
		return cusId;
	}
	
	public List getCustomerAdd() {
		return customerAdd;
	}

	public void setCusId(long l) {
		cusId = l;
	}

	public void setCustomerAdd(List list) {
		customerAdd = list;
	}

}
