class Solution {
public int lengthOfLongestSubstring(String s) {
char[] c = s.toCharArray();
int n=s.length();
int maxlen=0;
int i=0;
while(i<n){
boolean visited[]=new boolean[256];
int j=i;
while(j<n && visited[c[j]]==false){
maxlen=Math.max(maxlen,j-i+1);
visited[c[j]]=true;
j++;
}
visited[c[i]]=true;
i++;
}
return maxlen;
}
}
