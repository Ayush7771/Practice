fun main(){
    val theDarkKnight = Comics(2, "Christian Bale", 1)
    println(theDarkKnight.getInfo())
    println(theDarkKnight.getIndiancost())
}

open class Book(val pages : Int, val author : String, val cost : Int){
    fun getInfo() : String{
        return "$pages $author $$cost"
    }
}

class Comics(pages: Int, author: String, cost: Int) : Book(pages, author, cost){
    fun getIndiancost() : Int{
        return cost * 95
    }
}