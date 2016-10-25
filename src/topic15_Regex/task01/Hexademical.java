package topic15_Regex.task01;
/*
    Найти в текстовом файле все числа, записанные с 16-ричной системе счисления
*/

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hexademical {
    public static List<String> findHexademical(String str){
        ArrayList<String> hexademical = new ArrayList<>();

        Pattern pattern = Pattern.compile("0x(\\d|[A-F])+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            hexademical.add(str.substring(matcher.start(), matcher.end()));
        }
        return hexademical;
    }
}
