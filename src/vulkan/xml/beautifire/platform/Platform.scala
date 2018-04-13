package vulkan.xml.beautifire.platform

import vulkan.xml.beautifire._

import scala.xml.Node

/**
  * Created by philipp on 13.04.18.
  */
class Platform(registry: Registry, node: Node) extends RegistryType(registry,node) {
  val name: String = node \@ "name"
  val protect: String = node \@ "protect"
  val comment: Option[String] = node \@@ "comment"
}

object Platform {
  def apply(registry: Registry): Seq[Platform] =
    (registry.xml \ "platforms" \ "platform").map(new Platform(registry,_))
}
