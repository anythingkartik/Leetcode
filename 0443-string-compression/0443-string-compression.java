class Solution {
    public int compress(char[] chars) {
        int i,k=0;
        int count=1;

        if(chars.length==1) {
            return 1;
        }

        for(i=0;i<chars.length-1;i++) {

            if(chars[i]==chars[i+1]) {
                count++;
            }
            else {
                chars[k]=chars[i];
                k++;
                String s=Integer.toString(count);
                if(count>1){
                    for(int j=0;j<s.length();j++) {
                        chars[k++]=s.charAt(j);
                    }
                }
                count=1;
            }      
        }
         chars[k] = chars[i];
        k++;

        if (count > 1) {
            String s = Integer.toString(count);  // Convert count to a string
            for (int j = 0; j < s.length(); j++) {
                chars[k++] = s.charAt(j);  // Write each digit of the count
            }
        }
    return k;
}
}