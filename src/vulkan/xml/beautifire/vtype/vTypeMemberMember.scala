package vulkan.xml.beautifire.vtype

import vulkan.xml.beautifire._

import scala.xml.Node

/**
  * Created by philipp on 13.04.18.
  */
class vTypeMemberMember[T <: vTypeMember](registry: Registry, parrent: T, node: Node) extends RegistryChildType[T](registry,parrent,node){
  val values: Option[String] = node \@@ "values"
  val len: Option[String] = node \@@ "len"
  val altlen: Option[String] = node \@@ "altlen"
  val externsync: Option[String] = node \@@ "externsync"
  val optional: Option[String] = node \@@ "optional"
  val noautovalidity: Option[String] = node \@@ "noautovalidity"

  val name: String = node @\\ "name"
  val vType: Option[String] = node \@\ "type"
  val vEnum: Option[String] = node \@\ "enum"
}
