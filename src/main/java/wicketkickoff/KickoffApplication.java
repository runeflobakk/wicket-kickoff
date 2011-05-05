package wicketkickoff;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.target.coding.HybridUrlCodingStrategy;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.springframework.stereotype.Component;

import wicketkickoff.web.admin.ViewUsersPage;
import wicketkickoff.web.user.EditUserPage;
import wicketkickoff.web.user.ProfilePage;

@Component
public class KickoffApplication extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
        return ProfilePage.class;
    }

    @Override
    protected void init() {
        super.init();
        addComponentInstantiationListener(new SpringComponentInjector(this));
        mount(new HybridUrlCodingStrategy("/user", ProfilePage.class));
        mount(new HybridUrlCodingStrategy("/user/edit", EditUserPage.class));
        mount(new HybridUrlCodingStrategy("/admin/users", ViewUsersPage.class));
    }

}
