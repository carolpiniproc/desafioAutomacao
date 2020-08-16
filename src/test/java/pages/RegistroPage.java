package pages;

import Settings.Element;
import mapper.RegistroMap;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.LinkedHashMap;
import java.util.List;

public class RegistroPage {
    RegistroMap registroMap = new RegistroMap();

    public String getPageTitle(){
        return registroMap.pageTitle.getText().trim();
    }

    public RegistroPage setName(CharSequence... valor){
        registroMap.name.sendKeys(valor);
        return this;
    }
    public RegistroPage setLastName(CharSequence... valor){
        registroMap.lastName.sendKeys(valor);
        return this;
    }
    public RegistroPage setAddress(CharSequence... valor){
        registroMap.address.sendKeys(valor);
        return this;
    }
    public RegistroPage setEmail(CharSequence... valor){
       registroMap.email.sendKeys(valor);
        return this;
    }
    public RegistroPage setPhone(CharSequence... valor){
        registroMap.phone.sendKeys(valor);
        return this;
    }

    public void setGenderRadioButton(String valor){
        if("Male".equals(valor)) {
            registroMap.male.click();
        } else {
            registroMap.female.click();
        }
    }

    public void setHobbiesCheckbox(String valor){
        LinkedHashMap<String, Element> hobbies = new LinkedHashMap<>();
        hobbies.put("Cricket", registroMap.cricket);
        hobbies.put("Movies", registroMap.movies);
        hobbies.put("Hockey", registroMap.hockey);
        hobbies.get(valor).click();

//        switch (valor){
//            case "Cricket":
//                registroMap.cricket.click();
//                break;
//            case "Movies":
//                registroMap.movies.click();
//                break;
//            case "Hockey":
//                registroMap.hockey.click();
//                break;
//        }
    }

    public void setLanguageList(String valor){
        registroMap.languageList.click();
        List<WebElement> languages = registroMap.language.getElements();
        for (WebElement language : languages) {
            String languageName = language.getText();
            if (languageName.equals(valor)) {
                language.click();
                return;
            }
        }
    }

    public void setSkillsList(String valor){
        registroMap.skillsList.select(valor);
    }

    public void setCountryList(String valor){
        registroMap.countryList.select(valor);
    }

    public void setCountrySearchList(String valor){
        registroMap.countrySearchList.click();
        registroMap.countrySearchType.sendKeys(valor, Keys.ENTER);
    }

    public void setDate(String year, String month, String day){
        registroMap.year.select(year);
        registroMap.month.select(month);
        registroMap.day.select(day);
    }

    public void setPassword(String valorPass){
        registroMap.password.sendKeys(valorPass);
        registroMap.confirmPassword.sendKeys(valorPass);
    }

    public void submit(){
        registroMap.submit.click();
    }

    public boolean checkNewRegister( ){
        return registroMap.registroConcluido.isDisplayed();
    }

//    public void refresh() {
//        if (registroMap.emailAlreadyExists.isDisplayed() || registroMap.phoneAlreadyExists.isDisplayed()) {
//            registroMap.refresh.click();
//        }
//        else {
//            checkNewRegister();
//        }
//    }
//
//    public RegistroPage setUpload(CharSequence... value){
//        registroMap.uploadArquivo.sendKeys(value);
//        return this;
//    }

//    public boolean checkEmailFormat(){
//        return registroMap.emailAlert.isDisplayed();
//    }

}
