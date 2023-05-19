package lev1_성격유형검사하기;

import java.io.*;

public class Solution {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        
        int[] scores = new int[4]; //R(T)/C(F)/J(M)/A(N)
        for(int i=0; i<survey.length; i++){
            switch(survey[i]){
                case "RT":
                    scores[0] -= (choices[i]-4);
                    break;
                case "TR":
                    scores[0] += (choices[i]-4);
                    break;
                case "CF":
                    scores[1] -= (choices[i]-4);
                    break;
                case "FC":
                    scores[1] += (choices[i]-4);
                    break;
                case "JM":
                    scores[2] -= (choices[i]-4);
                    break;
                case "MJ":
                    scores[2] += (choices[i]-4);
                    break;
                case "AN":
                    scores[3] -= (choices[i]-4);
                    break;
                case "NA":
                    scores[3] += (choices[i]-4);
                    break;
            }
        }
        
        if(scores[0] >= 0 )answer += "R";
        else answer += "T";
        
        if(scores[1] >= 0 ) answer += "C";
        else answer += "F";
        
        if(scores[2] >= 0 )answer += "J";
        else answer += "M";
        
        if(scores[3] >= 0 ) answer += "A";
        else answer += "N";
        
        return answer;
    }
    
    public static void main(String[] args) throws IOException {
		
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
    	
    	String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
    	int[] choices = {5, 3, 2, 7, 5};
    	
    	System.out.println(solution(survey, choices));
    	
    	br.close();
    	
	}

}
