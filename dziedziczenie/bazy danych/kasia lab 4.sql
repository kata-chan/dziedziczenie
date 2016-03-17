-- Zagadnienia
-- Manipulowanie danymi, instrukcje INSERT, UPDATE, DELETE.

-- Zadanie 1

-- Napisz i wykonaj zapytanie (użyj INSERT), które dodaje do tabeli czekoladki następujące informacje:
-- IDCzekoladki: W98,
-- Nazwa: Bialy kiel,
-- RodzajCzekolady: Biala,
-- RodzajOrzechow: Laskowe,
-- RodzajNadzienia: Marcepan,
-- Opis: Rozplywajace sie w rekach i kieszeniach,
-- Koszt: 45 gr,
-- Masa: 20 g.

INSERT INTO czekoladki
(idczekoladki,nazwa,rodzajczekolady,rodzajorzechow,rodzajnadzienia,opis,koszt,masa)
VALUES
('W98','Bialy kliel','Biala','Laskowe','Marcepan','Rozplywajace sie w rekach i kieszeniach',0.45,20);

SELECT* FROM czekoladki;

-- Napisz i wykonaj trzy zapytania (użyj INSERT), które dodadzą do tabeli klienci następujące dane osobowe:
-- IDKlienta: 90,
-- Nazwa: Matusiak Edward, 
-- Ulica: Kropiwnickiego 6/3,
-- Miejscowosc: Leningrad,
-- Kod: 31-471,
-- Telefon: 031 423 45 38,
-- 
INSERT INTO klienci
(idklienta,nazwa,ulica,miejscowosc,kod,telefon)
VALUES
(90,'Matusiak Edward','Kropiwnickiego 6/3',' Leningrad','31-471','031 423 45 38');
-- 

-- IDKlienta: 91,
-- Nazwa: Matusiak Alina,
-- Ulica: Kropiwnickiego 6/3,
-- Miejscowosc: Leningrad,
-- Kod: 31-471,
-- Telefon: 031 423 45 38,
-- 
INSERT INTO klienci
(idklienta,nazwa,ulica,miejscowosc,kod,telefon)
VALUES
(91,'Matusiak Alina','Kropiwnickiego 6/3',' Leningrad','31-471','031 423 45 38');
-- 
-- IDKlienta: 92,
-- Nazwa: Kimono Franek,
-- Ulica: Karatekow 8,
-- Miejscowosc: Mistrz,
-- Kod: 30-029,
-- Telefon: 501 498 324.
-- 
INSERT INTO klienci
(idklienta,nazwa,ulica,miejscowosc,kod,telefon)
VALUES
(93,'Kimono Franek','Karatekow 8',' Mistrz','30-029','501 498 324');

-- Sprawdź, czy napisane przez Ciebie zapytania odniosły pożądany skutek tj. czy do w/w tabel zostały dodane odpowiednie wiersze, wykorzystaj SELECT.
-- 
SELECT*FROM klienci;

-- Zadanie 2

-- Napisz i wykonaj zapytanie, które doda do tabeli czekoladki następujące pozycje, wykorzystaj wartości NULL w poleceniu INSERT:
-- IDCzekoladki: X91,
-- Nazwa: Nieznana Nieznajoma,
-- Opis: Niewidzialna czekoladka wspomagajaca odchudzanie.,
-- Koszt: 26 gr,
-- Masa: 0g,
-- 
INSERT INTO czekoladki
(idczekoladki,nazwa,rodzajczekolady,rodzajorzechow,rodzajnadzienia,opis,koszt,masa)
VALUES
('X91','Nieznana Nieznajoma',NULL,NULL,NULL,'Niewidzialna czekolada wspomagajaca odchudzanie',0.26,0);

-- 
-- IDCzekoladki: M98,
-- Nazwa: Mleczny Raj,
-- RodzajCzekolady: Mleczna,
-- Opis: Aksamitna mleczna czekolada w ksztalcie butelki z mlekiem.,
-- Koszt: 26 gr,
-- Masa: 36 g,
DELETE FROM czekoladki WHERE idczekoladki='M98';

INSERT INTO czekoladki
(idczekoladki,nazwa,rodzajczekolady,rodzajorzechow,rodzajnadzienia,opis,koszt,masa)
VALUES
('M98','Mleczny Raj','Mleczna',NULL,NULL,'Aksamitna mleczna czekolada w ksztalcie butelki z mlekiem',0.26,36);

-- 
-- Sprawdź, czy napisane przez Ciebie zapytania odniosły pożądany skutek tj. czy do w/w tabel zostały dodane odpowiednie wiersze, wykorzystaj SELECT.
SELECT*FROM czekoladki;

-- Zadanie 3
-- Napisz zapytanie, które usunie informacje dodane w Zadaniu 2, użyj DELETE.
SELECT* FROM czekoladki WHERE idczekoladki IN ('M98','X91');
DELETE FROM czekoladki WHERE idczekoladki IN ('M98','X91');
-- 
-- Sprawdź, czy odpowiednie rekordy zostały usunięte.
SELECT * FROM czekoladki;

-- Zadanie 4
-- Córka Państwa Matusiakow została klientem naszej cukierni. 
-- Napisz i wykonaj zapytanie, które doda wiersz do tabeli klienci zawierający jej dane osobowe tj.
-- Matusiak Iza,
-- IDKlienta: 93.
-- Uwaga: Pozostałe dane osobowe Izy Matusiak muszą być takie same jak dla Pana Edwarda Matusiaka. Użyj konstrukcji: 
-- INSERT... (SELECT...)

INSERT INTO klienci
(idklienta,nazwa,ulica,miejscowosc,kod,telefon)
 SELECT 94,'Matusiak Iza',ulica, miejscowosc,kod,telefon FROM klienci WHERE nazwa='Matusiak Edward';
-- 

SELECT* FROM klienci;
-- Sprawdź (korzystając z SELECT), czy wszystkie dane zostały odpowiednio dodane.
 
-- Zadanie 5

-- Córka Państwa Matusiaków wyszła za mąż i zmieniła nazwisko na Nowak. Napisz zapytanie, które modyfikuje odpowiednie dane, użyj UPDATE. 

UPDATE klienci SET nazwa= 'Nowak Iza' WHERE idklienta= 94;
-- 
SELECT* FROM klienci;
-- Zadanie 6
-- Napisz i wykonaj zapytanie, które zmieni nazwę miasta z Leningrad na Piotrograd w tabeli klienci, użyj UPDATE.
-- 
UPDATE klienci SET miejscowosc='PiotroGrad' WHERE miejscowosc=' Leningrad';

-- Sprawdź czy odpowiednie rekordy zostały zmienione.
-- 
-- Zadanie 7
-- Napisz i wykonaj zapytania używając UPDATE: 
-- Obniż cenę czekoladek o identyfikatorach (idczekoladki): W98, M98 i X91, o 10%.
SELECT*From czekoladki;
Update czekoladki SET koszt= (koszt-(koszt*0.1)) WHERE idczekoladki IN('W98','M98','X91');
-- 
-- Ustal cenę czekoladek o nazwie Nieznana Nieznajoma na taką samą jak cena czekoladki o identyfikatorze W98.
UPDATE czekoladki SET koszt=(SELECT koszt FROM czekoladki WHERE idczekoladki='W98') WHERE nazwa='Nieznana Nieznajoma';
-- 
-- Sprawdź, czy w/w zapytania odniosły skutek. 
SELECT*FROM czekoladki;
-- 
-- Zadanie 8
-- Napisz i wykonaj zapytanie, które podniesie cenę czekoladek, których dwa ostatnie znaki identyfikatora (idczekoladki) są większe od 90, o 15 groszy, użyj UPDATE.


DELETE FROM czekoladki WHERE RIGHT (idczekoladki,2) >'90';


--SELECT* FROM czekoladki WHERE SUBSTRING(idczekoladki,0,2)>'90';
-- Sprawdź czy odpowiednie rekordy zostały zmienione.
-- 
-- Zadanie 9
-- Napisz i wykonaj zapytanie, które usuwa klientów (użyj DELETE): 
-- o nazwisku Matusiak, 
-- lub o identyfikatorze większym niż 91.
SELECT* FROM klienci;
DELETE FROM klienci WHERE nazwa LIKE 'Matusiak%' OR idklienta>91;
-- Zadanie 10
-- Napisz i wykonaj zapytanie, które usuwa czekoladki (użyj DELETE), których: 
SELECT* FROM czekoladki;
SELECT FROM czekoladki WHERE koszt>=0.45 OR masa>=36 OR masa=0;

-- koszt jest większy lub równy 0.45, lub 
-- masa jest większa lub równa 36, lub 
-- masa jest równa 0.
-- 
-- Zadanie 11
-- Napisz skrypt zawierający instrukcje INSERT wstawiające do bazy danych Cukiernia dwa nowe rekordy do tabeli Pudelka oraz odpowiednie rekordy związane z tymi pudełkami do tabeli Zawartosc. Każde z nowych pudełek ma zawierać łącznie co najmniej 10 czekoladek, w co najmniej 4 różnych smakach. 
-- Zadanie 12
-- Napisz skrypt zawierający instrukcje COPY wstawiające do bazy danych Cukiernia dwa nowe rekordy do tabeli Pudelka oraz odpowiednie rekordy związane z tymi pudełkami do tabeli Zawartosc. Każde z nowych pudełek ma zawierać łącznie co najmniej 10 czekoladek, w co najmniej 4 różnych smakach. 
-- 
-- Zadanie 13
-- Napisz instrukcję UDPATE, która dla pudełek dodanych w poprzednich dwóch zadaniach, zwiększa o 1 liczbę czekoladek każdego smaku, które w nich występują. 