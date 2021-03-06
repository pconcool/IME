package Config;

import java.util.HashSet;
import java.util.Set;

public final class SimpleConfig implements ConfigService {
    private static Set<String> completeSpellSet = new HashSet<>();
    private static Set<String> simpleSpellSet = new HashSet<>();

    static {

        simpleSpellSet.add("b");
        simpleSpellSet.add("be");
        simpleSpellSet.add("bia");
        simpleSpellSet.add("c");
        simpleSpellSet.add("co");
        simpleSpellSet.add("con");
        simpleSpellSet.add("cua");
        simpleSpellSet.add("d");
        simpleSpellSet.add("den");
        simpleSpellSet.add("do");
        simpleSpellSet.add("don");
        simpleSpellSet.add("dua");
        simpleSpellSet.add("f");
        simpleSpellSet.add("fe");
        simpleSpellSet.add("fi");
        simpleSpellSet.add("fia");
        simpleSpellSet.add("g");
        simpleSpellSet.add("go");
        simpleSpellSet.add("gon");
        simpleSpellSet.add("h");
        simpleSpellSet.add("hon");
        simpleSpellSet.add("ho");
        simpleSpellSet.add("j");
        simpleSpellSet.add("jio");
        simpleSpellSet.add("jion");
        simpleSpellSet.add("jua");
        simpleSpellSet.add("k");
        simpleSpellSet.add("ko");
        simpleSpellSet.add("kon");
        simpleSpellSet.add("l");
        simpleSpellSet.add("len");
        simpleSpellSet.add("lon");
        simpleSpellSet.add("lua");
        simpleSpellSet.add("m");
        simpleSpellSet.add("mia");
        simpleSpellSet.add("n");
        simpleSpellSet.add("nia");
        simpleSpellSet.add("non");
        simpleSpellSet.add("no");
        simpleSpellSet.add("nua");
        simpleSpellSet.add("p");
        simpleSpellSet.add("pia");
        simpleSpellSet.add("q");
        simpleSpellSet.add("qio");
        simpleSpellSet.add("qion");
        simpleSpellSet.add("qua");
        simpleSpellSet.add("r");
        simpleSpellSet.add("ra");
        simpleSpellSet.add("ro");
        simpleSpellSet.add("ron");
        simpleSpellSet.add("rua");
        simpleSpellSet.add("s");
        simpleSpellSet.add("son");
        simpleSpellSet.add("so");
        simpleSpellSet.add("sua");
        simpleSpellSet.add("t");
        simpleSpellSet.add("ten");
        simpleSpellSet.add("tia");
        simpleSpellSet.add("tin");
        simpleSpellSet.add("ton");
        simpleSpellSet.add("to");
        simpleSpellSet.add("tua");
        simpleSpellSet.add("w");
        simpleSpellSet.add("we");
        simpleSpellSet.add("x");
        simpleSpellSet.add("xion");
        simpleSpellSet.add("xua");
        simpleSpellSet.add("y");
        simpleSpellSet.add("yon");
        simpleSpellSet.add("yua");
        simpleSpellSet.add("z");
        simpleSpellSet.add("zon");
        simpleSpellSet.add("zo");
        simpleSpellSet.add("zua");
        simpleSpellSet.add("ch");
        simpleSpellSet.add("cho");
        simpleSpellSet.add("chon");
        simpleSpellSet.add("sh");
        simpleSpellSet.add("sho");
        simpleSpellSet.add("zh");
        simpleSpellSet.add("zho");
        simpleSpellSet.add("zhon");
        completeSpellSet.add("a");
        completeSpellSet.add("ai");
        completeSpellSet.add("an");
        completeSpellSet.add("ao");
        completeSpellSet.add("ang");
        completeSpellSet.add("ba");
        completeSpellSet.add("bai");
        completeSpellSet.add("ban");
        completeSpellSet.add("bang");
        completeSpellSet.add("bao");
        completeSpellSet.add("bei");
        completeSpellSet.add("ben");
        completeSpellSet.add("beng");
        completeSpellSet.add("bi");
        completeSpellSet.add("bian");
        completeSpellSet.add("biao");
        completeSpellSet.add("bie");
        completeSpellSet.add("bin");
        completeSpellSet.add("bing");
        completeSpellSet.add("bo");
        completeSpellSet.add("bu");
        completeSpellSet.add("ca");
        completeSpellSet.add("cai");
        completeSpellSet.add("can");
        completeSpellSet.add("cang");
        completeSpellSet.add("cao");
        completeSpellSet.add("ce");
        completeSpellSet.add("cen");
        completeSpellSet.add("ceng");
        completeSpellSet.add("ci");
        completeSpellSet.add("cong");
        completeSpellSet.add("cou");
        completeSpellSet.add("cu");
        completeSpellSet.add("cuan");
        completeSpellSet.add("cui");
        completeSpellSet.add("cun");
        completeSpellSet.add("cuo");
        completeSpellSet.add("da");
        completeSpellSet.add("dai");
        completeSpellSet.add("dan");
        completeSpellSet.add("dang");
        completeSpellSet.add("dao");
        completeSpellSet.add("de");
        completeSpellSet.add("dei");
        completeSpellSet.add("deng");
        completeSpellSet.add("di");
        completeSpellSet.add("dia");
        completeSpellSet.add("dian");
        completeSpellSet.add("diao");
        completeSpellSet.add("die");
        completeSpellSet.add("din");
        completeSpellSet.add("ding");
        completeSpellSet.add("diu");
        completeSpellSet.add("dong");
        completeSpellSet.add("dou");
        completeSpellSet.add("du");
        completeSpellSet.add("duan");
        completeSpellSet.add("dui");
        completeSpellSet.add("dun");
        completeSpellSet.add("duo");
        completeSpellSet.add("e");
        completeSpellSet.add("ei");
        completeSpellSet.add("en");
        completeSpellSet.add("er");
        completeSpellSet.add("fa");
        completeSpellSet.add("fan");
        completeSpellSet.add("fang");
        completeSpellSet.add("fei");
        completeSpellSet.add("fen");
        completeSpellSet.add("feng");
        completeSpellSet.add("fiao");
        completeSpellSet.add("fo");
        completeSpellSet.add("fou");
        completeSpellSet.add("fu");
        completeSpellSet.add("ga");
        completeSpellSet.add("gai");
        completeSpellSet.add("gan");
        completeSpellSet.add("gang");
        completeSpellSet.add("gao");
        completeSpellSet.add("ge");
        completeSpellSet.add("gei");
        completeSpellSet.add("gen");
        completeSpellSet.add("geng");
        completeSpellSet.add("gong");
        completeSpellSet.add("gou");
        completeSpellSet.add("gu");
        completeSpellSet.add("gua");
        completeSpellSet.add("guai");
        completeSpellSet.add("guan");
        completeSpellSet.add("guang");
        completeSpellSet.add("gui");
        completeSpellSet.add("gun");
        completeSpellSet.add("guo");
        completeSpellSet.add("ha");
        completeSpellSet.add("hai");
        completeSpellSet.add("han");
        completeSpellSet.add("hang");
        completeSpellSet.add("hao");
        completeSpellSet.add("he");
        completeSpellSet.add("hei");
        completeSpellSet.add("hen");
        completeSpellSet.add("heng");
        completeSpellSet.add("hong");
        completeSpellSet.add("hou");
        completeSpellSet.add("hu");
        completeSpellSet.add("hua");
        completeSpellSet.add("huai");
        completeSpellSet.add("huan");
        completeSpellSet.add("huang");
        completeSpellSet.add("hui");
        completeSpellSet.add("hun");
        completeSpellSet.add("huo");
        completeSpellSet.add("ji");
        completeSpellSet.add("jia");
        completeSpellSet.add("jian");
        completeSpellSet.add("jiang");
        completeSpellSet.add("jiao");
        completeSpellSet.add("jie");
        completeSpellSet.add("jin");
        completeSpellSet.add("jing");
        completeSpellSet.add("jiong");
        completeSpellSet.add("jiu");
        completeSpellSet.add("ju");
        completeSpellSet.add("juan");
        completeSpellSet.add("jue");
        completeSpellSet.add("jun");
        completeSpellSet.add("ka");
        completeSpellSet.add("kai");
        completeSpellSet.add("kan");
        completeSpellSet.add("kang");
        completeSpellSet.add("kao");
        completeSpellSet.add("ke");
        completeSpellSet.add("ken");
        completeSpellSet.add("keng");
        completeSpellSet.add("kong");
        completeSpellSet.add("kou");
        completeSpellSet.add("ku");
        completeSpellSet.add("kui");
        completeSpellSet.add("kun");
        completeSpellSet.add("kua");
        completeSpellSet.add("kuai");
        completeSpellSet.add("kuan");
        completeSpellSet.add("kuang");
        completeSpellSet.add("kuo");
        completeSpellSet.add("la");
        completeSpellSet.add("lai");
        completeSpellSet.add("lan");
        completeSpellSet.add("lang");
        completeSpellSet.add("lao");
        completeSpellSet.add("le");
        completeSpellSet.add("lei");
        completeSpellSet.add("leng");
        completeSpellSet.add("li");
        completeSpellSet.add("lia");
        completeSpellSet.add("lian");
        completeSpellSet.add("liang");
        completeSpellSet.add("liao");
        completeSpellSet.add("lie");
        completeSpellSet.add("lin");
        completeSpellSet.add("ling");
        completeSpellSet.add("liu");
        completeSpellSet.add("lo");
        completeSpellSet.add("long");
        completeSpellSet.add("lou");
        completeSpellSet.add("lu");
        completeSpellSet.add("luan");
        completeSpellSet.add("lun");
        completeSpellSet.add("luo");
        completeSpellSet.add("lv");
        completeSpellSet.add("lve");
        completeSpellSet.add("ma");
        completeSpellSet.add("mai");
        completeSpellSet.add("man");
        completeSpellSet.add("mang");
        completeSpellSet.add("mao");
        completeSpellSet.add("me");
        completeSpellSet.add("mei");
        completeSpellSet.add("men");
        completeSpellSet.add("meng");
        completeSpellSet.add("mi");
        completeSpellSet.add("mian");
        completeSpellSet.add("miao");
        completeSpellSet.add("mie");
        completeSpellSet.add("min");
        completeSpellSet.add("ming");
        completeSpellSet.add("miu");
        completeSpellSet.add("mo");
        completeSpellSet.add("mou");
        completeSpellSet.add("mu");
        completeSpellSet.add("na");
        completeSpellSet.add("nai");
        completeSpellSet.add("nan");
        completeSpellSet.add("nang");
        completeSpellSet.add("nao");
        completeSpellSet.add("ne");
        completeSpellSet.add("nei");
        completeSpellSet.add("nen");
        completeSpellSet.add("neng");
        completeSpellSet.add("ni");
        completeSpellSet.add("nian");
        completeSpellSet.add("niang");
        completeSpellSet.add("niao");
        completeSpellSet.add("nie");
        completeSpellSet.add("nin");
        completeSpellSet.add("ning");
        completeSpellSet.add("niu");
        completeSpellSet.add("nong");
        completeSpellSet.add("nou");
        completeSpellSet.add("nu");
        completeSpellSet.add("nuan");
        completeSpellSet.add("nun");
        completeSpellSet.add("nuo");
        completeSpellSet.add("nv");
        completeSpellSet.add("nve");
        completeSpellSet.add("o");
        completeSpellSet.add("ou");
        completeSpellSet.add("pa");
        completeSpellSet.add("pai");
        completeSpellSet.add("pan");
        completeSpellSet.add("pang");
        completeSpellSet.add("pao");
        completeSpellSet.add("pe");
        completeSpellSet.add("pei");
        completeSpellSet.add("pen");
        completeSpellSet.add("peng");
        completeSpellSet.add("pi");
        completeSpellSet.add("pian");
        completeSpellSet.add("piao");
        completeSpellSet.add("pie");
        completeSpellSet.add("pin");
        completeSpellSet.add("ping");
        completeSpellSet.add("po");
        completeSpellSet.add("pou");
        completeSpellSet.add("pu");
        completeSpellSet.add("qi");
        completeSpellSet.add("qia");
        completeSpellSet.add("qian");
        completeSpellSet.add("qiang");
        completeSpellSet.add("qiao");
        completeSpellSet.add("qie");
        completeSpellSet.add("qin");
        completeSpellSet.add("qing");
        completeSpellSet.add("qiong");
        completeSpellSet.add("qiu");
        completeSpellSet.add("qu");
        completeSpellSet.add("quan");
        completeSpellSet.add("que");
        completeSpellSet.add("qun");
        completeSpellSet.add("ran");
        completeSpellSet.add("rang");
        completeSpellSet.add("rao");
        completeSpellSet.add("re");
        completeSpellSet.add("ren");
        completeSpellSet.add("reng");
        completeSpellSet.add("ri");
        completeSpellSet.add("rong");
        completeSpellSet.add("rou");
        completeSpellSet.add("ru");
        completeSpellSet.add("ruan");
        completeSpellSet.add("rui");
        completeSpellSet.add("run");
        completeSpellSet.add("ruo");
        completeSpellSet.add("sa");
        completeSpellSet.add("sai");
        completeSpellSet.add("san");
        completeSpellSet.add("sang");
        completeSpellSet.add("sao");
        completeSpellSet.add("se");
        completeSpellSet.add("sen");
        completeSpellSet.add("seng");
        completeSpellSet.add("si");
        completeSpellSet.add("song");
        completeSpellSet.add("sou");
        completeSpellSet.add("su");
        completeSpellSet.add("suan");
        completeSpellSet.add("sui");
        completeSpellSet.add("sun");
        completeSpellSet.add("suo");
        completeSpellSet.add("ta");
        completeSpellSet.add("tai");
        completeSpellSet.add("tan");
        completeSpellSet.add("tang");
        completeSpellSet.add("tao");
        completeSpellSet.add("te");
        completeSpellSet.add("tei");
        completeSpellSet.add("teng");
        completeSpellSet.add("ti");
        completeSpellSet.add("tian");
        completeSpellSet.add("tiao");
        completeSpellSet.add("tie");
        completeSpellSet.add("ting");
        completeSpellSet.add("tong");
        completeSpellSet.add("tou");
        completeSpellSet.add("tu");
        completeSpellSet.add("tuan");
        completeSpellSet.add("tui");
        completeSpellSet.add("tun");
        completeSpellSet.add("tuo");
        completeSpellSet.add("wa");
        completeSpellSet.add("wai");
        completeSpellSet.add("wan");
        completeSpellSet.add("wang");
        completeSpellSet.add("wei");
        completeSpellSet.add("wen");
        completeSpellSet.add("weng");
        completeSpellSet.add("wo");
        completeSpellSet.add("wu");
        completeSpellSet.add("xi");
        completeSpellSet.add("xia");
        completeSpellSet.add("xian");
        completeSpellSet.add("xiang");
        completeSpellSet.add("xiao");
        completeSpellSet.add("xie");
        completeSpellSet.add("xin");
        completeSpellSet.add("xing");
        completeSpellSet.add("xiong");
        completeSpellSet.add("xiu");
        completeSpellSet.add("xu");
        completeSpellSet.add("xuan");
        completeSpellSet.add("xue");
        completeSpellSet.add("xun");
        completeSpellSet.add("ya");
        completeSpellSet.add("yan");
        completeSpellSet.add("yang");
        completeSpellSet.add("yao");
        completeSpellSet.add("ye");
        completeSpellSet.add("yi");
        completeSpellSet.add("yin");
        completeSpellSet.add("ying");
        completeSpellSet.add("yo");
        completeSpellSet.add("yong");
        completeSpellSet.add("you");
        completeSpellSet.add("yu");
        completeSpellSet.add("yuan");
        completeSpellSet.add("yue");
        completeSpellSet.add("yun");
        completeSpellSet.add("za");
        completeSpellSet.add("zai");
        completeSpellSet.add("zan");
        completeSpellSet.add("zang");
        completeSpellSet.add("zao");
        completeSpellSet.add("ze");
        completeSpellSet.add("zei");
        completeSpellSet.add("zen");
        completeSpellSet.add("zeng");
        completeSpellSet.add("zi");
        completeSpellSet.add("zong");
        completeSpellSet.add("zou");
        completeSpellSet.add("zu");
        completeSpellSet.add("zuan");
        completeSpellSet.add("zui");
        completeSpellSet.add("zun");
        completeSpellSet.add("zuo");
        completeSpellSet.add("cha");
        completeSpellSet.add("chai");
        completeSpellSet.add("chan");
        completeSpellSet.add("chang");
        completeSpellSet.add("chao");
        completeSpellSet.add("che");
        completeSpellSet.add("chen");
        completeSpellSet.add("cheng");
        completeSpellSet.add("chi");
        completeSpellSet.add("chong");
        completeSpellSet.add("chou");
        completeSpellSet.add("chu");
        completeSpellSet.add("chua");
        completeSpellSet.add("chuai");
        completeSpellSet.add("chuan");
        completeSpellSet.add("chuang");
        completeSpellSet.add("chui");
        completeSpellSet.add("chun");
        completeSpellSet.add("chuo");
        completeSpellSet.add("sha");
        completeSpellSet.add("shai");
        completeSpellSet.add("shan");
        completeSpellSet.add("shang");
        completeSpellSet.add("shao");
        completeSpellSet.add("she");
        completeSpellSet.add("shei");
        completeSpellSet.add("shen");
        completeSpellSet.add("sheng");
        completeSpellSet.add("shi");
        completeSpellSet.add("shou");
        completeSpellSet.add("shu");
        completeSpellSet.add("shua");
        completeSpellSet.add("shuai");
        completeSpellSet.add("shuan");
        completeSpellSet.add("shuang");
        completeSpellSet.add("shui");
        completeSpellSet.add("shun");
        completeSpellSet.add("shuo");
        completeSpellSet.add("zha");
        completeSpellSet.add("zhai");
        completeSpellSet.add("zhan");
        completeSpellSet.add("zhang");
        completeSpellSet.add("zhao");
        completeSpellSet.add("zhe");
        completeSpellSet.add("zhei");
        completeSpellSet.add("zhen");
        completeSpellSet.add("zheng");
        completeSpellSet.add("zhi");
        completeSpellSet.add("zhong");
        completeSpellSet.add("zhou");
        completeSpellSet.add("zhu");
        completeSpellSet.add("zhua");
        completeSpellSet.add("zhuai");
        completeSpellSet.add("zhuan");
        completeSpellSet.add("zhuang");
        completeSpellSet.add("zhui");
        completeSpellSet.add("zhun");
        completeSpellSet.add("zhuo");
    }
    private SimpleConfig() {
        // restrict instantiation
    }

    public static final double PI = 3.14159;
    public static final double CANDIDATE_WORDS_COUNT = 15;
    public static final Integer SIMPLE_SPELL_CANDIDATE_COUNT = 15;
    public static Set<String> getCompleteSpellSet() {
        return completeSpellSet;
    }

    public static Set<String> getSimpleSpellSet() {
        return simpleSpellSet;
    }
}