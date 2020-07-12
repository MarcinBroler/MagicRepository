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

W pliku `Main01.java` stwórz metodę o sygnaturze `public static void createDirectory(String fileName)`.

1. Uzupełnij ciało metody tak, aby tworzyła katalog o zadanej nazwie,
2. sprawdzaj czy katalog nie istnieje,
3. wykorzystaj metody klas pakietu `java.nio.file`: `Files.exists(directory)` oraz `Files.createDirectory(directory);`.


## Zadanie 2

W pliku `Main02.java` stwórz metodę o sygnaturze `public static void createFile (String fileName)`.

1. Uzupełnij ciało metody tak, aby tworzyła plik o zadanej nazwie,
2. sprawdzaj czy plik nie istnieje,
3. wykorzystaj metody klas pakietu `java.nio.file` .

## Zadanie 3

W pliku `Main03.java` stwórz metodę o sygnaturze `public static void copyFile(String directory, String fileName, String secondFileName)`.  
Następnie:  

1. uzupełnij ciało metody tak, aby z katalogu `directory` kopiowała plik o nazwie `fileName` do pliku o nazwie `secondFileName`.
2. sprawdzaj czy plik nie istnieje.

## Zadanie 4

W pliku `Main04.java` stwórz metodę o sygnaturze `public static void writeToFile(String fileName)`.  
Uzupełnij ciało metody tak, aby:

1. utworzyła (jeżeli nie istnieje) plik o nazwie `fileName`. 
2. pobierała z konsoli całe linie, a następnie zapisywała je do pliku. Wykorzystaj odpowiednią metodę klasy `Scanner`.


## Zadanie 5

W pliku `Main05.java` stwórz metodę o sygnaturze `public static void readFromFile(String fileName)`.  
Uzupełnij ciało metody tak, aby:

1. wczytała zawartość pliku podanego w parametrze metody (sprawdzaj czy istnieje plik źródłowy),
2. utworzyła nowy plik o rozszerzeniu `html` i nazwie takiej samej jak plik wczytywany,
3. wpisywała do nowego pliku dane w postaci `html`, gdzie każda linia pliku wczytanego będzie się znajdować w tagu `<p>`.

Przykład:
```html
<html>
<body>
<p>pierwsza linia</p>
<p>druga linia</p>
</body>
</html>

```

---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
