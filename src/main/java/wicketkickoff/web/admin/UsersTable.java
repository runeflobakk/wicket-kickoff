package wicketkickoff.web.admin;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.spring.injection.annot.SpringBean;

import wicketkickoff.domain.User;
import wicketkickoff.domain.UserRepository;

public class UsersTable extends ListView<User> {

    @SpringBean
    private UserRepository userRepository;

    public UsersTable(String id) {
        super(id);
        setList(userRepository.all());
    }

    @Override
    protected void populateItem(ListItem<User> item) {
        User user = item.getModelObject();
        item.add(new Label("id", String.valueOf(user.getId())));
        item.add(new Label("name", user.getName()));
    }

}
