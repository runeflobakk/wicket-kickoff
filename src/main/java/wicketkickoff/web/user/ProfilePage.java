package wicketkickoff.web.user;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.spring.injection.annot.SpringBean;

import wicketkickoff.domain.User;
import wicketkickoff.domain.UserRepository;

public class ProfilePage extends WebPage {

    @SpringBean
    private UserRepository userRepository;

    public ProfilePage() {
        User user = userRepository.get(1);

        Link<?> link = new Link<Object>("edituser") {
            @Override
            public void onClick() {
                setResponsePage(EditUserPage.class, new PageParameters("id=1"));
            };
        };
        add(
                new Label("name", user.getName()),
                link);
    }
}
