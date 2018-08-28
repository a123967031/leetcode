class Solution {
    public boolean buddyStrings(String A, String B) {
    	if(A.length()!=B.length())return false;
    	if(A.equals(B)){
    		return A.matches(".*(.).*\\1.*");
    	}else{
    		int first = 0;
    		int second = 0;
    		for(int i=0;i<A.length();i++){
    			if(A.charAt(i) != B.charAt(i)){
    				if(first==0)
    					first = i;
    				else if(second==0)
    					second = i;
    				else
    					return false;
    			}
    		}
    	return (second!=0 && A.charAt(first)==B.charAt(second) && A.charAt(second)==B.charAt(first));
    	}
    }
}
