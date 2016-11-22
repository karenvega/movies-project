//package co.s4n
//
///**
//  * Created by karenvega on 17/11/16.
//  */
//trait Domain {
//  def apply(): Domain = new Domain("", "")
//}
//
//case class Domain(name: String, surname: String);
//
//object CsvParser {
//
//  def parser(file: String, separator: String): Unit = {
//    var lines = file.split(separator);
//    var parsing = name.tupled andThen surname.tupled;
//    parsing(lines, new Domain())
//
//  }
//
//  private def name: (Array[String], Domain) => (Array[String], Domain) = {
//     case (values, domain) => {
//       val name = values.head;
//       val acc = values.tail;
//       domain.copy(name, values.tail)
//     }
//
//  }
//
//  private def surname: (Array[String], Domain) => (Array[String], Domain) = {
//    case (vales, acc) => {
//      var surname = vales.head;
//      acc.copy(values.ta)
//    }
//  }
//}
