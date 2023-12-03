package Year2023

import java.util.LinkedList

inline fun List<String>.getXY(lineIndex: Int, charIndex: Int) = this[lineIndex][charIndex]

fun main() {
    val input = ".............65..................998.........453...................................845..773.........................307....527...........541,............*..........125.......*...331......*.....................30.76......./...*....*..861.......*.........298*......*.........700.....,................942.......*...874...*......407...558............752......*196.274.240.345...*.....-..105...................164...........466,....+............&.....593...........516............-....=.....*....74.....................377..157................128...........175*.......,....314.750......................497...........258.....549...70.....*....745.....289*418.................351........../..............839....,..........*.......786......283......*366..........*...............899.....*......................652.......@...219..........................,........468..=249..........*..........................866.797*960..........234.......252-.686.......=............\$...................&......,..386.............582....681...52....\$369.+.......969..+........................276........*.................873.....824.......%627..51..25.,.....-......835..@....*....................101.......*.......444...........587...*..33....847...............&.......=.......................,...........*.......513.45.125......................883.......*...............=.988.\$.............962.*595.....................*....674.534..,........180.........................891*129..957...........+.584......................291*59..71*..................../.....707.646....*.....,...................=530.....................*.......610..790........314...\$....991..................231*926....29..870.264..................,......132-..............#..............\$....93.........*...............*...537...\$.139..........70...............&.....................131..,...36.......#.514%.......99..684.......21.........852.886../...191.....892...........*....456..-.....172...../..............................,.....*...508................&......615...........\$.........964....*...................627...............*242.945..........457.....512..880..,.....211.............430...........*.......%..........702.........243..747.......506................24.......................*873....*......,.........................988..570........-..72....726*.................-........=.....340............*.555....526......................&....,........&..........#928....&../.......785..............971..585......................+............860....%...#..........628.....=....952....,..165..541......................822........930.........*...%............*737..................940..............#561......=...=..685.........,....+...........248..-...40...................*521....897............698.................................558...............52........-......,..................*...19..%...........674.....................110.........................*296.............*...........78#.........495......,................753.....................*..............@.....#....199......353.604.....737.......483.366....242....720......................,...407....973#...............352.........397............144......*............*............799....%..................#....845.......539.....,......*................*........*..............643............443..726....=......*939..439*.....*....478\$.....#.............-........-......,...165.........3....599.943..840..424..268.389...*..........=.........*83.827.318............135.55........924..535*...........%............,.......163........@...............*..........+..688.......529.........................858............137............681.347...187...........,...541....*.299.340.....@..+645.492...................................#....830*.................897.*.......782\$...................352......,........740.%........549..............500...-..899......671=.807.....334.......313...26........+....366.701.............330........*........,....125.....................928../......@..243...................225......182........=..................*................&.......346........,......%....814.665.........*......573.....................69.......%.........*484.................+...64.........910.........273.....450....,...............*...........383.........433.................*...........#22...........62..#569....396........736.....*708.......&....*.......,.383.........774......................*.....#............&..265.............812......*...............305*....*...................657........,.....467.392.......936...806.......373...929...463....484.............337....%...415..465.@..............154..326...........................,....../..*.....+.......=....*.....................*........517*24.-.................*.....297.......................................*.......,..........599..820.....342.438...........482...200................49..........-312..847.............548...\$.....581..909.........879.616....,............................................&................&475........................528...578....@..211......*....%....791.............,..............802..............250....................................*229........923......#.....*.................635......................,552......762..#...................\$..%......940......651...........461........900*.............654...673....................*437..993.......,..........\$.............52............602......%........*...105..\$.................938...431.............................157......#...310...,...581../...............\$.........309.......*...........846.../..718..........568@..*.......*...261...............22.........-852......*....,......*.969.349..354.....................156.666....@................-378..-................632....*..........363*........./......976.871...,.....60.....*.......*....10...@..684#..............225....248.............904..........638\$......896....%.................906.926...*.......,.............602.....958.....103..........703..........................\$.........456.........704.........149...785.2=...........*.87...95...,....228..589.................................*...770..588...........411..902..................................................645...........,.......*....*...135.......*...909.857.207-.602.....*.....*......=.........*..........358..............535......*................../235......,.....126..747............513..*.....\$...........125.....389..956.....164...797........*.....807..34......%..754.734.....140..............969,.................919*213.....232............530..................583...................986....*...*.................186...=.%881..859.......,...937......881..........774......*345.......*......894#...644*.....\$....588.................520..323..218...%...../..................#.....,.....-.401.*.......359.....*....19.........728.................670.................674.511*...........*......580........203%.........470....,........*..610......-.......836.....299.........832..........................690...........528.......21.....................................,......991......#.......365................447....#...857...227.605.........%.-...599.........................*602...529...........10........,..........+471..443.....+................*..........*......=......*252..417.....*.....653.............412.727.......*.....634.304.*.....42..,.....494......................&...........552.....852...................................*....550*520............80.174.............437......,......-.....+...536.........\$..969............519.......448........251..............\$...794.....................*.........701...............,..373.....930.....*......298.............76+.....*...@.....*......*................856......@899..............96..40......*.......574.......,.....*........518..575...........957.112.......479.579....288..306...+.......\$817........................785.....*...9.......127..#...=907..,...698.......*..........329.....\$....*......92........................203..........168.....................*..346....*..........*...........,.......470........68/..............263.....*.........337..................433............................666........92......20..784..978*194,.........%................465-.............297..............193.259.............................................17.........*................,.............*.................................................*.......*............580.......763.......@.........*747....519....628..647...,......900.....261..........722.553.....284*513......*429..............155....&....\$....%..914...*......468.......................\$......*...,........#........................................932......413....414......829.....528.......+...527................382...835...........744..,....918......103*37..207...676.297........422..............*........*993................140...................945.#.......*...686...........,.......................\$.../...*......423....*..459=...&....602..........................................................978..*.............,.........&........414.........41.........*..673......543..........848*276.......388%..792...*....700*152......596/....*........791...%...485,.....615..55.........+......+........%.859...............@363..........................*..858.........................556............748....,......../....................775..467..........700..............*492.....\$..862.......266..........319............88..........724........291,........................942.............530....*.....#.259...872........157./...287...........#687..*..../...........438\$........*..233.....,............../...641........534.546...+......802.847.....*........................*...................13.......................677..*......,....604.......158........818....*.........................947................24....516.......&...332...........573...................697....,...%....2................*............/..........................162....27.....\$.......#860.284.....*540..309...+...........................,........................678........337........105.469.......49.....................641.....................*......644\$..............128.....,.....................%..................386.............203*.....497.404.............................795..................670.........*.....,....+..............369......814.........#.......359...........-.....*.......+.......41...........353....*263.........-.........700....102...,...862......430........=.....*............*682..............195.456..........379......+...........*..........790...987......................,....................565................689......................*...296.........................599..689.829...*..............\$....910......,513......721.................................645*343.105........1....*..............=349.............&.....%...785..........832../...*......,........=............50*15..............272............*....242...306...........................................................159.59......,..............190...............88#.%.........229......310....#.......330...........149*.........89.......333.....771.....701..........522..,....354.........+....................561........*..........73.....336*....\$40..906......16.........-.......+.......*........*...563....*....,.......*.............948..844......#.......556...51.........*......................=...........744.....361...\$.....15.644=..9...........686.,........535.796.....*......#......907.........%......286...918....714..............688.232.................51......................284......,............*........755................@255.........*...........*......=.292............./.........453.........913................\$....810.,............354...................................361..406*802...112..461............162.....\$......=......991/./........&..................,.......+............#892.......654/....705..........................................*........385.........................506....*506........,.444/.482.................................*.....................619.....19*239.....187.993......................*............718........884.,..............906.182..473............/..58...407.591.583...=.....%......................*.......\$......1....310.196....................*...,......820@......%....@.%.........343..61........*.......-.663.............490.....209..921....288.......*..............484...956.........324,...+.........................189*.............963...878.......782..955....%..........*................72...........406*......*....-.........,...188......861....239.818..........................*.................*......7....892.............705....197.20*..........204......429......,........*....*......./....#............*236.425*147..816..............739.....*........%..../.....*.............473...455...................,.....718.939..679........................................182.281@...........597.......360..324.161.......8*671...............971............,....................+318.698*778..691......648*806..387\$../..............*......174/................+133............25......................,.............620*..................*...986...............................587.....................................15......264%..128.....998..,.......%436......267..557%..#827.......................746%.48.411*309.............+.....547......-.............*.................*....*....,..690..........#.................724....*.....772...........+..........787........462...+........89.#777.....794...-.........120.662....429.,....&....\$575.874........450.379...%.120.944.....*....10......378*888.%..........................................542........................,..................388.....+.....*..............108........243..............468...........363......132....-....&...............*....391......,.....*.............%....\$.....554.494....784.........310.&............458...%........753*..............217...174..23*108...853.233...*......,..636.425....343.........455........\$........87........*.................-........%..............823.....................-...........898....,................*728.747.......770.......913.*....855.159.....&618...*.............779...94-..........375/.318*410...324.209................,........................*399......*.......=...905.*.......24........192.......760................785...................#...............468..,.......674.414....108/.......498..443.............660.......*................*....................*....980..................................,.462.........*..............................654..............669...........427......\$..............14..*...921.......897.............862....,...@.......292..370....751....639....................403..............74.......537.504.130.............779..&....89..*....615.423.%....*....,...............+..........*........958......23...160./..................*228.....*........*....66.....................378....*....735.......,......#...............&68.584..125.\$....898..+....*.........130.................927.....75......*....613....414.............................,....909..968...................\$.....=...#......@.935..............966.......................374.......*.....*...&......73.......*611.=888..,............*231...................93.........157..............252..%..900.869...269................550...352..123......*...7.888...........,.......833%..............277%.+860............................*...........*......*............973....................697...#........765..153,..............920@..569.........................499................44..........36....................406.98...+..295..........94*....@......,.....28...............*.413......-333......984.*............984...........878.............*.................958.....*43...829....746........,......*............320...@...799.......696..\$..211...%.......+.........%...*......232\$.915.....209...........................*........510...,.......429.....................*........\$...........624.736..........342....960..................*..................186....402..............,....16.........838*............477....&...................%...............................977..996..........255.212.........................,245........88......209.................283.920*456...............410.............\$353.....%....................*....................846.....,.......699..*....................................................*...580......................659*......=..................184....#..#......,..890...*...485..........=......................................16...*......589...................754.802........485..%...-......784...+....,.......28.........303....405.@442.......768......476..273*961......843.....*.....161....813.....................*....470..............111...,.............#...*...........................303.*..........................255.+........&.......326*309.+814.469..............5............,....208.....910.514..148..261..334.......\$...*...674..597..........................*439......36.....................=876...468*.............,....*....*..........*........*...@.....205...525.....*.....863..190.......115................./..@..+17......731................626.....&...,..984....994.......396.......587....................558....*..............................112...364.........................599*.......824..,......./...............................................................935*56........146................#......%............................,.......563..................896....216*192.......................588...........423......*......657...894..678...57............&.....813*....,............#......186.-....*...................796.916........./..........810...*...532..........@.......*........394.......885........871.,..../.......484...*....101.208........%..42........*......623.....*592.....*.....572.......545.........677.....*...*........................,.479....25........535...............627..*...........652.....+.808.......926.522............*...............671.33.499.............514......,..........*............951*472............215.......*.....................................451.....152...........................58...%...903,..........178.....=....................64......22.244...898.................514.......460........-......947..........823....368...%.........,...................120.....=.....289...*........*.......................723..../...........................*....368.................349..304,..........................402...........914..707.............630/...*.............................419.....654......*..............*.....*...,......981.131....809*755...........318*.............248...........#.195........338..........23....*...............395..223.....626.498.681..,.....*.....................+.271.......457.........*......384...633.......#.....*...638..46........144........@...........*.................,...915....................14../..............595..806......*...............523.603..&....*....................165.824.....789.....347\$......,.................*47.............761.265.150................967........565............=...296......-..............*...........671......379..,..............967......./.&197......*.........=.....................&................660..........292.............993...........=..581..#...,......................279........+.........755........@..............712..........*...................827....../...................*........,...........\$.....*................115..................400................=......1.292..@602..=.................321..............728........,..579..410..3..44.291..........................538..................148....873.................461....................................722..."
    val lines = input.split(",")
    val numbers = LinkedList<Number>()
    for ((lineIndex, line) in lines.withIndex()) { // 467..114..
        var number = ""
        for ((charIndex, char) in line.withIndex()) {
            if (char.isDigit()) {
                number += char
            }
            if (!char.isDigit() || charIndex == line.length - 1) {
                if (number.isNotEmpty()) {
                    val startIndex = if (char.isDigit() && charIndex == line.length - 1) charIndex - number.length + 1 else charIndex - number.length
                    numbers.add(Number(
                        number,
                        Position(
                            lineIndex,
                            startIndex,
                        ),
                    ))
                    number = ""
                }
            }
        }
    }
    var sum = 0L
    val symbols = HashMap<String, LinkedList<String>>()
    for (number in numbers) {
        val positionsToCheck = LinkedList<Position>()
        val previousCharIndex = number.position.charIndex - 1
        val nextCharIndex = number.position.charIndex + number.value.length
        // same line
        addPoint(number.position.lineIndex, previousCharIndex, lines, positionsToCheck)
        addPoint(number.position.lineIndex, nextCharIndex, lines, positionsToCheck)
        // previous and next line
        val previousLineIndex = number.position.lineIndex - 1
        for (i in previousCharIndex..nextCharIndex) {
            addPoint(previousLineIndex, i, lines, positionsToCheck)
        }
        val nextLineIndex = number.position.lineIndex + 1
        for (i in previousCharIndex..nextCharIndex) {
            addPoint(nextLineIndex, i, lines, positionsToCheck)
        }
        // check positions
        var isPartNumber = false
        for (position in positionsToCheck) {
            val char = lines.getXY(position.lineIndex, position.charIndex)
            if (!char.isDigit() && char != '.') {
                isPartNumber = true
                val pos = position.lineIndex.toString() + "|" + position.charIndex.toString()
                val list = symbols[pos] ?: LinkedList()
                list.add(number.value)
                symbols[pos] = list
            }
        }
        if (isPartNumber) {
            sum += number.value.toInt()
        }
    }
    println(sum)
    sum = 0L
    for (list in symbols.values) {
        if (list.size == 2) {
            sum += list[0].toInt() * list[1].toInt()
        }
    }
    println(sum)
}

fun addPoint(lineIndex: Int, charIndex: Int, lines: List<String>, positionsToCheck: LinkedList<Position>) {
    if (lineIndex >= 0 && lineIndex < lines.size && charIndex >= 0 && charIndex < lines[lineIndex].length) {
        positionsToCheck.add(Position(lineIndex, charIndex))
    }
}

data class Number(
    val value: String,
    val position: Position,
)

data class Position(
    val lineIndex: Int,
    val charIndex: Int,
)