package com.epam.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputStringForInsertMethod = "Слово1. Слово2саб, Слово3, Слсабово4саб; Ссаблово5, (Слово6), " +
                "(Слово7саб), \"Слово8\"; Слово9, \"Слово10саб\". сабСлово11";
        String subString = "саб";
        String wordToInsert = "вставленное";
        List<String> outputStringOfInsertMethod = StringTransformer.insertWordAfterSampleEnding(inputStringForInsertMethod,
                                                                                                subString, wordToInsert);
        for (String word : outputStringOfInsertMethod) {
            System.out.print(word + " ");
        }
        System.out.println();
        String inputStringForReplaceMethod = "Первое бла бла бла последнее. Раз два три четыре пять. 3 два 1.";
        StringBuilder[] outputStringOfReplaceMethod = StringTransformer.replaceFirstAndLastWord(inputStringForReplaceMethod);
        for (StringBuilder sentence : outputStringOfReplaceMethod) {
            System.out.print(sentence + ". ");
        }
        System.out.println();
        for (int i = 0; i < 11; i++) {
            System.out.print(StringTransformer.unpackText("hel2owo4rld")[i]);
        }
    }
}
