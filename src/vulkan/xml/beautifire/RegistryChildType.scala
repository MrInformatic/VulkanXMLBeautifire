package vulkan.xml.beautifire

import scala.xml.Node

/**
  * Created by philipp on 13.04.18.
  */
class RegistryChildType[T <: RegistryType](registry: Registry,val parrent: T,node: Node) extends RegistryType(registry, node){

}
