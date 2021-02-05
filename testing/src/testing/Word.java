package testing;
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word
{
   private static String vowels = "AEIOUaeiou";   	//why is this here?
   																//why is it static?
String word;
public Word(String word) {
	this.word = word;
}
public int getNumVowels() {
	int vowelCount = 0;
	for(int i=0; i<word.length();i++) {
		for(int j =0; j <vowels.length();j++) {
			char c= 	word.charAt(i);
			if(c == vowels.charAt(j)) {
				vowelCount =vowelCount +1;
			}
		}


	}
	return vowelCount;
}
public int getLength() {
	return word.length();
}
public void setWord(String string) {
word = string;
	
}
}