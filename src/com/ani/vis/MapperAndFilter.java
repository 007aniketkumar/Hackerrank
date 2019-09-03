package com.ani.vis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 
 * 
 * Given a set of strings count the number of words that start with 
 * a given prefix 
 * 
 * 
 * 
 * for example -
 * 
 * list of words
 * 
 * aalmkn, anik, banduk, aayush, aadhar,zandu
 * 
 * 
 * prefix- aa
 * 
 * count : 3
 * 
 * Requirement is to use a mapper and filter.
 */


public class MapperAndFilter {

	
	public static void main(String[] args) {
		
	//List<String> input =new ArrayList<>();
	
	//input.add("aalmkn");
	
	String[] input = new String[] {"aalmkn", "anik", "banduk", "aayush", "aadhar","zandu"};
	
	//Converting the input array to list

		List<String>  inputList= Arrays.asList(input);
		
		String prefix ="aa";
		//Now using this in stream
		
		
		inputList.stream().filter(nameStartingWithPrefix(prefix)).// filter the strings based on prefixes
		map(str->str.chars().distinct().count()). // find the distinct characters per string
		collect(Collectors.toList()).
		forEach(s->System.out.println(s));
		
//forEach(str->str.chars().distinct().count());
		
	}
	
	
	
/*
 * 
 * Create a predicate which checks prefix in the stream in Strings.
 * 
 *  what predicate returns  - a Stream 
 * 	
 */
	
public static Predicate<String> nameStartingWithPrefix(String prefix) {
	return  str-> str.startsWith(prefix);
				
}




}
