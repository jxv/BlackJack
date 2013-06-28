object FaceCardFactory extends Enumeration {
	val TWO = CardFaceValue("2",2)
	val THREE = CardFaceValue("3",3)
	val FOUR = CardFaceValue("4",4)
	val FIVE = CardFaceValue("5",5)
	val SIX = CardFaceValue("6",6)
	val SEVEN = CardFaceValue("7",7)
	val EIGHT = CardFaceValue("8",8)
	val NINE = CardFaceValue("9",9)
	val TEN = CardFaceValue("10",10)
	val JACK = CardFaceValue("J",10)
	val QUEEN = CardFaceValue("Q",10)
	val KING = CardFaceValue("K",10)
	val ACE = CardFaceValue("A",11,1)
	def getCards = {
		Seq(ACE,TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING)
	}
}