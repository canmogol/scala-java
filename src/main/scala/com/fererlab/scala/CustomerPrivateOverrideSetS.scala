package com.fererlab.scala

class CustomerPrivateOverrideSetS(name: String, address: String) {
  // private var id = "" // changed to _id
  private var _id = ""

  /**
    * getter method for id field
    *
    * @return String id
    */
  def id(): String = _id

  /**
    * setter method for id field
    *
    * @param id String
    */
  def id_=(id: String): Unit = {
    if (_id.isEmpty) {
      this._id = id
    }
  }


  //  The method "def id_=(value: String): Unit" definition clashes with the compiler
  //  generated method "id_=()" we get an error of
  //  "ambiguous reference to overloaded definition" as below,
  //  therefore we need to change the field's name to _id and create a set get method for "id"
  //
  //  Error:(17, 12) ambiguous reference to overloaded definition,
  //  both method id_= in class CustomerPrivateOverrideSetS of type (value: String)Unit
  //    and  variable id in class CustomerPrivateOverrideSetS of type (x$1: String)Unit
  //  match argument types (String)
  //  this.id = value
  //  ^
  //
  //  def id_=(value: String): Unit = {
  //    if (id.isEmpty) {
  //      this.id = value
  //    }
  //  }

}
