

import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.stream.Stream;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.stream.IntStream;
import java.util.ArrayList;




 public class AlphabetReplace {
	 
	 
	 
	static String changeInWordToConvert;
	static String letterposition = "";
	
	
	public static String Replace(String wordtoconvert) {
		
		changeInWordToConvert = wordtoconvert ;
		String[] wordInArray = changeInWordToConvert.split("");
		Stream.of(wordInArray).forEach(AlphabetReplace::characterPosition);
		System.out.print(letterposition);
		return letterposition;
		
	}
	
	public static void characterPosition(String letterinwordtoconvert) {
		if (!(letterinwordtoconvert.trim().equals(""))) {
			switch(letterinwordtoconvert.toLowerCase()) {
				case "a": letterposition+="1 ";
				break;
				case "b": letterposition+="2 ";
				break;
				case "c": letterposition+="3 ";
				break;
				case "d": letterposition+="4 ";
				break;
				case "e": letterposition+="5 ";
				break;
				case "f": letterposition+="6 ";
				break;
				case "g": letterposition+="7 ";
				break;
				case "h": letterposition+="8 ";
				break;
				case "i": letterposition+="9 ";
				break;
				case "j": letterposition+="10 ";
				break;
				case "k": letterposition+="11 ";
				break;
				case "l": letterposition+="12 ";
				break;
				case "m": letterposition+="13 ";
				break;
				case "n": letterposition+="14 ";
				break;
				case "o": letterposition+="15 ";
				break;
				case "p": letterposition+="16 ";
				break;
				case "q": letterposition+="17 ";
				break;
				case "r": letterposition+="18 ";
				break;
				case "s": letterposition+="19 ";
				break;
				case "t": letterposition+="20 ";
				break;
				case "u": letterposition+="21 ";
				break;
				case "v": letterposition+="22 ";
				break;
				case "w": letterposition+="23 ";
				break;
				case "x": letterposition+="24 ";
				break;
				case "y": letterposition+="25 ";
				break;
				case "z": letterposition+="26 ";
				break;
			}
		}
		
	}
	
	public static void main(String abc[]) {
		Replace ("Hi");	
	}
	
	
//	public String replaceLetterWithPosition(String word) {
//		return word;
//	}
}
