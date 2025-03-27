package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class HomePage{
    private final SelenideElement avatar = $x("//div[@class='toolbar_avatar']");
    private final SelenideElement friendsButton = $x("//a[contains(@href, '/friends')] |" +
            " //span[text()='Друзья']/..");
    public boolean isAvatarAvailable(){
        return avatar.isDisplayed();
    }

    public SelenideElement getFriendsButton(){
        return friendsButton;
    }

    public HomePage close(){
        Selenide.closeWebDriver();
        return this;
    }
}