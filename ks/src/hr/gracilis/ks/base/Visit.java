package hr.gracilis.ks.base;

import java.io.Serializable;

public class Visit implements Serializable {
	private boolean isAuthenticated=false;
	
	public boolean isAuthenticated() {
		return isAuthenticated;
	}
	
	public void setAuthenticated(boolean isAuthenticated) {
		this.isAuthenticated=isAuthenticated;
	}
}
