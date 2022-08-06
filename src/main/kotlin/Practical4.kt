fun main(){
    var x = readLine()!!.toInt()
    if(x > 0){
        println("Positive")
    }
    else{
        println("negative")
    }
    // Another syntax for if statement just for kotlin
    print(if (x > 0) "positive" else "negative")
}