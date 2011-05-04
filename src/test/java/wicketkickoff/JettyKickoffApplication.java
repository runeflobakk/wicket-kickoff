package wicketkickoff;

import java.io.File;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;

public class JettyKickoffApplication {

    public static void main(String[] args) throws Exception {
        File testroot = new File(JettyKickoffApplication.class.getResource("/").getFile());
        String webappPath = new File(testroot, "../../src/main/webapp/").getCanonicalPath();

        WebAppContext context = new WebAppContext();
        context.setWar(webappPath);
        Server server = new Server(8080);
        server.addHandler(context);
        server.start();
    }

}
