package lev1_개인정보수집유효기간;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	
    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
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
