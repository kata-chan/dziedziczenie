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