package vn.momo.tasks.navigate;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import vn.momo.actions.scroll.MobileScrollTo;
import vn.momo.ui.ProfileScreen;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class NavigateToIntroduceHerSelfScreen implements Task {
    @Override
    @Step("{0} navigates to introduce herself screen")
    public <T extends Actor> void performAs(T theUser) {
        theUser.attemptsTo(
                Navigate.toProfileScreen(),
                WaitUntil.the(ProfileScreen.SCREEN_TITLE_LABEL, isVisible()).forNoMoreThan(30).seconds(),
                MobileScrollTo.text("Giới thiệu"),
                Click.on(ProfileScreen.INTRODUCTION_EDIT_BUTTON)
        );
    }
}
