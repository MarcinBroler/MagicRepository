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

W pliku `Main01` znajduje się kod programu.

1. Ustaw breakpoint w miejscu instrukcji `int x = 33 * 55;` a następnie uruchom program w trybie debugowania.
2. Zrób krok do przodu i zobacz zmienną `x`.
3. Zrób krok do przodu i zobacz ponownie zmienną `text`.
4. Zrób krok do przodu i przejdź do metody `bar` z klasy `Foo` przy pomocy przycisku `Step into`.
5. Wróć do metody `main` klasy `Main01` przy pomocy przycisku `Step out`.
6. Puść program do końca przy pomocy przycisku `Resume`.

## Zadanie 2 - rozwiązywane z wykładowcą

W pliku `Main02` znajduje się kod programu.

1. Ustaw breakpoint w miejscu instrukcji `int a = 11 / 3;` a następnie uruchom program w trybie debugowania.
2. Zrób krok do przodu aż do końca i zaobserwuj wartości które przyjmują znajdujące się tam zmienne.

## Zadanie 3
W pliku `Main03` znajduje się kod programu.

1. Ustaw breakpoint w lini:
````
 b = i < 9995 ? a / i : a * i;
````
a następnie uruchom program w trybie debugowania.
1. Wznawiaj program kilka razy, a następnie go zatrzymaj.
2. Zmodyfikuj breakpoint nadając mu warunek `i<3`.
3. Debuguj ponownie program, do momentu wystąpienia wyjątku.
4. Pozostaw program z błędem.

## Zadanie 4

W pliku `Main04` znajduje się metoda, która ma obliczyć sumę elementów podanych jako argument.
1. Zdebuguj a następnie popraw program tak by zwracał poprany wynik.

## Zadanie 5

W pliku `Main05` znajduje się metoda, która ma obliczyć średnią elementów podanych jako argument.
1. Zdebuguj a następnie popraw program tak by zwracał poprany wynik.

---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
