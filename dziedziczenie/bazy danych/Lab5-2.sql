-- Zagadnienia
-- Zapytania oparte na wielu tabelach. 
-- Zadanie 1
-- Porównaj wyniki poniższych zapytań: 

SELECT k.nazwa FROM klienci k;

 SELECT k.nazwa, z.idzamowienia FROM klienci k, zamowienia z;
 SELECT k.nazwa, z.idzamowienia FROM klienci k, zamowienia z  
 WHERE z.idklienta = k.idklienta;
-- 
 SELECT k.nazwa, z.idzamowienia FROM klienci k NATURAL JOIN zamowienia z;
  SELECT k.nazwa, z.idzamowienia FROM klienci k JOIN zamowienia z
 ON z.idklienta=k.idklienta;
  SELECT k.nazwa, z.idzamowienia FROM klienci k JOIN zamowienia z
  USING (idklienta);
-- 1. W którym zapytaniu występuje iloczyn kartezjański? 2
-- 2. Które zapytanie dostarcza bezwartościowych danych? 2,3

-- Zadanie 2

-- Napisz zapytanie w języku SQL wyświetlające informacje na temat zamówień (data realizacji, idzamowienia), które: 

-- 1. zostały złożone przez klienta, który ma na imię Antoni,
SELECT k. nazwa ,datarealizacji,idzamowienia FROM zamowienia z NATURAL JOIN klienci k  WHERE k.nazwa like ('%Antoni') ;

-- 2. zostały złożone przez klientów z mieszkań (zwróć uwagę na pole ulica),

SELECT k.nazwa,k. ulica ,z.datarealizacji,z.idzamowienia FROM zamowienia z NATURAL JOIN klienci k  WHERE k.ulica like ('%/%') ;

-- 3. zostały złożone przez klienta z Krakowa do realizacji w listopadzie 2008 roku.
select* FROM klienci;
select* FROM zamowienia;

SELECT k. nazwa ,datarealizacji,idzamowienia,miejscowosc FROM zamowienia z NATURAL JOIN klienci k  WHERE k.miejscowosc='Krakow' AND z.datarealizacji BETWEEN '2008-11-01' AND '2008-11-30' ;

-- W każdym zapytaniu należy dodać dodatkowe pola (poza informacjami o zamówieniu), które pozwolą sprawdzić, czy wynik jest poprawny np. nazwa klienta, ulica etc. 

-- Zadanie 3

-- Napisz zapytanie w języku SQL wyświetlające informacje na temat klientów (nazwa, ulica, miejscowość), którzy: 

-- 1. złożyli zamówienia z datą realizacji 12.11.2008,

SELECT k.nazwa,k.ulica,k.miejscowosc, z.datarealizacji FROM klienci k NATURAL JOIN zamowienia z WHERE z.datarealizacji= '2008-11-12';

-- 2. złożyli zamówienia z datą realizacji w listopadzie 2008,
SELECT k.nazwa,k.ulica,k.miejscowosc, z.datarealizacji FROM klienci k NATURAL JOIN zamowienia z WHERE z.datarealizacji  BETWEEN '2008-11-01' AND '2008-11-30';
 
-- 3. zamówili pudełko Kremowa fantazja lub Kolekcja jesienna,
SELECT * FROM pudelka;
SELECT* k.nazwa,k.ulica,k.miejscowosc,p.nazwa,z.datarealizacji FROM klienci k NATURAL JOIN zamowienia z  NATURAL JOIN artykuly a JOIN pudelka p ON a.idpudelka= p.idpudelka WHERE
 p.nazwa= 'Kremowa fantazja' OR p.nazwa='Kolekcja jesienna'; 
 SELECT * FROM zawartosc;
-- 4. zamówili co najmniej 2 sztuki pudełek Kremowa fantazja lub Kolekcja jesienna w ramach jednego zamówienia,

SELECT k.nazwa,k.ulica,k.miejscowosc,p.nazwa,a.sztuk  FROM klienci k NATURAL JOIN zamowienia z NATURAL JOIN artykuly a JOIN pudelka p ON a.idpudelka= p.idpudelka 
WHERE (p.nazwa= 'Kremowa fantazja' OR p.nazwa='Kolekcja jesienna') AND a.sztuk>=2;

-- 5. zamówili pudełka, które zawierają czekoladki z migdałami,
SELECT k.nazwa,k.ulica,k.miejscowosc,p.nazwa,a.sztuk,c.rodzajorzechow  FROM klienci k NATURAL JOIN zamowienia z NATURAL JOIN artykuly a 
JOIN pudelka p ON a.idpudelka= p.idpudelka INNER JOIN zawartosc zaw
ON p.idpudelka=zaw.idpudelka INNER JOIN czekoladki c ON zaw.idczekoladki=c.idczekoladki WHERE c.rodzajorzechow='Migdaly';
SELECT*FROM czekoladki;
-- 6. złożyli przynajmniej jedno zamówienie,

SELECT k.nazwa,k.ulica,k.miejscowosc FROM klienci k NATURAL JOIN zamowienia z;

-- 7. nie złożyli żadnych zamówień.
SELECT * FROM zamowienia;

SELECT k.nazwa,k.ulica,k.miejscowosc FROM klienci k left OUTER  JOIN zamowienia z on k.idklienta=z.idklienta WHERE z.idzamowienia IS NULL;
 

-- W każdym zapytaniu należy dodać dodatkowe pola (poza danymi klientów), które pozwolą sprawdzić, czy wynik jest poprawny np. data realizacji, nazwa pudełka etc. 
-- Zadanie 4
-- Napisz zapytanie w języku SQL wyświetlające informacje na temat pudełek i ich zawartości (nazwa, opis, nazwa czekoladki, opis czekoladki): 
-- 1. wszystkich pudełek,
SELECT * FROM pudelka;
-- 
-- 2. pudełka o wartości klucza głównego HEAV,
SELECT p.nazwa,p.idpudelka FROM pudelka p WHERE idpudelka= 'HEAV';
-- 
-- 3. pudełek, których nazwa zawiera słowo Kolekcja.
SELECT p.nazwa,p.opis FROM pudelka p WHERE opis LIKE 'Kolekcja%';
-- 
-- 
-- W każdym zapytaniu należy dodać dodatkowe pola (poza danymi o pudełkach), które pozwolą sprawdzić, czy wynik jest poprawny. 
-- Zadanie 5
-- Napisz zapytanie w języku SQL wyświetlające informacje na temat pudełek z czekoladkami (nazwa, opis, cena), które: 
-- 1. zawierają czekoladki o wartości klucza głównego D09
SELECT nazwa p,opis p,cena p, idczekoladki FROM pudelka p NATURAL JOIN zawartosc z WHERE z.idczekoladki ='D09';
-- 
-- 2. zawierają czekoladki Gorzka truskawkowa,
-- 
-- 3. zawierają przynajmniej jedną czekoladkę, której nazwa zaczyna się na S,
-- 
-- 4. zawierają przynajmniej 4 sztuki czekoladek jednego gatunku (o takim samym kluczu głównym),
-- 
-- 5. zawierają co najmniej 3 sztuki czekoladki Gorzka truskawkowa,
-- 
-- 6. zawierają czekoladki z nadzieniem truskawkowym,
-- 7. nie zawierają czekoladek w gorzkiej czekoladzie,
-- 
-- 8. nie zawierają czekoladek z orzechami,
-- 
-- 9. zawierają przynajmniej jedną czekoladkę bez nadzienia.
-- 
-- W każdym zapytaniu należy dodać dodatkowe pola (poza danymi o pudełkach), które pozwolą sprawdzić, czy wynik jest poprawny.
-- Zadanie 6
-- Napisz zapytanie w języku SQL wyświetlające informacje na temat pudełek z czekoladkami (nazwa, cena), oraz o: 
-- 1. łącznej wartości tych pudełek, które znajdują się w magazynie,
-- 
-- 2. łącznej masie czekoladek o wartości klucza głównego B01, które znajdują się w tych pudełkach,
-- 
-- 3. łącznej masie czekoladek Gorzka truskawkowa, które znajdują się w tych pudełkach,
-- 
-- 4. łącznym koszcie wytworzenia czekoladek o wartości klucza głównego B01, które znajdują się w tych pudełkach,
-- 
-- 5. łącznym koszcie wytworzenia czekoladek Gorzka truskawkowa, które znajdują się w tych pudełkach,
-- 
-- W każdym zapytaniu należy dodać dodatkowe pola (poza danymi o pudełkach), które pozwolą sprawdzić, czy wynik jest poprawny. W zapytaniach nie wolno stosować funkcji agregujących. 
-- Zadanie 7
-- Napisz poniższe zapytania w języku SQL: 
-- 1. Wyświetl wartości kluczy głównych oraz nazwy czekoladek, których koszt jest większy od czekoladki o wartości klucza głównego równej D08.
-- 
-- 2. Kto (nazwa klienta) złożył zamówienia na takie same czekoladki (pudełka) jak zamawiała Gorka Alicja.
-- 
-- 3. Kto (nazwa klienta, adres) złożył zamówienia na takie same czekoladki (pudełka) jak zamawiali klienci z Katowic.
-- Uwaga: w powyższych zapytaniach należy użyć samozłączeń (złączeń własnych). 
