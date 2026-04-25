class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            map.computeIfAbsent(Arrays.toString(ch), k -> new ArrayList()).add(str);
        }

        return new ArrayList(map.values());
    }
}
