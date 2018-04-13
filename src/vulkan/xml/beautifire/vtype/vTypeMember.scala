package vulkan.xml.beautifire.vtype

import vulkan.xml.beautifire._

import scala.xml.Node

/**
  * Created by philipp on 13.04.18.
  */
class vTypeMember(registry: Registry, node: Node) extends vType(registry, node){
  val returnedonly: Option[String] = node \@@ "returnedonly"
  val structextends: Option[String] = node \@@ "structextends"
}
