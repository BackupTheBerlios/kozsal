//@(#) $Header: /home/xubuntu/berlios_backup/github/tmp-cvs/kozsal/Repository/ks/src/hr/gracilis/ks/base/Visit.java,v 1.2 2004/04/09 14:40:38 obivatelj Exp $

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
