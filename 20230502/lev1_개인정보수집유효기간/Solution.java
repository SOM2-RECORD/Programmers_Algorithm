package lev1_개인정보수집유효기간;

import java.io.*;
import java.util.*;

public class Solution {
	
    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int year = Integer.parseInt(today.substring(0, 4));
        int month = Integer.parseInt(today.substring(5, 7));
        int date = Integer.parseInt(today.substring(8));
        
        int todayN = year*12*28 + month*28 + date;
        
        HashMap<String, Integer> termsMap = new HashMap<>();
        for(int i=0; i<terms.length; i++) {
        	termsMap.put(terms[i].substring(0, 1), Integer.parseInt(terms[i].substring(2)));
        }
        
        for(int i=0; i<privacies.length; i++) {
        	String pKind = privacies[i].substring(11);
        	if(termsMap.containsKey(pKind)) {
        		int pYear = Integer.parseInt(privacies[i].substring(0, 4));
        		int pMonth = Integer.parseInt(privacies[i].substring(5, 7));
        		int pDate = Integer.parseInt(privacies[i].substring(8, 10));
        		
        		int pDateN = pYear*12*28 + pMonth*28 + pDate + termsMap.get(pKind)*28;
        		
        		if(todayN >= pDateN) list.add(i+1);
        	}
        }
        
        
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    
    public static void main(String[] args) throws IOException {
		
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
    	
    	String today = "2022.05.19";
    	String[] terms = {"A 6", "B 12", "C 3"};
    	String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
    	
    	System.out.println(solution(today, terms, privacies));

    	br.close();
    	
	}

}
