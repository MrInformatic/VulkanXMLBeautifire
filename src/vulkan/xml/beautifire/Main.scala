package vulkan.xml.beautifire

import java.io.{File, FileWriter}

import scala.xml.{Node, XML}

/**
  * Created by philipp on 13.04.18.
  */
object Main {
  def main(args: Array[String]): Unit ={
    new VulkanXMLBeautifire

    val xml = XML.loadFile(new File("vk.xml"))

    val prettyPrinter = new scala.xml.PrettyPrinter(80, 2)
    val writer = new FileWriter(new File("vulkan.xml"))
    writer.write(prettyPrinter.format(registy(xml)))
    writer.close()
  }

  def registy(xml: Node): Node = {
    <registy>
      {queues(xml)}
      {renderpasses(xml)}
      {cmdbufferlevels(xml)}
      {pipelines(xml)}
      {commands(xml)}
    </registy>
  }

  def queues(xml: Node): Node =
    <queues>
      {(xml \ "commands" \ "command").map(_ \@@ "queues").flatMap(_.seq.flatMap(_.split(",").seq)).distinct.map(queue)}
    </queues>

  def queue(name: String): Node =
    <queue name={name}></queue>

  def renderpasses(xml: Node): Node =
    <renderpasses>
      {(xml \ "commands" \ "command").flatMap(_ \@@ "renderpass").distinct.map(renderpass)}
    </renderpasses>

  def renderpass(name: String): Node =
    <renderpass name={name}></renderpass>

  def cmdbufferlevels(xml: Node): Node =
    <cmdbufferlevels>
      {(xml \ "commands" \ "command").map(_ \@@ "cmdbufferlevel").flatMap(_.seq.flatMap(_.split(",").seq)).distinct.map(queue)}
    </cmdbufferlevels>

  def cmdbufferlevel(name: String): Node =
    <cmdbufferlevel name={name}></cmdbufferlevel>

  def pipelines(xml: Node): Node =
    <pipelines>
      {(xml \ "commands" \ "command").flatMap(_ \@@ "pipeline").distinct.map(renderpass)}
    </pipelines>

  def pipeline(name: String): Node =
    <pipelines name={name}></pipelines>

  def commands(xml: Node): Node =
    <commands>
      {(xml \ "commands" \ "command").map(command(xml,_))}
    </commands>

  def command(xml: Node, command: Node): Node =
    <command>

    </command>

}
