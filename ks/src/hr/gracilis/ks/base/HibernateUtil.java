//	@(#) $Header: /home/xubuntu/berlios_backup/github/tmp-cvs/kozsal/Repository/ks/src/hr/gracilis/ks/base/HibernateUtil.java,v 1.3 2004/04/11 09:25:30 obivatelj Exp $

package hr.gracilis.ks.base;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;
import net.sf.hibernate.SessionFactory;
import net.sf.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    public static final ThreadLocal session=new ThreadLocal();
    
    static {
        try {
            sessionFactory=new Configuration().configure().buildSessionFactory();
        } catch(HibernateException ex) {
            throw new RuntimeException("Exception building SessionFactory: " + ex.getMessage());
        }
    }

    public static Session currentSession() throws HibernateException {
        Session s=(Session) session.get();
        
        // Open a new Session, if this Thread has none yet
        if(s==null) {
            s=sessionFactory.openSession();
            session.set(s);
        }
        
        return s;
    }

    public static void closeSession(boolean toFlush) throws HibernateException {
        Session s=(Session) session.get();
        session.set(null);
        
        if(s!=null) {
        	if(toFlush) {
        		s.flush();
        	}
        	
        	s.close();
        }
    }
}
