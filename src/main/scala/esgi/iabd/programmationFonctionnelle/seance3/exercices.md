
📝 **Exercice 1** : 

Écrire une fonction `processNumbers` qui :
1. Prend une `List[Int]` en entrée
2. Filtre uniquement les nombres pairs
3. Multiplie chaque élément par 3
4. Retourne la somme des éléments obtenus

**Exemple**

```scala
   val nums = List(1, 2, 3, 4, 5, 6)
   val result = processNumbers(nums)
   println(result) // 36
```
--- 
📝 **Exercice 2** : Pipeline texte

Écrire un programme qui :
1. Découpe une chaîne de caractères en mots
2. Convertit en minuscules
3. Filtre les mots de longueur ≥ 4
4. Compte les occurrences de chaque mot

**Exemple**

```scala
  val text = "Scala is great and Scala is functional"
  val wordCounts = ...
  println(wordCounts)
```

```scala
val data = List(
    Record("Paris", "2025-03-01", 12.3, 0.65),
    Record("Paris", "2025-03-02", 15.1, 0.60),
    Record("Lyon", "2025-03-01", 10.5, 0.70),
    Record("Lyon", "2025-03-02", 9.8, 0.75),
    Record("Marseille", "2025-03-01", 17.2, 0.55),
    Record("Marseille", "2025-03-02", 18.4, 0.50)
)
```