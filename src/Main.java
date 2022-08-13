import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Passat passat = new Passat();
        Golf golf = new Golf();
        Artheon artheon = new Artheon();
        Golf golf2 = new Golf();
        A4 a4 = new A4();

        List<Volkswagen> volkswagenList = new ArrayList<>();
        volkswagenList.add(golf);
        volkswagenList.add(passat);
        volkswagenList.add(artheon);
        volkswagenList.add(golf2);


        for (int i = 0; i < volkswagenList.size(); i++) {
            System.out.println(volkswagenList.get(i).getModelName());
        }
        List<Audi> audiList = new ArrayList<>();
        audiList.add(a4);

        for (int i = 0; i <audiList.size() ; i++) {
            System.out.println(audiList.get(i).getModelName());

        }
    }

}