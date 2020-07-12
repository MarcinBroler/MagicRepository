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

1. podzieli na wyrazy ciąg znaków przechowywany w zmiennej `str`, znajdującej się w pliku,
2. wyświetli na konsoli każdy z tych wyrazów w oddzielnej linii.

## Zadanie 2

W pliku `Main02.java` znajduje się zmienna `str`. Napisz program, który:

1. podzieli podany ciąg znaków na bohaterów z filmu `Powrót do przyszłości` – znakiem podziału jest przecinek `(,)`,
2. wyświetli na konsoli każde zdanie w oddzielnej linii.

## Zadanie 3

W pliku `Main03.java`:

1. umieść metodę o sygnaturze `public static int countTokens(String str)`,
2. uzupełnij ciało metody tak, aby zwracała liczbę wyrazów w podanym ciągu znaków.

Metoda powinna pomijać białe znaki.

Przykład:
dla `String str = "   To jest  tekst do   ";` mamy otrzymać wartość **4**;

## Zadanie 4

W pliku `Main04.java` umieść metodę o sygnaturze `public static String[] onlyTwoElements(String str, char separator)`.
Uzupełnij ciało metody tak, aby zwracała tablicę dwóch elementów, które powstały po podzieleniu tekstu (`str`) po pierwszym napotkanym znaku podziału (`separator`).

Przykład:
dla napisu `Java-zadania-podzial-napisow` oraz separatora `-` otrzymamy:
1. pierwszy element tablicy: `Java`
2. drugi element: `zadania-podzial-napisow`.

---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
