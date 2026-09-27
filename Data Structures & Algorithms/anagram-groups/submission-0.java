class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res=new HashMap<>();
        for(String s :strs){
            char[] charArray= s.toCharArray();
            Arrays.sort(charArray);
            String so=new String(charArray);
            res.putIfAbsent(so, new ArrayList<>());
            res.get(so).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
