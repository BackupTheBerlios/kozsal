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
