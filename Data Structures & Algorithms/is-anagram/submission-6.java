class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
         Map<Character, Integer> map2 = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i=0; i<t.length();i++){
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0)+1);
        }
        
        return map.equals(map2);
    }
}
