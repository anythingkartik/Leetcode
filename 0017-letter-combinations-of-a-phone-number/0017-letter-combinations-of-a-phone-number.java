class Solution {
    public List<String> letterCombinations(String digits) {
        //List<String> combinations=new ArrayList<>();

        if(digits.isEmpty()) {
            return new ArrayList<>();
        }

        Queue<String> queue=new LinkedList<>(); 
        queue.add("");

        HashMap<Character,String> keyboard=new HashMap<>();
        keyboard.put('2',"abc");
        keyboard.put('3',"def");
        keyboard.put('4',"ghi");
        keyboard.put('5',"jkl");
        keyboard.put('6',"mno");
        keyboard.put('7',"pqrs");
        keyboard.put('8',"tuv");
        keyboard.put('9',"wxyz");
    
        for(char number:digits.toCharArray()){
            String letters=keyboard.get(number);

            int size=queue.size();

            for (int i = 0; i < size; i++) {  
                 String combination = queue.poll(); 

                for(char ch:letters.toCharArray()) {
                     queue.add(combination + ch);
                } 
            }
        }
     return new ArrayList<>(queue);
    }
}