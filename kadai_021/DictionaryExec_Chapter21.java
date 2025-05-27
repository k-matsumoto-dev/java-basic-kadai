package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
        String[] searchWords = {
            "apple",
            "banana",
            "grape",
            "orange"
        };
        for (String word : searchWords) {
            String meaning = dictionary.search(word);
            if (meaning != null) {
                System.out.println(word + "の意味は" + meaning);
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}
