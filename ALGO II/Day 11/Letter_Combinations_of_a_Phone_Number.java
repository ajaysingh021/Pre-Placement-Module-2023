class Solution {
    
    private static List<String> divideAndMerge(String digits, int i, int j, Map<Character, List<String>> hashMap) {
		
        if(i == j) {
            return hashMap.get(digits.charAt(i));
        }
        
        int mid = (i+j)/2;
        
		
        List<String> list1 = divideAndMerge(digits, i, mid, hashMap);
        List<String> list2 = divideAndMerge(digits, mid+1, j, hashMap);
        
		
        List<String> res = merge(list1, list2);
        
        return res;
    }
    
    private static List<String> merge(List<String> list1, List<String> list2) {
        List<String> tempList = new ArrayList<>();
        
		// Merge algorithm
        for(int i = 0; i < list1.size(); i++) {
            for(int j = 0; j < list2.size(); j++) {
                String temp = list1.get(i) + list2.get(j);
                tempList.add(temp);
            }
        }
        
        return tempList;
    }
    
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) {
            return new ArrayList<String>();
        }
        
	
        Map<Character, List<String>> hashMap = new HashMap<>();
        hashMap.put('1', new ArrayList<>());
        hashMap.put('2', new ArrayList<>(Arrays.asList("a","b","c")));
        hashMap.put('3', new ArrayList<>(Arrays.asList("d","e","f")));
        hashMap.put('4', new ArrayList<>(Arrays.asList("g","h","i")));
        hashMap.put('5', new ArrayList<>(Arrays.asList("j","k","l")));
        hashMap.put('6', new ArrayList<>(Arrays.asList("m","n","o")));
        hashMap.put('7', new ArrayList<>(Arrays.asList("p","q","r","s")));
        hashMap.put('8', new ArrayList<>(Arrays.asList("t","u","v")));
        hashMap.put('9', new ArrayList<>(Arrays.asList("w","x","y","z")));
        
		
        return divideAndMerge(digits,0, digits.length()-1, hashMap);
        
    }
}