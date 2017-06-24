public static String swapPairs(String s) {
    String e = "";
    String o = "";
    int length = s.length();

    for (int i = 0; i <= length-2; i+=2) {          
        e += s.charAt(i+1) + "" + s.charAt(i);
    }

    if (length % 2 != 0) {          
        o = e + s.charAt(length-1);
        return o;
    } else {
        return e;
    }
}
