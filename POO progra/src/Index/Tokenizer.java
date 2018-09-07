package Index;

import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.List;

public class Tokenizer {
	
	int numOfWords;
	String[] wordVector;
	
	public Tokenizer (String[] docs) {
		HashMap<String, Integer> mapWordToIdx = new HashMap<>();
        int nextIdx = 0;
        for (String doc : docs) {
            for (String word : doc.split(" ")) {
                if (!mapWordToIdx.containsKey(word)) {
                    mapWordToIdx.put(word, nextIdx);
                    nextIdx++;
                }
            }
        }
        numOfWords = mapWordToIdx.size();
        
        wordVector = new String[numOfWords];
        for (String word : mapWordToIdx.keySet()) {
            int wordIdx = mapWordToIdx.get(word);
            wordVector[wordIdx] = word;
        }
	}
	/*
	public static void main(String[] args) {
		String[] docs = new String[]{"this is a a sample of example", "this is another another example example which example"};
        TF_IDF tf_idf = new TF_IDF(docs);
        for (String s : tf_idf.getWordVector()) {
            System.out.print(s + " ");
        }
	
	}*/
}

