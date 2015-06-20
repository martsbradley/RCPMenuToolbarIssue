package mytestplugin;

import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
//import org.apache.log4j.Logger;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    //private static Logger log = Logger.getLogger(ApplicationWorkbenchAdvisor.class);
	

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }


    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
       return new ApplicationActionBarAdvisor(configurer);
    }
    
    public void preWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
        //configurer.setInitialSize(new Point(400, 300));
        configurer.setShowCoolBar(true);
        configurer.setShowStatusLine(false);
        configurer.setTitle("SQL Student"); //$NON-NLS-1$
    }
}
