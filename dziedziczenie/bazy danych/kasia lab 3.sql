-- Napisz zapytanie w języku SQL wyświetlające informacje na temat czekoladek (IDCzekoladki, Nazwa, RodzajCzekolady, RodzajOrzechow, RodzajNadzienia), których nazwa: 
-- 1. rozpoczyna się na literę 'S',
SELECT IDczekoladki,nazwa,rodzajczekolady,rodzajorzechow,rodzajnadzienia FROM czekoladki Where nazwa LIKE 'S%';
--  
-- 2. rozpoczyna się od 'Slod',
-- 
SELECT IDczekoladki,nazwa,rodzajczekolady,rodzajorzechow,rodzajnadzienia FROM czekoladki WHERE nazwa LIKE 'Slod%';
-- 3. rozpoczyna się na literę 'S' i kończy się na literę 'i',
SELECT IDczekoladki,nazwa,rodzajczekolady,rodzajorzechow,rodzajnadzienia FROM czekoladki WHERE nazwa LIKE 'S%i';
-- 
-- 4. rozpoczyna się na literę 'S' i zawiera w środku literę 'm',
SELECT IDczekoladki,nazwa,rodzajczekolady,rodzajorzechow,rodzajnadzienia FROM czekoladki WHERE nazwa LIKE 'S%m%';
-- 
-- 5. rozpoczyna się na literę 'S' i zawiera słowo rozpoczynające się na literę 'm',
SELECT IDczekoladki,nazwa,rodzajczekolady,rodzajorzechow,rodzajnadzienia FROM czekoladki WHERE nazwa LIke'S% m%';
-- 
-- 6. rozpoczyna się na literę 'A', 'B' lub 'C',
SELECT IDczekoladki,nazwa,rodzajczekolady,rodzajorzechow,rodzajnadzienia FROM czekoladki WHERE nazwa LIKE 'A%' or nazwa LIKE 'B%'or nazwa LIKE'C%';
-- 
-- 7. zawiera rdzeń 'orzech' (może on wystąpić na początku i wówczas będzie pisany z wielkiej litery),
 SELECT IDczekoladki,nazwa,rodzajczekolady,rodzajorzechow,rodzajnadzienia FROM czekoladki WHERE nazwa  ILIKE '%orzech%';
-- 8. zawiera słowo 'maliny' lub 'truskawki',
 SELECT IDczekoladki,nazwa,rodzajczekolady,rodzajorzechow,rodzajnadzienia FROM czekoladki WHERE nazwa LIKE '%maliny%' or nazwa LIKE '%truskawki%';
-- 9. nie rozpoczyna się żadną z liter: 'D'-'K', 'S' i 'T',
SELECT IDczekoladki,nazwa,rodzajczekolady,rodzajorzechow,rodzajnadzienia FROM czekoladki WHERE nazwa  NOT SIMILAR TO '([D-K]|[S,T])%';
-- 
-- 10. składa się dokładnie z jednego słowa.
SELECT IDczekoladki,nazwa,rodzajczekolady,rodzajorzechow,rodzajnadzienia FROM czekoladki WHERE nazwa NOT LIKE '% %';


Zadanie 2

Napisz zapytanie w języku SQL wyświetlające informacje na temat czekoladek (IDZamowienia, DataRealizacji), które mają być zrealizowane: 
--1. w listopadzie 2008,

--2. między 12 i 20 listopada 2008,

--3. w listopadzie lub grudniu 2008,

--4. między 1 i 6 grudnia lub między 20 i 24 grudnia 2008. 



Zadanie 3

Napisz zapytanie w języku SQL wyświetlające informacje na temat czekoladek (IDCzekoladki, Nazwa, Masa, Koszt), których: 

--1. masa mieści się w przedziale od 15 do 24 g,

--2. masa mieści się w przedziale od 25 do 35 g,

--3. koszt produkcji mieści się w przedziale od 15 do 24 gr,

--4. koszt produkcji mieści się w przedziale od 25 do 35 gr,


Zadanie 4

Korzystając z zapytań z zadania 3 oraz operatorów UNION, INTERSECT, EXCEPT napisz zapytanie w języku SQL wyświetlające informacje na temat
 czekoladek (IDCzekoladki, Nazwa, Masa, Koszt), których (UWAGA: Każde zapytanie ma zostać umieszczone w oddzielnym pliku, skrypcie): 
 
--1. masa mieści się w przedziale od 15 do 24 g lub koszt produkcji mieści się w przedziale od 15 do 24 gr,

--2. masa mieści się w przedziale od 15 do 24 g i koszt produkcji mieści się w przedziale od 15 do 24 gr,

--3. masa mieści się w przedziale od 25 do 35 g, ale koszt produkcji nie mieści się w przedziale od 25 do 35 gr,

--4. masa mieści się w przedziale od 15 do 24 g i koszt produkcji mieści się w przedziale od 15 do 24 gr lub masa mieści się w przedziale od 25 do 35 g i koszt produkcji mieści się w przedziale od 25 do 35 gr,

--5. masa mieści się w przedziale od 25 do 35 g, ale koszt produkcji nie mieści się ani w przedziale od 15 do 24 gr, ani w przedziale od 25 do 35 gr.


Zadanie 5

Napisz zapytanie w języku SQL wyświetlające informacje na temat czekoladek (IDCzekoladki, Nazwa, RodzajCzekolady, RodzajOrzechow, RodzajNadzienia), które: 

--1. zawierają jakieś orzechy,
SELECT idczekoladki, nazwa, rodzajczekolady, rodzajorzechow, rodzajnadzienia FROM czekoladki WHERE  rodzajorzechow IS NOT NULL AND NOT rodzajorzechow = '';

--2. nie zawierają orzechów,
SELECT idczekoladki, nazwa, rodzajczekolady, rodzajorzechow, rodzajnadzienia FROM czekoladki WHERE rodzajorzechow ='';

--3. zawierają jakieś nadzienie,
SELECT idczekoladki, nazwa, rodzajczekolady, rodzajorzechow, rodzajnadzienia FROM czekoladki WHERE NOT rodzajnadzienia='' ;

--4. nie zawierają nadzienia,
SELECT idczekoladki, nazwa, rodzajczekolady, rodzajorzechow, rodzajnadzienia FROM czekoladki WHERE rodzajnadzienia='';
--5. zawierają jakieś orzechy lub jakieś nadzienie,
SELECT idczekoladki, nazwa, rodzajczekolady, rodzajorzechow, rodzajnadzienia FROM czekoladki WHERE NOT rodzajorzechow ='' OR NOT rodzajnadzienia='';

--6. nie zawierają orzechów ani nadzienia,
SELECT idczekoladki, nazwa, rodzajczekolady, rodzajorzechow, rodzajnadzienia FROM czekoladki WHERE  rodzajorzechow='' AND rodzajnadzienia='';

--7. nie zawierają jednocześnie orzechów i nadzienia,
SELECT idczekoladki, nazwa, rodzajczekolady, rodzajorzechow, rodzajnadzienia FROM czekoladki WHERE ( rodzajorzechow='' AND NOT rodzajnadzienia='') OR( NOT rodzajorzechow='' AND rodzajnadzienia='');

--8. są w mlecznej lub białej czekoladzie (użyj IN) i nie zawierają orzechów,
SELECT idczekoladki, nazwa, rodzajczekolady, rodzajorzechow, rodzajnadzienia FROM czekoladki WHERE  rodzajczekolady IN ('Mleczna','Biala') AND rodzajorzechow='';

--9. są w mlecznej lub białej czekoladzie i nie zawierają nadzienia,
SELECT idczekoladki, nazwa, rodzajczekolady, rodzajorzechow, rodzajnadzienia FROM czekoladki WHERE  rodzajczekolady IN ('Mleczna','Biala') AND rodzajnadzienia='';

--10. nie są są w mlecznej ani białej czekoladzie i zawierają jakieś orzechy lub jakieś nadzienie.
SELECT idczekoladki, nazwa, rodzajczekolady, rodzajorzechow, rodzajnadzienia FROM czekoladki WHERE( NOT rodzajczekolady IN ('Mleczna','Biala')) AND( NOT rodzajorzechow='' OR NOT rodzajnadzienia='');

Zadanie 6

Napisz zapytanie w języku SQL oparte na tabeli Klienci, które: 

--1. wyświetla nazwy miast, z których są klienci cukierni,

--2. wyświetla nazwy klientów, którzy podali numer stacjonarny telefonu,

--3. wyświetla nazwy klientów, którzy podali numer komórkowy telefonu,


Zadanie 7

Napisz skrypt składający się z poleceń psql, który wykona zapytanie (użyj dowolnego zapytania z zadania 4) oraz zwróci jego wynik jako dokument HTML (nie zapomnij o znacznikach html, body itd.), gdzie odpowiedź serwera będzie tabelą HTML. 
UWAGA: Przydatne polecenia: \H \echo \T \pset 
psql ... < zapytanie.sql > wynik.html


Zadanie 8

Napisz skrypt składający się z poleceń psql, który wykona zapytanie (użyj dowolnego zapytania z zadania 4, ale innego niż w zadaniu 6) oraz zwróci jego wynik jako dokument tekstowy z polami oddzielonymi przecinkami (Comma Separated Values), z jednym rekordem w jednej linii. 
UWAGA: Przydatne polecenia: \a \pset fieldsep \t 
psql ... < zapytanie.sql > wynik.txt
