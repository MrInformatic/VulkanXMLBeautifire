package vulkan.xml.beautifire.tag

import vulkan.xml.beautifire.{Registry, RegistryType}

import scala.xml.Node

/**
  * Created by philipp on 13.04.18.
  */
class Tag(registry: Registry, node: Node) extends RegistryType(registry,node) {
  val name: String = node \@ "name"
  val author: String = node \@ "author"
  val contact: String = node \@ "contact"
}

object Tag {
  def apply(registry: Registry): Seq[Tag] =
    (registry.xml \ "tags" \ "tag").map(new Tag(registry,_))
}
