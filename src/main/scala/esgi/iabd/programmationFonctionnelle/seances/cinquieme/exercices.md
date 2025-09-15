
📝 **Exercice 1** : 

Écrire une fonction`describe` qui prend en paramètre un`Any` et utilise le`pattern matching` pour :
1. afficher `"Nombre positif"` si c’est un `Int > 0`
2. afficher `"Chaîne vide"` si c’est une`String`vide
3. afficher `"Liste de longueur N"` si c’est une`List
4. sinon afficher `"Type inconnu"`

--- 
📝 **Exercice 2** : 

Écrire une fonction `safeSqrt(x: Double): Either[String, Double]` qui :
1. retourne `"Nombre négatif"` (Left) si `x < 0`
2. sinon retourne la racine carrée (Right)
