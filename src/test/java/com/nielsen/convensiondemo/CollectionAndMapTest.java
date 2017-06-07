package com.nielsen.convensiondemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class CollectionAndMapTest {

	@Test
	public void testList() {
		List<String> myListOfStrings = new ArrayList<>();

		for(int i=0; i<10; i++) {
			myListOfStrings.add("String " + i);
		}

		Iterator<String> iterator = myListOfStrings.iterator();
		while(iterator.hasNext()) {
			String currentValue = iterator.next();
			System.out.println(currentValue);
		}

		for(String currentValue : myListOfStrings) {
			System.out.println(currentValue);
		}

		myListOfStrings.remove("String 0");
		System.out.println(myListOfStrings.get(0));
	}

	@Test
	public void testSet() {
		Set<String> mySetOfString = new HashSet<>();

		for(int i=0; i<10; i++) {
			mySetOfString.add("String " + i);
		}

		for(String currentValue : mySetOfString) {
			System.out.println(currentValue);
		}

		System.out.println(mySetOfString.contains("String 3"));

	}

	@Test
	public void testSet2() {
		Set<String> mySetOfString = new LinkedHashSet<>();

		for(int i=0; i<10; i++) {
			mySetOfString.add("String " + i);
		}

		for(String currentValue : mySetOfString) {
			System.out.println(currentValue);
		}

		System.out.println(mySetOfString.contains("String 3"));

	}

	@Test
	public void testSet3() {
		Set<Integer> mySetOfinteger = new TreeSet<>();

		for(int i=0; i<10; i++) {
			mySetOfinteger.add(10 - i);
		}

		for(Integer currentValue : mySetOfinteger) {
			System.out.println(currentValue);
		}
	}

	@Test
	public void testMap() {
		Map<Integer,String> myMapOfStrings = new HashMap<>();

		for(int i=0; i<10; i++) {
			myMapOfStrings.put(10 - i, "string " + i);
		}

		for(Entry<Integer, String> currentEntry : myMapOfStrings.entrySet()) {
			System.out.println(currentEntry);
		}

		System.out.println(myMapOfStrings.get(3));
	}

}
