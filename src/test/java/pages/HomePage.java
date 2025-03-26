package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class HomePage{
    private final SelenideElement avatar = $x("//div[@class='toolbar_avatar']");

    public boolean isAvatarAvailable(){
        return avatar.isDisplayed();
    }
}