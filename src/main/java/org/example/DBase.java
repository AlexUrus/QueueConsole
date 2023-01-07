package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DBase {

    static {
        try {
            fileReader = new FileReader("base.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Base not found");
        }
    }

    private static FileReader fileReader;
    private static BufferedReader bufferedReader = new BufferedReader(fileReader);
    private static List<Teacher> listTeachers = new ArrayList<>();
    private static List<Lesson> listLessons = new ArrayList<>();
   /* private static
    public static void readBase() throws IOException {
        while (bufferedReader.ready()) {
            String str = bufferedReader.readLine();
            String[] words = str.split(" ");
            Tour tour = new TourBuilderPattern().setNumber(Integer.parseInt(words[0])).setCountry(words[1])
                    .setPrice(Integer.parseInt(words[2])).setComfort(Integer.parseInt(words[3]))
                    .setHotKoef(Integer.parseInt(words[4])).setNeedVisa(Integer.parseInt(words[5])).build();
            baseOfToursList.add((TourWithVisa) tour);
            //РЅРѕРјРµСЂ СЃС‚СЂР°РЅР° СЃС‚РѕРёРјРѕСЃС‚СЊ РєРѕРјС„РѕСЂС‚ РєРѕСЌС„Inters РєРѕСЌС„Hot
        }
    }
    public static List<TourWithVisa> getBase(String condition) throws IOException {
        switch (condition){
            case "hot":
                List<TourWithVisa> sortedHot = new ArrayList<>(baseOfToursList);
                ListIterator<TourWithVisa> iterator = sortedHot.listIterator();
                while (iterator.hasNext()){
                    if(!iterator.next().getHot()) iterator.remove();
                }
                return sortedHot;
            case "default":
                return baseOfToursList;
            default: throw new IOException("РќРµ РІРµСЂРЅС‹Р№ Р·Р°РїСЂРѕСЃ");
        }
    }
    public static TourWithVisa getTour(String country) throws Exception {
        for(TourWithVisa tour : baseOfToursList){
            if(tour.getCountry().equals(country)) return tour;
        }
        throw new Exception("Р’ Р±Р°Р·Рµ РЅРµС‚ С‚Р°РєРѕРіРѕ С‚СѓСЂР°");
    }
    public static boolean exitsTour(String country){
        for(TourWithVisa tour : baseOfToursList){
            if(tour.getCountry().equals(country)) return true;
        }
        return false;
    }
}
*/
}
