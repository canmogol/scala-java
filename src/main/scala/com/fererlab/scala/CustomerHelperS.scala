package com.fererlab.scala


/**
  * this is the class definition and primary constructor,
  * primary constructor is designated as private which means that
  * we can only create this class using the companion object's apply method
  * which is basically a factory method
  *
  * @param name    String
  * @param address String
  */
class CustomerHelperS private(val name: String, val address: String) {
  /**
    * since the id field is a value, compiler will only generate the getter method
    * and id field is defined as private so the generated getter method will be private
    *
    * The CustomerHelperS class and CustomerHelperS object can see each others private fields/methods
    * If the CustomerHelperS object's name would be different from the CustomerHelperS class
    * then they wouldn't see each others private fields
    *
    */
  private val id = CustomerHelperS.nextId()
}


object CustomerHelperS {

  /**
    * factory method for CustomerHelperS class, creates a CustomerHelperS instance
    * the apply is a short hand notation for a class, it is kind of like a default method of a class
    * so if you don't call a method by name on an instance, but instead just match the arguments
    * of an apply method, it will call it for you
    *
    * @param name    String
    * @param address String
    * @return CustomerHelperS
    */
  def apply(name: String, address: String) = new CustomerHelperS(name, address)

  def main(args: Array[String]): Unit = {
    val customer1 = CustomerHelperS.apply("yoda", "Dagobah")
    val customer2 = CustomerHelperS("yoda", "Dagobah")
  }

  private var sequenceOfIds: Integer = 0

  private def nextId(): Integer = {
    sequenceOfIds += 1
    sequenceOfIds
  }
}