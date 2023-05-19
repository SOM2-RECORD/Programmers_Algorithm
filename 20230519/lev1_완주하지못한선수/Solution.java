package lev1_완주하지못한선수;

import java.io.*;
import java.util.*;

public class Solution {
	
	public static String solution(String[] participant, String[] completion) {
	    String answer = "";
		
		HashMap<String, Integer> hash = new HashMap<>();
		
		for(int i=0; i<participant.length; i++) {
			String str = participant[i];
			if(hash.containsKey(str)) hash.replace(str, hash.get(str)+1);
			else hash.put(str, 1);
		}
		
		for(int i=0; i<completion.length; i++) {
			String str = completion[i];
			if(hash.containsKey(str) && hash.get(str) > 1) hash.replace(str, hash.get(str)-1);
			else hash.remove(str);
		}
		
		for(String key : hash.keySet()) {
			answer = key;
		}
		
		return answer;
	}

	
	public static void main(String[] args) throws IOException {
		
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
    	
    	String[] participant = {"leo", "kiki", "eden"};
    	String[] completion = {"eden", "kiki"};
    	
    	System.out.println(solution(participant, completion));
    	
    	br.close();
    	
	}

}
