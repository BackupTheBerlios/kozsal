import java.io.File;

import net.sf.hibernate.cfg.Configuration;
import net.sf.hibernate.tool.hbm2ddl.SchemaExport;

public class A {
	public static void main(String[] args) throws Exception {
		new A();
	}
	
	public A() throws Exception {
		File f=new File("context/WEB-INF/classes/hibernate.se.cfg.xml");
		SchemaExport se=new SchemaExport(new Configuration().configure(f));
		se.create(true, true);
	}
}
