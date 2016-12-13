package com.fererlab.scala


class DiscountCustomerShoppingS(name: String, address: String)
  extends CustomerShoppingS(name, address) {
  override def total(): Double = super.total() * 0.90
}
