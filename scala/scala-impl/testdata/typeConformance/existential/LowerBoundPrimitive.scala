trait Foo[X]
trait TInt extends Foo[Int]
trait TDouble extends Foo[Double]
trait TLong extends Foo[Long]
val myType: Foo[_ >: Int with Long with Double] = 1 match {
  case 1 => null.asInstanceOf[TInt]
  case 2 => null.asInstanceOf[TLong]
  case 3 => null.asInstanceOf[TDouble]
}
//true