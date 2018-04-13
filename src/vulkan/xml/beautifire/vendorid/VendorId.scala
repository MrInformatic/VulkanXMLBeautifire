package vulkan.xml.beautifire.vendorid

import vulkan.xml.beautifire._

import scala.xml.Node

/**
  * Created by philipp on 13.04.18.
  */
class VendorId(registry: Registry,node: Node) extends RegistryType(registry, node){
  val name: String = node \@ "name"
  val id: String = node \@ "id"
  val comment: Option[String] = node \@@ "comment"
}

object VendorId {
  def apply(registry: Registry): Seq[VendorId] =
    (registry.xml \ "vendorids" \ "vendorid").map(new VendorId(registry,_))
}
