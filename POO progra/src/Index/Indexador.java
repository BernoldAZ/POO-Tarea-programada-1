package Index;

public class Indexador {
	private int numOfWords;
	private String[] wordVector;
	private double[][] tfIdfMatrix;
	
	private static Indexador indice;
	
	private Indexador() {
		
	}

	public static Indexador getInstance() {
		if (indice == null) {
			indice = new Indexador();
		}
		return indice;
	}
	
	public void useTFIDF (String[] docs) {
		TF_IDF tfidf = new TF_IDF (docs);
		numOfWords = tfidf.getNumOfWords();
		wordVector = tfidf.getWordVector();
		tfIdfMatrix = tfidf.getTF_IDFMatrix();
		
	}

	public int getNumOfWords() {
		return numOfWords;
	}

	public String[] getWordVector() {
		return wordVector;
	}

	public double[][] getTfIdfMatrix() {
		return tfIdfMatrix;
	}

}
