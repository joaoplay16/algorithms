
fun maximumWealth(accounts: Array<IntArray>): Int {
    var max = 0

    for( i in accounts){
        var sum = 0 // defined here to improve performance
        for (j in i ){
            sum += j
            if(sum > max) max = sum
        }
    }
    return max
}

fun main(){
    println(maximumWealth(arrayOf(intArrayOf(1,2,3), intArrayOf(3,2,1))))
}