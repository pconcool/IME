package IMEngine;

import Config.SimpleConfig;
import Util.*;
import javafx.util.Pair;
import org.apache.log4j.Logger;

import java.util.*;

import static Config.SimpleConfig.CANDIDATE_WORDS_COUNT;
import static IMEngine.Algorithm.SimpleViterbi.topkPath;

/*
    这是一个返回拼音切分结果的引擎.
    这是一个简单实现
    实现了返回全部简拼的候选词 从字典中查找
 */
public class SimpleIMEngineInstance implements IMEngineInstance {
    private Logger logger = Logger.getLogger(SimpleIMEngineInstance.class);
    //< 简拼, < 汉字, 出现次数>>
    private HashMap<String, ArrayList<Pair<String, Double>>> simpleSpellDict;
    private HashMap<String, HashMap<String, Double>> py2ch;
    private HashMap<String, Double> PI;
    private HashMap<String, HashMap<String, Double>> emit;
    private HashMap<String, HashMap<String, Double>> trans;

    public SimpleIMEngineInstance(HashMap<String, ArrayList<Pair<String, Double>>> simpleSpellDict, HashMap<String, HashMap<String, Double>> py2ch, HashMap<String, Double> pi, HashMap<String, HashMap<String, Double>> emit, HashMap<String, HashMap<String, Double>> trans) {
        this.simpleSpellDict = simpleSpellDict;
        this.py2ch = py2ch;
        this.PI = pi;
        this.emit = emit;
        this.trans = trans;
    }


    public static void main(String[] args) {
        //new SimpleIMEngineInstance().getCandidateWords()
    }

    /*
        这个地方需要返回一个带评分的数组, 每个元素是候选词和对应的一个评分
     */
    @Override
    @Deprecated
    public List<String> getCandidateWord(String pySeries) {
        logger.debug("调用 getCandidateWord 获得拼音切分序列");
        return new ArrayList<>(Arrays.asList(pySeries.split(" ")));
    }
//    private List<CandidateItem> getCandidateWordsFromDict(List<SplitResultItem> splitResultItems, String simpleSpell,List<CandidateItem> candidateItems){
//        //candidateItems.add(new CandidateItem("北京"));
//
//        if(simpleSpellDict.containsKey(simpleSpell) && simpleSpellDict.get(simpleSpell).size() != 0 ){
//            PriorityQueue<Pair<String, Double>> simpleEntries = simpleSpellDict.get(simpleSpell);
//            Pair<String, Double> tmp;
//            for(int i = 0; i < SIMPLE_SPELL_CANDIDATE_COUNT; i ++){
//                tmp = simpleEntries.peek();
//                candidateItems.add(new CandidateItem(tmp.getKey(),tmp.getValue()));
//            }
//
//        }
//        return null;
//    }

    @Override
    public List<CandidateItem> getCandidateWords(List<SplitResultItem> splitResultItems) {
        PinYinInputType pinYinInputType = PinYinInputType.MIXEDINPUT;
        Set<PinYinItemType> pinYinItemTypeSet = new HashSet<>();
        List<CandidateItem> candidateItemList = null;
        for (SplitResultItem item : splitResultItems) {
            pinYinItemTypeSet.add(item.getPyType());
        }
        if (pinYinItemTypeSet.contains(PinYinItemType.OTHERSPELL)) {
            pinYinInputType = PinYinInputType.OTHERINPUT;
        } else if (pinYinItemTypeSet.contains(PinYinItemType.SIMPLESPELL) &&
                pinYinItemTypeSet.contains(PinYinItemType.COMPLETESPELL)) {
            pinYinInputType = PinYinInputType.MIXEDINPUT;
        } else if (pinYinItemTypeSet.contains(PinYinItemType.SIMPLESPELL)) {
            pinYinInputType = PinYinInputType.SIMPLESPELLINPUT;
        } else if (pinYinItemTypeSet.contains(PinYinItemType.COMPLETESPELL)) {
            pinYinInputType = PinYinInputType.COMPLETESPELLINPUT;
        }
        switch (pinYinInputType) {
            case MIXEDINPUT:
                logger.debug("pinYinInputType is MIXEDINPUT");
                break;
            case COMPLETESPELLINPUT:
                logger.debug("pinYinInputType is COMPLETESPELLINPUT");
                candidateItemList = topkPath(splitResultItems,
                        SimpleConfig.SIMPLE_SPELL_CANDIDATE_COUNT,
                        py2ch,
                        PI,
                        emit,
                        trans);

                break;
            case SIMPLESPELLINPUT:
                logger.debug("pinYinInputType is SIMPLESPELLINPUT");
                candidateItemList = getSimpleSpellCandidateWords(splitResultItems);
                break;
            case OTHERINPUT:
                logger.debug("pinYinInputType is OTHERINPUT");
                break;
        }
        return candidateItemList;
    }


    private List<CandidateItem> getSimpleSpellCandidateWords(List<SplitResultItem> splitResultItems) {
        StringBuilder inputItem = new StringBuilder();
        List<CandidateItem> candidateItems = new ArrayList<>();
        for (SplitResultItem splitResultItem : splitResultItems) {
            inputItem.append(splitResultItem.getPyItem());
        }
        String simpleSpell = inputItem.toString();
        if (simpleSpellDict.containsKey(simpleSpell) && simpleSpellDict.get(simpleSpell).size() != 0) {
            // todo 遍历集合 然后找到value最大的k个
            ArrayList<Pair<String, Double>> simpleEntries = simpleSpellDict.get(simpleSpell);
            simpleEntries.sort(new PairComparator());
            for (int i = 0; i < Math.min(CANDIDATE_WORDS_COUNT, simpleEntries.size()); i++) {
                candidateItems.add(new CandidateItem(simpleEntries.get(i).getKey(), simpleEntries.get(i).getValue()));
            }
        }
        //getCandidateWordsFromDict(splitResultItems, inputItem.toString(), candidateItems);
        logger.debug("SimpleIMEngineInstance :: getCandidateWords 拼接结果" + inputItem.toString());
        logger.debug("SimpleIMEngineInstance :: getCandidateWords 结果数量 count : " + candidateItems.size());
        for (CandidateItem tmp : candidateItems) {
            logger.debug("candidateItems :" + tmp.toString());
        }
        return candidateItems;
    }

}
