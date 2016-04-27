# 1.Descriere
Acest departament se ocupa de reprezentarea vizuala 3D a unor date specifice ,  "blueprint-urilor" unor cladiri , precum si oferirea de anumite functionalitati.
      Functionalitatile acestei aplicatii pun la dispozitia utilizatorului anumite functii :

Accesarea unei sali sau a unui lift :
* Numarul maxim de persoane ce pot fi prezente in sala respectiva
* Fluxul de persoane per iesire
* "Highlight-ul" rutei de evacuare , pentru fiecare sala , calculata pe baza fluxului si iesirile accesibile in momentul actiunii.
* Se va tine cont si de potentialele obstacole

Vizualizare 3D a planului curent , pune la dispozitie:

* Rotire - clockwise , counter-clockwise
* Sus , jos
* Scalabilitate

# 2.Domenii

Aceasta functionalitate va fi disponibila oricarei institutii publice , acestea la randul lor vor oferi informatiile sub forma de aplicatie web , disponibila oricarui doritor.

# 3.Actionari/Interese

## Firma :
Pune la dispozitia institutiilor  aplicatia.
## Institutie : 
Ofera utilizatorilor (cadrelor didactice , personalul institutiei) aplicatie pe un anumit server web , gratuit , accesibil 24/24.
## Utilizatorul : 
Dispune de aplicatie oricand pentru familiarizarea cu planul de evacuare , precum si regulile acestuia.

# 4. Actori & Obiective

## Firma: 
Satisfactia Institutiilor dar si utilizatorilor , intrucat institutia ofera acest produs gratuit prin urmare orice feedback va fi primit si din partea utilizatorilor.
## Institutie:
Pregatirea in caz de incidente a  oricarei persoane cu activitate frecventa in respectiva institutie.
## Utilizatorul: 
Auto-educare.

# 5.Scenarii de utilizare

##  5.1 Vizualizarea exteriorului cladirii

### 5.1.1 Obiectiv/Context

Utilizatorului ii este prezentat wireframe-ul cladirii.
Acesta poate roti imaginea folosind "click" stanga pe unele dintre butoanele : stanga,dreapta,sus,jos , aflate intr-un colt al imaginii. 

### 5.1.2 Scenariu / Pasi

Utilizatorului ii este permisa vizualizarea 3D a cladirii. Acesta poate accesa un anumit etaj pentru vizualizarea interiorului.

### 5.1.3 Extensii

Pierderea conexiunii de internet -> reprezentarea deformata a imaginii / pierderea anumitor functionalitati.

Solutie : restabilirea conexiunii 

## 5.2 Vizualizarea interiorului per etaj

### 5.2.1. 	Obiectiv/Context

Prin accesarea unui etaj pot fi afisate printr-un "click" informatii in legatura cu :

* sali :  numarul maxim de persoane ce pot fi prezente in sala , forma geometrica a acesteia.
* iesiri : fluxul pe secunda in functie de arhitectura iesirii , disponibilitate (accesibila/inaccesibila).
* rute de acces : evidentierea drumului cel mai eficient spre o iesire accesibila.
* extinctoare

### 5.2.2. Scenariu/Pasi

Conform celor de mai sus , utilizatorul poate accesa informatiile la distanta de un "click" stanga.

### 5.2.3 Extensii

Componenta nu este activa.
Pot exista conflicte intre stabilirea rutelor de evacuare.

Solutie : Reimprospatarea paginii / redesenarea etajului.
          Rezolvarea conflictului - alegerea drumului cel mai eficient.

## 5.3. Utilizatorul declanseaza o simulare

### 5.3.1. Obiectiv/Context

Utilizatorul poate declansa o evacuare simulata  , pornita dintr-un anumit spatiu pentru simularea in sine.

### 5.3.2. Scenariu/Pasi

Va exista o functionalitate , prin care utilizatorul va porni simularea printr-un "click" stanga.









