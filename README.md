# Scala Java
Scala for java developers, examples project

### Setters/Getters

- For a field defined as val not a var
```scala
val id = ""
```
the compiler will only create getter

- For a field defined as var not a val
```scala
var id = ""
```
in a class, compiler will generate a getter method with signature
```scala
def id():String
```
and a setter method with signature
```scala
def id_$eq(value:String)
```

an example usage:
```scala
customer.id_=("001") // this is the set method's signature which is "_=" translates to byte code as "_$eq"
customer.id = "002" // this calls the "_$eq"
customer.id // and that calls the id() getter method
```

- For a field defined as private val or var
```scala
private val id = ""
```
compiler generates setter and getter methods as private.

Please find how to override these methods in (CustomerPrivateOverrideSetS)[https://github
.com/canmogol/scala-java/blob/master/src/main/scala/com/fererlab/scala/CustomerPrivateOverrideSetS.scala] class

### Singleton

Scala has "object" not static definition,
Logger is an object and equivalent of java static
```scala
object Logger {
  def method(){
    print("it would be a static method in java")
  }
}
```

### Companion Object
In scala there may be a companion object to a class
```scala
class Customer{}
object Customer{}
```
these two may see each other's private fields and methods.

Also companion objects may contain an "apply" method
which can be used as a constructor/factory method.

Below example is a scala class "Customer" with a private constructor
and a Companion object Customer with an apply method,
a use case can be seen in Main::main example
```scala
class Customer private(val name:String){}
object Customer{
  def apply(name:String):Customer = {
    new Customer(name)
  }
}
object Main{
  def main(args:Array[String]):Unit = {
    val customer:Customer = Customer("yoda")
  }
}

```