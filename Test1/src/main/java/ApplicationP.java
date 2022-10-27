import com.codeborne.selenide.Condition;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ApplicationP {

    @Test
    public void shouldOpenSite() {
        //open site
        WebDriverManager.chromedriver().setup();
        open("https://next.privat24.ua/money-transfer/card");

        //do action
        $("[data-qa-node='numberdebitSource']").sendKeys("4552331448138217");
        $("[data-qa-node='expiredebitSource']").sendKeys("05/24");
        $("[data-qa-node='cvvdebitSource']").sendKeys("926");
        $("[data-qa-node='firstNamedebitSource']").sendKeys("Dmytro");
        $("[data-qa-node='lastNamedebitSource']").sendKeys("Demchenko");
        $("[data-qa-node='numberreceiver']").sendKeys("4004159115449003");
        $("[data-qa-node='firstNamereceiver']").sendKeys("Volodymyr");
        $("[data-qa-node='lastNamereceiver']").sendKeys("Varavin");
        $("[data-qa-node='amount']").sendKeys("123");
        $("[name='currency']").selectOption("USD");
        $("[type='submit']").click();

        //check
        $("[data-qa-node='payer-card']").should(Condition.text("4552 3314 4813 8217"));
        $("[data-qa-node='payer-amount']").should(Condition.text("123 USD"));
        $("[data-qa-node='payer-currency']").should(Condition.text("5.41 USD"));
        $("[data-qa-node='receiver-name']").should(Condition.text("VOLODYMYR VARAVIN"));
        $("[data-qa-node='receiver-card']").should(Condition.text("4004 1591 1544 9003"));
        $("[data-qa-node='receiver-amount']").should(Condition.text("123 USD"));
        $("[data-qa-node='receiver-currency']").should(Condition.text("0 USD"));
        $("[data-qa-node='total']").should(Condition.text("Разом до списання 128.41 USD"));
    }
}