package com.epam.task2;

import java.util.List;
import java.util.ArrayList;

public abstract class StringTransformer {
    public static List<String> insertWordAfterSampleEnding(String inputText, String subString, String wordToInsert) {
        List<String> resultText = new ArrayList<>();
        String regexToSplitByWords = "[\\s.,;()\"]+";
        String[] splitInputText = inputText.split(regexToSplitByWords);
        for (String word : splitInputText) {
            resultText.add(word);
            if (word.lastIndexOf(subString) == word.length() - subString.length()) {
                resultText.add(wordToInsert);
            }
        }
        return resultText;
    }

    public static StringBuilder[] replaceFirstAndLastWord(String inputText) {
        String regexToSplitByWords = "[\\s.,;()\"]+";
        String regexToSplitBySentence = "\\.\\s";
        String[] splitInputText = inputText.split(regexToSplitBySentence);
        StringBuilder[] resultText = convertStringArrayToStringBuilderArray(splitInputText);
        for (StringBuilder sentence : resultText) {
            String[] sentenceSplitByWords = sentence.toString().split(regexToSplitByWords);
            int lastWordIndex = sentenceSplitByWords.length;
            String tempStringForReplace = sentenceSplitByWords[0];
            sentenceSplitByWords[0] = makeFirstLetterCapital(sentenceSplitByWords[lastWordIndex - 1]);
            sentenceSplitByWords[lastWordIndex - 1] = makeFirstLetterSmall(tempStringForReplace);
            sentence.delete(0,sentence.length());
            for (int i = 0; i < lastWordIndex; i++) {
                if (i == lastWordIndex-1) {
                    sentence.append(sentenceSplitByWords[i]);
                } else {
                    sentence.append(sentenceSplitByWords[i] + " ");
                }
            }
        }
        return resultText;
    }

    public static StringBuilder[] unpackText(String inputText) {
        String numberRegex = "[\\d]+";
        char[] inputChars = inputText.toCharArray();
        int textLength = inputChars.length;
        StringBuilder[] resultText = new StringBuilder[textLength];
        for (int i = 0; i < textLength; i++) {
            resultText[i] = new StringBuilder();
            resultText[i].append(inputChars[i]);
            if (resultText[i].toString().matches(numberRegex) && i > 0) {
                int currentNumber = Integer.parseInt(resultText[i].toString());
                char previousChar = resultText[i-1].charAt(0);
                for (int j = 0; j < currentNumber-1; j++) {
                    resultText[i-1].append(previousChar);
                }
                resultText[i] = new StringBuilder("");
            }
        }
        return resultText;
    }

    private static StringBuilder[] convertStringArrayToStringBuilderArray(String[] inputStringArray) {
        int arrayLength =  inputStringArray.length;
        StringBuilder[] resultArray = new StringBuilder[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            resultArray[i] = new StringBuilder(inputStringArray[i]);
        }
        return resultArray;
    }

    private static String makeFirstLetterCapital(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    private static String makeFirstLetterSmall(String word) {
        return word.substring(0, 1).toLowerCase() + word.substring(1);
    }
}
