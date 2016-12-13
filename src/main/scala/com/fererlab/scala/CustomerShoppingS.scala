package com.fererlab.scala

import scala.collection.mutable.ListBuffer


class CustomerShoppingS(val name: String, val address: String) {

  val basket: ShoppingBasket = new ShoppingBasket()

  def add(item: Item): Unit = {
    basket.add(item)
  }

  def total(): Double = {
    basket.value()
  }

}

class ShoppingBasket {
  val items:ListBuffer[Item] = new ListBuffer[Item]

  def add(item:Item):Unit = {
    this.items += item
  }

  def value():Double = {
    items.map(item=>item.value).sum
  }

}

class Item(val name:String, val value:Double) {
}