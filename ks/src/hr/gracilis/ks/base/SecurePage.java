//	@(#) $Header: /home/xubuntu/berlios_backup/github/tmp-cvs/kozsal/Repository/ks/src/hr/gracilis/ks/base/SecurePage.java,v 1.2 2004/04/09 14:40:38 obivatelj Exp $

package hr.gracilis.ks.base;

import org.apache.tapestry.IRequestCycle;
import org.apache.tapestry.PageRedirectException;
import org.apache.tapestry.html.BasePage;

public class SecurePage extends BasePage {

	public void validate(IRequestCycle iRequestCycle) {
			Visit visit=(Visit) getVisit();
			
			if (!visit.isAuthenticated()) {
				throw new PageRedirectException("Home");
			}
			
			super.validate(iRequestCycle);
		}

}
