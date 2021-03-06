package Year2016;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.function.Consumer;

/**
 * Created by arenaq on 04.12.2016.
 */
public class Day2 {
    static class Key {
        String name;
        Key up, left, right, down;
        Key(String name) {
            this.name = name;
            up = left = right = down = this;
        }
    }

    static Key position;
    static String result = "";

    static void initKeyPad1() {
        Key KEYPAD_1 = new Key("1");
        Key KEYPAD_2 = new Key("2");
        Key KEYPAD_3 = new Key("3");
        Key KEYPAD_4 = new Key("4");
        Key KEYPAD_5 = new Key("5");
        Key KEYPAD_6 = new Key("6");
        Key KEYPAD_7 = new Key("7");
        Key KEYPAD_8 = new Key("8");
        Key KEYPAD_9 = new Key("9");

        KEYPAD_1.right = KEYPAD_2;
        KEYPAD_1.down = KEYPAD_4;

        KEYPAD_3.left = KEYPAD_2;
        KEYPAD_3.down = KEYPAD_6;

        KEYPAD_9.up = KEYPAD_6;
        KEYPAD_9.left = KEYPAD_8;

        KEYPAD_7.up = KEYPAD_4;
        KEYPAD_7.right = KEYPAD_8;

        KEYPAD_2.right = KEYPAD_3;
        KEYPAD_2.down = KEYPAD_5;
        KEYPAD_2.left = KEYPAD_1;

        KEYPAD_6.up = KEYPAD_3;
        KEYPAD_6.down = KEYPAD_9;
        KEYPAD_6.left = KEYPAD_5;

        KEYPAD_8.up = KEYPAD_5;
        KEYPAD_8.right = KEYPAD_9;
        KEYPAD_8.left = KEYPAD_7;

        KEYPAD_4.up = KEYPAD_1;
        KEYPAD_4.right = KEYPAD_5;
        KEYPAD_4.down = KEYPAD_7;

        KEYPAD_5.up = KEYPAD_2;
        KEYPAD_5.right = KEYPAD_6;
        KEYPAD_5.down = KEYPAD_8;
        KEYPAD_5.left = KEYPAD_4;

        position = KEYPAD_5;
    }

    static void initKeyPad2() {
        Key KEYPAD_1 = new Key("1");
        Key KEYPAD_2 = new Key("2");
        Key KEYPAD_3 = new Key("3");
        Key KEYPAD_4 = new Key("4");
        Key KEYPAD_5 = new Key("5");
        Key KEYPAD_6 = new Key("6");
        Key KEYPAD_7 = new Key("7");
        Key KEYPAD_8 = new Key("8");
        Key KEYPAD_9 = new Key("9");
        Key KEYPAD_A = new Key("A");
        Key KEYPAD_B = new Key("B");
        Key KEYPAD_C = new Key("C");
        Key KEYPAD_D = new Key("D");

        KEYPAD_1.down = KEYPAD_3;
        KEYPAD_5.right = KEYPAD_6;
        KEYPAD_9.left = KEYPAD_8;
        KEYPAD_D.up = KEYPAD_B;

        KEYPAD_2.right = KEYPAD_3;
        KEYPAD_2.down = KEYPAD_6;

        KEYPAD_4.down = KEYPAD_8;
        KEYPAD_4.left = KEYPAD_3;

        KEYPAD_C.up = KEYPAD_8;
        KEYPAD_C.left = KEYPAD_B;

        KEYPAD_A.up = KEYPAD_6;
        KEYPAD_A.right = KEYPAD_B;

        KEYPAD_3.up = KEYPAD_1;
        KEYPAD_3.right = KEYPAD_4;
        KEYPAD_3.down = KEYPAD_7;
        KEYPAD_3.left = KEYPAD_2;

        KEYPAD_6.up = KEYPAD_2;
        KEYPAD_6.right = KEYPAD_7;
        KEYPAD_6.down = KEYPAD_A;
        KEYPAD_6.left = KEYPAD_5;

        KEYPAD_8.up = KEYPAD_4;
        KEYPAD_8.right = KEYPAD_9;
        KEYPAD_8.down = KEYPAD_C;
        KEYPAD_8.left = KEYPAD_7;

        KEYPAD_B.up = KEYPAD_7;
        KEYPAD_B.right = KEYPAD_C;
        KEYPAD_B.down = KEYPAD_D;
        KEYPAD_B.left = KEYPAD_A;

        KEYPAD_7.up = KEYPAD_3;
        KEYPAD_7.right = KEYPAD_8;
        KEYPAD_7.down = KEYPAD_B;
        KEYPAD_7.left = KEYPAD_6;

        position = KEYPAD_5;
    }

    static void parseLine(String line) {
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            switch(c) {
                case 'U': position = position.up;
                    break;
                case 'L': position = position.left;
                    break;
                case 'D': position = position.down;
                    break;
                case 'R': position = position.right;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        String input = "URULLLLLRLDDUURRRULLLDURRDRDRDLURURURLDLLLLRUDDRRLUDDDDDDLRLRDDDUUDUDLDULUDLDURDULLRDDURLLLRRRLLRURLLUDRDLLRRLDDRUDULRRDDLUUUDRLDLURRRULURRDLLLDDDLUDURDDRLDDDLLRULDRUDDDLUDLURUDLLRURRUURUDLLLUUUUDDURDRDDDLDRRUDURDLLLULUDURURDUUULRULUDRUUUUDLRLUUUUUDDRRDDDURULLLRRLDURLDLDRDLLLUULLRRLLLLDRLRDRRDRRUDDLULUUDDDDRRUUDDLURLRDUUDRRLDUDLRRRLRRUUDURDRULULRDURDRRRDLDUUULRDDLRLRDLUUDDUDDRLRRULLLULULLDDDRRDUUUDDRURDDURDRLRDLDRDRULRLUURUDRLULRLURLRRULDRLRDUDLDURLLRLUDLUDDURDUURLUDRLUL\n" +
                "LLLUUURUULDDDULRRDLRLLLLLLLLRURRDLURLUDRRDDULDRRRRRRLDURRULDDULLDDDRUUDLUDULLDLRRLUULULRULURDURLLDULURDUDLRRLRLLDULLRLDURRUULDLDULLRDULULLLULDRLDLDLDLDDLULRLDUDRULUDDRDDRLRLURURRDULLUULLDRRDRRDLDLLRDLDDUUURLUULDDRRRUULDULDDRDDLULUDRURUULLUDRURDRULDRUULLRRDURUDDLDUULLDDRLRRDUDRLRRRLDRLRULDRDRRUDRLLLDDUDLULLURRURRLUURDRLLDLLDUDLUUURRLRDDUDRLUDLLRULLDUUURDLUUUDUDULRLDLDRUUDULRDRRUDLULRLRDLDRRDDDUDLDLDLRUURLDLLUURDLDLRDLDRUDDUURLLLRDRDRRULLRLRDULUDDDLUDURLDUDLLRULRDURDRDLLULRRDLLLDUURRDUDDLDDRULRRRRLRDDRURLLRRLLL\n" +
                "DRURLDDDDRLUDRDURUDDULLRRLLRLDDRLULURLDURRLDRRLRLUURDDRRDLRDLDLULDURUDRLRUDULRURURLRUDRLLDDUDDRDLDRLLDDLRRDRUUULDUUDRUULRLLDLLULLLRRDRURDLDDRRDDUDDULLDUUULDRUDLDLURLDRURUDLRDDDURRLRDDUDLLLRRUDRULRULRRLLUUULDRLRRRLLLDLLDUDDUUDRURLDLRRUUURLUDDDRRDDLDDDDLUURDDULDRLRURLULLURRDRLLURLLLURDURLDLUDUUDUULLRLDLLLLULRDDLDUDUDDDUULURRLULDLDRLRDRLULLUDDUUUUURDRURLDUULDRRDULUDUDLDDRDLUDDURUDURLDULRUDRRDLRLRDRRURLDLURLULULDDUUDLRLLLLURRURULDDRUUULLDULDRDULDDDLLLRLULDDUDLRUDUDUDURLURLDDLRULDLURD\n" +
                "DRUDRDURUURDLRLUUUUURUDLRDUURLLDUULDUULDLURDDUULDRDDRDULUDDDRRRRLDDUURLRDLLRLRURDRRRDURDULRLDRDURUDLLDDULRDUDULRRLLUDLLUUURDULRDDLURULRURDDLRLLULUDURDRRUDLULLRLDUDLURUDRUULDUDLRDUDRRDULDDLDRLRRULURULUURDULRRLDLDULULRUUUUULUURLURLRDLLRRRRLURRUDLRLDDDLDRDRURLULRDUDLRLURRDRRLRLLDLDDLLRRULRLRLRUDRUUULLDUULLDDRLUDDRURLRLDLULDURLLRRLDLLRDDDUDDUULLUDRUDURLLRDRUDLUDLLUDRUUDLRUURRRLLUULLUUURLLLRURUULLDLLDURUUUULDDDLRLURDRLRRRRRRUDLLLRUUULDRRDLRDLLDRDLDDLDLRDUDLDDRDDDDRULRRLRDULLDULULULRULLRRLLUURUUUDLDLUDUDDDLUUDDDDUDDDUURUUDRDURRLUULRRDUUDDUDRRRDLRDRLDLRRURUUDRRRUUDLDRLRDURD\n" +
                "DDDLRURUDRRRURUUDLRLRDULDRDUULRURRRUULUDULDDLRRLLRLDDLURLRUDRLRRLRDLRLLDDLULDLRRURDDRDLLDDRUDRRRURRDUDULUDDULRRDRLDUULDLLLDRLUDRDURDRRDLLLLRRLRLLULRURUUDDRULDLLRULDRDLUDLULDDDLLUULRRLDDUURDLULUULULRDDDLDUDDLLLRRLLLDULRDDLRRUDDRDDLLLLDLDLULRRRDUDURRLUUDLLLLDUUULDULRDRULLRDRUDULRUUDULULDRDLDUDRRLRRDRLDUDLULLUDDLURLUUUDRDUDRULULDRDLRDRRLDDRRLUURDRULDLRRLLRRLDLRRLDLDRULDDRLURDULRRUDURRUURDUUURULUUUDLRRLDRDLULDURUDUDLUDDDULULRULDRRRLRURLRLRLUDDLUUDRRRLUUUDURLDRLRRDRRDURLLL";
        initKeyPad1();
        new BufferedReader(new StringReader(input)).lines().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                parseLine(s);
                result += position.name;
            }
        });
        System.out.println(result);

        /* Second part */
        result = "";
        initKeyPad2();
        new BufferedReader(new StringReader(input)).lines().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                parseLine(s);
                result += position.name;
            }
        });
        System.out.println(result);
    }
}
