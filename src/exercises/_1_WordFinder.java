package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import examples.Boy;

public class _1_WordFinder {

	public static void main(String[] args) {
		/* Print all the words beginning with P that are over 10 characters. */
		List<String> words = loadWordList();
		// System.out.println(words);
		Stream<String> streamOfWords = words.stream();

		Predicate<String> predicate1 = word -> word.charAt(0) == 'p' || word.charAt(0) == 'P';

		Predicate<String> predicate2 = word -> word.length() > 10;
		List<String> wantedWords = streamOfWords.filter(predicate1).filter(predicate2).collect(Collectors.toList());

		System.out.println(wantedWords);

	}

	public static List<String> loadWordList() {
		List<String> messages = new ArrayList<String>();
		File file = new File("resource/words.txt");

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String aLine;
			while ((aLine = buffer.readLine()) != null) {
				messages.add(aLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return messages;
	}

}
