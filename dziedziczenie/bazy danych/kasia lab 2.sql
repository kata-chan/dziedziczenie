--lab2. zad5
select idczekoladki,nazwa,opis from czekoladki;
--lab2. zad6
SELECT idpudelka, nazwa, opis from pudelka;
--lab2. zad7
 Select 124 * 7 + 45; 
Select 2 ^ 20; 
Select sqrt(3); 
select PI();
--lab2. zad8
--1. wyświetla listę klientów (nazwa, ulica, miejscowość) posortowaną według nazw klientów,
select nazwa,ulica,miejscowosc  from klienci ORDER BY nazwa;
--2. wyświetla listę klientów posortowaną malejąco według nazw miejscowości,
select nazwa,ulica,miejscowosc from klienci Order By miejscowosc DESC;
--3. wyświetla listę klientów posortowaną malejąco według nazw miejscowości, a w ramach tej samej miejscowości rosnąco według nazw klientów,
select nazwa,ulica,miejscowosc from klienci Order By miejscowosc DESC,nazwa ASC;
--4. wyświetla listę klientów z Krakowa posortowaną według nazw klientów,
select nazwa,ulica, miejscowosc from klienci where miejscowosc='Krakow' Order  BY nazwa;
--5. wyświetla listę klientów z Krakowa lub z Warszawy posortowaną malejąco według nazw miejscowości, a w ramach tej samej miejscowości rosnąco według nazw klientów (zapytanie utwórz na dwa sposoby stosując w kryteriach or lub in),
select nazwa,ulica ,miejscowosc  FROM KLieNCI wHeRe 'Krakow' = miejscowosc or 'Warszawa'= miejscowosc ORDER BY miejscowosc DESC,nazwa; 
select nazwa,ulica,miejscowosc From klienci WHERE miejscowosc IN ('Krakow','Warszawa') ORDER BY miejscowosc DESC,nazwa;
-- Zadanie 9
-- Napisz zapytanie w języku SQL, które: 
-- 1. wyświetla nazwę i masę czekoladek, których masa jest większa niż 20 g,
SELECT nazwa, masa FROM czekoladki WHERE masa > 20;
-- 2. wyświetla nazwę i koszt produkcji czekoladek, których koszt produkcji jest większy niż 25 gr,
SELECT nazwa,koszt FROM czekoladki WHERE koszt>0.25;
-- 3. wyświetla nazwę, masę i koszt produkcji czekoladek, których masa jest większa niż 20 g i koszt produkcji jest większy niż 25 gr,
SELECT nazwa,masa,koszt FROM czekoladki WHERE masa>20 AND koszt >0.25;
-- 4. wyświetla nazwę i rodzaj czekolady dla czekoladek, które są w białej lub mlecznej czekoladzie,
SELECT nazwa,rodzajczekolady FROM czekoladki WHERE rodzajczekolady IN ('Biala','Mleczna');
-- 5. wyświetla nazwę oraz rodzaj czekolady, nadzienia i orzechów dla czekoladek, 
--które są w mlecznej czekoladzie i nadziane malinami lub są w mlecznej czekoladzie i nadziane truskawkami 
--lub zawierają orzechy laskowe, ale nie są w gorzkiej czekoladzie. 
SELECT nazwa,rodzajczekolady,rodzajnadzienia,rodzajorzechow FROM czekoladki WHERE 
(rodzajczekolady='Mleczna' AND rodzajnadzienia='Maliny') OR
 (rodzajczekolady='Mleczna' AND rodzajnadzienia='Truskawki')
  OR (rodzajorzechow='Laskowe'AND rodzajczekolady<>'Gorzka');