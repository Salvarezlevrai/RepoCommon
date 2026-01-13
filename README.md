private git repository to transfer and relate files between my laptop and pc tower.
related to intelij.
# Exercices Java + POO (40) — difficulté progressive

> Consigne générale : écris du code lisible, simple, et teste chaque exercice dans un `main`.


## 1) POO — Classe vs Objet (instanciation, champs, méthodes)


### Exercice 1 — Créer ta première classe `Car`

Crée une classe `Car` qui représente une voiture.

**Champs (fields)** :
- `String color`
- `int speed` (en km/h)

**Constructeur** :
- `Car(String color)` : initialise `color` et met `speed` à 0.

**Méthodes** :
- `void accelerate(int delta)` : ajoute `delta` à `speed` (delta peut être positif).
- `void brake(int delta)` : enlève `delta` à `speed` sans jamais descendre en dessous de 0.
- `String describe()` : retourne une phrase du type `Car(color=red, speed=50)`.

Dans une classe `Main`, crée une voiture rouge, accélère de 30 puis freine de 10 et affiche `describe()` à chaque étape.


**Checklist de validation**

- La vitesse ne devient jamais négative

- Le constructeur met `speed=0`

- Tu as une classe `Main` avec un `main` qui teste


### Exercice 2 — Comprendre “classe = plan” vs “objet = instance”

Dans `Main`, crée **3 objets** `Car` (couleurs différentes).

Fais ces actions dans l’ordre :
1. Accélère la première voiture de 50.
2. Accélère la deuxième de 20 puis freine de 5.
3. Ne touche pas à la troisième.

Affiche `describe()` pour les trois voitures.  
**Objectif** : constater que chaque objet a son propre état.


**Checklist de validation**

- Les 3 voitures n’ont pas la même vitesse

- Tu affiches 3 lignes distinctes


### Exercice 3 — Mini “TicketMachine” (état + méthodes)

Crée une classe `TicketMachine` (inspirée d’un distributeur de tickets).

**Champs** :
- `int price` (prix d’un ticket)
- `int balance` (argent inséré)

**Constructeur** :
- `TicketMachine(int price)` : initialise `price` et met `balance` à 0.

**Méthodes** :
- `int getPrice()`
- `int getBalance()`
- `void insertMoney(int amount)` : ajoute `amount` à `balance`.
- `void printTicket()` : si `balance >= price`, affiche `Ticket printed`, retire `price` du `balance` ; sinon affiche `Not enough money` et ne change rien.

Écris un `main` qui teste : insérer 5, imprimer ; insérer 10, imprimer.


**Checklist de validation**

- `printTicket()` ne retire pas d’argent si solde insuffisant

- Tests dans `main`


### Exercice 4 — Validation simple avec `if/else`

Reprends `TicketMachine` et améliore `insertMoney(int amount)` :

- Si `amount <= 0`, n’ajoute rien au solde et affiche `Error: amount must be positive`.
- Sinon, comportement normal.

Teste dans `main` avec `amount = -5` puis `amount = 10`.


**Checklist de validation**

- Le solde ne bouge pas pour -5

- Message d’erreur affiché


### Exercice 5 — Variables locales vs champs

Ajoute une méthode `int refund()` à `TicketMachine` :

- Elle **retourne** l’argent actuellement dans `balance`.
- Elle remet `balance` à 0.

Indice : utilise une **variable locale** pour retenir l’ancien solde avant de le remettre à zéro.

Teste : insère 20, appelle `refund()`, affiche la valeur retournée, puis affiche `getBalance()`.


**Checklist de validation**

- `refund()` retourne l’ancien solde

- `balance` vaut 0 après remboursement


## 2) Objets en détail — constructeurs, encapsulation, getters/setters


### Exercice 6 — Encapsulation : rendre les champs privés

Dans `TicketMachine`, passe `price` et `balance` en `private`.

Interdiction : accéder directement à `tm.balance` depuis `Main` (ça doit compiler).  
Utilise uniquement `getPrice()` / `getBalance()` / `insertMoney()` / `printTicket()`.


**Checklist de validation**

- Les champs sont `private`

- Le code compile sans accès direct


### Exercice 7 — Créer une classe `Student` (constructeur + getters)

Crée une classe `Student` avec :

**Champs privés** :
- `String name`
- `int id`

**Constructeur** :
- `Student(String name, int id)`

**Méthodes** :
- `String getName()`
- `int getId()`
- `String describe()` qui retourne `Student(name=Alice, id=123)`

Dans `main`, crée 2 étudiants et affiche `describe()`.


**Checklist de validation**

- Champs privés

- Constructeur initialise tout

- 2 instances créées


### Exercice 8 — Mutateurs (setters) avec règle métier

Dans `Student`, ajoute :
- `void setName(String newName)`

Règles :
- Si `newName` est `null` ou vide (après `trim()`), le nom ne change pas et tu affiches `Error: invalid name`.
- Sinon, le nom est remplacé.

Teste dans `main` : `setName("")` puis `setName("Bob")`.


**Checklist de validation**

- Le nom ne change pas si invalide

- Le nom change si valide


### Exercice 9 — Primitifs vs objets : comparaison correcte

Écris une méthode `static boolean sameIntegerValue(Integer a, Integer b)` dans `Main` (ou une classe utilitaire).

Objectif : retourner `true` si les deux objets ont **la même valeur numérique**.

Contraintes :
- La méthode doit gérer le cas où `a` ou `b` est `null`.
- Interdiction d’utiliser `==` pour comparer la valeur.

Teste avec :
- `sameIntegerValue(10, 10)`
- `sameIntegerValue(null, 10)`
- `sameIntegerValue(10, null)`


**Checklist de validation**

- Pas de `==` sur les objets

- Gestion de `null`


### Exercice 10 — Autoboxing : `ArrayList<Integer>` + somme

Crée une méthode `static int sumList(ArrayList<Integer> values)`.

- Elle retourne la somme des valeurs.
- Si la liste est `null`, retourne 0.
- Si un élément est `null`, ignore-le.

Dans `main`, crée une `ArrayList<Integer>` avec : `10`, `null`, `5` puis affiche le résultat (attendu : 15).


**Checklist de validation**

- Gère `null` list

- Ignore les `null` dans la liste


## 3) Java bases — types, opérateurs, conditions (if/switch/ternaire)


### Exercice 11 — Méthode pure : `isInRange`

Écris une méthode :
`static boolean isInRange(int value, int min, int max)`

Elle retourne `true` si `value` est entre `min` et `max` **inclus**.

Teste avec :
- `isInRange(5, 1, 10)` → true
- `isInRange(0, 1, 10)` → false


**Checklist de validation**

- Utilise `<=` et `>=`

- Tests dans `main`


### Exercice 12 — Ternary : majeur ou mineur

Écris une méthode :
`static String adultLabel(int age)`

Elle retourne `"Majeur"` si `age >= 18`, sinon `"Mineur"`.

Contrainte : utilise l’opérateur ternaire `?:`.


**Checklist de validation**

- Utilise `?:`

- 18 renvoie Majeur, 17 renvoie Mineur


### Exercice 13 — Switch : convertir une note lettre

Écris une méthode :
`static String gradeMessage(String grade)`

Règles :
- `"A"` → `"Excellent"`
- `"B"` → `"Bien"`
- `"C"` → `"Correct"`
- autre → `"Inconnu"`

Contrainte : utilise `switch`.
Teste avec `"A"`, `"C"`, `"Z"`.


**Checklist de validation**

- Switch présent

- default présent


### Exercice 14 — Court-circuit : éviter un crash

Écris une méthode :
`static boolean isNonEmpty(String s)`

Elle retourne `true` si `s` n’est pas `null` ET si sa longueur est > 0.

Contrainte : utilise `&&` pour profiter du court-circuit (ne pas appeler `length()` si `s` est null).

Teste avec `null`, `""`, `"ok"`.


**Checklist de validation**

- Pas de NullPointerException

- Utilise `&&`


### Exercice 15 — Comparer deux Strings correctement

Écris une méthode :
`static boolean sameText(String a, String b)`

Elle retourne `true` si les deux textes sont identiques (mêmes caractères), même si ce sont deux objets différents.

Contraintes :
- Gérer les `null`.
- Ne pas utiliser `==`.

Tests :
- `"abc"` et `"abc"` → true
- `new String("abc")` et `"abc"` → true
- `null` et `"abc"` → false
- `null` et `null` → true


**Checklist de validation**

- Gère null

- Pas de `==`


## 4) Boucles & tableaux — for/while/do-while, arrays


### Exercice 16 — Tableau : créer, remplir, sommer

Crée un tableau `int[] numbers` de taille 5 et remplis-le avec : `1, 2, 3, 4, 5`.

Écris une méthode `static int sumArray(int[] arr)` qui retourne la somme.

Teste : la somme attendue est 15.


**Checklist de validation**

- Tableau taille 5

- Méthode `sumArray`


### Exercice 17 — Tableau : trouver le maximum

Écris une méthode :
`static int max(int[] arr)`

Règles :
- Si `arr` est `null` ou vide, retourne `Integer.MIN_VALUE`.
- Sinon, retourne la plus grande valeur.

Teste avec :
- `[3, 7, 2]` → 7
- `[]` → Integer.MIN_VALUE


**Checklist de validation**

- Gère null/vide

- Boucle `for` ou `for-each`


### Exercice 18 — Tableau : inverser dans un nouveau tableau

Écris une méthode :
`static int[] reversed(int[] arr)`

- Si `arr` est `null`, retourne `null`.
- Sinon, retourne un **nouveau** tableau contenant les éléments dans l’ordre inverse.

Exemple : `[1,2,3]` → `[3,2,1]`.


**Checklist de validation**

- Nouveau tableau créé

- Ne modifie pas l’original


### Exercice 19 — Boucle `for` : table de multiplication

Dans `main`, affiche la table de multiplication du 7 de `7 x 1` à `7 x 10`.

Format exact :
`7 x 1 = 7`
...
`7 x 10 = 70`

Contrainte : utilise une boucle `for`.


**Checklist de validation**

- 10 lignes

- Boucle for


### Exercice 20 — Boucle `while` : compter jusqu’à condition

Écris une méthode :
`static int countTriesToGetSix()`

Règles :
- Crée un `java.util.Random`.
- Tire un nombre entre 1 et 6 (inclus) jusqu’à obtenir 6.
- Retourne le nombre d’essais nécessaires.

Contrainte : utilise une boucle `while`.
Dans `main`, appelle la méthode et affiche le nombre.


**Checklist de validation**

- Random utilisé

- While utilisé

- Retourne un compteur


## 5) Collections — ArrayList, Map, Set, Iterator


### Exercice 21 — ArrayList : liste de courses

Crée une `ArrayList<String> shoppingList` dans `main`.

Fais :
1. Ajoute `"milk"`, `"eggs"`, `"bread"`
2. Supprime `"eggs"`
3. Affiche la taille (`size()`) et le contenu complet.

Résultat attendu : la taille vaut 2.


**Checklist de validation**

- add/remove/size utilisés


### Exercice 22 — Itération : afficher avec index

Écris une méthode :
`static void printWithIndex(ArrayList<String> items)`

Elle affiche chaque élément sur une ligne, avec son index :
`0: milk`
`1: bread`

Contrainte : utilise une boucle `for` classique (avec `i`), pas un for-each.


**Checklist de validation**

- Boucle for avec i

- Format `i: item`


### Exercice 23 — Map : mini annuaire (clé → valeur)

Crée une classe `PhoneBook` avec un champ privé :
`HashMap<String, String> contacts`

Méthodes :
- `void addContact(String name, String phone)`
- `String findPhone(String name)` : retourne le numéro ou `null` si absent
- `int size()`

Dans `main`, ajoute `"Jean" -> "555-1234"` puis affiche `findPhone("Jean")`.


**Checklist de validation**

- HashMap utilisée

- findPhone renvoie null si absent


### Exercice 24 — Set : supprimer les doublons

Écris une méthode :
`static HashSet<String> uniqueEmails(ArrayList<String> emails)`

- Si `emails` est `null`, retourne un `HashSet` vide.
- Sinon, retourne un `HashSet` contenant chaque email une seule fois.

Teste avec la liste : `a@x.com`, `b@x.com`, `a@x.com` → taille attendue : 2.


**Checklist de validation**

- HashSet utilisé

- Gère emails=null


### Exercice 25 — Iterator : supprimer en parcourant (sans bug)

Tu as une liste `ArrayList<String> words`.

Écris une méthode :
`static void removeShortWords(ArrayList<String> words)`

Elle supprime tous les mots dont la longueur est < 3.

Contrainte : utilise un `Iterator<String>` et sa méthode `remove()` (pas `words.remove(...)` dans un for-each).

Teste avec : `["a", "ok", "yes", "no", "java"]` → résultat attendu : `["yes", "java"]`.


**Checklist de validation**

- Iterator utilisé

- Aucune ConcurrentModificationException


## 6) Héritage & polymorphisme — extends, super, override, classes abstraites


### Exercice 26 — Créer une hiérarchie `Vehicle` → `Car`

Crée une classe `Vehicle` avec :
- champ `protected int speed`
- constructeur `Vehicle()` qui met `speed=0`
- méthode `void accelerate(int delta)` qui augmente `speed`
- méthode `int getSpeed()`

Crée une classe `Car` qui **extends** `Vehicle` et ajoute :
- champ `private String fuelType`
- constructeur `Car(String fuelType)`

Dans `main`, crée un `Car("diesel")`, accélère, puis affiche la vitesse.


**Checklist de validation**

- extends utilisé

- speed hérité

- getSpeed fonctionne


### Exercice 27 — `super(...)` : appeler le constructeur parent

Modifie `Vehicle` pour avoir un constructeur :
`Vehicle(int initialSpeed)`

- Il initialise `speed` avec `initialSpeed` (si négatif, mettre 0).

Modifie `Car` pour appeler `super(initialSpeed)` dans son constructeur :
`Car(String fuelType, int initialSpeed)`

Teste avec `initialSpeed = -10` puis `20`.


**Checklist de validation**

- super(...) appelé en premier

- Vitesse jamais négative


### Exercice 28 — Override : une méthode `display()`

Crée une classe `Post` avec :
- `protected String username`
- `protected int likes`
- constructeur `Post(String username)` (likes = 0)
- méthode `void like()` qui incrémente `likes`
- méthode `void display()` qui affiche : `Post by <username> (<likes> likes)`

Crée `MessagePost extends Post` avec :
- champ `private String message`
- constructeur `MessagePost(String username, String message)`
- override `display()` pour afficher aussi le message (sur une autre ligne).

Teste : crée un `MessagePost`, like 2 fois, puis `display()`.


**Checklist de validation**

- @Override utilisé

- display affiche likes + message


### Exercice 29 — Polymorphisme : une liste de `Post`

Dans `main`, crée :
- 1 `MessagePost`
- 1 autre `MessagePost` avec message différent

Stocke-les dans `ArrayList<Post> posts` puis boucle et appelle `display()` sur chaque élément.

Objectif : tu appelles `display()` sur le type parent, mais c’est la bonne version qui s’exécute.


**Checklist de validation**

- ArrayList<Post>

- display appelé dans une boucle


### Exercice 30 — Classe abstraite : obliger l’implémentation

Transforme `Post` en `abstract class Post`.

- Remplace `display()` par une méthode abstraite :
  `public abstract void display();`

Ajoute une nouvelle sous-classe `PhotoPost extends Post` avec :
- `String filename`
- `String caption`

Implémente `display()` dans les deux sous-classes.

Teste avec une liste `ArrayList<Post>` contenant 1 `MessagePost` et 1 `PhotoPost`.


**Checklist de validation**

- Post est abstract

- Les enfants implémentent display()


## 7) Interfaces & découplage — implements, polymorphisme par contrat


### Exercice 31 — Interface `Drawable` + polymorphisme

Crée une interface `Drawable` avec une méthode :
`void draw();`

Crée deux classes qui implémentent l’interface :
- `Circle` (champ `int radius`)
- `Rectangle` (champs `int width`, `int height`)

Chaque `draw()` affiche une phrase simple, ex :
`Drawing circle radius=3`.

Dans `main`, crée une `ArrayList<Drawable>` et ajoute un `Circle` et un `Rectangle`, puis boucle et appelle `draw()`.


**Checklist de validation**

- interface utilisée

- ArrayList<Drawable>


### Exercice 32 — Interface `Actor` (contrat) : Fox & Rabbit

Crée une interface `Actor` avec :
- `void act(ArrayList<Actor> newActors);`
- `boolean isActive();`

Crée une classe `Rabbit` qui implémente `Actor` :
- champ `private int energy` (initialisé au constructeur)
- `act(...)` : décrémente `energy` de 1
- `isActive()` : retourne `energy > 0`

Crée une classe `Fox` qui implémente `Actor` :
- champ `private int hunger`
- `act(...)` : augmente `hunger` de 1
- `isActive()` : retourne `hunger < 5`

Dans `main`, crée une liste d’`Actor` avec 1 `Rabbit(3)` et 1 `Fox(0)` et appelle `act(...)` 3 fois (dans une boucle). Affiche après chaque tour combien d’acteurs sont encore actifs.


**Checklist de validation**

- 2 classes implements Actor

- act modifie un état

- isActive utilisé


### Exercice 33 — Programmer “contre l’interface”, pas la classe

Dans `main`, écris cette déclaration exactement :
`List<String> items = new ArrayList<>();`

Ajoute 2 éléments, puis affiche `items.size()`.

Objectif : comprendre que le type déclaré est `List` (interface), pas `ArrayList` (implémentation).


**Checklist de validation**

- Type déclaré = List

- Instantiation = new ArrayList<>()


### Exercice 34 — Interface + classe abstraite : combo propre

Crée une classe abstraite `Animal` avec :
- champ `protected String name`
- constructeur `Animal(String name)`
- méthode concrète `String getName()`

Crée une interface `RunnableAnimal` avec :
- `void run();`

Crée une classe `Dog` qui :
- `extends Animal`
- `implements RunnableAnimal`
- implémente `run()` en affichant `Dog <name> runs!`

Teste dans `main` avec un `Dog("Rex")` stocké dans une variable de type `RunnableAnimal`.


**Checklist de validation**

- extends + implements

- Variable de type interface


### Exercice 35 — Découplage par injection : `Logger`

Crée une interface `Logger` avec :
- `void log(String message);`

Crée `ConsoleLogger` qui affiche `message` dans la console.

Crée une classe `OrderService` avec :
- un champ `private Logger logger`
- un constructeur `OrderService(Logger logger)`
- une méthode `void createOrder(String product)` qui log :
    - `Creating order for <product>`
    - puis `Order created`

Dans `main`, instancie `OrderService` avec un `ConsoleLogger` et appelle `createOrder("pizza")`.


**Checklist de validation**

- Logger est une interface

- Injection via constructeur


## 8) Composition/Agrégation & erreurs — validation, exceptions, try/catch, throws


### Exercice 36 — Composition : `ClockDisplay` contient `NumberDisplay`

Crée une classe `NumberDisplay` avec :
- `private int value`
- `private int limit`
- constructeur `NumberDisplay(int limit)` (value=0)
- `void increment()` : value++, si value == limit → value=0
- `void setValue(int newValue)` : si newValue est hors [0, limit-1], ignore
- `String getDisplayValue()` : retourne toujours 2 chiffres (ex: 4 → "04")

Crée une classe `ClockDisplay` avec :
- `private NumberDisplay hours`
- `private NumberDisplay minutes`

Contrainte composition : dans le constructeur `ClockDisplay()`, tu fais `hours = new NumberDisplay(24)` et `minutes = new NumberDisplay(60)` (création interne).

Ajoute :
- `void timeTick()` : incrémente minutes ; si minutes repassent à 0, incrémente heures
- `String getTime()` : ex `"13:05"`

Teste : pars de `00:00`, fais 65 `timeTick()` et affiche le temps final (attendu : `01:05`).


**Checklist de validation**

- ClockDisplay crée ses NumberDisplay

- Affichage 2 chiffres

- timeTick correct


### Exercice 37 — Agrégation : `Auction` utilise des `Lot` externes

Crée une classe `Lot` avec :
- `private String description`
- constructeur `Lot(String description)`
- `String getDescription()`

Crée une classe `Auction` avec :
- `private ArrayList<Lot> lots = new ArrayList<>();`
- `void addLot(Lot lot)` : ajoute le lot à la liste
- `int countLots()`

Contrainte agrégation : les `Lot` doivent être créés **dans `main`** puis passés à `addLot(...)` (création externe).

Teste : crée 2 lots dans `main`, ajoute-les, puis affiche `countLots()` (attendu : 2).


**Checklist de validation**

- Lot créé dans main

- Auction stocke des références


### Exercice 38 — Programmation défensive : rejeter `null`

Dans `Auction.addLot(Lot lot)` :

- Si `lot == null`, lève une `IllegalArgumentException` avec le message : `lot cannot be null`.
- Sinon, ajoute normalement.

Teste : appelle `addLot(null)` dans un `try/catch` et affiche `Caught: <message>`.


**Checklist de validation**

- throw IllegalArgumentException

- try/catch dans main


### Exercice 39 — Try/Catch/Finally : parsing robuste

Écris une méthode :
`static int parseIntSafe(String s)`

- Dans un bloc `try`, fais `Integer.parseInt(s)` et retourne le résultat.
- Dans un `catch (NumberFormatException e)`, retourne 0.
- Dans un `finally`, affiche `parseIntSafe finished` (toujours).

Teste avec `"42"` puis `"not-a-number"`.


**Checklist de validation**

- try/catch/finally présents

- finally s’exécute toujours


### Exercice 40 — Exception personnalisée + propagation (`throws`)

Crée une exception **contrôlée** (checked) :
`class DuplicateKeyException extends Exception`

- constructeur `DuplicateKeyException(String key)` qui passe au parent le message : `Duplicate key: <key>`

Dans `PhoneBook` (exercice 23), modifie `addContact` pour :
- si `name` existe déjà dans la map → `throw new DuplicateKeyException(name)`
- sinon ajoute.

Signature obligatoire :
`public void addContact(String name, String phone) throws DuplicateKeyException`

Dans `main`, fais :
- ajoute `"Jean"` une première fois
- essaye de l’ajouter une deuxième fois dans un `try/catch`
- en catch, affiche le message de l’exception.

Objectif : voir un checked exception te forcer à gérer le cas.


**Checklist de validation**

- Exception extends Exception

- addContact déclare throws

- try/catch dans main
