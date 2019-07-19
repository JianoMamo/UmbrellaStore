package umbrellaStore

class SeaUmbrella(override var color: String,override var poleType: String, override var length: Double, override var width: Double,
                  override var price: Double, var weight: Double):
        AppliedUmbrellas, Umbrella("","",true,0.0,0.0,0.0) {


    fun howManyHumanAreNeededToTransferMe() {

        if (weight <= 7) println("You need one man to carry this")
        else if (weight > 7 && weight <= 20) println("You need three men to carry this umbrella")
        else println("You need a gorilla to carry this")

    }


}



