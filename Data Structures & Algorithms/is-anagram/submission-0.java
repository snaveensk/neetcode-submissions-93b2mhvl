class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        TreeMap<Character,Integer> s1 = new TreeMap<>();
        TreeMap<Character,Integer> s2 = new TreeMap<>();
        for (int i=0; i<s.length(); i++){
            if (s1.containsKey(s.charAt(i))){
                s1.computeIfPresent(s.charAt(i), (key, val) -> val + 1);
            }
            else{
                s1.put(s.charAt(i),1);
            }
             if (s2.containsKey(t.charAt(i))){
                s2.computeIfPresent(t.charAt(i), (key, val) -> val + 1);
            }
            else{
                s2.put(t.charAt(i),1);
            }
        }
        if (s1.equals(s2)){
            return true;
        }
        return false;

    }
}
