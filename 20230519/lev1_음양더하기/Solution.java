package lev1_음양더하기;

import java.io.*;

/*
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 
 * 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 */

public class Solution {
	
    public static int solution(int[] absolutes, boolean[] signs) {
       
    	int answer = 0;
        
        for(int i=0; i<absolutes.length; i++){
            if(signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }
        
        return answer;
    }
    
    
    public static void main(String[] args) throws IOException {
		
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
    	
    	int[] absolutes = {4, 7, 12};
    	boolean[] signs = {true, false, true};
    	
    	System.out.println(solution(absolutes, signs));
    	
    	br.close();
    	
	}

}
