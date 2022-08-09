class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hash = new HashMap<>();
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if (hash.containsKey(s)) {
                hash.get(s).add(str);
            } else {
                hash.put(s, new ArrayList<>());
                hash.get(s).add(str);
            }
        }
        return new ArrayList<>(hash.values());
    }
}