//@(#) $Header: /home/xubuntu/berlios_backup/github/tmp-cvs/kozsal/Repository/ks/src/KSSchemaExport.java,v 1.2 2004/04/12 20:41:18 obivatelj Exp $

import java.io.File;
import net.sf.hibernate.cfg.Configuration;
import net.sf.hibernate.tool.hbm2ddl.SchemaExport;

public class KSSchemaExport {
	public static void main(String[] args) throws Exception {
		new KSSchemaExport();
	}
	
	public KSSchemaExport() throws Exception {
		File f=new File("context/WEB-INF/classes/hibernate.se.cfg.xml");
		SchemaExport se=new SchemaExport(new Configuration().configure(f));
		se.create(true, true);
	}
}
