package steps;

import org.junit.Assert;
import pages.RegistroPage;
import Settings.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class RegisterSteps {
    RegistroPage registroPage = new RegistroPage();

    @Given("Im on a register form as {string}")
    public void imOnARegisterFormAs(String pageTitle) {
        Driver.setUrl("http://demo.automationtesting.in/Register.html");
        assertEquals(pageTitle, registroPage.getPageTitle());
    }


    @When("I type my first name as {string}")
    public void iTypeMyFistNameAs(String name) {
        registroPage.setName(name);
    }

    @And("I complete the form with my valid data")
    public void iCompleteTheFormWithMyValidData() {

        registroPage.setLastName("Proc");
        registroPage.setAddress("Rua Hermantino Coelho 743");
        registroPage.setEmail("test+5@test.com");
        registroPage.setPhone("1126119896");
        registroPage.setGenderRadioButton("FeMale");
        registroPage.setHobbiesCheckbox("Movies");
        registroPage.setLanguageList("Filipino");
        registroPage.setLanguageList("English");
        registroPage.setSkillsList("Android");
        registroPage.setCountryList("Afghanistan");
        registroPage.setCountrySearchList("Denmark");
        registroPage.setDate("1986","July","4");
        registroPage.setPassword("123Mudar");
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {
        registroPage.submit();
    }

    @Then("I have completed my registration")
    public void iHaveCompletedMyRegistration() {
        
        Assert.assertTrue(registroPage.checkNewRegister());
    }

}
