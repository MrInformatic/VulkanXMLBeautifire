package vulkan.xml.beautifire.vtype

import vulkan.xml.beautifire._

import scala.xml.Node

/**
  * Created by philipp on 13.04.18.
  */
class vType(registry: Registry, node: Node) extends RegistryType(registry,node){
  val name: String = node \\@ "name"
  val requires: Option[String] = node \@@ "requires"
  val alias: Option[String] = node \@@ "alias"
  val api: Option[String] = node \@@ "api"
  val comment: Option[String] = node \@@ "comment"
}
