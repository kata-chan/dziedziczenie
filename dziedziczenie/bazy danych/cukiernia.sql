BEGIN;

CREATE TABLE czekoladki (
       IDCzekoladki CHAR(3) PRIMARY KEY,
       Nazwa VARCHAR(30) NOT NULL,
       RodzajCzekolady VARCHAR(15),
       RodzajOrzechow VARCHAR(15),
       RodzajNadzienia VARCHAR(15),
       Opis VARCHAR(100) NOT NULL,
       Koszt NUMERIC(7,2) NOT NULL,
       Masa INTEGER NOT NULL
);

CREATE TABLE pudelka (
       IDPudelka CHAR(4) PRIMARY KEY,
       Nazwa VARCHAR(40) NOT NULL,
       Opis VARCHAR(150),
       Cena NUMERIC(7,2) NOT NULL,
       Stan INTEGER NOT NULL
);

CREATE TABLE zawartosc (
       IDPudelka CHAR(4) NOT NULL REFERENCES pudelka,
       IDCzekoladki CHAR(3) NOT NULL REFERENCES czekoladki,
       Sztuk INTEGER NOT NULL,
       PRIMARY KEY (IDPudelka, IDCzekoladki)
);


CREATE TABLE klienci (
       IDKlienta INTEGER PRIMARY KEY,
       Nazwa VARCHAR(128) NOT NULL,
       Ulica VARCHAR(30) NOT NULL,
       Miejscowosc VARCHAR(15) NOT NULL,
       Kod CHAR(6) NOT NULL,
       Telefon varchar(20) NOT NULL
);

CREATE TABLE zamowienia (
       IDZamowienia INTEGER PRIMARY KEY,
       IDKlienta INTEGER NOT NULL REFERENCES klienci,
       DataRealizacji DATE NOT NULL
);

CREATE TABLE artykuly (
       IDZamowienia INTEGER NOT NULL REFERENCES zamowienia,
       IDPudelka CHAR(4) NOT NULL REFERENCES pudelka,
       Sztuk INTEGER NOT NULL,
       PRIMARY KEY (IDZamowienia, IDPudelka)
);



COPY klienci FROM 'klienci.sql' NULL '';


COPY zamowienia FROM STDIN NULL '';
1	2	2008-10-30
3	57	2008-10-30
4	58	2008-10-31
5	12	2008-10-31
6	1	2008-11-02
7	33	2008-11-02
8	4	2008-11-02
9	86	2008-11-05
10	54	2008-11-06
11	11	2008-11-07
12	4	2008-11-08
13	53	2008-11-09
14	59	2008-11-09
15	62	2008-11-12
16	12	2008-11-12
17	86	2008-11-12
18	4	2008-11-12
19	38	2008-11-12
20	71	2008-11-13
22	73	2008-11-14
23	2	2008-11-15
24	63	2008-11-16
25	64	2008-11-16
26	4	2008-11-17
27	86	2008-11-17
28	54	2008-11-17
29	74	2008-11-18
30	76	2008-11-19
31	3	2008-11-19
32	54	2008-11-20
33	43	2008-11-21
34	44	2008-11-22
35	46	2008-11-23
36	12	2008-11-24
37	26	2008-11-24
38	31	2008-11-25
39	26	2008-11-25
40	55	2008-11-25
41	86	2008-11-26
42	7	2008-11-26
43	40	2008-11-26
44	82	2008-11-27
45	28	2008-11-27
46	29	2008-11-27
47	30	2008-11-27
49	3	2008-12-05
50	28	2008-12-05
51	2	2008-12-06
52	26	2008-12-06
53	39	2008-12-06
54	73	2008-12-06
55	54	2008-12-06
56	35	2008-12-06
57	2	2008-12-06
58	79	2008-12-07
59	80	2008-12-07
60	82	2008-12-07
61	66	2008-12-07
62	67	2008-12-07
63	49	2008-12-07
64	82	2008-12-07
65	68	2008-12-08
66	69	2008-12-08
67	70	2008-12-08
68	63	2008-12-08
69	35	2008-12-08
70	49	2008-12-08
71	8	2008-12-08
72	10	2008-12-09
73	11	2008-12-09
74	12	2008-12-09
75	13	2008-12-09
76	11	2008-12-09
77	14	2008-12-09
78	21	2008-12-09
79	7	2008-12-10
80	28	2008-12-10
81	29	2008-12-10
82	30	2008-12-10
83	14	2008-12-10
84	15	2008-12-10
85	16	2008-12-10
86	18	2008-12-11
87	73	2008-12-11
88	14	2008-12-11
89	15	2008-12-11
90	16	2008-12-11
91	18	2008-12-11
92	19	2008-12-11
93	21	2008-12-12
94	22	2008-12-12
95	24	2008-12-12
96	49	2008-12-12
97	3	2008-12-12
98	25	2008-12-12
99	26	2008-12-12
100	27	2008-12-13
101	4	2008-12-13
102	28	2008-12-13
103	29	2008-12-13
104	30	2008-12-13
105	31	2008-12-13
106	53	2008-12-13
107	84	2008-12-14
108	79	2008-12-14
109	33	2008-12-14
110	34	2008-12-14
111	35	2008-12-14
112	56	2008-12-14
113	1	2008-12-14
114	1	2008-12-15
115	37	2008-12-15
116	38	2008-12-15
117	39	2008-12-15
118	40	2008-12-15
119	42	2008-12-15
120	43	2008-12-15
121	44	2008-12-16
122	63	2008-12-16
123	73	2008-12-16
124	28	2008-12-16
125	63	2008-12-16
126	44	2008-12-16
127	46	2008-12-16
128	47	2008-12-17
129	48	2008-12-17
130	49	2008-12-17
131	84	2008-12-17
132	85	2008-12-17
133	56	2008-12-17
134	79	2008-12-17
136	73	2008-12-18
137	73	2008-12-18
138	44	2008-12-18
139	11	2008-12-18
140	86	2008-12-18
141	4	2008-12-18
142	50	2008-12-19
143	51	2008-12-19
144	52	2008-12-19
145	16	2008-12-19
146	25	2008-12-19
147	53	2008-12-19
148	54	2008-12-19
149	55	2008-12-20
\.

COPY czekoladki FROM STDIN NULL '';
B01	Plomienna ekstaza	Gorzka	Luskane	Krem	Orzechy w kremie, zatopione w gorzkiej czekoladzie.	0.30	20
B02	Gorzka jagodowa	Gorzka		Jagody	Smakowite gorskie jagody w czekoladzie.	0.25	25
B03	Marcepanowe listki	Gorzka		Marcepan	Marcepany w ksztalcie lisci debu oblewane gorzka czekolada.	0.40	12
B04	Gorzka truskawkowa	Gorzka		Truskawki	Truskawki w gorzkiej czekoladzie, wysmienite.	0.23	20
B05	Gorzka malinowa	Gorzka		Maliny	Maliny zrywane na bezludnych wyspach, w polewie czekoladowej.	0.25	20
B06	Gorzka z marmolada	Gorzka		Marmolada	Marmolada w polewie czekoladowej - prawdziwie brytyjski smakolyk.	0.17	25
B07	Gorzka z wisniami	Gorzka		Wisnie	Ulubione wisnie krolowej Anny zatopione w czekoladzie.	0.26	25
B08	Gorzkie orzechy	Gorzka	Laskowe		Orzechy laskowe w czekoladzie.	0.24	20
D01	Migdalowy smak	Ciemna	Migdaly		Cale migdaly, recznie topione w czekoladzie.	0.30	15
D02	Serce na dloni	Ciemna		Krem wisniowy	Ciemna czekolada o sercu z kremu wisniowego.	0.32	25
D03	Potega orzechow	Ciemna	Luskane		Ogromne orzechy recznie umieszczane w czekoladzie.	0.30	15
D04	Migdalowa ambrozja	Ciemna	Migdaly	Amaretto	Migdaly zatapiane w amaretto.	0.44	25
D06	Smak orzechow laskowych	Ciemna	Laskowe		Cale orzechy laskowe, recznie topione w czekoladzie.	0.21	10
D07	Wisniowa klasyczna	Ciemna		Wisnie	Wisnie w czekoladzie.	0.28	24
D08	Czekoladowe kiwi	Ciemna	Brazylijskie		Orzechy brazylijskie na czekoladzie tworzace wspaniala kompozycje wzorowana na owocu kiwi.	0.29	30
D09	Amerykanska pieknosc	Ciemna			Twarda czekolada w ksztalcie amerykanskich pieknosci.	0.24	30
D11	Marcepanowe delicje	Ciemna		Marcepan	Smakowity marcepan w gorzkiej czekoladzie.	0.38	30
F01	Twarda kremowa wloska	Twarda	Wloskie	Krem	Slodziutki krem z orzechami wloskimi.	0.19	25
F02	Twarda kremowa pistacjowa	Twarda	Pistacjowe	Krem	Slodziutki krem z orzechami pistacjowymi.	0.21	25
M01	Slodkie truskawki	Mleczna		Truskawki	Truskawki oblewane mleczna czekolada.	0.20	25
M02	Smak macadamia	Mleczna	Macadamia		Cale macadamia, recznie umieszczane w mlecznej czekoladzie.	0.40	20
M03	Smak pistacji	Mleczna	Pistacjowe		Cale pistacjowe orzechy, recznie umieszczane w mlecznej czekoladzie.	0.30	12
M04	Rozkosz kremu orzechowego	Mleczna		Krem orzechowy	Delikatny krem orzechowy robiony z senegalskich orzeszkow w mlecznej czekoladzie.	0.21	12
M05	Marcepanki	Mleczna		Marcepan	Marcepan oblewany mleczna czekolada.	0.32	35
M06	Serce kochanka	Mleczna		Krem wisniowy	Czekoladki mlaczne w ksztalcie serc z nadzieniem wisniowym.	0.25	35
M07	Jablkowe amory	Mleczna	Migdaly		Mleczne czekoladki w ksztalcie jabluszek z listkami z migdalow.	0.24	25
M08	Marcepanowy klon	Mleczna		Marcepan	Marcepan w ksztalcie listkow klonu z mleczna czekolada.	0.37	25
M09	Slodkie maliny	Mleczna		Maliny	Maliny oblewane mleczna czekolada.	0.26	15
M10	Niezapominajki	Mleczna		Jagody	Niezapomniana mleczna czekolada nadziewana jagodami.	0.19	15
M11	Slodkie wisnie	Twarda		Wisnie	Wisnie w polewie z mlecznej czekolady.	0.27	20
M12	Slodkie jagody	Mleczna		Jagody	Jagody osladzane mleczna czekolada.	0.25	20
M13	Slodka marmolada	Mleczna		Marmolada	Mleczna czekolada z nadzieniem z pomaranczowej marmolady.	0.18	30
M14	Wisnie z orzechami	Mleczna	Laskowe	Krem wisniowy	Swietne orzechy laskowe przykryte kremem wisniowym i mleczna czekolada.	0.26	30
M15	Tropikalna palma	Mleczna		Kokosy	Palma z mlecznej czekolady z kokosami.	0.23	25
M16	Cud marcepanu	Mleczna		Marcepan	Marcepan w ksztalcie migdalow z czekoladowym "Mniam mniam".	0.33	25
M17	Amaretto z orzechali	Mleczna	Laskowe	Amaretto	Orzechy laskowe z amaretto oblewane mleczna czekolada.	0.36	25
M18	Orzechy w kremie	Mleczna	Laskowe	Krem	Orzechy laskowe z kremem oblewane mleczna czekolada.	0.33	20
W01	Marcepanowa jaskolka	Biala		Marcepan	Marcepanowe jaskolki o skrzydlach z mlecznej czekolady.	0.34	20
W02	Biale lilie	Biala			Elegancka biala czekolada formowana w ksztalcie lilii.	0.27	25
W03	Zlamane serce	Biala	Pekan		Dwie polowki pekanowego serca z bialej czekolady.	0.30	25
W06	Smak Brazylii	Biala	Brazylijskie		Brazylijskie orzechy, recznie umieszczane w bialej czekoladzie.	0.28	35
\.

COPY pudelka FROM STDIN NULL '';
ALLS	Pory roku	Jagody, truskawki i maliny, wszystkie slodziutkie i smaczne.	14.00	700
ALPI	Kolekcja alpejska	Alpejskie jagody i maliny w naszej najlepszej czekoladzie.	20.00	400
AUTU	Kolekcja jesienna	Rodzinne pudelko czekoladek, na jesienne wieczory.	43.00	200
BITT	Gorzkie czekoladki	Nasza gorzka czekolada z jagodami, wisniami, marmolada, malinami i truskawkami.	27.70	200
CHER	Klasyczne wisnie	Cale wisnie w czekoladzie, klasyczne i slodkie.	16.20	500
FUDG	Kremowa fantazja	Kolekcja czekoladek kremowych - jak senne marzenie.	18.00	400
HEAV	Niebianskie orzechy	Najlepsze orzechy w orzechowych czekoladkach.	15.00	300
INTE	Miedzynarodowe	Miedzynarodowy zestaw czekoladek zawierajacy czekoladki: Amerykanska pieknosc, Smak Brazylii i Czekoladowe kiwi.	34.00	500
ISLA	Islandzka kolekcja	Delikatesy ktore zabiora Cie na bezludna wyspe, czekoladki: Czekoladowe kiwi, Biale lilie i Tropikalna palma.	35.00	400
LOVE	Serca kochankow	Najlepsze czekoladki mleczne w sercowej kolekcji, takie jak:amane serce, Serce kochanka i Serce na dloni.	17.50	300
MARZ	Marcepanowy cud	Swietny zestaw marcepanowych czekoladek.	32.20	500
NORT	Kolekcja polnocna	Szczegolna kolekcja czekoladek dla kochankow, takich jak: Marcepanowy klon, Marcepanowa jaskolka i  Niezapominajki.	32.20	700
PACI	Obfitosc Pacyfiku	Najwykwintniejszy zestaw czekoladek Pacyfiku: Biale lilie, Amaletto z orzechami i Orzechy w kremie.	21.00	500
PEAN	Kremowe delikatesy	Oblewana czekolada masa kremowa, smakujaca wszystkim.	19.00	900
ROMA	Kolekcja romantyczna	Nasz klasyczny i romantyczny wybor czekoladek: Migdalowa ambrozja, Plomienna ekstaza, Amerykanska pieknosc i Jablkowe amory.	34.00	700
SUPR	Smaki	Smaki wybranych orzechow oblewanych czekolada.	18.00	400
SWE2	Slodkie kremowe	Smakowite kremy dla wszystkich ktorzy uwielbiaja nadzienie kremowe.	23.00	200
SWEE	Mieszanka czekoladowa	Nasza najlepsza mieszanka owocow w czekoladzie.	27.00	300
\.

COPY artykuly FROM STDIN NULL '';
1	PEAN	2
3	ALPI	1
3	LOVE	2
3	CHER	2
3	NORT	1
4	AUTU	1
4	BITT	2
4	PACI	1
5	AUTU	2
5	BITT	2
5	FUDG	1
5	ISLA	1
6	BITT	1
6	FUDG	1
6	HEAV	2
6	NORT	2
6	PEAN	1
6	SWEE	2
7	PEAN	1
8	FUDG	1
8	MARZ	2
9	NORT	2
9	PACI	1
10	PACI	1
10	SWEE	2
11	BITT	1
11	HEAV	2
11	PEAN	1
11	SUPR	2
11	SWEE	1
12	ALPI	2
12	FUDG	2
12	ROMA	1
12	SWE2	1
12	SWEE	1
13	SWEE	2
14	HEAV	1
14	ISLA	1
15	ALPI	1
15	ROMA	2
16	ISLA	1
16	ROMA	2
16	SUPR	1
16	SWEE	2
17	LOVE	1
17	NORT	1
17	PEAN	2
17	SWEE	1
18	AUTU	2
18	BITT	2
18	CHER	1
18	HEAV	1
18	PACI	2
18	ROMA	1
19	FUDG	1
20	HEAV	1
22	BITT	1
22	INTE	2
23	FUDG	1
23	NORT	1
23	PEAN	1
23	ROMA	2
23	SWEE	1
24	ALPI	2
24	AUTU	1
24	BITT	1
24	NORT	2
25	HEAV	1
26	BITT	1
27	CHER	1
27	NORT	2
27	SWE2	1
28	ALPI	2
28	HEAV	1
28	PEAN	2
29	ALLS	2
29	BITT	1
29	PEAN	1
29	ROMA	1
29	SWEE	2
30	BITT	2
30	SUPR	1
30	SWE2	1
30	SWEE	2
31	SWEE	2
32	LOVE	1
33	CHER	1
33	FUDG	1
33	NORT	2
33	PACI	2
34	AUTU	1
34	ROMA	1
34	SUPR	2
34	SWEE	1
35	BITT	1
35	FUDG	2
35	ISLA	2
35	NORT	1
35	SWEE	1
36	BITT	2
36	CHER	1
36	FUDG	2
36	NORT	2
36	ROMA	1
36	SWEE	1
37	MARZ	1
38	BITT	1
38	SWEE	2
39	NORT	1
39	ROMA	2
40	BITT	2
40	ROMA	1
40	SWEE	2
41	ALPI	1
41	HEAV	1
41	PACI	1
41	SWE2	2
41	SWEE	2
42	ALPI	2
42	FUDG	1
42	INTE	2
42	ROMA	1
42	SWE2	1
42	SWEE	1
43	ALPI	1
44	AUTU	1
44	BITT	2
45	ALLS	2
45	CHER	2
45	FUDG	1
46	HEAV	1
46	INTE	2
46	PEAN	1
46	SUPR	1
47	BITT	1
47	CHER	1
47	LOVE	2
47	NORT	2
47	PEAN	1
47	AUTU	1
47	FUDG	1
47	ISLA	2
47	PACI	2
47	ROMA	1
49	FUDG	2
50	BITT	1
50	ISLA	2
51	HEAV	2
51	NORT	1
52	CHER	2
52	HEAV	1
52	PEAN	1
53	BITT	2
53	MARZ	2
53	NORT	2
53	SUPR	1
53	SWEE	1
54	BITT	1
54	FUDG	1
54	HEAV	2
54	NORT	2
54	ROMA	1
54	SWEE	1
55	BITT	1
56	FUDG	1
56	HEAV	2
57	ALPI	1
57	SWE2	1
57	SWEE	2
58	ALPI	2
58	INTE	1
58	ROMA	1
58	SWEE	2
59	ALLS	2
59	NORT	1
59	ROMA	2
59	SWE2	1
59	SWEE	1
60	LOVE	1
60	PEAN	2
60	ROMA	1
60	SUPR	2
60	SWE2	1
60	SWEE	1
61	LOVE	2
62	ALPI	1
62	NORT	2
63	CHER	1
63	PACI	1
63	ROMA	2
64	AUTU	2
64	BITT	1
64	FUDG	1
64	LOVE	1
65	AUTU	1
65	FUDG	2
65	ISLA	2
65	LOVE	1
65	NORT	1
66	BITT	2
66	FUDG	1
66	LOVE	2
66	MARZ	2
66	NORT	1
66	SWEE	1
67	BITT	1
68	NORT	2
68	SWEE	1
69	FUDG	1
69	ROMA	1
69	SWEE	2
70	BITT	1
70	CHER	1
70	HEAV	2
70	ISLA	2
71	BITT	1
71	FUDG	2
71	LOVE	1
71	SWE2	2
71	SWEE	1
72	ALPI	1
72	BITT	1
72	HEAV	1
72	NORT	2
73	BITT	2
74	ALLS	1
74	LOVE	1
75	INTE	1
75	ROMA	2
75	SUPR	1
76	ALPI	2
76	PEAN	2
76	SUPR	1
76	SWEE	1
77	CHER	2
77	HEAV	1
77	LOVE	2
77	NORT	1
77	PACI	1
78	ALPI	2
78	AUTU	2
78	BITT	2
78	FUDG	1
78	INTE	1
78	ROMA	1
79	AUTU	1
80	BITT	2
80	ISLA	1
81	INTE	1
81	ISLA	2
82	BITT	2
82	INTE	1
82	LOVE	1
82	MARZ	2
83	CHER	2
83	INTE	1
83	ISLA	1
83	LOVE	1
83	SWEE	1
84	BITT	1
84	CHER	1
84	HEAV	2
84	LOVE	2
84	NORT	2
84	PACI	1
85	PACI	1
86	LOVE	2
86	NORT	1
87	ALPI	2
87	HEAV	1
87	SWE2	1
88	BITT	1
88	FUDG	2
88	HEAV	2
88	INTE	1
89	ALLS	1
89	BITT	1
89	LOVE	2
89	NORT	2
90	CHER	1
90	HEAV	2
90	ISLA	1
90	LOVE	1
90	PEAN	2
90	SUPR	1
91	LOVE	2
92	CHER	1
92	NORT	1
93	NORT	2
93	PACI	2
93	ROMA	1
94	ALPI	1
94	AUTU	2
94	CHER	1
94	FUDG	1
95	ISLA	1
95	NORT	2
95	PACI	1
95	PEAN	2
95	SWEE	1
96	ALPI	2
96	BITT	1
96	CHER	1
96	LOVE	2
96	MARZ	1
96	NORT	2
97	FUDG	1
98	BITT	2
98	FUDG	1
99	LOVE	1
99	NORT	2
100	BITT	1
100	HEAV	1
100	SUPR	2
100	SWEE	2
101	ALPI	2
101	AUTU	1
101	FUDG	2
101	NORT	1
101	SWE2	1
102	BITT	2
102	FUDG	2
102	INTE	1
102	LOVE	1
102	ROMA	1
102	SWEE	1
103	PEAN	1
104	ALLS	2
104	BITT	1
105	SUPR	1
105	SWE2	2
105	SWEE	2
106	LOVE	1
106	PEAN	1
106	ROMA	1
106	SWE2	2
107	CHER	1
107	NORT	2
107	PACI	2
107	ROMA	1
108	AUTU	1
108	BITT	1
108	FUDG	2
108	INTE	1
108	LOVE	1
108	SWEE	2
109	ISLA	2
110	CHER	1
110	ROMA	2
111	BITT	1
111	PACI	1
111	SWE2	2
112	ALPI	1
112	FUDG	1
112	ROMA	2
112	SWE2	1
113	LOVE	1
113	NORT	2
113	ROMA	2
113	SWE2	2
113	SWEE	1
114	ALPI	2
114	BITT	2
114	HEAV	1
114	LOVE	1
114	ROMA	1
115	HEAV	1
116	HEAV	2
116	SWE2	1
117	ALPI	2
117	BITT	1
117	LOVE	1
118	BITT	1
118	INTE	2
118	LOVE	2
118	NORT	1
119	ALLS	2
119	BITT	2
119	HEAV	1
119	NORT	1
119	SUPR	1
120	HEAV	1
120	LOVE	2
120	NORT	1
120	PACI	1
120	PEAN	1
120	ROMA	2
121	NORT	2
122	CHER	1
122	PACI	2
123	NORT	2
123	PACI	1
123	ROMA	1
124	AUTU	1
124	FUDG	1
124	HEAV	2
124	ISLA	1
125	AUTU	1
125	BITT	1
125	ISLA	2
125	NORT	2
125	PEAN	1
126	BITT	1
126	LOVE	1
126	MARZ	2
126	NORT	2
126	PEAN	1
126	SWEE	2
127	PEAN	1
128	ALPI	2
128	SWEE	1
129	BITT	2
129	PEAN	1
129	SWEE	1
130	BITT	1
130	HEAV	2
130	ROMA	2
130	SWEE	1
131	ALPI	1
131	INTE	2
131	ROMA	1
131	SWE2	1
131	SWEE	2
132	ALPI	2
132	BITT	1
132	FUDG	2
132	INTE	1
132	PEAN	1
133	ALLS	2
134	CHER	1
134	FUDG	1
134	NORT	1
134	SUPR	2
134	LOVE	2
134	PEAN	2
137	CHER	1
137	NORT	2
137	PACI	1
137	PEAN	1
137	ROMA	2
138	AUTU	2
138	CHER	1
138	FUDG	1
138	INTE	2
138	ISLA	2
138	NORT	1
139	FUDG	1
140	FUDG	2
140	NORT	1
141	AUTU	1
141	BITT	2
142	HEAV	1
142	MARZ	2
142	NORT	2
143	CHER	1
143	INTE	1
143	PEAN	1
143	ROMA	1
143	SWEE	2
144	BITT	1
144	HEAV	2
144	INTE	1
144	ROMA	2
144	SWE2	2
144	SWEE	1
145	SUPR	1
146	ALPI	1
146	SWE2	2
147	ALPI	2
147	FUDG	1
147	INTE	1
148	HEAV	1
148	ROMA	2
148	SUPR	2
148	SWE2	1
149	ALLS	1
149	LOVE	2
149	ROMA	2
149	SUPR	1
149	SWE2	1
\.

COPY zawartosc FROM STDIN NULL '';
ALLS	B02	2
ALLS	B04	2
ALLS	B05	2
ALLS	M01	2
ALLS	M09	2
ALLS	M12	2
ALPI	M12	4
ALPI	B04	5
ALPI	M01	5
ALPI	B02	4
AUTU	M05	6
AUTU	B03	6
AUTU	W01	6
AUTU	M08	6
BITT	B07	4
BITT	B04	5
BITT	B05	5
BITT	B06	5
BITT	B02	5
CHER	B07	4
CHER	M11	4
CHER	D07	4
FUDG	F01	9
FUDG	B03	4
FUDG	F02	9
FUDG	B05	4
FUDG	B04	4
HEAV	M14	2
HEAV	D06	2
HEAV	M16	3
HEAV	B08	3
HEAV	M15	2
INTE	D08	6
INTE	D09	6
INTE	W06	6
INTE	M05	6
ISLA	M08	6
ISLA	D08	6
ISLA	M15	6
ISLA	W02	6
LOVE	D02	4
LOVE	M06	4
LOVE	W03	4
MARZ	M08	3
MARZ	M05	3
MARZ	D11	3
MARZ	B03	3
MARZ	W01	3
MARZ	M16	3
NORT	B05	4
NORT	D09	4
NORT	M05	4
NORT	M10	4
NORT	W01	4
NORT	W02	4
PACI	M18	3
PACI	M17	3
PACI	D04	3
PACI	W02	3
PEAN	M04	18
ROMA	B02	3
ROMA	D04	3
ROMA	D02	3
ROMA	D09	3
ROMA	M06	3
ROMA	M07	3
ROMA	M10	3
ROMA	W03	3
SUPR	D06	2
SUPR	D03	2
SUPR	D01	2
SUPR	M02	2
SUPR	M03	2
SUPR	W06	2
SWE2	B04	6
SWE2	M06	6
SWE2	M04	6
SWEE	B07	3
SWEE	B06	3
SWEE	B04	3
SWEE	B02	2
SWEE	B05	3
SWEE	M01	2
SWEE	M13	2
SWEE	M12	2
SWEE	M11	2
SWEE	M09	2
\.

COMMIT;
