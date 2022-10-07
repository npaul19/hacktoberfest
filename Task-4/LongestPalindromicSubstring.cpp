 #include<bits/stdc++.h>
 using namespace std;
 
 string modify(string s){
        string newString ="";
        for(int i=0; i<s.size(); i++){
            newString += (char)('#');
            newString += (char)(s[i]);
        }
        newString += (char)('#');;
        return newString;    
    }
    
    string manchers(string s, string cos){
        int n = s.size();

        int c = 0, r=0;  
        int maxLen=0, start=0;   
        vector<int>arr(n);      
		
        for(int i=0; i<n; i++){
            int other = 2*c-i;     
            if(i<r) arr[i] = min(arr[other], r-i);
            while( (i+arr[i]+1 < n) &&  ( i-arr[i]-1 >=0) && ( s[i+arr[i]+1] == s[i-arr[i]-1] ) ) arr[i]++;
            if(i+arr[i] > r ){
                c = i;
                r = i + arr[i];
            }

            if( arr[i] > maxLen){        
                start = ( i-arr[i] ) / 2;
                maxLen = arr[i];
            }
        }
        
        string ans;                      
        for(int i=start; i<= (start+maxLen-1); i++){
            ans+=cos[i];
        }
        return ans;
        
    }
    
    string longestPalindrome(string text) {
        
        if(text.size() <= 1) return text;

        string cos = text;            
        text = modify(text);       
        return manchers(text,cos);
        
    }

int main(){
    string s;
    cin>>s;
    cout<<longestPalindrome(s);
}
