package org.iasijug.scala.controllers

import javax.inject.Named
import javax.enterprise.context.SessionScoped
import beans.BeanProperty
import javax.faces.event.ActionEvent
import java.util.ArrayList
import collection.JavaConversions._

@Named
@SessionScoped
class IndexBean extends Serializable with Transformer
{
  @BeanProperty
  var currentString : String = _
  @BeanProperty
  var strings = new ArrayList[String]

  def addToList(event : ActionEvent)
  {
    strings += currentString
    currentString = ""
  }

  def transformList1(event : ActionEvent)
  {
    transformListUsing(strings, x => x.toUpperCase)
  }

  def transformList2(event :ActionEvent)
  {
    transformListUsing(strings, x => x.reverse)
  }
}
