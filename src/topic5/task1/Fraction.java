package topic5.task1;

import java.util.List;
class Fraction {
    void printFr(ПростаяДробь fr){
        if (fr != null)
        System.out.println(fr);
    }
    
    void printFrArray(ПростаяДробь[] fr){
        if (fr != null)
        for (int i = 0; i < fr.length; i++) {
            printFr(fr[i]);
        }
    }
    
    void printFrCollection(List<ПростаяДробь> fr){
        if (fr != null)
        for (ПростаяДробь iterator:
             fr) {
            printFr(iterator);
        }
    }
}
