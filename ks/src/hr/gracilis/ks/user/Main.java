//	@(#) $Header: /home/xubuntu/berlios_backup/github/tmp-cvs/kozsal/Repository/ks/src/hr/gracilis/ks/user/Main.java,v 1.2 2004/04/09 14:40:38 obivatelj Exp $

package hr.gracilis.ks.user;

import java.util.Iterator;
import java.util.List;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Query;
import net.sf.hibernate.Session;
import net.sf.hibernate.Transaction;
import hr.gracilis.ks.base.HibernateUtil;
import hr.gracilis.ks.base.SecurePage;
import hr.gracilis.ks.base.Visit;

public class Main extends SecurePage {	
	
	public String getName() throws HibernateException {
		Visit visit=(Visit) getVisit();
		
		Session session=HibernateUtil.currentSession();
		Transaction transaction=session.beginTransaction();
			
		Query query=session.createQuery("from Customer");
		List result=query.list();
		
		transaction.commit();
		session.flush();

		Iterator iter=result.iterator();

		if(iter.hasNext()) {
			return "dohvatio iz baze";
		}
		
		HibernateUtil.closeSession(true);
		
		return visit.isAuthenticated() + "";
	}
}
