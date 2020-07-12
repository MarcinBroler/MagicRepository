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

W pliku `Main01.java` napisz metodę `public static int multiply(int multipler, int index)`,
która zwróci wartość zmiennej `multipler` pomnożonej przez wartość argumentu `index`.

## Zadanie 2

W pliku `Main02.java` napisz metodę `public static int square(int num)`, 
która zwróci wartość `num` podniesioną do kwadratu.

## Zadanie 3

W pliku `Main03.java` napisz publiczną metodę `convertToUsd`, która przyjmuje parametr `pln`, czyli kwotę w złotówkach.
 Metoda ma zwrócić podaną kwotę w dolarach amerykańskich. Jako przelicznik przyjmij wartość 4.04 PLN = 1 USD.

## Zadanie 4

W pliku `Main04.java` napisz publiczną metodę `createName`, która przyjmie następujące parametry:

* `name`: imię,
* `surname`: nazwisko,
* `nickname`: pseudonim.

Metoda ma zwrócić łańcuch tekstowy z połączonymi parametrami, w postaci: "imię pseudonim nazwisko".

## Zadanie 5

W pliku `Main05.java` napisz publiczną metodę `calculateNetto`, która przyjmie argumenty:

* `gross`: kwotę brutto ceny zakupu,
* `vat`: wartość podatku VAT. Możesz założyć, że VAT ma być liczbą zmiennoprzecinkową z zakresu 0 &ndash; 1.

Metoda ma zwrócić wartość netto ceny. Napisz w komentarzu jakie obliczenia musisz wykonać.

## Zadanie 6

W pliku `Main06.java` napisz publiczną metodę `checkMaturity`, która:

* przyjmie parametr liczbowy `age` oznaczający wiek użytkownika,
* sprawdzi czy użytkownik jest pełnoletni,
* zwróci wartość `true` &ndash; jeśli jest pełnoletni,
* zwróci wartość `false` &ndash; jeśli nie jest.

## Zadanie 7

W pliku `Main07.java` napisz publiczną metodę `checkEvenOdd`, która:

* przyjmie parametr liczbowy `number`,
* będzie zwracać wartość typu `String`,
* zwróci wynik "even", jeśli liczba jest parzysta,
* zwróci wynik "odd", jeśli liczba jest nieparzysta.

## Zadanie 8

W pliku `Main08.java` napisz publiczną metodę `maxOfThree`, która przyjmie trzy parametry liczbowe. Metoda ma zwrócić największą liczbę.


## Zadanie 9

W pliku `Main09.java` napisz publiczną metodę `factorial`, która przyjmie jako parametr liczbę naturalną `n`. Metoda ma zwrócić wartość *n!*, 
czyli wynik mnożenia wszystkich liczb naturalnych w zakresie 1...n.

## Zadanie 10* (Dodatkowe)

Gdy klub piłkarski A gra dwumecz z klubem piłkarskim B, oznacza to, że grają jeden mecz na boisku drużyny A i jeden na boisku drużyny B.

Wygrywa ta drużyna, która zdobędzie więcej goli w obu meczach.

W przypadku, gdy drużyny zdobyły tyle samo bramek, gole zdobyte na wyjeździe liczą się jako "trochę ważniejsze" 
i wygrywa ta drużyna, która zdobyła więcej bramek na wyjeździe.

Remis w dwumeczu wypada wtedy, gdy obie drużyny zdobyły  tyle samo bramek i mają tyle samo bramek na wyjeździe.

----
**Na przykład:**

W Pucharze Polski grają dwa zespoły: **Grom** i **Błyskawica**. Zespoły rozegrały następujące mecze:

**Gospodarz: Grom.**

Grom 0:2 Błyskawica

**Gospodarz: Błyskawica.**

Błyskawica 1:3 Grom

Sumaryczny wynik dwumeczu wynosi 3:3. Jednak Grom na wyjeździe zdobył 3 bramki, a Błyskawica tylko 2. Zatem wygrywa Grom.

----

Napisz metodę, `footballWin`, która przyjmie następujące parametry:

* gole zdobyte przez zespół A w pierwszym meczu (na boisku zepołu A),
* gole zdobyte przez zespół B w pierwszym meczu (na boisku zepołu A),
* gole zdobyte przez zespół A w drugim meczu (na boisku zespołu B),
* gole zdobyte przez zespół B w drugim meczu (na boisku zespołu B),

po czym zwróci `1`, jeśli dwumecz wygrał zespół A, `2` &ndash; jeśli B. W przypadku remisu, zwróć `X`. 
Wynik ma być łańcuchem tekstowym, a nie liczbą!


---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
