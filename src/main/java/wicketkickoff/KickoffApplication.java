package wicketkickoff;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import wicketkickoff.web.helloworld.HelloWorld;

public class KickoffApplication extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
        return HelloWorld.class;
    }

}
