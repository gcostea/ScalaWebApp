package org.iasijug.scala.controllers

import java.util.ArrayList
import collection.JavaConversions._

trait Transformer
{
  def transformListUsing(list : ArrayList[String], func : (String) => String)
  {
    list.transform(func)
  }
}
