package wicketkickoff.web.helloworld;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.PropertyModel;

public class HelloWorld extends WebPage {

    private int teller = 1;

    public HelloWorld() {
        add(new Label("user", new PropertyModel<String>(this, "user")));
    }

    public String getUser() {
        return "World" + teller++;
    }
}
