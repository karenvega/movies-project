package co.s4n

/**
  * Created by karenvega on 8/11/16.
  */

// abstract class Movie
case class MovieActor(name: String,
                      facebook: String)

trait SocialNetwork
case class Facebook(likes: Int) extends SocialNetwork
case class Imdb(link: String,
                score: Double) extends SocialNetwork

case class MovieComplete(movieForeverAlone: MovieForeverAlone,
                         actors: List[MovieActor],
                         director: MovieActor,
                         socialNetwork: SocialNetwork)

case class MovieFinancialResources(gross: Double,
                                   budget: Double)

case class MovieForeverAlone(director: MovieActor,
                             duration: String,
                             genres: List[String],
                             title: String,
                             language: String,
                             plotKeywords: String,
                             imdb: Imdb,
                             country: String,
                             year: Int,
                             actors: List[MovieActor])

object MovieActor {
  def apply(s: Array[String]): MovieActor = s match {
    case (name, likes) => {
      MovieActor(name, likes)
    };
  }
}

//object MovieExtractor {
//  def unapply(s: String) : Option[MovieComplete] = try {
//    Some( MovieComplete(s) )
//  }
//  catch {
//    // bettor handling of bad cases
//    case e: Throwable => None
//  }
//}
