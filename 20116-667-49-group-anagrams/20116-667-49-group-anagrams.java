class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char [] s = str.toCharArray();
            Arrays.sort(s);

            String sorted = new String(s);

            map.putIfAbsent(sorted,new ArrayList<>());
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }
}