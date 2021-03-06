/*
Wite a method to replace all spaces in a string with '%20'.
 */

public class URLify {
    public static void main(String[] args) {
        String s = "Mr John smith    ";
        s.trim();
        char[] chArr = s.toCharArray();
        System.out.println(replaceSpaces(chArr, 13));

    }

    public static String replaceSpaces(char[] str, int trueLength){
        int spaceCount = 0 , index, i=0;
        for(i=0; i<trueLength; i++){
            if(str[i] == ' '){
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if(trueLength < str.length) str[trueLength]='\0'; // end array
        for(i=trueLength-1; i>=0; i--){
            if(str[i]==' '){
                str[index-1] = '0';
                str[index-2] = '2';
                str[index-3] = '%';
                index = index -3;
            }else {
                str[index - 1] = str[i];
                index--;
            }
        }
        return str.toString();
    }
}
