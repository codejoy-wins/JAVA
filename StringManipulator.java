public class StringManipulator {
    public String trimAndConcat(String string1, String string2) {
        String str = (string1 + string2).trim();
        return str;
    }
    public Integer getIndexOrNull(String string1, char char1) {
        int a = string1.indexOf(char1);
        if(a == -1){
            return null;
        }else{
            return a;
        }
    }
    public Integer getIndexOrNull(String string1, String string2) {
        int a = string1.indexOf(string2);
        if(a == -1){
            return null;
        }else{
            return a;
        }
    }
    public String concatSubstring(String string1, int int1, int int2, String string2) {
        String str2 = string1.substring(int1,int2) + string2;
        return str2;
    }
}