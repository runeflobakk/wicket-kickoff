package wicketkickoff.web.admin;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.spring.injection.annot.SpringBean;

import wicketkickoff.domain.User;
import wicketkickoff.domain.UserRepository;

public class UsersTable extends PropertyListView<User> {

    @SpringBean
    private UserRepository userRepository;

    public UsersTable(String id) {
        super(id);
        setList(userRepository.all());
    }

    @Override
    protected void populateItem(ListItem<User> item) {
        item.add(new Label("id"));
        item.add(new Label("name"));
    }

}
