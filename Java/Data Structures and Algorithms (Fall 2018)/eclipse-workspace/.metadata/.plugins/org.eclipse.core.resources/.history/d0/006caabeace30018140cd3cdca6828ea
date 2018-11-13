package jobalbarr.csci210;

import java.util.ArrayList;
import java.util.List;

//write a method that when given a list of strings and an number,
//removes all strings of the given length and returns the new list
//example --> wordsWithoutNum(["a", "bb", "b", "ccc"], 1) returns ["bb", "ccc"]

//write another method that when given a list of strings and another string,
//removes all strings from the list that are equal to the given string and returns the new list
//example --> wordsWithoutString(["a", "bb", "ab", "ccc"], "bb") returns ["a", "ab", "ccc"]

public class ALBARRJob_Challenge001 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("bb");
		list.add("b");
		list.add("ccc");
		System.out.printf("Before:  %s\n",list);
		System.out.printf("After:   %s\n",wordsWithoutNum(list, 1));
		
		ArrayList<String> listTwo = new ArrayList<String>();
		listTwo.add("a");
		listTwo.add("bb");
		listTwo.add("ab");
		listTwo.add("ccc");
		System.out.printf("\nBefore:  %s\n",listTwo);
		System.out.printf("After:   %s\n",wordsWithoutString(listTwo, "bb"));
		
		
	}

	public static List<String> wordsWithoutNum(List<String> words, int len) {
		ArrayList<String> myList = new ArrayList<String>();
		for (String item : words) {
			if (item.length() != len) {
				myList.add(item);
			}
		}
		return myList;
	}

	public static List<String> wordsWithoutString(List<String> words, String word) {
		ArrayList<String> myList = new ArrayList<String>();
		for (String item : words) {

			if (item != word) {
				myList.add(item);
			}
		}
		return myList;
	}

}
