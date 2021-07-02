package hr.vestigo.java.tecaj.zadatak1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Class for finding the most repeated words
 * @author Mario
 *
 */
public class MostRepeatedWord {
	/**
	 * Function that, given a string, finds the most repeated word in it;
	 * if the given string testString is empty or null, or if there are only words in the string testString 
	 * that we chose not to count, an empty string is given; 
	 * if there are multiple words that appear the same number of times, 
	 * the method returns the one that occurs the first in the given string testString
	 * @param testString a string in which we want to find the most repeated word
	 */
	public static void findMostRepeatedWord(String testString) {
		if(testString == null || testString.isEmpty()) {
			System.out.println("Most repeated word in the given string is: . Times repeated: 0.");
			return;
		}
		
		String[] wordsFromString = testString.split("([.,!?:;'\\\"-]|\\s)+");
		Set<String> ignoredWords = new HashSet<>(Arrays.asList("the", "a", "or", "an", "it", "and", "but", "is", "are", "of", "on", "to", "was", 
				"were", "in", "that", "i", "your", "his", "their", "her", "you", "me", "all"));
		Map<String, Integer> findMax = new LinkedHashMap<>();
		for(int i = 0; i < wordsFromString.length; i++) {
			if(!ignoredWords.contains(wordsFromString[i].toLowerCase())) {
				if(findMax.containsKey(wordsFromString[i].toLowerCase())) {
					findMax.put(wordsFromString[i].toLowerCase(), findMax.get(wordsFromString[i].toLowerCase()) + 1);
				} else {
					findMax.put(wordsFromString[i].toLowerCase(), 1);
				}
			}
		}
		
		if(findMax.isEmpty()) {
			System.out.println("Most repeated word in the given string is: . Times repeated: 0.");
			return;
		}
		
		int max = Collections.max(findMax.values());
		for (Map.Entry<String, Integer> entry : findMax.entrySet()) {
			if(entry.getValue() == max) {
				System.out.println("Most repeated word in the given string is: " + entry.getKey() + ". Times repeated: " + max + ".");
				return;
			}
		}
		System.out.println("Most repeated word in the given string is: . Times repeated: 0.");
		return;
	}
	
	/**
	 * Main function, used for finding the most repeated words in multiple strings
	 * @param args
	 */
	public static void main(String[] args) {
		String testString = "Lorem Ipsum is simply dummy text of the " +

		"printing and typesetting industry. Lorem Ipsum has been " +

		"the industry's standard dummy text ever since the 1500s, " +

		"when an unknown printer took a galley of type and scrambled " +

		"it to make a type specimen book. It has survived not only " +

		"five centuries, but also the leap into electronic typesetting, " +

		"remaining essentially unchanged. It was popularised in the " +

		"1960s with the release of Letraset sheets containing " +

		"Lorem Ipsum passages, and more recently with desktop " +

		"publishing software like Aldus PageMaker including " +

		"versions of Lorem Ipsum.";

		findMostRepeatedWord(testString);
		
		System.out.println();

		String testString2 = "Penguins are aquatic, flightless birds that " +

		"are highly adapted to life in the water. Their distinct " +

		"tuxedo-like appearance is called countershading, a form " +

		"of camouflage that helps keep them safe in the water. " +

		"Penguins do have wing-bones, though they are flipper-like " +

		"and extremely suited to swimming. Penguins are found " +

		"almost exclusively in the southern hemisphere, where they " +

		"catch their food underwater and raise their young on land.";

		findMostRepeatedWord(testString2);

		System.out.println();

		String testString3 = "Students seek relief from rising " +

		"prices through the purchase of used copies of " +

		"textbooks, which tend to be less expensive. " +

		"Most college bookstores offer used copies of " +

		"textbooks at lower prices. Most bookstores will " +

		"also buy used copies back from students at the end of " +

		"a term if the book is going to be re-used at the school. " +

		"Books that are not being re-used at the school are often " +

		"purchased by an off-campus wholesaler for 0-30% of " +

		"the new cost, for distribution to other bookstores " +

		"where the books will be sold. Textbook companies " +

		"have countered this by encouraging faculty to " +

		"assign homework that must be done on the " +

		"publisher's website. If a student has a new textbook, " +

		"then he or she can use the pass code in the " +

		"book to register on the site. If the student " +

		"has purchased a used textbook, then " +

		"he or she must pay money directly " +

		"to the publisher in order to access the " +

		"website and complete assigned homework. ";

		findMostRepeatedWord(testString3);

		System.out.println();

		String testString4 = "Sunday morning rain is falling\n" +

		"Steal some covers share some skin\n" +

		"Clouds are shrouding us in moments unforgettable\n" +

		"You twist to fit the mold that I am in\n" +

		"But things just get so crazy living life gets hard to do\n" +

		"And I would gladly hit the road get up and go if I knew\n" +

		"That someday it would lead me back to you\n" +

		"That someday it would lead me back to you\n" +

		"\n" +

		"That may be all I need\n" +

		"In darkness she is all I see\n" +

		"Come and rest your bones with me\n" +

		"Driving slow on Sunday morning\n" +

		"And I never want to leave\n" +

		"\n" +

		"Fingers trace your every outline\n" +

		"Paint a picture with my hands\n" +

		"Back and forth we sway like branches in a storm\n" +

		"Change the weather still together when it ends\n" +

		"\n" +

		"That may be all I need\n" +

		"In darkness she is all I see\n" +

		"Come and rest your bones with me\n" +

		"Driving slow on Sunday morning\n" +

		"And I never want to leave\n" +

		"\n" +

		"But things just get so crazy living life gets hard to do\n" +

		"Sunday morning rain is falling and I'm calling out to you\n" +

		"Singing someday it'll bring me back to you\n" +

		"Find a way to bring myself back home to you\n" +

		"\n" +

		"May not know\n" +

		"\n" +

		"That may be all I need\n" +

		"In darkness she is all I see\n" +

		"Come and rest your bones with me\n" +

		"Driving slow on Sunday morning\n" +

		"Driving slow\n" +

		"\n" +

		"Oh, yeah, yeah...\n" +

		"\n" +

		"There is a flower in your hair.\n" +

		"I'm a flower in your hair.\n" +

		"\n" +

		"Oh, yeah, yeah, oh\n";

		findMostRepeatedWord(testString4);
		
		System.out.println();

		/* ====== ====== ====== ====== ====== ====== */
		
		// Some test cases -> if there are no words, or there are only words that we don't count, method returns an empty string
		
		// Test 1:
		String testString5 = "Java swing SWing, JAVA; jAWa  JJAva Swing swing. java JAVa";
		
		findMostRepeatedWord(testString5);
		
		System.out.println();
		
		// Test 2:
		String testString6 = "Java swing SWing, JAVA; jAWa  JJAva Swing swing. java ";
		
		findMostRepeatedWord(testString6);
		
		System.out.println();
		
		// Test 3:
		String testString7 = "";
		
		findMostRepeatedWord(testString7);
		
		System.out.println();
		
		// Test 4:
		String testString8 = null;
		
		findMostRepeatedWord(testString8);
		
		System.out.println();
		
		// Test 5:
		String testString9 = ";::::  ,..,";
		
		findMostRepeatedWord(testString9);
		
		System.out.println();
		
		// Test 6:
		String testString10 = "is IS Is The A tHE";
		
		findMostRepeatedWord(testString10);
		
		System.out.println();
		
		// Test 7:
		String testString11 = "is IS Is The A or my or or or not gravity tHE";
		
		findMostRepeatedWord(testString11);
		
		System.out.println();
		
		// Test 8:
		String testString12 = "Ana bere Masline Ana, masline";
		
		findMostRepeatedWord(testString12);
		
		System.out.println();
	}
}
