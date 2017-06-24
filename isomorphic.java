public boolean isIsomorphic(String s, String t) {
    if(s==null||t==null)
        return false;
 
    if(s.length()!=t.length())
        return false;
 
    HashMap<Character, Character> map = new HashMap<Character, Character>();
 
 
    for(int i=0; i<s.length(); i++){
        char s1 = s.charAt(i);
        char s2 = t.charAt(i);
 
        if(map.containsKey(s1)){
            if(map.get(s1)!=s2)
                return false;
        }else{
            if(map.containsValue(s2)) 
                return false;
            map.put(s1, s2);
        }
    }
 
    return true;
}
