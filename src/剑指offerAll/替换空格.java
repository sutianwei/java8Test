package 剑指offerAll;

public class 替换空格 {
    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (String.valueOf(s.charAt(i)).equals(" ")){
                builder.append("%20");

            }else {
                builder.append(s.charAt(i));
            }
        }
        return String.valueOf(builder);
    }
}
