package pl.coderslab.strings;

public class Main01 {

    public static void main(String[] args) {

        String str = "CodersLab jak dobrze zacząć programować";

        // Pobieram z stringa str przedostatnią litere i przypisuje do zmiennej o nazwie c
        // str.length() - 2 zwroci mi indeks przedostatniej litery
        char c = str.charAt(str.length() - 2);

        //inicjalizacuje licznik, ktory bedzie mi liczyl wystąpienia
        int counter = 0;
        // pobieram ze stringa wszystkie znaki (char) pod postacia tablicy
        char[] charArr = str.toCharArray();

        //iteruje się, po wszystkich znakach w tablicy (tej którą instrukcje wcześnmiej wyciągnałęm
        for(int i=0; i<charArr.length; i++) {
            // prezchodzac po kolei po kazdym znaku, sprawdzam czy ktorych z nich
            // jest taki sam, jak ten na miejscu przedostatnim
            if(charArr[i] == c) {
                //jeśli tak, zwiększam licznik
                counter++;
            }
        }

/*        for(Character el : str.toCharArray()) {
            if(el == c) {
                counter++;
            }
        }*/

        System.out.println(counter);

    }
}
