package umbrellaStore



    fun findTheHighestPriceUmbrella(store: Store): Pair<Double,Double> {

        var startingHighPriceUmbrella = -1.0
        var startHighPriceSeaUmbrella = -1.0


        for (i in 0 until store.umbrellaList.size) {

            val currentUmbrella = store.umbrellaList[i].price

            if (currentUmbrella > startingHighPriceUmbrella) {

                startingHighPriceUmbrella = currentUmbrella
            }
        }


        for (i in 0 until store.seaUmbrellaList.size) {

            val currentSeaUmbrellaPrice = store.seaUmbrellaList[i].price

            if (currentSeaUmbrellaPrice > startHighPriceSeaUmbrella) {

                startHighPriceSeaUmbrella = currentSeaUmbrellaPrice
            }
        }

        return Pair(startingHighPriceUmbrella,startHighPriceSeaUmbrella)
    }



    fun findTheLowestPriceUmbrella(store: Store): Pair<Double,Double> {

        var startLowPriceUmbrella = 10000.0
        var startLowPriceSeaUmbrella = 10000.0


        for (i in 0 until store.umbrellaList.size) {

            val currentUmbrellaLowPrice = store.umbrellaList[i].price

            if (currentUmbrellaLowPrice < startLowPriceUmbrella) {

                startLowPriceUmbrella = currentUmbrellaLowPrice
            }
        }


        for(i in 0 until store.seaUmbrellaList.size) {

            val currentSeaUmbrellaLowPrice = store.seaUmbrellaList[i].price

            if (currentSeaUmbrellaLowPrice < startLowPriceSeaUmbrella ) {

                startLowPriceSeaUmbrella = currentSeaUmbrellaLowPrice
            }
        }

        return Pair(startLowPriceUmbrella,startLowPriceSeaUmbrella)

    }

    fun findTheBiggestUmbrella(store: Store): Pair<Double,Double> {

        var startBiggestSizeUmbrella = -1.0
        var startBiggestSizeSeaUmbrella = -1.0

        for (i in 0 until store.umbrellaList.size) {

            val currentSizeUmbrella = store.umbrellaList[i].coverMe(store.umbrellaList[i].length, store.umbrellaList[i].width)

            if (currentSizeUmbrella > startBiggestSizeUmbrella) {

                startBiggestSizeUmbrella = currentSizeUmbrella

            }
        }

         for (i in 0 until store.seaUmbrellaList.size) {

             val currentSizeSeaUmbrella = store.seaUmbrellaList[i].coverMe(store.seaUmbrellaList[i].length,store.seaUmbrellaList[i].width)

             if (currentSizeSeaUmbrella > startBiggestSizeSeaUmbrella)

                 startBiggestSizeSeaUmbrella = currentSizeSeaUmbrella
         }

        return Pair(startBiggestSizeUmbrella,startBiggestSizeSeaUmbrella)
    }


    fun findTheSmallestUmbrella(store:Store) : Double {

        var smallSizeUmbrella = 100.0

        for (i in 0 until store.seaUmbrellaList.size) {

            val currentSizeUmbrella = store.seaUmbrellaList[i].coverMe(store.seaUmbrellaList[i].length,store.seaUmbrellaList[i].width)

            if (currentSizeUmbrella < smallSizeUmbrella) {

                smallSizeUmbrella = currentSizeUmbrella

            }

        }

        return smallSizeUmbrella
    }


    fun sumOfAllUmbrellas(store: Store): Triple<Double,Double,Double> {

        var sumUmbrella = 0.0
        var sumSeaUmbrella = 0.0

        for (i in 0 until store.umbrellaList.size) {

            val currentUmbrella = store.umbrellaList[i].price
            sumUmbrella += currentUmbrella

        }

        for (i in 0 until store.seaUmbrellaList.size) {

            val currentSeaUmbrella = store.seaUmbrellaList[i].price
            sumSeaUmbrella += currentSeaUmbrella

        }

        return Triple(sumUmbrella,sumSeaUmbrella,sumUmbrella + sumSeaUmbrella)

    }


    fun main() {

        val umbrella1 = Umbrella("red", "wood", true, 1.5, 2.1, 11.99)
        val umbrella2 = Umbrella("yellow", "plastic", false, 4.5, 5.5, 23.99)
        val umbrella3 = Umbrella("black", "wood", false, 0.5, 1.7, 9.49)
        val umbrella4 = Umbrella("pink", "wood", true, 1.4, 1.8, 4.59)
        val umbrella5 = Umbrella("gray", "metal", true, 0.8, 0.9, 9.99)
        val umbrella6 = Umbrella("green", "metal", false, 2.4, 2.5, 13.99)
        val umbrella7 = Umbrella("red", "plastic", false, 3.6, 1.5, 17.99)
        val umbrella8 = Umbrella("blue", "wood", false, 0.7, 0.4, 3.99)


        val seaUmbrella1 = SeaUmbrella("rose", "plastic",2.7, 2.1, 5.99,10.25)
        val seaUmbrella2 = SeaUmbrella("purple", "metal",3.1, 5.5, 8.99, 20.54)
        val seaUmbrella3 = SeaUmbrella("sky", "wood",0.8, 1.7, 9.99,4.65)
        val seaUmbrella4 = SeaUmbrella("yellow", "metal",1.8, 1.8, 13.99, 8.95)
        val seaUmbrella5 = SeaUmbrella("nightblue", "wood",0.5, 0.9, 19.99, 3.15)
        val seaUmbrella6 = SeaUmbrella("sunny", "wood",4.8, 4.7, 29.99,14.65)
        val seaUmbrella7 = SeaUmbrella("white", "metal",2.8, 1.5, 15.99, 14.95)
        val seaUmbrella8 = SeaUmbrella("nightblue", "wood",2.5, 2.9, 9.99, 10.15)

        val storeUmbrellas = Store("08:00 - 21:00", "Umbrella e la e la", mutableListOf(umbrella1, umbrella2, umbrella3, umbrella4, umbrella5),mutableListOf(seaUmbrella1,seaUmbrella2,seaUmbrella3,seaUmbrella4,seaUmbrella5))

        val storeUmbrellas2 = Store("09:00 - 21:00","Um Bre Lla", mutableListOf(umbrella6,umbrella7,umbrella8), mutableListOf(seaUmbrella6,seaUmbrella7,seaUmbrella8))


        println(findTheHighestPriceUmbrella(storeUmbrellas).first)

        println(findTheHighestPriceUmbrella(storeUmbrellas).second)

        println(findTheLowestPriceUmbrella(storeUmbrellas).first)

        println(findTheLowestPriceUmbrella(storeUmbrellas).second)

        println(findTheBiggestUmbrella(storeUmbrellas).first)

        println(findTheBiggestUmbrella(storeUmbrellas).second)

        println(findTheSmallestUmbrella(storeUmbrellas))

        println(sumOfAllUmbrellas(storeUmbrellas))

        println(seaUmbrella2.howManyHumanAreNeededToTransferMe())

        if((storeUmbrellas.umbrellaList.size > storeUmbrellas2.umbrellaList.size) && (storeUmbrellas.seaUmbrellaList.size > storeUmbrellas2.seaUmbrellaList.size))
            println("The first store has more umbrellas than the second one") else println("The second store has more umbrellas than the first one")

        println(sumOfAllUmbrellas(storeUmbrellas).third)
        println(sumOfAllUmbrellas(storeUmbrellas2).third)

        val differenceOfPriceBetweenTwoStores = sumOfAllUmbrellas(storeUmbrellas).third - sumOfAllUmbrellas(storeUmbrellas2).third
        println(differenceOfPriceBetweenTwoStores)

    }
