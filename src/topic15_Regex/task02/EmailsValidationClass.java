package topic15_Regex.task02;

    /*Найти в тексте все email-адреса и посчитать количество адресов, имеющих одно и тоже account name*/

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailsValidationClass {

    public static int validateEmails(String string){
        HashMap<String, Integer> map = new HashMap<>();

        Pattern pattern = Pattern.compile("([\\w|\\.]+)@([a-z]|[A-Z])+\\.[a-z]{2,3}");
        Matcher matcher = pattern.matcher(string);

        int result =0;
        while (matcher.find()){
            if (map.size()>0){
                if (map.containsKey(matcher.group(1))){
                    map.put(matcher.group(1), map.get(matcher.group(1))+1);
                } else map.put(matcher.group(1), 1);
            } else map.put(matcher.group(1), 1);
        }

        for (Map.Entry<String, Integer> pair:
             map.entrySet()) {
            if (pair.getValue() > 1){
                result ++;
            }
        }
        return result;
    }
}
