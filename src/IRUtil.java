public class IRUtil {

    public static int getFrequencyCount(String term, String doc) {

        // Step 1: Convert both term & doc into lower-case

        term = term.toLowerCase();
        doc = doc.toLowerCase();

        // Step 2: Initialize variable frequencyCount to 0
        int frequencyCount = 0;

        // Step 3: Initialize variable index with the index position of term in doc. Hint: Use indexOf() method
        int index = doc.indexOf(term);

        // Step 4: If index >= 0 (i.e.., term appears in doc), then go to next step. Else go to last step.
        while (index >= 0) {
            // Step 5: Increment frequencyCount
            frequencyCount++;

            // Step 6: Re-compute doc with the string appearing after term till end of doc. Hint: You can use substring() & length() methods

            doc = doc.substring(index + term.length());
            // Step 7: Re-compute index with index position of term in the re-computed doc. Go to step 4 to continue processing.
            index = doc.indexOf(term);
        }

        // Step 8: Return frequencyCount
        return frequencyCount;
    }

    public static double termFrequency(String term, String doc) {

        // Step 1: int frequencyCount = getFrequencyCount(term, doc);

        int frequencyCount = getFrequencyCount(term, doc);
        // Step 2: Create variable totalTermCount to hold the total number of terms appearing in doc. Hint: You can use split() with white-space " " as delimiter
        int totalTermCount = doc.split(" ").length;
        // Step 3: return frequencyCount / totalTermCount. This is the tf formula.
        return frequencyCount / totalTermCount;
    }

}