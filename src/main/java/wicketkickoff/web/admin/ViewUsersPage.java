package wicketkickoff.web.admin;

import org.apache.wicket.markup.html.WebPage;

public class ViewUsersPage extends WebPage {

    public ViewUsersPage() {
        add(new UsersTable("users"));
    }
}
