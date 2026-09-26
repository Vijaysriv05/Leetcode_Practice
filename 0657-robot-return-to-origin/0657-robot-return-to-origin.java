class Solution {
    public boolean judgeCircle(String moves) {
        char ch[]=moves.toCharArray();
        int uc=0;
        int lc=0;
        int dc=0;
        int rc=0;
        for(int i=0;i<moves.length();i++){
            if(ch[i]=='U'){
                uc++;
            }
            if(ch[i]=='D'){
                dc++;
            }
            if(ch[i]=='L'){
            lc++;
            }
            if(ch[i]=='R'){
                rc++;
            }
        }
        if((uc==dc)&&(lc==rc)){
            return true;
        }
        else{
            return false;
        }
    }
}