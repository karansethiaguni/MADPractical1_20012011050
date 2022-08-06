fun main(){
    print("Enter operation\n")
    var op = readLine()!!.single()
    print("Enter numbers")
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    calculator(op,a,b)
}
fun calculator(op:Char,a:Int,b:Int){
    when(op){
        '+' -> print(a+b)
        '-' -> print(a-b)
        '*' -> print(a*b)
        '/' -> print(a/b)
    }
}