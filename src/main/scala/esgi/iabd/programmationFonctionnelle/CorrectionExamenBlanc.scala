package esgi.iabd.programmationFonctionnelle

import esgi.iabd.programmationFonctionnelle.seance3.Record

object CorrectionExamenBlanc {

  def main(args: Array[String]): Unit = {
    // Exemple de données
    val data = List(
      Record("Paris", "2025-03-01", 12.3, 0.65),
      Record("Paris", "2025-03-02", 15.1, 0.60),
      Record("Lyon", "2025-03-01", 10.5, 0.70),
      Record("Lyon", "2025-03-02", 9.8, 0.75),
      Record("Marseille", "2025-03-01", 17.2, 0.55),
      Record("Marseille", "2025-03-02", 18.4, 0.50)
    )

    val tempMin: Int = 0
    val tempMax: Int= 10

    println("1) La temperature moyenne de tous les enregistrements est: "+averageTemperature(data))
    println("2) La temperature moyenne par ville est de: "+averageTemperatureByCity(data).mkString(","))
    println("3) La ville ayant la température moyenne la plus élevée est: "+hottestCity(data).getOrElse("Liste vide"))
    println("4) La nouvelle liste: "+normalizeTemperatures(data).mkString(","))
    println(s"5) Les enregistrements dont la température est comprise entre $tempMin et $tempMax est: ${filterByTemperature(data).mkString(",")}")
    println("6) La ville dont la différence entre la température max et min est la plus grande est: "+cityWithMostVariation(data).getOrElse("Liste vide"))
    println("7) Summary par date: "+dailySummary(data).mkString(","))
  }

  // Question 1:
  def averageTemperature(data: List[Record]): Double = data.map(_.temperature).sum / data.size

  // Question 2:
  def averageTemperatureByCity(data: List[Record]): Map[String, Double] =
    data
      .groupBy(_.city) // Map(city -> List[Record])
      //.map(x => x._1 -> x._2.map(_.temperature).sum / X._2.size)
      /*.map {
        match x:
          case (city, listOfRec) => city -> listOfRec.map(_.temperature).sum / listOfRec.size)
          case _ => Map("" -> -1)
      }*/
      .view
      .mapValues(records => records.map(_.temperature).sum / records.size)
      .toMap

  // Question 3:
  def hottestCity(data: List[Record]): Option[String] = {
    val avgByCity = averageTemperatureByCity(data)
    if (avgByCity.isEmpty) None
    else Some(avgByCity.maxBy(_._2)._1)
  }

  // Question 4
  def normalizeTemperatures(data: List[Record]): List[Record] =
    data.map(r => r.copy(temperature = r.temperature * 9 / 5 + 32))

  // Question 5
  def filterByTemperature(data: List[Record], min: Double, max: Double): List[Record] =
    data.filter(r => r.temperature >= min && r.temperature <= max)

  // Question 6
  def cityWithMostVariation(data: List[Record]): Option[String] = {
    val variations = data
      .groupBy(_.city)
      .view
      .mapValues(records => {
        val temps = records.map(_.temperature)
        temps.max - temps.min
      })
      .toMap

    if (variations.isEmpty) None
    else Some(variations.maxBy(_._2)._1)
  }

  // Question 7
  def dailySummary(data: List[Record]): Map[String, (Double, Double)] =
    data
      .groupBy(_.date)
      .view
      .mapValues(records => {
        val avgTemp = records.map(_.temperature).sum / records.size
        val avgHum = records.map(_.humidity).sum / records.size
        (avgTemp, avgHum)
      })
      .toMap
}
