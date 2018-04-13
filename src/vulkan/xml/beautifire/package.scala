package vulkan.xml

import scala.xml.NodeSeq

/**
  * Created by philipp on 13.04.18.
  */
package object beautifire {
  implicit def AttrAsOption(nodeSeq: NodeSeq) = new AnyRef{
    def \@@(attributeName: String): Option[String] =
      Option(nodeSeq \@ attributeName).filterNot(_ == "")

    def \\@@(attributeName: String): Option[String] =
      Traversable(nodeSeq \@ attributeName, (nodeSeq \ attributeName).text).find(_ != "")

    def \\@(attributeName: String): String =
      \\@@(attributeName).getOrElse("")

    def \@\(attributeName: String): Option[String] =
      Option(nodeSeq \ attributeName).map(_.text).filterNot(_ == "")

    def @\\(attributeName: String): String =
      (nodeSeq \ attributeName).text
  }
}
