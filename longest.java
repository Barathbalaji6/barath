public String longestCommonPrefix(String[] strs) {
    String longestPre = "";
    if(strs.length>0){
        longestPre = strs[0];
    }
    for(int i=1; i<strs.length; i++){
        String analyzing = strs[i];
        int j=0;
        for(; j<Math.min(longestPre.length(), strs[i].length()); j++){
            if(longestPre.charAt(j) != analyzing.charAt(j)){
                break;
            }
        }
        longestPre = strs[i].substring(0, j);
    }
    return longestPre;
}
