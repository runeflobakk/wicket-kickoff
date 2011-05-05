package wicketkickoff.web.user;

import org.apache.wicket.PageParameters;
import org.apache.wicket.util.tester.FormTester;
import org.junit.Test;
import wicketkickoff.web.WicketTestBase;


public class EditUserPageTest extends WicketTestBase {


    @Test
    public void isAccessedFromProfilePage() {
        wicketTester.startPage(ProfilePage.class);
        wicketTester.clickLink("edituser");
        wicketTester.assertRenderedPage(EditUserPage.class);
    }


    @Test
    public void canEditUsersName() {
        wicketTester.startPage(EditUserPage.class, new PageParameters("id=1"));

        FormTester userform = wicketTester.newFormTester("userform");
        userform.setValue("name", "A brand new name!");
        userform.submit();

        wicketTester.assertRenderedPage(ProfilePage.class);
        wicketTester.assertContains("A brand new name!");
    }


}
