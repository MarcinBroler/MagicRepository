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

W pliku `Main01.java` stwórz metodę o sygnaturze `public static void getInfo()`.

W ciele metody dodaj kod, który:

1. poprosi Cię o podanie imienia,
2. poprosi Cię o podanie wieku,
3. wypisze na konsoli informacje w formacie `"{imię} ma {wiek} lat"`.  
Wywołaj metodę w metodzie `main`.

## Zadanie 2

W pliku `Main02.java` stwórz metodę o sygnaturze `public static void operations()`.

Uzupełnij ciało metody tak, by wczytała 2 liczby, a następnie wyświetliła na konsoli wyniki:  
1. dodawania,
2. odejmowania,
3. mnożenia,
4. dzielenia.  
Wywołaj metodę w metodzie `main`.

## Zadanie 3

W pliku `Main03.java` stwórz metodę o sygnaturze `public static void getData()`.

Uzupełnij ciało metody tak, aby:

1. wczytywała liczby z konsoli do momentu wprowadzania 0 (ale nie włączając go do sumy liczb), 
2. sumowała ich wartość oraz liczbę.  
Wywołaj metodę w metodzie `main`.

## Zadanie 4

W pliku `Main04.java` stwórz metodę o sygnaturze `public static void rowsColumns()`, która:

1. wczyta z konsoli 2 liczby całkowite i przypisze je do zmiennych `rows` i `columns`,
2. stworzy tablicę o podanej liczbie wierszy i kolumn,
3. wypełni tablicę kolejnymi liczbami całkowitymi,
4. obliczy i wyświetli na konsoli sumę wszystkich elementów,
5. obliczy i wyświetli na konsoli średnią wszystkich elementów.  
Wywołaj metodę w metodzie `main`.

## Zadanie 5

W pliku `Main05.java` stwórz metodę o sygnaturze `public static void textLines()`, która wczyta kolejne linie tekstu z konsoli,  
a następnie je wyświetli. Program ma zakończyć działanie po wpisaniu `quit` (ale już bez wyświetlania go na konsoli).  
Wywołaj metodę w metodzie `main`.

## Zadanie 6

W pliku `Main06.java` stwórz metodę o sygnaturze `public static void equation()`, która:

1. poprosi o podanie liczb całkowitych `a`, `b`, `c`,
2. obliczy pierwiastki równania kwadratowego, a następnie je wyświetli.  
Wywołaj metodę w metodzie `main`.

## Zadanie 7

W pliku `Main07.java` stwórz metodę o sygnaturze `public static void nettoBrutto()`, która:

1. Wczyta z konsoli typ wyliczenia dostępne wartości to:
**bn** &ndash; zamiana brutto na netto
**nb** &ndash; zamiana netto na brutto
2. Wczyta z konsoli wartość do zamiany a następnie dokona zamiany wg wcześniej określonego typu.  

W przypadku otrzymania wartości innej niż możliwe **bn**, **nb** &ndash; program będzie pytał do skutku.  
Wywołaj metodę w metodzie `main`.

---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
