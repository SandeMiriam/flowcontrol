fun main(){
    oddNumber()
    var num=name(arrayOf("samina","shirlyne","sebby","floid","Terrus"))
println(num)
    drinks(4)
    drinks(10)
    drinks(21)
    multiples()

}
fun oddNumber(){
    for (number in 1..100){
        if(number % 2 !=0)
            println(number)
    }
}
fun name(names :Array<String>):Int{
    var num=0
    names.forEach{name->
        if (name.length > 5)
            num++
    }
    return num
}
fun drinks(age:Int){
    if (age<6)
    {
        println("glass milk")
    }
    else if (age<15 && age >6)
    {
        println("Fanta orange bottle")
    }
    else{
        (println("Cocacola bottle"))
    }
}
fun multiples (){
    for (number in 1..100)
    {
        if (number % 3 ==0 && number % 5 ==0)
            println("FizzBuzz")
        else if(number % 3 == 0)
            println("Fizz")
        else if (number % 5 ==0)
            println("Buzz")
        else println(number)


    }}
