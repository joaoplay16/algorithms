fun numberOfSteps(num: Int): Int {
    var steps = 0
    var res = num
    while(res > 0){
        if(res % 2 ==0) res /= 2 else res -= 1
        steps++
    }
    return steps
}

fun main() {
    println(numberOfSteps(56))
}