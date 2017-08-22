class SubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        if(s==null) return false;
        
        int len = s.length();
        for (int i=1; i<=len/2; i++){
            StringBuilder str = new StringBuilder();
            if (len%i==0){
                int m = len/i;
                String subString = s.substring(0,i);
                for (int j=0; j<m; j++){
                    str.append(subString);
                }
                if (s.equals(str.toString())) return true;
            }
        }
    return false;
    }
}