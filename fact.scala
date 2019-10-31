object fact extends App{
	
	def fact(x:Int) : Int = {
		x match{
			case 1 => 1
			case _ => x * fact(x-1)
		}
	}
	
	println(fact(args(1).toInt))
	
}