package week7;
import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    HashMap<String, String> words = new HashMap<String, String>();

    public String translate(String word) {
        return words.get(word);
    }

    public void add(String word, String translation) {
        words.put(word, translation);
    }

    public int amountOfWords() {
        return this.words.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translatedList = new ArrayList<String>();
        for (String key : this.words.keySet()) {
            String value = this.words.get(key);
            String pair = key + " = " + value;
            translatedList.add(pair);
        }
        return translatedList;
    }
}

