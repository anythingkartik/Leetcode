class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        int k=0;
        for(int i=0;i<words.length;i++)
        {
            String w=words[i];
            if(w.indexOf(x)!=-1)
            {
                result.add(i);
            k++;
            }
        }
        return result;
    }
}