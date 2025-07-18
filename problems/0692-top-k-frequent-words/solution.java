class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> h = new HashMap<>();
        List<String> list = new ArrayList<>();
        
        for (String word : words) {
            
            h.put(word, h.getOrDefault(word, 0) + 1);
            if (!list.contains(word)) list.add(word);
        }
        Collections.sort(list, (String a, String b) -> {
                int aCount = h.get(a);
                int bCount = h.get(b);
            
                if (aCount == bCount) {
                    return a.compareTo(b);
                } else {
                    return bCount - aCount;
                }
            });

        return list.subList(0, k);
    }
}

// List: [apple, banana, cherry, date]

// list.sort((a, b) -> {
//     int freq = map.get(b) - map.get(a);
//     return freq != 0 ? freq : a.compareTo(b);
// });




// Compare("apple", "banana"):
//    freq = 3 - 5 = -2 (negative)
//    apple before banana

// Compare("apple", "cherry"):
//    freq = 5 - 5 = 0 (equal)
//    compare lex: "apple" < "cherry" → apple before cherry

// Compare("banana", "date"):
//    freq = 2 - 3 = -1 (negative)
//    banana before date

