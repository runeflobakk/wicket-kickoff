package wicketkickoff.web.helloworld;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.SubmitLink;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import wicketkickoff.domain.User;
import wicketkickoff.domain.UserRepository;

public class EditUserPage extends WebPage {

    @SpringBean
    private UserRepository userRepository;

    public EditUserPage(PageParameters pageParameters) {
        User user = userRepository.get(pageParameters.getInt("id"));

        Form<User> userform = new Form<User>("userform", new CompoundPropertyModel<User>(user));
        SubmitLink submitLink = new SubmitLink("submit") {
            @Override
            public void onSubmit() {
                setResponsePage(ProfilePage.class);
            }
        };

        add(userform
                .add(new TextField<String>("name"))
                .add(submitLink));
    }

}
