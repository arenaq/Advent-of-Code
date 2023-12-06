package Year2023

fun main() {
    val input = "Time: 56 97 77 93,Distance: 499 2210 1097 1440"
//    val input = "Time: 7 15 30,Distance: 9 40 200"
    val lines = input.split(",")
    val raceTimes = lines[0].split(": ")[1].split(" ").map { it.toInt() }
    val recordDistances = lines[1].split(": ")[1].split(" ").map { it.toInt() }
    var part1 = 1
    for (raceNumber in raceTimes.indices) {
        var numberOfWays = 0
        val raceLimit = raceTimes[raceNumber]
        val raceRecord = recordDistances[raceNumber]
        for (secToHold in 1..<raceLimit) {
            val distance = secToHold * (raceLimit - secToHold)
            if (distance > raceRecord) {
                numberOfWays++
            }
        }
        part1 *= numberOfWays
    }
    println(part1)
}