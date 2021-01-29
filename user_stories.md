#TP1.2

Faire les critères d'acceptation (Given.../When.../Then...)
Pour le ROI = 15min=1 (1h=4)
# Mouvements de pièce

**1** | Joueur | Lorsque j'appuie sur la flèche de droite | La pièce se déplace vers la droite | 100
Ref | Etant donné | Quand | Action
1 | Une pièce sans mur sur sa droite | J'appuie sur la flèche droite | La pièce se déplace vers la droite

(15min)
ROI : 100


**2** | Joueur | Lorsque j'appuie sur la flèche de gauche | La pièce se déplace vers la gauche | 100

2 | Une pièce sans mur sur sa gauche | J'appuie sur la flèche gauche | La pièce se déplace vers la gauche

(15min)
ROI : 100

**3** | Joueur | Lorsque j'appuie sur la flèche du bas | La pièce se déplace vers le bas plus rapidement | 80

3 | Une pièce qui n'a pas d'obstacle sur son côté bas | J'appuie sur la flèche du bas | La pièce se déplace vers le bas

(15min)
ROI : 100

**4** | Joueur | Lorsque j'appuie sur la flèche du haut, la pièce se positionne en bas instantanément| La pièce aille se positionner en bas | 80

4 | Une pièce qui n'a pas d'obstacle sur son côté bas | J'appuie sur la flèche du haut | La pièce se déplace ver le bas jusqu'à rencontrer un obstacle

(15min)
ROI : 80

**5** | Joueur | Faire tourner la pièce en sens horaire d'un quart de tour| Changer l'orientation de la pièce | 100

5 | Une pièce qui n'a pas d'obstacle à sa rotation horaire | J'appuie sur la touche de rotation | La pièce tourne en sens horaire

(15min)
ROI : 100

**6** | Joueur | Faire tourner la pièce dans le sens anti-horaire d'un quart de tour | Changer l'orientation de la pièce | 100

6 | Une pièce qui n'a pas d'obstacle à sa rotation antihoraire | J'appuie sur la touche de rotation | La pièce tourne en sens antihoraire 

(15min)
ROI : 100

**7** | Joueur | Pouvoir être bloqué par les murs | Rester dans l'espace de jeu | 100

7 | Une pièce collée à un mur sur sa droite | J'appuie sur la flèche droite | La pièce ne se déplace pas vers la droite
7 | Une pièce collée à un mur sur sa gauche | J'appuie sur la flèche gauche | La pièce ne se déplace pas vers la gauche
7 | Une pièce collée au sol sur son côté bas | J'appuie sur la flèche du bas | La pièce ne se déplace pas vers le bas
7 | Une pièce collée au sol par le bas | J'appuie sur la flèche du haut | La pièce ne se déplace pas vers le bas
7 | Une pièce qui a un mur/le sol bloquant sa rotation antihoraire mais qui peut être déplacée | J'appuie sur la touche de rotation | La pièce se déplace sur le coté puis tourne en sens horaire
7 | Une pièce qui a un mur/le sol bloquant sa rotation horaire et qui ne peut pas être déplacée | J'appuie sur la touche de rotation | La pièce ne bouge pas
7 | Une pièce qui a un mur/le sol bloquant sa rotation antihoraire mais peut être déplacée | J'appuie sur la touche de rotation | La pièce se déplace sur le coté puis tourne en sens antihoraire
7 | Une pièce qui a un mur/le sol bloquant sa rotation antihoraire et ne peut pas être déplacée | J'appuie sur la touche de rotation | La pièce se déplace sur le coté puis tourne en sens antihoraire

(60min)
ROI : 25

**8** | Joueur | Pouvoir être bloqué par les pièces | Rester dans l'espace de jeu | 100

8 | Une pièce collée à une pièce sur sa droite | J'appuie sur la flèche droite | La pièce ne se déplace pas vers la droite
8 | Une pièce collée à une pièce sur sa gauche | J'appuie sur la flèche gauche | La pièce ne se déplace pas vers la gauche
8 | Une pièce collée à une pièce sur son côté bas | J'appuie sur la flèche du bas | La pièce ne se déplace pas vers le bas
8 | Une pièce collée à une pièce par le bas | J'appuie sur la flèche du haut | La pièce ne se déplace pas vers le bas
8 | Une pièce dont la rotation horaire est bloquée par d'autres pièces mais qui peut être déplacée | J'appuie sur la touche de rotation | La pièce se déplace sur le coté puis tourne en sens horaire
8 | Une pièce dont la rotation horaire est bloquée par d'autres pièces mais qui ne peut pas être déplacée | J'appuie sur la touche de rotation | La pièce ne bouge pas
8 | Une pièce dont la rotation antihoraire est bloquée par d'autres pièces mais qui peut être déplacée | J'appuie sur la touche de rotation | La pièce se déplace sur le coté puis tourne en sens antihoraire
8 | Une pièce dont la rotation antihoraire est bloquée par d'autres pièces mais qui ne peut pas être déplacée | J'appuie sur la touche de rotation | La pièce ne bouge pas

(60min)
ROI : 25

# Interface menu

**n** | Joueur | Disposer d'une interface graphique | Modifier les options de façon ergonomique | 90
n | Le menu est codé | Le joueur lance l'application | L'interface graphique s'affiche et répond

(120min)
ROI : 11,25

**9** | Joueur | Pouvoir démarrer la partie | Commencer à jouer | 100
9 | Lorsque le jeu est lancé | Le joueur clique sur Démarrer la partie | La partie démarre

(15min)
ROI : 100

**10** | Joueur | Choisir la difficulté | Adapter le jeu à mon niveau | 20
10 | Lorsque le joueur a choisi la difficulté dans le menu déroulant "difficulté" | la partie est lancée | la difficulté est appliquée à la partie lancée

(15min)
ROI : 20

**11** | Joueur | Changer la musique | Avoir l'ambiance la meilleure pour jouer | 10
11 | Lorsque le joueur a choisi la musique dans le menu déroulant "musique" | la partie est lancée | la musique est appliquée à la partie lancée ET on l'entend ET elle tourne en boucle jusqu'a ce que mort s'en suive

(??min)
ROI : ??

**12** | Joueur | Régler le volume | Adapter le niveau du son | 10
12 | Les boutons de volumes existants | Le joueur règle le volume | Le niveau sonore est correctement adapté

(15min)
ROI : 10

# UX

**13** | Joueur | Que chaque type de pièces soit associé à une unique couleur | Faciliter la reconnaissance des pièces | 80

13 | Un type de pièce | La pièce apparaît dans le jeu | Afficher la pièce avec la couleur qui lui correspond
(30min)
ROI : 40

**14** | Joueur | Voir mon score en temps réel | Connaître son nombre de points | 80

14 | Une partie en cours | Le joueur gagne des points | Le score est mis à jour
14 | Une partie en cours | Le joueur joue | Le score est affiché
(15min)
ROI : 80


**15** | Joueur | Visualiser l'endroit où va tomber la pièce courante | Anticiper mes futurs mouvements | 30

15 | Une pièce | Le joueur peut déplacer cette pièce | L'endroit où peut tomber la pièce est affiché
(45min)
ROI : 10

# Evènements de jeu

**16** | Joueur | Voir la pièce suivante | Anticiper mes futurs mouvements | 30
16 | Les sept types de pièces définis | La pièce suivante est générée | La pièce correspondante est bien affichée
(30min)
ROI : 15

**17** | Joueur | Disposer de pièces aléatoires | Varier les plaisirs de jeu | 90
17 | Les sept types de pièces définis | Les pièces suivantes sont générées | La suite des pièces générées est bien tirée selon une loi aléatoire uniforme
(15min)
ROI : 90

**18** | Joueur | Lorsque les pièces positionnées forment une ligne complète, elles disparaissent | Libérer de l'espace | 100
18 | Une ou des ligne(s) complétée(s) | Je pose une nouvelle pièce | Les lignes complétées disparaissent
(30min)
ROI : 50

**19** | Joueur | Lorsqu'une ligne disparait, je gagne des points| Comptabiliser le score | 40

19 | Le dernier bloc posé complète 1 ligne | Je pose la pièce | Je gagne ? points
19 | Le dernier bloc posé complète 2 lignes | Je pose la pièce | Je gagne ? points
19 | Le dernier bloc posé complète 3 lignes | Je pose la pièce | Je gagne ? points
19 | Le dernier bloc posé complète 4 lignes | Je pose la pièce | Je gagne ? points
19 | Le dernier bloc posé ne complète pas de ligne | Je pose la pièce | Je ne gagne pas de points
(15min)
ROI : 40

**20** | Joueur | Perdre lorsqu'un bloc est dans la zone de spawn| Terminer la partie | 100

20 | Le dernier bloc posé est hors de la zone de spawn | Je pose la pièce | La partie continue
20 | Le dernier bloc posé est dans de la zone de spawn | Je pose la pièce | La partie s'arrête
(15min)
ROI : 100

**21** | Joueur | Voir les niveaux augmenter avec le score | Renforcer la difficulté | 100
21 | Les gains de score opérationnels | Le score dépasse les valeurs seuils | Le niveau courant augmente
(15min)
ROI : 100

**22** | Joueur | Les pièces tombent d'elles-mêmes, de plus en plus vite avec le niveau de jeu | Renforcer la difficulté du jeu | 100
22 | Le système de score opérationnel | Le niveau augmente | Les pièces tombent de plus en plus vite
(30min)
ROI : 50