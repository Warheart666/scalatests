package beard.test

import com.zaxxer.hikari.{HikariConfig, HikariDataSource}
import io.getquill.{CamelCase, NamingStrategy, PostgresJdbcContext, UpperCase}
import org.springframework.stereotype.Service

trait Rep[T] {


  def create(): T

  def update(): Long

  def delete(): Boolean


  val pgDataSource = new org.postgresql.ds.PGSimpleDataSource()
  pgDataSource.setUser("postgres")
  pgDataSource.setPassword("666")
  pgDataSource.setURL("jdbc:postgresql://localhost:5432/postgres?currentSchema=quilltest")

  val config = new HikariConfig()
  config.setDataSource(pgDataSource)

  val ctx = new PostgresJdbcContext(NamingStrategy(CamelCase, UpperCase), new HikariDataSource(config))

  //  type qq

}

@Service
class TaskRep extends Rep[Task] {
  override def create(): Task = ???

  override def update(): Long = ???

  override def delete(): Boolean = ???
}

