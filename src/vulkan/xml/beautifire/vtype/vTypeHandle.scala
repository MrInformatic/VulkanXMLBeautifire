package vulkan.xml.beautifire.vtype

import vulkan.xml.beautifire._

import scala.xml.Node

/**
  * Created by philipp on 13.04.18.
  */
class vTypeHandle(registry: Registry, node: Node) extends vTypeOther(registry, node){
  val parrent: Option[String] = node \@@ "parrent"
}
