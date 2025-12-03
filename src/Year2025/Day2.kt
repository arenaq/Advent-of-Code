package Year2025

fun main() {
//    val input = "11-22,95-115,998-1012,1188511880-1188511890,222220-222224,1698522-1698528,446443-446449,38593856-38593862,565653-565659,824824821-824824827,2121212118-2121212124" // test input
    val input = "3737332285-3737422568,5858547751-5858626020,166911-236630,15329757-15423690,753995-801224,1-20,2180484-2259220,24-47,73630108-73867501,4052222-4199117,9226851880-9226945212,7337-24735,555454-591466,7777695646-7777817695,1070-2489,81504542-81618752,2584-6199,8857860-8922218,979959461-980003045,49-128,109907-161935,53514821-53703445,362278-509285,151-286,625491-681593,7715704912-7715863357,29210-60779,3287787-3395869,501-921,979760-1021259"
    val lines = input.split(",")
    var count = 0L
    lines.forEach { line ->
        val ranges = line.split("-")
        for (id in ranges[0].toLong()..ranges[1].toLong()) {
            val idString = id.toString()
            val length = idString.length
            val s1 = idString.substring(0, length / 2)
            val s2 = idString.substring(length / 2)
            if (s1 == s2) {
                count += id
            }

        }
    }
    println(count)
    count = 0
    // part 2
    lines.forEach { line ->
        val ranges = line.split("-")
        for (id in ranges[0].toLong()..ranges[1].toLong()) {
            val idString = id.toString()
            val length = idString.length
            // testing all possible ways to split a string to same sized chunks
            if (length == 2) {
                if (idString[0] == idString[1]) {
                    count += id
                    continue
                }
            }
            for (numberOfChunks in 2..length) {
                if (length % numberOfChunks > 0) continue
                // going through all chunks
                var invalid = true
                val chunkSize = length / numberOfChunks
                for (i in 0..numberOfChunks - 2) {
                    val chunk1 = idString.substring((i)*chunkSize, (i+1)*chunkSize)
                    val chunk2 = idString.substring((i+1)*chunkSize, (i+2)*chunkSize)
                    if (chunk1 != chunk2) {
                        invalid = false
                        break
                    }
                }
                if (invalid) {
                    count += id
                    break
                }
            }
        }
    }
    println(count)
}
