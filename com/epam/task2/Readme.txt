А5. После каждого слова текста, заканчивающегося заданной подстрокой, вставить указанное слово.
Метод insertWordAfterSampleEnding(String inputText, String subString, String wordToInsert);

B5. В каждом предложении текста поменять местами первое слово с последним, не изменяя длины предложения.
Метод replaceFirstAndLastWord(String inputText);

C5. Распаковать текст, сжатый по правилу из предыдущего задания.
(Предыдущее задание (С4): Осуществить сжатие английского текста, заменив каждую группу из двух или более рядом стоящих символов на один символ, за которым следует количество его вхождений в группу. К примеру, строка hellowoooorld должна сжиматься в hel2owo4rld.)
Метод unpackText(String inputText);

Вспомогательные методы:

convertStringArrayToStringBuilderArray(String[] inputStringArray) - преобразование массива стрингов в массив стригбилдеров

makeFirstLetterCapital(String word) - делает первую букву слова заглавной

makeFirstLetterSmall(String word) - делает первую букву слова строчной