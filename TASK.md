Programowanie Urządzeń Mobilnych  - Laboratoria
Uniwersytet Jagielloński, Instytut Informatyki i Matematyki Komputerowej, 2014

Autor: Przemysław Kadela
Spotkanie: 2014-10-06
Grupa: 4


------------------------------------------------------------------------------
AGENDA

* Rozgrzewka w Javie


------------------------------------------------------------------------------
ĆWICZENIA

---------------------------------------
1. Numer IBAN

Napisać aplikację sprawdzającą poprawność numerów IBAN. Program odczytuje z pliku in.txt kolejne wiersze tekstu ignorując białe znaki (spacje, tabulacje). Jeżeli wiersz nie jest pusty program sprawdza, czy jest to prawidłowy numer rachunku IBAN. Program ma działać wyłącznie dla numerów polskich (rozpoczynających się od PL).
Aplikacja tworzy plik out.txt do którego wpisuje kolejne odczytane wiersze i na końcu dopisuje informację, czy numer w danym wierszu jest prawidłowy.
Uwaga - sprawdzanie poprawności numerów rachunków powinno być wykonane w ramach wyizolowanej klasy, którą łatwo będzie można przenieść do innego programu.

Algorytm sprawdzania cyfr kontrolnych IBAN to:
  Weź pełen numer konta (razem z kodem kraju), bez spacji.  
  Sprawdź czy zgadza się długość numeru dla danego kraju.
  Przenieś 4 pierwsze znaki numeru na jego koniec.
  Zamień litery w numerze konta na ciągi cyfr, zamieniając 'A' na '10', 'B' na '11' itd aż do 'Z' na '35' (dla Polski 2521).
  Potraktuj otrzymany ciąg znaków jak liczbę i wylicz resztę z dzielenia przez 97.
  Jeśli reszta jest równa 1, to numer konta ma prawidłowe cyfry kontrolne.
  
Przykład:

in.txt zawiera
  PL 42 1840 0007 2213 3200 0811 1319
  PL 22 1840 0007 2213 3200 0811 1319
  EN 42 1840 0007 2213 3200 0811 1319
  PL 82 222
  
out.txt:
  PL42184000072213320008111319 POPRAWNY
  PL22184000072213320008111319 BLEDNY
  EN42184000072213320008111319 BLEDNY
  PL82222 BLEDNY

---------------------------------------

