import scala.util.Try

trait MovieService {

  def getParentalControlLevel(movieId: String): Try[String]
}
