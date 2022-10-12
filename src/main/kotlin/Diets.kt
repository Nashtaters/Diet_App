class Diets {
    val LOW_CAL_DIET_STR = "Low Calorie Diet"
    val LOW_CARB_DIET_STR = "Low Carb Diet"

    val lowCalDietList = listOf("Low Calorie Diet", "Intermittent Fasting", "Cookie Diet")
    val lowCarbDietList = listOf("Low Carb Diet", "Atkins Diet", "Keto Diet")

    val lowCalBadList = listOf("Starches", "Sugar", "Fat", "Anything that tastes good")
    val lowCalGoodList = listOf("Fruits", "Vegetables")
    val fastBadList = listOf("Any foods for an extended period of time")
    val fastGoodList = listOf("Any food after an extended period of time")
    val cookieBadList = listOf("Everything but our special formulated cookie")
    val cookieGoodList = listOf("Our special formulated cookie")
    val lowCarbBadList = listOf("Bread", "Grains", "High Sugar Fruits", "Starches", "Carbs")
    val lowCarbGoodList = listOf("Vegetables", "Lean Meats", "Fish", "Legumes", "Oils")
    val atkinsBadList = listOf("Processed Meats", "Other Processed Food")
    val atkinsGoodList = listOf("Fish", "Nuts", "Olive Oil", "Fresh Fruit", "Whole Grains")
    val ketoBadList = listOf("Grains", "Starches", "Sweetened Yogurt", "Juices", "Sugar", "Chips", "Crackers", "Baked Goods")
    val ketoGoodList = listOf("Meat", "Fish", "Fats", "Eggs", "Cheese", "Plain Greek Yogurt", "Vegetables")

    val LOW_CAL_DIET = 1
    val LOW_CARB_DIET = 2
    val SICK_DIET = 3
    val LOW_CAL_GENERAL_DIET = 4
    val INTERMITTENT_DIET = 5
    val COOKIE_DIET = 6
    val LOW_CARB_GENERAL_DIET = 7
    val ATKINS_DIET = 8
    val KETO_DIET = 9

    fun selectSubDiet(typeOfDiet: Int, dietName: String) {
        var subDietList = listOf("")

        if (typeOfDiet == LOW_CAL_DIET) {
            subDietList = lowCalDietList
        }
        else if (typeOfDiet == LOW_CARB_DIET) {
            subDietList = lowCarbDietList
        }

        println("Which following " + dietName + " diet would you like?")
        println("")
        println("1. " + subDietList[0])
        println("2. " + subDietList[1])
        println("3. " + subDietList[2])
        val inputStr = readLine()
        var input = Integer.parseInt(inputStr)
        var badSubList = listOf("")
        var goodSubList = listOf("")

        if (typeOfDiet == LOW_CAL_DIET) {
            if (input == 1) {
                badSubList = lowCalBadList
                goodSubList = lowCalGoodList
            }
            else if (input == 2) {
                badSubList = fastBadList
                goodSubList = fastGoodList
            }
            else if (input == 3) {
                badSubList = cookieBadList
                goodSubList = cookieGoodList
            }
        }
        else if (typeOfDiet == LOW_CARB_DIET) {
            if (input == 1) {
                badSubList = lowCarbBadList
                goodSubList = lowCarbGoodList
            }
            else if (input == 2) {
                badSubList = atkinsBadList
                goodSubList = atkinsGoodList
            }
            else if (input == 3) {
                badSubList = ketoBadList
                goodSubList = ketoGoodList
            }
        }

        printList(badSubList, goodSubList)

    }

    fun printList(badFoodList: List<String>, goodFoodList: List<String>) {
        println("Avoid these foods: ")
        badFoodList.forEach {
            println(it)
        }
        println("")
        println("Load up on these foods: ")
        goodFoodList.forEach {
            println(it)
        }
    }

    fun selectDiet() {
        println("Which following diet would you like?")
        println("")
        println("1. Low Calorie Diets")
        println("2. Low Carb Diets")
        println("3. I Feel Sick")
        val inputStr = readLine()
        var input = Integer.parseInt(inputStr)

        when (input) {
            1 -> selectSubDiet(LOW_CAL_DIET, LOW_CAL_DIET_STR)
            2 -> selectSubDiet(LOW_CARB_DIET, LOW_CARB_DIET_STR)
            3 -> printSickDiet()
            else -> printErrorMessage()
        }
    }

    fun run() {
        println("Welcome to my diet app")
        selectDiet()
    }

    fun printErrorMessage() {
        println("Please enter a valid number.")
    }

    fun printSickDiet() {
        println("Avoid these foods: Fatty and greasy foods, anything hearty.")
        println("Load up on these foods: Bananas, rice, applesauce, toast")
    }

}
