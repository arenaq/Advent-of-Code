package Year2016;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by arenaq on 22.12.2016.
 */
public class Day11 {
    static enum Nevim {
        THULIUM_GENERATOR, PLUTONIUM_GENERATOR, PROMETHIUM_GENERATOR, STRONTIUM_GENERATOR, RUTHENIUM_GENERATOR,
        THULIUM_MICROCHIP, PLUTONIUM_MICROCHIP, PROMETHIUM_MICROCHIP, STRONTIUM_MICROCHIP, RUTHENIUM_MICROCHIP;
    }

    public static void main(String[] args) {
        String in = "The first floor contains a thulium generator, a thulium-compatible microchip, a plutonium generator, and a strontium generator.\n" +
                "The second floor contains a plutonium-compatible microchip and a strontium-compatible microchip.\n" +
                "The third floor contains a promethium generator, a promethium-compatible microchip, a ruthenium generator, and a ruthenium-compatible microchip.\n" +
                "The fourth floor contains nothing relevant.";

        /**
         * F4   .   .   .   .   .
         * F3   PRG PRM RG  RM  .
         * F2   PLM SM  .   .   .
         * F1   TG  TM  PLG SG  .
         */
        Set<Nevim> first = new TreeSet<>();
        first.add(Nevim.THULIUM_GENERATOR);
        first.add(Nevim.THULIUM_MICROCHIP);
        first.add(Nevim.PLUTONIUM_GENERATOR);
        first.add(Nevim.STRONTIUM_GENERATOR);

        Set<Nevim> second = new TreeSet<>();
        second.add(Nevim.PLUTONIUM_MICROCHIP);
        second.add(Nevim.STRONTIUM_MICROCHIP);

        Set<Nevim> third = new TreeSet<>();
        third.add(Nevim.PROMETHIUM_GENERATOR);
        third.add(Nevim.PROMETHIUM_MICROCHIP);
        third.add(Nevim.RUTHENIUM_GENERATOR);
        third.add(Nevim.RUTHENIUM_MICROCHIP);

        Set<Nevim> fourth = new TreeSet<>();

        ;
    }
}
