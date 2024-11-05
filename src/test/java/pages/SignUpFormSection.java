package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class SignUpFormSection {

    public TextBox fullNameTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox emailTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox pwdTxtBox = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));

    public Button checkButton = new Button(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms"));
    public Button signUpButton = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));

    public void signUp(String fullName, String email, String pwd){
        this.fullNameTxtBox.setText(fullName);
        this.emailTxtBox.setText(email);
        this.emailTxtBox.setText(email);
    }

}
