package wicketkickoff.web;

import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import wicketkickoff.KickoffApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public abstract class WicketTestBase {

    @Autowired
    private ApplicationContext applicationContext;

    protected WicketTester wicketTester;

    @Before
    public final void initializeWicketTester() {
        KickoffApplication applicationUnderTest = new KickoffApplication() {
            @Override
            protected SpringComponentInjector newSpringComponentInjector() {
                return new SpringComponentInjector(this, applicationContext, true);
            }
        };
        wicketTester = new WicketTester(applicationUnderTest);
    }

}
