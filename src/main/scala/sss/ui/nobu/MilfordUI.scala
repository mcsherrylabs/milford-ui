package sss.ui.nobu

import com.vaadin.annotations.{Push, Theme}
import com.vaadin.event.ShortcutAction
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent
import com.vaadin.navigator.{Navigator, ViewChangeListener}
import com.vaadin.server.VaadinRequest
import com.vaadin.ui.UI
import sss.ancillary.Logging


/**
  * Created by alan on 6/10/16.
  */
object MilfordUI {

}

@Theme("template")
@Push
class MilfordUI extends UI with ViewChangeListener with Logging {

  log.info("Constructing new MilfordUI")

  override def init(vaadinRequest: VaadinRequest): Unit = {

    val navigator = new Navigator(this, this)
    navigator.addViewChangeListener(this)
    navigator.addView("landing", new LandingView())
    navigator.addView("wallView", new WallView())
    navigator.navigateTo("wallView")

  }

  override def afterViewChange(viewChangeEvent: ViewChangeEvent): Unit = Unit

  override def beforeViewChange(viewChangeEvent: ViewChangeEvent): Boolean = {
    true // <---- WARNING WARNING WARNING!
  }


  override def detach(): Unit = {
    super.detach()
  }
}





