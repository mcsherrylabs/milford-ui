package sss.ui.nobu

import com.vaadin.navigator.View
import com.vaadin.ui.VerticalLayout
import sss.ui.milford.design.{Message, PhotoMsg, Structure, TextMsg}

class WallView extends Structure with View{

  val vl = new VerticalLayout()
  (0 to 6) foreach { _ =>
    val m = new Message()
    m.addComponent(new PhotoMsg())
    vl.addComponent(m)
  }

  vl setMargin false
  vl setSpacing false
  itemPanel.setContent(vl)
}
