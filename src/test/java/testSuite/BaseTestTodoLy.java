package testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.*;
import session.Session;

public class BaseTestTodoLy {

    MainPage mainPage = new MainPage();
    SignUpFormSection signUpFormSection = new SignUpFormSection();
//    protected LoginSection loginSection = new LoginSection();
//    protected MenuSection menuSection = new MenuSection();
//    protected SettingsSection settingsSection = new SettingsSection();

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get("https://todo.ly/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getInstance().closeSession();
    }


}
