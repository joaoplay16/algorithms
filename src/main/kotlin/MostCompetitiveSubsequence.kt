
//fun mostCompetitive(nums: IntArray, k: Int): IntArray {
//
//}
fun main (){
    val array = intArrayOf(2,4,3,3,5,4,9,6)
    var min = array.minOrNull()!!

    for((index, n) in array.withIndex()){
        if(min <= index + 1 && index < array.size -1 ){
            println(n)
        }
    }
}