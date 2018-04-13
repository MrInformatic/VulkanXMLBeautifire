package vulkan.xml.beautifire

import java.io.File

import scala.xml.XML

/**
  * Created by philipp on 13.04.18.
  */
class Registry {
  val xml = XML.loadFile(new File("vk.xml"))
}
