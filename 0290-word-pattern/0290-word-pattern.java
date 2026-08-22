class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" ");
        Map<Character,String> map1=new HashMap<>();
        Map<String,Character> map2=new HashMap<>();
        if(pattern.length()!=str.length) return false;
        for(int i=0;i<pattern.length();i++){
        char ch=pattern.charAt(i);
        String word=str[i];
        if(map1.containsKey(ch)){
            if(!map1.get(ch).equals(word)){
                 return false;
             
            }
        }
        if(map2.containsKey(word)){
            if(map2.get(word)!=ch){
                return  false;
                
            }
        }
        map1.put(ch,word);
        map2.put(word,ch);
        }
        return true;

    }
}