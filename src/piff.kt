fun main() {
    piffv1()
    println()
    piffv2()
}

fun piffv1() {
    for(i in 0..100){
        if(i % 3 == 0){
            println("Piff")
        }else if(i % 5 == 0){
            println("Paff")
        }
    }
}

fun piffv2(){
    var i = 0
    while (i <= 100){
        when {
            i % 3 == 0 -> println("Piff")
            i % 5 == 0 -> println("Paff")
        }
        i++
    }
}