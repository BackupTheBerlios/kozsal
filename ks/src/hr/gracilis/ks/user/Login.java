package hr.gracilis.ks.user;

import hr.gracilis.ks.base.Visit;
import org.apache.tapestry.IRequestCycle;
import org.apache.tapestry.PageRedirectException;
import org.apache.tapestry.html.BasePage;

public abstract class Login extends BasePage {
	public abstract void setMessage(String message);
	public abstract String getUserName();
	public abstract String getPassword();
	  
	public void login(IRequestCycle cycle) {
		Visit visit=(Visit) getVisit();
		
		setMessage(getUserName() + "/" + getPassword() + " - " + visit.isAuthenticated());
		
		visit.setAuthenticated(true);
		throw new PageRedirectException("Main");
	}
}
