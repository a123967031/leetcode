class Solution {
    public boolean buddyStrings(String A, String B) {
    	if(A.length()!=B.length())return false;
    	if(A.equals(B)){
    		return A.matches(".*(.).*\\1.*");
    	}else{
    		int first = -1;
    		int second = -1;
    		for(int i=0;i<A.length();i++){
    			if(A.charAt(i) != B.charAt(i)){
    				if(first==-1)
    					first = i;
    				else if(second==-1)
    					second = i;
    				else
    					return false;
    			}
    		}
    	return (second!=-1 && A.charAt(first)==B.charAt(second) && A.charAt(second)==B.charAt(first));
    	}
    }
}
