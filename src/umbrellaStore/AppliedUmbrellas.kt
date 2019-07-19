package umbrellaStore

interface AppliedUmbrellas {

    fun coverMe(length:Double, width:Double): Double {


        return length * width
    }

    fun getElegant(): String {

       return ""
    }

}