object optional extends App{

	def divideby(x:Int, y:Int) : Option[Int] = {
		y match{
			case 0 => {
				println("cannot divide by zero...") 
				None
				}
			case _ => Some(x/y)
		}
	}
	
}