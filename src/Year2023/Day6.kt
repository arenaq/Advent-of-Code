package Year2023

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

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
    // part 2
    val raceTime = lines[0].split(": ")[1].replace(" ", "").toLong() // = T
    val raceRecord = lines[1].split(": ")[1].replace(" ", "").toLong() // = R
    var numberOfWays = 0L
    for (secToHold in 1..<raceTime) {
        val distance = secToHold * (raceTime - secToHold)
        if (distance > raceRecord) {
            numberOfWays++
        }
    }
    println(numberOfWays)
    /**
     * ax^2 - bx + c < 0, D = b^2 - 4ac, x1,2 = 1/2 * ((-b) +- (D)^(1/2))
     *  =>
     * ax^2 - Tx + R < 0, D = T^2 - 4R, x1,2 = 1/2 * ((-T) +- (D)^(1/2))
     *  =>
     * numberOfWays = x2 - x1 + 1
     *  =>
     * numberOfWays = (1/2 * (-T + (T^2 -4R)^(1/2))) - (1/2 * (-T - (T^2 -4R)^(1/2)))
     */
    val T = raceTime.toDouble()
    val R = raceRecord.toDouble()
    numberOfWays = (floor(1.0/2.0 * (-T + sqrt((T*T - 4*R)))) - ceil(1.0/2.0 * (-T - sqrt(T*T - 4*R))) + 1).toLong() // x2 - x1 + 1
    println(numberOfWays)
}