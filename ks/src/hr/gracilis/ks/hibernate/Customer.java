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
