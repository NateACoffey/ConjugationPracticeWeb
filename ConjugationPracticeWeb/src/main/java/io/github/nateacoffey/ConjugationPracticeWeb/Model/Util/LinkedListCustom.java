package io.github.nateacoffey.ConjugationPracticeWeb.Model.Util;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCustom extends LinkedList<String>{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString(){
		if(size() == 0){
			return "";
		}
		StringBuilder stringBuilder = new StringBuilder();
		
		Iterator<String> iterator = descendingIterator();
		
		while(iterator.hasNext()){
			stringBuilder.append(iterator.next() + "\n");
		}
		
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		
		return stringBuilder.toString();
	}
	
}
