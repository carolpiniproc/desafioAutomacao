package mapper;
import Settings.ByValue;
import Settings.Element;

public class RegistroMap {

    public Element pageTitle = new Element(ByValue.CSS, "h1");
    public Element name = new Element(ByValue.CSS,"input[ng-model=\"FirstName\"]");
    public Element lastName = new Element(ByValue.CSS,"input[ng-model=\"LastName\"]");
    public Element address = new Element(ByValue.CSS,"textarea[ng-model=\"Adress\"]");
    public Element email = new Element(ByValue.CSS,"input[ng-model=\"EmailAdress\"]");
    public Element phone = new Element(ByValue.CSS,"input[ng-model=\"Phone\"]");
    public Element male = new Element(ByValue.CSS,"input[value=\"Male\"]");
    public Element female = new Element(ByValue.CSS,"input[value=\"FeMale\"]");
    public Element cricket = new Element(ByValue.CSS,"input[value=\"Cricket\"]");
    public Element movies = new Element(ByValue.CSS,"input[value=\"Movies\"]");
    public Element hockey = new Element(ByValue.CSS,"input[value=\"Hockey\"]");
    public Element languageList = new Element(ByValue.ID,"msdd");
    public Element language = new Element(ByValue.CSS,"#msdd div, a.ui-corner-all");
    public Element skillsList = new Element(ByValue.ID,"Skills");
    public Element countryList = new Element(ByValue.ID,"countries");
    public Element countrySearchList = new Element(ByValue.CSS,"#country + span");
    public Element countrySearchType = new Element(ByValue.CSS,"input[type=\"search\"]");
    public Element year = new Element(ByValue.ID,"yearbox");
    public Element month = new Element(ByValue.CSS,"select[ng-model=\"monthbox\"]");
    public Element day = new Element(ByValue.ID,"daybox");
    public Element password = new Element(ByValue.ID,"firstpassword");
    public Element confirmPassword = new Element(ByValue.ID,"secondpassword");
    public Element submit = new Element(ByValue.ID,"submitbtn");
    public Element refresh = new Element(ByValue.ID,"Button1");
    public Element emailAlreadyExists = new Element(ByValue.CSS,"div[ng-if=\"EmailExists\"]");
    public Element phoneAlreadyExists = new Element(ByValue.CSS,"div[ng-if=\"errorlabel\"]");
    public Element uploadArquivo = new Element(ByValue.ID,"imagesrc");
    public Element registroConcluido = new Element(ByValue.XPATH,"//h4[1]");
    public Element emailAlert = new Element(ByValue.CSS,".tooltptext > span");
}
