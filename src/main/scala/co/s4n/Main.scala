package co.s4n

import com.typesafe.scalalogging.LazyLogging

import scala.io.Source

object Main extends App with LazyLogging {

  logger.info(m())

  def m(): String = "Hello world"

//  def readFile(): String = {
//    val filename = "movie_metadata.csv"
//    for (line <- Source.fromFile(filename).getLines()) {
//      processLine(line)
//    }
//
//    "hola";
//  }

//  def processLine(line: String) : String = {
//    val movies = List.empty;
//    val movieLine = "Color;James Cameron;723;178;0;855;Joel David Moore;1000;760505847;Action|Adventure|Fantasy|Sci-Fi;CCH Pounder;Avatar ;886204;4834;Wes Studi;0;avatar|future|marine|native|paraplegic;http://www.imdb.com/title/tt0499549/?ref_=fn_tt_tt_1;3054;English;USA;PG-13;237000000;2009;936;7.9;1.78;33000;";
//    val movie = MovieComplete(movieLine)
//    line match {
//      case MovieExtractor(u) => movies = movies :: u
//
//    }
//    return "hola";
//  }


  def mostMoviesByDirector(movies: Seq[(String, Int)]): String = {
    val votesByMovie = movies groupBy {
      case (movie, _) => movie
    }
    val sumByMovie = votesByMovie map {
      case (movie, counts) => {
        val countsOnly = counts map {
          case (_, count) => count
        }
        (movie, countsOnly.sum)
      }
    }
    val orderedVotes = sumByMovie.toSeq
      .sortBy { case (_, count) => count }
      .reverse

    orderedVotes(0)._1.toString()
  }

  def bestMovie(movies: Seq[(String, Int)]): String = {
    val votesByMovie = movies
      .sortBy {
        case (_, count) => count
      }
      .reverse

    votesByMovie(0)._1.toString;
  }
}

