package Assignment


fun main(args:Array<String>){
    println("bac".isNice())
    println("aza".isNice())
    println("abaca".isNice())
    println("baaa".isNice())
    println("bbau".isNice())
}

fun String.isNice(): Boolean {
    val doesContainSubString =
            this.contains("bu",true) or this.contains("ba",true) or
                    this.contains("be",true)

    var vowelCount=0
    var freqCount=0

    this.forEachIndexed { index, c ->
        if(index+1<length && c==this[index+1]){
            freqCount++
        }
    }

    this.groupBy {
        it
    }.flatMap {
        if(it.key=='a'||it.key=='e'||it.key=='i'||it.key=='o'||it.key=='u'){
            vowelCount+=it.value.size
        }
        it.value
    }

    if((!doesContainSubString && vowelCount>=3)
            ||(vowelCount>=3 && freqCount>=1)
    || (!doesContainSubString && freqCount>=1)){
        return true
    }

    return false
}