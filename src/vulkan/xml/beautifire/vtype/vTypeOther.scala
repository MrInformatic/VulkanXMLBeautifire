package vulkan.xml.beautifire.vtype

import vulkan.xml.beautifire._

import scala.xml.Node

/**
  * Created by philipp on 13.04.18.
  */
class vTypeOther(registry: Registry, node: Node) extends vType(registry, node){
  val vtype: Seq[String] = (node \ "type").map(_.text)
  val apientry: Seq[String] = (node \ "apientry").map(_.text)
  val code: String = node.text
}
