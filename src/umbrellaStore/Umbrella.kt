package umbrellaStore

open class Umbrella(open var color: String,open var poleType: String, var isForRain: Boolean,
               open var length: Double,open var width: Double,open var price: Double): AppliedUmbrellas {

    override fun getElegant(): String {


        if ((color == "blue" || color == "red" || color == "yellow" || color == "purple"
                || color == "pink" || color == "orange" || color == "green") && poleType == "wood") {

            return "The umbrella is very elegant"
        }

        else {
            return "Not so elegant"
        }

    }
}