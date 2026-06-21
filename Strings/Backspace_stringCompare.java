package Strings;

class Backspace_stringCompare{
    public static boolean backspaceCompare(String s, String t) {
        int i = s.length()-1;
        int j = t.length() - 1;
        
      while(i  >= 0 || j>=0){ 
         i = getNextValidIndex(s, i);
         j = getNextValidIndex(t, j);

         if (i < 0 && j <0){
            return true;
         }
         if (i < 0 || j < 0){
            return false;
         }
         if (s.charAt(i) != t.charAt(j)) {
             return false;
         }
         i--;
         j--;

    }
    return true;
    }

    private static int getNextValidIndex( String str, int index){
        int backspace = 0;

        while (index >= 0){
            if(str.charAt(index) == '#'){
                backspace++;
            }
            else if(backspace > 0){
                backspace --;
            }else {
                break;
            }
            index--;
        }
        return index;
    }

    public static void main(String args[]){
       String s ="ab##c";
       String t = "ab#c";

       boolean ans = backspaceCompare(s, t);
       System.out.println(ans);
    }
}