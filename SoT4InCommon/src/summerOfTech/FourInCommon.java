/*
 * AUTHOR: 		André N. Basson	
 * FOR:			Summer of Tech
 * ASSIGNMENT:	"Four in Common"
 * SUBMITTED:	8/07/2016
 * DUE:			11/07/2016
 * IDE:			Eclipse 	  
 */

package summerOfTech;

import java.util.ArrayList;

public class FourInCommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourInCommon fic = new FourInCommon();		
		String sourceString = "SPLIT";
		//String sourceString = "PLIT";
		//String sourceString = "SPLI";
		//String sourceString = "LIT";
		
		String[] sourceStrArray = {"AMPLITUDE", "AMPLITUDES", "APLITE", "APLITES", 
		              "APLITIC", "DISPLING", "EARSPLITTING", "HAIRSPLITTER", 
		              "HAIRSPLITTERS", "HAIRSPLITTING", "HAIRSPLITTINGS", "HAPLITE", 
		              "HAPLITES", "HAPLITIC", "HOPLITE", "HOPLITES", "HOPLITIC", 
		              "LAMPLIT", "POPLITEAL", "POPLITEI", "POPLITEUS", "POPLITIC", 
		              "PRESPLIT", "RESPLICE", "RESPLICED", "RESPLICES", "RESPLICING", 
		              "RESPLIT", "RESPLITS", "RESPLITTING", "SHINSPLINTS", "SIDESPLITTING", 
		              "SIDESPLITTINGLY", "SPLICE", "SPLICED", "SPLICER", "SPLICERS", 
		              "SPLICES", "SPLICING", "SPLICINGS", "SPLIFF", "SPLIFFS", "SPLINE", 
		              "SPLINED", "SPLINES","SPLINING", "SPLINT", "SPLINTED", "SPLINTER", 
		              "SPLINTERED", "SPLINTERIER","SPLINTERIEST", "SPLINTERING", "SPLINTERS", 
		              "SPLINTERY", "SPLINTING", "SPLINTLIKE", "SPLINTS", "SPLINTWOOD", 
		              "SPLINTWOODS", "SPLISH", "SPLISHED", "SPLISHES", "SPLISHING", 
		              "SPLIT", "SPLITS", "SPLITTED", "SPLITTER", "SPLITTERS", "SPLITTING", 
		              "SPLITTINGS", "SPLITTISM", "SPLITTISMS", "SPLITTIST", "SPLITTISTS", 
		              "TRIPLITE", "TRIPLITES", "UNSPLINTERABLE", "UNSPLIT", "UPLIT", 
		              "WASPLIKE", "WISPLIKE", "PANDAS", "KOALAS"
		              };
		System.out.println("Source string array length: " + sourceStrArray.length);
		String[] outStringArray = fic.fourLettersInCommon(sourceString, sourceStrArray);
		for (String s : outStringArray){
			System.out.println(s);
		}
		System.out.println("Four letters in common string array length: " + outStringArray.length);
	}
	
/**
 * Method fourLettersInCommon() 
 * 	@param srcStr		- a string of 4 characters or more
 * 	@param srcStrArr	- an array of string elements (the source)
 * 	@return				- an array that include only the strings (from srcStrArr) that contains any 4-sequential characters
 * 						  from srcStr
 */
	private String[] fourLettersInCommon(String srcStr, String[] srcStrArr){		
		ArrayList<String> strArrList = new ArrayList<String>();	//to accommodate a growing list of strings
		final int FOUR = 4;										//only 4-character sequences considered
		
		// iterate for every string in the array of strings given
		for (String s : srcStrArr){
			//Ignore any strings from the array that are shorter than 4 characters
			if (s.length() >= FOUR){
				// loop for all 4-letter sequences from the source string, compare with string from array, and store match in list
				for (int i=0; i <= srcStr.length()-FOUR; i++){
					String fourLetters = srcStr.substring(i, i+FOUR);	
					if (s.contains(fourLetters)){ 			
						strArrList.add(s);					
						break;									//break the (inner for) loop (or you'll get double counts)
					}								
				};
			}			
		}		
		//convert string array list to standard string array, and return
		return strArrList.toArray(new String[strArrList.size()]);
		
	} 
}

