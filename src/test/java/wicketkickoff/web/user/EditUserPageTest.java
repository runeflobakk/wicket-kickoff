package wicketkickoff.web.user;

import org.apache.wicket.PageParameters;
import org.apache.wicket.util.tester.FormTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import wicketkickoff.KickoffApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class EditUserPageTest {

    private WicketTester wicket;

    @Before
    public void setup() {
        wicket = new WicketTester(new KickoffApplication());
    }

    @Test
    public void isAccessedFromProfilePage() {
        wicket.startPage(ProfilePage.class);
        wicket.clickLink("edituser");
        wicket.assertRenderedPage(EditUserPage.class);
    }


    @Test
    public void canEditUsersName() {
        wicket.startPage(EditUserPage.class, new PageParameters("id=1"));
        FormTester userform = wicket.newFormTester("userform");
        userform.setValue("name", "A brand new name!");
        userform.submit();
        wicket.assertRenderedPage(ProfilePage.class);
        wicket.assertContains("A brand new name!");
    }

}
