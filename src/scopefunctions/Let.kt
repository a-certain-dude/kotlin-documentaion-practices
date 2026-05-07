package scopefunctions
/*
Practice
Exercise 1
Rewrite the .getPriceInEuros() function as a single-expression function that uses safe
call operators ?. and the let scope function.
Hint
Use safe call operators ?. to safely access the priceInDollars property from the
getProductInfo() function.
Then, use the let scope function to convert the value of
priceInDollars into euros.
*/

data class ProductInfo(val priceInDollars: Double?)
class Product {
    fun getProductInfo(): ProductInfo? {
        return ProductInfo(100.0)
    }
}

// Rewrite this function
fun Product.getPriceInEuros(): Double? {
    val info = getProductInfo()
    if (info == null) return null
    val price = info.priceInDollars
    if (price == null) return null
    return convertToEuros(price)
}

// to this function single-expression function
fun Product.getPriceInEurosS(): Double? = getProductInfo()?.priceInDollars?.let { convertToEuros(it) }


fun Product.getPriceInEurosT() {
    val info = getProductInfo()
    val price = info?.priceInDollars
    val confirm = price?.let {
        convertToEuros(it)
    }
}


fun convertToEuros(dollars: Double): Double {
    return dollars * 0.85
}

fun main() {
    val product = Product()
    val priceInEuros = product.getPriceInEurosS()

    /* if (priceInEuros != null)
         println("Price in Euros: $priceInEuros")
     else
         println("Price info not available")
    */
    val check = priceInEuros?.let {
        println("Price in Euros: $it")
    }
    // check variable can be removed
}