//@(#) $Header: /home/xubuntu/berlios_backup/github/tmp-cvs/kozsal/Repository/ks/src/hr/gracilis/ks/base/FrameComponent.java,v 1.1 2004/04/11 09:25:30 obivatelj Exp $

package hr.gracilis.ks.base;

import org.apache.tapestry.BaseComponent;

public class FrameComponent extends BaseComponent {
	public boolean isNotMemberUserRole(String roleName) {
		if("Admin".equalsIgnoreCase(roleName)) {
			return true;
		}
		
		return false;
	}
}
