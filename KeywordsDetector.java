public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Initilaizing all string characters to lower case.
        // I am creating a copy of the arrays to not change the original values.
        if (sentences.length == 0 || keywords.length == 0) {
            System.out.println("ERROR: EMPTY ARRAY.");
        }

        String[] sentencesCopy = new String[sentences.length];
        String[] keywordsCopy = new String[keywords.length];
        for (int i = 0; i < sentences.length; i++) {
            sentencesCopy[i] = sentences[i];
            sentencesCopy[i] = sentencesCopy[i].toLowerCase();          
        }
        for (int i = 0; i < keywords.length; i++) {
            keywordsCopy[i] = keywords[i];
            keywordsCopy[i] = keywordsCopy[i].toLowerCase();
        }
        
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < keywords.length; j++) {
                if (sentencesCopy[i].indexOf(keywordsCopy[j]) > 0)
                System.out.println(sentences[i]);
            }
        }
    }
}
