//	@(#) $Header: /home/xubuntu/berlios_backup/github/tmp-cvs/kozsal/Repository/ks/src/hr/gracilis/ks/user/Main.java,v 1.4 2004/04/13 22:53:53 obivatelj Exp $

package hr.gracilis.ks.user;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.tapestry.IRequestCycle;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Query;
import net.sf.hibernate.Session;
import net.sf.hibernate.Transaction;
import hr.gracilis.ks.base.HibernateUtil;
import hr.gracilis.ks.base.SecurePage;
import hr.gracilis.ks.base.Visit;

public abstract class Main extends SecurePage {
	public abstract String getTestB();
	public abstract Date getTestD();
	public abstract String getPoljeA();
	public abstract void setPoljeAMsg(String poljeAMsg);
	public abstract String getPoljeAMsg();
	public abstract void setHasValidationError(boolean hasValidationError);
	public abstract void setPoljeACSS(String poljeACSS);
	
	public String getName() throws HibernateException {
		Visit visit=(Visit) getVisit();
		
		Session session=HibernateUtil.currentSession();
		Transaction transaction=session.beginTransaction();
			
		Query query=session.createQuery("from Customer");
		List result=query.list();
		
		transaction.commit();

		Iterator iter=result.iterator();

		if(iter.hasNext()) {
			return "dohvatio iz baze";
		}
		
		HibernateUtil.closeSession(true);
		
		return visit.isAuthenticated() + "";
	}
	
	public void formSubmit(IRequestCycle cycle) {
		setHasValidationError(false);
		setPoljeAMsg(null);
		setPoljeACSS(null);
		String poljeA=getPoljeA();
		
		if(poljeA==null || poljeA.length()<5) {
			setHasValidationError(true);
			setPoljeAMsg("Polje A mora biti duga\u010Dko najmanje 5 znakova.");
			setPoljeACSS("error");
			return;
		}
	}
}
