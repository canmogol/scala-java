package com.fererlab.scala

class CustomerInitialsS(val name: String, val initials: String = "", val surname: String) {
  // caution, the if/else is an expression not a block, so they do return a value,
  // this time they return a string which is set to the "fullname" value!
  val fullname =
    if (initials != null && !initials.isEmpty)
      String.format("%s %s %s", name, initials, surname)
    else
      String.format("%s %s", name, surname)

  // we may use auxiliary constructor but we added a DEFAULT value to initials
  // in default constructor as empty string
  //  def this(name: String, surname: String) {
  //    this(name, "", surname)
  //  }
}
