package Year2016;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.function.Consumer;

/**
 * Created by arenaq on 06.12.2016.
 */
public class Day6 {
    static String s1, s2, s3, s4, s5, s6, s7, s8;

    public static void main(String[] args) {
        String in = "cqvkxhip\n" +
                "tgswqbjh\n" +
                "ymbqjoau\n" +
                "yakqfnvb\n" +
                "klwpoxak\n" +
                "ebftersc\n" +
                "muhqajoy\n" +
                "sttjluap\n" +
                "nbfrccxf\n" +
                "pjtxsrdt\n" +
                "pcehiulx\n" +
                "imtchqqu\n" +
                "shtdcptu\n" +
                "gziwdtvt\n" +
                "gkisoote\n" +
                "dmodaoyb\n" +
                "mqykfphl\n" +
                "rchfhsxr\n" +
                "expmfmmi\n" +
                "eyyjzupd\n" +
                "ysoqeeib\n" +
                "phedgslu\n" +
                "xmwituwf\n" +
                "cibvkswh\n" +
                "dusqdmkm\n" +
                "oajlhpcj\n" +
                "nqbvrtsv\n" +
                "eytohbvb\n" +
                "byjvrycg\n" +
                "oorhjlll\n" +
                "bflfjdaz\n" +
                "wtydcsem\n" +
                "xinelpsx\n" +
                "bkrenkkc\n" +
                "kuhljsqo\n" +
                "fhkrtpkg\n" +
                "qkiohori\n" +
                "rzebhkwv\n" +
                "prpldmyf\n" +
                "dstdrxbo\n" +
                "jgtenhmc\n" +
                "vpibddhk\n" +
                "nkytfkno\n" +
                "hldsxaoq\n" +
                "qgwusrkd\n" +
                "xlsuudux\n" +
                "buxfxaiy\n" +
                "uljrvuen\n" +
                "awoyppai\n" +
                "igplagub\n" +
                "kqfiefgc\n" +
                "cqjukquf\n" +
                "djxuuizu\n" +
                "zvuetjli\n" +
                "uwcrclvy\n" +
                "gtdlktiv\n" +
                "cvwbsaxj\n" +
                "zpwzzepj\n" +
                "vmdmkgqz\n" +
                "qfsxdnrf\n" +
                "mhqtikwv\n" +
                "fduxoluy\n" +
                "emhhanfc\n" +
                "zglqrchc\n" +
                "jvvjspsu\n" +
                "rndsqnky\n" +
                "itzjeqfr\n" +
                "lnpslqsj\n" +
                "yxohoogq\n" +
                "oqmmzizo\n" +
                "ginjbszz\n" +
                "qhdnjnxs\n" +
                "mjtbhrzl\n" +
                "zorxielb\n" +
                "xflyknux\n" +
                "xrssqfpx\n" +
                "tcvrpzxn\n" +
                "sgnholch\n" +
                "nlpbrofn\n" +
                "qclukwkr\n" +
                "foylzchc\n" +
                "hieqxicp\n" +
                "nqvwnhpt\n" +
                "ssubumix\n" +
                "vtbpattp\n" +
                "ncgmzjmv\n" +
                "wtzedksg\n" +
                "mvlatfbj\n" +
                "ithfpwgr\n" +
                "dmqvfilt\n" +
                "lbnovpit\n" +
                "hqfzxflr\n" +
                "pgeeancn\n" +
                "rpdiwwle\n" +
                "ehkipwnx\n" +
                "pncgkqey\n" +
                "chzakbif\n" +
                "doooixwk\n" +
                "xztjzzrs\n" +
                "vhyqtnja\n" +
                "cbzmragf\n" +
                "rxqhsehw\n" +
                "rxzuqnoy\n" +
                "kvldlabx\n" +
                "crsslumd\n" +
                "cbxmypaq\n" +
                "qzevgrco\n" +
                "teiavilb\n" +
                "yjuhsfkj\n" +
                "asutrkwn\n" +
                "csgkdxtw\n" +
                "fbdppqjn\n" +
                "ivaewkpq\n" +
                "iznlnknb\n" +
                "btxpvjxk\n" +
                "rrpatocg\n" +
                "yxgkxenm\n" +
                "yrszvqpo\n" +
                "olhjkcac\n" +
                "dmaxpvog\n" +
                "wzicsunc\n" +
                "eoaozekn\n" +
                "oqbcrcje\n" +
                "jjpcwqae\n" +
                "zlyibfto\n" +
                "nkkarjbd\n" +
                "rrsrbrlr\n" +
                "gllxvuve\n" +
                "pkanrgds\n" +
                "bylfpxdm\n" +
                "tzkvedot\n" +
                "eidxawif\n" +
                "nwvcofjz\n" +
                "xkfverdu\n" +
                "wgncgvvy\n" +
                "epwrztow\n" +
                "mybcqyza\n" +
                "arxfmrfd\n" +
                "utcbwrta\n" +
                "iwdfihgp\n" +
                "tkskahas\n" +
                "vvkmupxb\n" +
                "ffetjcgu\n" +
                "nmaoaihp\n" +
                "wilheaug\n" +
                "pmshnqgg\n" +
                "pzbjnbtw\n" +
                "zlxbrzhz\n" +
                "xwikirug\n" +
                "rprmighu\n" +
                "xaaaioxr\n" +
                "mqxpjfgw\n" +
                "ejhezvgh\n" +
                "brjmtonm\n" +
                "wskkweze\n" +
                "kkaxuuib\n" +
                "mdrbckzy\n" +
                "idpwlzfg\n" +
                "fqfdktuq\n" +
                "jnurlaba\n" +
                "bbgftoqt\n" +
                "sgiuadsr\n" +
                "pwzcfnir\n" +
                "mytlszbv\n" +
                "uxcwljqs\n" +
                "lyrangoq\n" +
                "lnmbpgej\n" +
                "qjjugsps\n" +
                "kptbbita\n" +
                "sppvfzzw\n" +
                "ghkleimh\n" +
                "aupnupvy\n" +
                "tzxtqzev\n" +
                "dbcyghnu\n" +
                "qaygxqjo\n" +
                "vgscfmwb\n" +
                "raoylhwp\n" +
                "gewyhjjh\n" +
                "bsozmyma\n" +
                "skpkdxcx\n" +
                "qcngjsxk\n" +
                "xlznquqa\n" +
                "tztogrtf\n" +
                "bvnovdaf\n" +
                "crlrvjsq\n" +
                "afbpxgwl\n" +
                "gwbeomez\n" +
                "aezkolyv\n" +
                "cooulafb\n" +
                "dnrsyvda\n" +
                "ljudufiz\n" +
                "ctwxlryc\n" +
                "djmebdhh\n" +
                "ktoaoxmd\n" +
                "afqaqbbj\n" +
                "mobvjjyk\n" +
                "yplopnti\n" +
                "kwkqjzol\n" +
                "fcvncctm\n" +
                "pkbzlejz\n" +
                "axxxbdqj\n" +
                "gnjurhkl\n" +
                "qakjwsvw\n" +
                "vkoagapm\n" +
                "tpeyuvqi\n" +
                "omejmbtw\n" +
                "yhitogvj\n" +
                "ybpwtcvb\n" +
                "xtnuyfyh\n" +
                "isvpwgza\n" +
                "ozdntafh\n" +
                "hysgmgvh\n" +
                "zbgkvytj\n" +
                "fntphlnd\n" +
                "xjyujmbw\n" +
                "uvnhgphl\n" +
                "decpnkwq\n" +
                "kmkepzcp\n" +
                "lwegdttv\n" +
                "epkpsehc\n" +
                "uouovxth\n" +
                "agvppzan\n" +
                "zxllwuvw\n" +
                "ektemcjl\n" +
                "zegwoyif\n" +
                "hqhrdyzq\n" +
                "qiyxumhk\n" +
                "trbebaka\n" +
                "etjxsihf\n" +
                "yxjgfvnf\n" +
                "joywcwmz\n" +
                "teeqmoik\n" +
                "qjknvrmq\n" +
                "avpxxuni\n" +
                "naemzbma\n" +
                "jpbxexkk\n" +
                "ifevcqzn\n" +
                "tcnibepd\n" +
                "yzppffml\n" +
                "xhqgnbqc\n" +
                "lvvopbzw\n" +
                "pnzmeuon\n" +
                "ovzzvvsh\n" +
                "mcqmuqjp\n" +
                "oadvyhfk\n" +
                "tkgnxpyy\n" +
                "mvbisygc\n" +
                "occsftic\n" +
                "fawfwbvy\n" +
                "hqmqpuam\n" +
                "ptjxkjtk\n" +
                "hzxuosye\n" +
                "zingpdhg\n" +
                "jiombirp\n" +
                "vjtvrses\n" +
                "fdlzglxq\n" +
                "ggooqynz\n" +
                "fmwotljx\n" +
                "mnzzmfro\n" +
                "vtvjvcqu\n" +
                "kmpiufet\n" +
                "hwsvlelq\n" +
                "wdenjddo\n" +
                "gfqtffby\n" +
                "cxneiwee\n" +
                "wtribxye\n" +
                "gvuszzzu\n" +
                "pugjyrqp\n" +
                "yewglqml\n" +
                "beqgcrqn\n" +
                "azmucset\n" +
                "kicbbxtu\n" +
                "bmihylgt\n" +
                "edjrinqf\n" +
                "vvdretyn\n" +
                "zkakzfkp\n" +
                "qbraqzwo\n" +
                "ujpgjzdc\n" +
                "hdobaxgr\n" +
                "atghhhaw\n" +
                "ouucgcws\n" +
                "iodycvik\n" +
                "ljjdonpe\n" +
                "nnekdlaz\n" +
                "lbrzjrkn\n" +
                "jjwewnji\n" +
                "tfdkekdf\n" +
                "eidbjaiz\n" +
                "hssryuot\n" +
                "oajvmyuj\n" +
                "fziqlofo\n" +
                "uisyryfh\n" +
                "ssucyqxa\n" +
                "wyvmbyuq\n" +
                "fomhuool\n" +
                "scyogldx\n" +
                "uznjymzz\n" +
                "tnmfndhu\n" +
                "wmaiqhjd\n" +
                "jrtvsvys\n" +
                "zpgdzcdw\n" +
                "rpzjgslv\n" +
                "uulfdwba\n" +
                "gfctmdso\n" +
                "jcqqmnxe\n" +
                "hbzxgupz\n" +
                "zbhofhjo\n" +
                "szmkzygs\n" +
                "ydsnzkwe\n" +
                "djbctccs\n" +
                "utqjhlzr\n" +
                "dslwhsra\n" +
                "ujxkxald\n" +
                "panonqfl\n" +
                "brhfqycu\n" +
                "adewetuw\n" +
                "rzsxqpyd\n" +
                "ypfaxikk\n" +
                "vgoncwxp\n" +
                "kqcrmyil\n" +
                "vwsswwlt\n" +
                "bjxktjpi\n" +
                "lyzyaehh\n" +
                "noccjwkt\n" +
                "volhauxw\n" +
                "zeeaczxk\n" +
                "cgiyzqtg\n" +
                "wrflucju\n" +
                "mupwfuwq\n" +
                "tlgvwoqm\n" +
                "laybkcqh\n" +
                "mawgcbyq\n" +
                "ofuaudem\n" +
                "gtkhbeuu\n" +
                "svrzwaxw\n" +
                "ohqiojux\n" +
                "mnmttbve\n" +
                "jlluhifp\n" +
                "zuhdfnaq\n" +
                "hsedbspi\n" +
                "rkqoshpx\n" +
                "qzvdlvuc\n" +
                "rwbglsly\n" +
                "djpwgibn\n" +
                "edzgvmws\n" +
                "teacriww\n" +
                "gcvzijna\n" +
                "llokdnqu\n" +
                "dkywadmh\n" +
                "madxishe\n" +
                "feharxjj\n" +
                "sqzpbcgu\n" +
                "ohmflgzd\n" +
                "qrrsyggg\n" +
                "sxxrafvs\n" +
                "xnaterpk\n" +
                "tdiytzmh\n" +
                "wecsvxnm\n" +
                "uiksxtzm\n" +
                "ypqpajdd\n" +
                "fyaoughg\n" +
                "epvdtbni\n" +
                "pyynubyw\n" +
                "dpjdgbaf\n" +
                "vlomtyym\n" +
                "zpitxkwr\n" +
                "tzclhsoz\n" +
                "wduicuqg\n" +
                "sltpfxwo\n" +
                "iyrmivtk\n" +
                "hdmfndbx\n" +
                "znqwrzrs\n" +
                "fxktgznx\n" +
                "indnyerl\n" +
                "airalvum\n" +
                "jfsfyysy\n" +
                "svztyezl\n" +
                "qsjpktkb\n" +
                "xfujksji\n" +
                "jkymepzm\n" +
                "lrtlztdg\n" +
                "nluspned\n" +
                "huwocmgk\n" +
                "nygyugbk\n" +
                "ryzsjezz\n" +
                "uxwwczou\n" +
                "awrcdzad\n" +
                "tobynxxz\n" +
                "swicrqsv\n" +
                "jqywnfns\n" +
                "kdzvcwmh\n" +
                "gogmydcr\n" +
                "dkcuvthh\n" +
                "hkmraojf\n" +
                "kcgbpskp\n" +
                "qgknjgtt\n" +
                "oywbqczg\n" +
                "oiqpwmcv\n" +
                "fxjrhvce\n" +
                "laaizayr\n" +
                "xfcldeuu\n" +
                "govaqtom\n" +
                "dbcymhvq\n" +
                "yjzeuyxc\n" +
                "sejtfvqn\n" +
                "pbvavgov\n" +
                "tpitipok\n" +
                "lnfxhraz\n" +
                "whbqsgli\n" +
                "beuhoifp\n" +
                "pojyvmuz\n" +
                "yynnekkn\n" +
                "nxggwods\n" +
                "nkhpvkct\n" +
                "rcxwiluq\n" +
                "gnhsygno\n" +
                "nwwgewiu\n" +
                "kcbqnvcb\n" +
                "jiisqtqt\n" +
                "dochmmei\n" +
                "cwmwfrwl\n" +
                "hcautqpg\n" +
                "oihxktet\n" +
                "yrcekmmv\n" +
                "lxoyyqxp\n" +
                "vlbvilra\n" +
                "uqnsdjdf\n" +
                "jadyopgr\n" +
                "iwunbaps\n" +
                "wrplbwpj\n" +
                "shfuglla\n" +
                "knhgmlsg\n" +
                "riknnrmg\n" +
                "hoxzmvsr\n" +
                "qvqdqxrv\n" +
                "lyyvpffj\n" +
                "ghhflirv\n" +
                "khmzdart\n" +
                "qixervoz\n" +
                "fdgemrrn\n" +
                "uvnbxxpz\n" +
                "lqvanhjt\n" +
                "umorijwr\n" +
                "sgogttye\n" +
                "jlfgdzoc\n" +
                "barxtobf\n" +
                "czrzjduo\n" +
                "vlgkvnek\n" +
                "prknsjfr\n" +
                "uleiwboe\n" +
                "mxaswrft\n" +
                "ihqcepmh\n" +
                "awfqxael\n" +
                "hqvzrkbw\n" +
                "zwvciodj\n" +
                "czyrbdhq\n" +
                "ixhfswys\n" +
                "ndauoxcn\n" +
                "lhhwxiry\n" +
                "adpagord\n" +
                "suuxfdnq\n" +
                "nynlzhfj\n" +
                "ffmwgpyj\n" +
                "idbgnwev\n" +
                "wuculiup\n" +
                "cymyvkgm\n" +
                "fifqbhvs\n" +
                "ijxfzmrq\n" +
                "hugjbhin\n" +
                "aeffbcfp\n" +
                "ywxtejmz\n" +
                "qpprytsg\n" +
                "kcmlmbeo\n" +
                "ruomfeex\n" +
                "vvtpcfnk\n" +
                "zcihodib\n" +
                "nnfoffoi\n" +
                "rmldwivo\n" +
                "ejrzqyln\n" +
                "ifnjdpab\n" +
                "abiidqmo\n" +
                "aglmsjkr\n" +
                "xwqghpda\n" +
                "gufhhjer\n" +
                "ubjzhfgj\n" +
                "glhagkrm\n" +
                "wiwhahqd\n" +
                "lbyhcebg\n" +
                "ahhhxupc\n" +
                "dulzuzyi\n" +
                "xxdqhiod\n" +
                "ydkrksxo\n" +
                "pgdazjfi\n" +
                "ebrjoyrr\n" +
                "maejpwkm\n" +
                "xekimgsi\n" +
                "jvntcosc\n" +
                "wrfiyvmb\n" +
                "hfgzughl\n" +
                "wgbwylwl\n" +
                "tpjgkkye\n" +
                "wsspddss\n" +
                "ctoyeuvv\n" +
                "skjcqabz\n" +
                "wfutxuew\n" +
                "oqymawht\n" +
                "xeqmpvcm\n" +
                "hrmflsjx\n" +
                "rstnycbh\n" +
                "aavqqxcc\n" +
                "ouawtykt\n" +
                "kmxcjxxe\n" +
                "heudiqlo\n" +
                "srmiwwrw\n" +
                "ufavnfdy\n" +
                "xfokmkax\n" +
                "vnzztetb\n" +
                "goevrbmb\n" +
                "wfkthpfj\n" +
                "ddesetaa\n" +
                "vygkqvdn\n" +
                "qsyemmqr\n" +
                "iqlyiqtx\n" +
                "esvuchui\n" +
                "pfslklic\n" +
                "genqjcpi\n" +
                "bumqsxkx\n" +
                "msvbjoip\n" +
                "lghjsxdw\n" +
                "elukpmbf\n" +
                "qmipavgm\n" +
                "iafoaecd\n" +
                "usidajnf\n" +
                "vxsymknf\n" +
                "oyfjsysv\n" +
                "mpwtxlvv\n" +
                "kogsobli\n" +
                "jmgwktdj\n" +
                "rgztrmby\n" +
                "dnrcfisj\n" +
                "ottnehjl\n" +
                "zsqbinds\n" +
                "zmufvgrd\n" +
                "fcalplxx\n" +
                "jcwqwnvm\n" +
                "myjowlcd\n" +
                "nodixwaa\n" +
                "phfnpbve\n" +
                "kexcgape\n" +
                "ldmlswbk\n" +
                "naxeikbg\n" +
                "cgmlnbsb\n" +
                "vuwbdcnb\n" +
                "bwxbhmgy\n" +
                "ziadnccv\n" +
                "bacypeeq\n" +
                "tbluknup\n" +
                "btanytry\n" +
                "bqddnwwl\n" +
                "urieqmyv\n" +
                "csrdslqa\n" +
                "fsfiyiai\n" +
                "ceasodly\n" +
                "jetpbhos\n" +
                "xcqzgosd\n" +
                "ydqiuyzh\n" +
                "vxpzumjp\n" +
                "ruwlxvle\n" +
                "exrrmafx\n" +
                "kbfikzdl\n" +
                "bhvvzgfn\n" +
                "ivckwbga";
        s1 = s2 = s3 = s4 = s5 = s6 = s7 = s8 = "";
        new BufferedReader(new StringReader(in)).lines().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                s1 += s.charAt(0);
                s2 += s.charAt(1);
                s3 += s.charAt(2);
                s4 += s.charAt(3);
                s5 += s.charAt(4);
                s6 += s.charAt(5);
                s7 += s.charAt(6);
                s8 += s.charAt(7);
            }
        });
        System.out.print(highestOccuredChar(s1));
        System.out.print(highestOccuredChar(s2));
        System.out.print(highestOccuredChar(s3));
        System.out.print(highestOccuredChar(s4));
        System.out.print(highestOccuredChar(s5));
        System.out.print(highestOccuredChar(s6));
        System.out.print(highestOccuredChar(s7));
        System.out.println(highestOccuredChar(s8));
        System.out.println(hoho);
        System.out.print(lowestOccuredChar(s1));
        System.out.print(lowestOccuredChar(s2));
        System.out.print(lowestOccuredChar(s3));
        System.out.print(lowestOccuredChar(s4));
        System.out.print(lowestOccuredChar(s5));
        System.out.print(lowestOccuredChar(s6));
        System.out.print(lowestOccuredChar(s7));
        System.out.println(lowestOccuredChar(s8));
    }

    private static char highestOccuredChar(String str) {

        int [] count = new int [256];

        for ( int i=0 ;i<str.length() ; i++){
            count[str.charAt(i)]++;
        }

        int max = -1 ;
        char result = ' ' ;
        int haha = 0;

        for(int j =0 ;j<str.length() ; j++){
            if(max < count[str.charAt(j)] && count[str.charAt(j)] > 1) {
                max = count[str.charAt(j)];
                result = str.charAt(j);
                haha = max;
            }
        }

        hoho += " "+haha;
        return result;

    }

    private static char lowestOccuredChar(String str) {

        int [] count = new int [256];

        for ( int i=0 ;i<str.length() ; i++){
            count[str.charAt(i)]++;
        }

        int min = Integer.MAX_VALUE ;
        char result = ' ' ;
        int haha = 0;

        for(int j =0 ;j<str.length() ; j++){
            if(min > count[str.charAt(j)] && count[str.charAt(j)] > 1) {
                min = count[str.charAt(j)];
                result = str.charAt(j);
                haha = min;
            }
        }

        hoho += " "+haha;
        return result;

    }
    static String hoho = "";
}
