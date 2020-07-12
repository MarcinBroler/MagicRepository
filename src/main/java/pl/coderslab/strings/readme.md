![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/152855/73064373-5ed69780-3ea1-11ea-8a71-3d370a5e7dd8.png)

# Kilka ważnych informacji

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki

## Jak zacząć?

1. Stwórz [*fork*](https://guides.github.com/activities/forking/) repozytorium z zadaniami.
2. Sklonuj repozytorium na swój komputer. Użyj do tego komendy `git clone adres_repozytorium`
Adres repozytorium możesz znaleźć na stronie repozytorium po naciśnięciu w guzik "Clone or download".
3. Rozwiąż zadania i skomituj zmiany do swojego repozytorium. Użyj do tego komend `git add nazwa_pliku`.
Jeżeli chcesz dodać wszystkie zmienione pliki użyj `git add .` 
Pamiętaj że kropka na końcu jest ważna!
Następnie skommituj zmiany komendą `git commit -m "nazwa_commita"`
4. Wypchnij zmiany do swojego repozytorium na GitHubie.  Użyj do tego komendy `git push origin master`
5. Stwórz [*pull request*](https://help.github.com/articles/creating-a-pull-request) do oryginalnego repozytorium, gdy skończysz wszystkie zadania.

Poszczególne zadania rozwiązuj w odpowiednich plikach.

# Poniżej znajdziesz wytyczne do zadań

## Zadanie 1 - rozwiązywane z wykładowcą

W pliku `Main01.java` napisz program, który:

1. pobierze przedostatnią literę zmiennej `str`, znajdującej się w pliku,
2. wyświetli na konsoli liczbę wystąpień tej litery w całym ciągu znaków.

## Zadanie 2

W pliku `Main02.java` została umieszczona metoda o sygnaturze `public static int charPos(String str, char c) `.
Uzupełnij ciało metody tak, aby zwracała wartość pierwszego indeksu, pod którym w napisie `str` znajduje się znak `c`. 

## Zadanie 3

W pliku `Main03.java` została umieszczona metoda o sygnaturze `public static String firstHalf(String str)`.
Uzupełnij ciało metody tak, aby zwracała połowę napisu (uwzględniamy tylko część całkowitą podziału).
Przykład: dla napisu `CodersLab` zwróci `Code`.

## Zadanie 4

W pliku `Main04.java` została umieszczona metoda o sygnaturze `public static boolean containsStr(String str, String search)`.
Uzupełnij ciało metody tak, aby zwracała informację czy zmienna `str` zawiera w sobie element napisu ze zmiennej `search`.

## Zadanie 5 

W pliku `Main05.java` została umieszczona metoda o sygnaturze `public static String stringFromArray(String[] str)`.
Uzupełnij ciało metody tak, aby zwracała napis powstały z połączenia wszystkich napisów występujących w tablicy `str`.

## Zadanie 6

W pliku `Main06.java` napisz program, który dla znajdującej się w pliku zmiennej `str` wyświetli na konsoli odwrócony napis.
Przykład: dla napisu `Tak` wyświetli `kaT`. 

## Zadanie 7

Palindrom to słowo lub zdanie, które brzmi tak samo zarówno czytane wspak, jak i od początku, np.: "kajak", "radar", "Kobyła ma mały bok".
W pliku `Main07.java` napisz program, który sprawdzi czy zmienna `str`, znajdująca się w pliku, jest palindromem.
Uwaga: podczas sprawdzania palindromu zignoruj spacje.

## Zadanie 8

W pliku `Main08.java` została umieszczona metoda o sygnaturze `public static String toggleChar(String str) `.
Uzupełnij ciało metody tak, aby zamieniała duże litery na małe i odwrotnie, a następnie zwracała wynik. 
Przykład: dla napisu `TaK` wyświetli `tAk`. 

---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
