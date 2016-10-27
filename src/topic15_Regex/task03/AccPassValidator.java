package topic15_Regex.task03;

import java.io.IOException;
import java.util.regex.Pattern;

/*Написать регулярное(ые) выражение(я), проверяющее допустимость символов, во введенном логине, пароле
Условия проверки на логин:
1) Начинается с латинской буквы;
2) Может содержать буквы, цифры и следующие знаки "._-";
3) Должен содержать заглавные и прописные буквы и цифры (не знаю как в одном регексе задать сразу все условия)
4) Символы, кроме букв и цифр, не должны идти подряд (не знаю как в одном регексе задать сразу все условия)
*/
public class AccPassValidator {

    public static boolean checkAccPass (String[] strings) throws IOException{

        boolean isAccValid = false;
        boolean isPassValid = false;
        if (strings.length <2)
            throw new IOException("Переданы менее 2-х строк, следовательно не передан логин/пароль/ничего");
        if (strings.length >2)
            throw new IOException("Передано более 2-х строк, следовательно передано что-то лишнее");

        Pattern pattern = Pattern.compile("");
        isAccValid = (Pattern.matches("([a-zA-Z])(\\w|\\.|-){7,15}", strings[0]));
        System.out.println(isAccValid);
        isPassValid = (Pattern.matches("([a-zA-Z])(\\w|\\.|-){7,15}", strings[1]));
        System.out.println(isPassValid);

        return isAccValid && isPassValid;
    }
}
