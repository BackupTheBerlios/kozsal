//	@(#) $Header: /home/xubuntu/berlios_backup/github/tmp-cvs/kozsal/Repository/ks/src/hr/gracilis/ks/user/Main.java,v 1.3 2004/04/12 20:41:18 obivatelj Exp $

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
	public abstract String getTestA();
	public abstract String getTestB();
	public abstract void setMessage(String message);
	public abstract Date getTestD();
	
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
		setMessage(getTestA() + "<br>" + getTestB() + "<br>" + getTestD());
	}
	
	public String getTestE() {
		return "error";
	}
}
