package topic15_Regex;

import topic15_Regex.task01.Hexademical;
import topic15_Regex.task02.EmailsValidationClass;
import topic15_Regex.task03.AccPassValidator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader("resources/findAllNotes")){
                while (reader.ready()){
                    sb.append((char) reader.read());
                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){}

        ArrayList<String> strings = Hexademical.findHexademical(sb.toString());
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println();
        System.out.println(EmailsValidationClass.validateEmails(sb.toString()));

        String[] accAndPass = new String[2];
        accAndPass[0] = "F..32k3L";
        accAndPass[1] = "F------------";

        try {
            System.out.println(AccPassValidator.checkAccPass(accAndPass));
        } catch (IOException e) {

        }

    }
}
