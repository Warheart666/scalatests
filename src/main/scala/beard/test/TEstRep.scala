package beard.test

import com.zaxxer.hikari.{HikariConfig, HikariDataSource}
import io.getquill.{CamelCase, NamingStrategy, PostgresJdbcContext, UpperCase}

class TEstRep {
  self: TEstInj =>
  val pgDataSource = new org.postgresql.ds.PGSimpleDataSource()
  pgDataSource.setUser("postgres")
  pgDataSource.setPassword("666")
  pgDataSource.setURL("jdbc:postgresql://localhost:5432/postgres?currentSchema=quilltest")

  val config = new HikariConfig()
  config.setDataSource(pgDataSource)

  val ctx = new PostgresJdbcContext(NamingStrategy(CamelCase, UpperCase), new HikariDataSource(config))

  import ctx._

  def create(person: Person) = {
    test()
    ctx.run {
      query[Person].insert(lift(person))
    }
  }

  //  def q: Quoted[ctx.DynamicInsert[Person]] = quote(dynamicQuery[qq].insertValue(Person("hgf",789)))

  //
  //
  //  def find: Person = {
  //    //    Try {
  //    //      ctx.transaction {
  //    val rs =
  //    ctx.run {
  //      query[Person].filter(p => quote(p.name == "asd")).map(p => Person(p.name, p.age))
  //    }
  //    //      val value = ctx.run(rs)
  //    Person("asd", 123)
  //    //        if (generateId) {
  //    //          ctx.createAndGenerateId[PersonId, Person](entity)
  //    //        } else {
  //    //        ctx.create[PersonId, Person](entity)
  //    //        }
  //    //      }
  //    //    }
  //  }
}
