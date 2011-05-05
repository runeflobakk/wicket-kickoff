package wicketkickoff.web.user;

import org.apache.wicket.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.apache.wicket.util.tester.FormTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import wicketkickoff.KickoffApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class EditUserPageTest {

    @Autowired
    private ApplicationContext applicationContext;

    private WicketTester wicket;

    @Before
    public void setup() {
        wicket = new WicketTester(new KickoffApplication() {
            @Override
            protected SpringComponentInjector newSpringComponentInjector() {
                return new SpringComponentInjector(this, applicationContext, true);
            }
        });
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
