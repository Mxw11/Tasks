package com.epam.task3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public abstract class textAnalyst {
    public static void findMaxDigitSequence() throws IOException {
        File inputFile = new File("inputFile.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
        Map<Integer, String> digitSequence = new HashMap<Integer, String>();
        char[] inputChars = bufferedReader.readLine().toCharArray();
        int textLength = inputChars.length;
        int counter = 0;
        String sequence = "";
        int maxCounter = 0;
        String maxSequence = "";
        for (int i = 0; i < textLength; i++) {
            if (Character.isDigit(inputChars[i])) {
                counter++;
                sequence += inputChars[i];
            } else {
                if (i > 0 && Character.isDigit(inputChars[i-1])) {
                    digitSequence.put(counter, sequence);
                }
                counter = 0;
                sequence = "";
            }
        }
        for (Map.Entry entry : digitSequence.entrySet()) {
            if((int)entry.getKey() > maxCounter) {
                maxCounter = (int)entry.getKey();
                maxSequence = entry.getValue().toString();
            }
        }
        System.out.printf("Максимальная последовательность: %s, длина: %d", maxSequence, maxCounter);
        bufferedReader.close();
    }
}
