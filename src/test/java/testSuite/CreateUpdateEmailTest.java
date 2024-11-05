package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.ProfileSection;


public class CreateUpdateEmailTest extends BaseTestTodoLy {
    ProfileSection profileSection = new ProfileSection();

    @Test
    public void verifyCreateUpdateEmail() throws InterruptedException {
        String newName = "Update";
        mainPage.signUpButton.click();



        Assertions.assertEquals(newName, profileSection.getFullName(),
                "ERROR! The full name was not updated correctly");
    }
}
