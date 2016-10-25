package topic15_Regex;

import topic15_Regex.task01.Hexademical;
import topic15_Regex.task02.EmailsValidationClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (FileReader reader = new FileReader("sdv")){
                while (reader.ready()){
                    sb.append(reader.read());
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

    }
}
