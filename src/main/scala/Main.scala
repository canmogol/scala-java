import java.util.logging.Level

import com.fererlab.java.{LoggerJ, CustomerInitialsJ}
import com.fererlab.scala._

object Main {

  def main(args: Array[String]): Unit = {
    customerId()
    customerPrivateId()
    customerInitials()

    logger()
  }

  def customerId(): Unit = {
    val customerScala: CustomerS = new CustomerS("Yoda", "Dagobah")

    /**
      * CustomerS class byte code has two methods for "id" field
      * setter method public void id_$eq(String id) {this.id = id;}
      * and a getter method public String id() {return this.id;}
      */
    customerScala.id_=("001") // this is the set method's signature which is "_=" translates to byte code as "_$eq"
    customerScala.id = "002" // this calls the "_$eq"
    println(customerScala.id) // and that calls the id() getter method
  }

  def customerPrivateId(): Unit = {
    val customerScala: CustomerPrivateS = new CustomerPrivateS("Yoda", "Dagobah")

    /**
      * we cannot set id as 'customerScala.id = "001"' because the id field is private
      * compiler generates private setter and getter for that field
      * private String id(){return this.id;}
      * private void id_$eq(String id) {this.id = id;}
      */

  }

  def customerPrivateOverrideSetId(): Unit = {
    val customer: CustomerPrivateOverrideSetS = new CustomerPrivateOverrideSetS("Yoda", "Dagobah")
  }

  def customerInitials(): Unit = {
    val customerJ: CustomerInitialsJ = new CustomerInitialsJ("Yoda", "Master")
    // here the parameter name given for the surname! so the intermediate "initials" parameter get the default value
    val customerS: CustomerInitialsS = new CustomerInitialsS("Yoda", surname = "Master")
  }

  def logger():Unit = {
    LoggerJ.getInstance.log(Level.SEVERE, "holly cow")
    LoggerS.log(Level.SEVERE, "Holly cow")
  }
}
