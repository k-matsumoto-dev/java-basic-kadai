package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    HashMap<String, String> dictionary;

    public Dictionary_Chapter21() {
        this.dictionary = new HashMap<String, String>();
        this.dictionary.put("apple",        "りんご");
        this.dictionary.put("peach",        "桃");
        this.dictionary.put("banana",       "バナナ");
        this.dictionary.put("lemon",        "レモン");
        this.dictionary.put("pear",         "梨");
        this.dictionary.put("kiwi",         "キウイ");
        this.dictionary.put("strawberry",   "いちご");
        this.dictionary.put("grape",        "ぶどう");
        this.dictionary.put("muscat",       "マスカット");
        this.dictionary.put("cherry",       "さくらんぼ");
    }

    public String search(String word) {
        return this.dictionary.get(word);
    }
}
