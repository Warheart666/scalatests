package beard.test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Main {

  //  service: Service =>

  //  @Autowired
  //  var qwe: TEstRep = _


  //  println("scala main class")
  //
  //  def test(): Unit = {
  //    service.run()
  //  }

  //  override def run(args: String*): Unit = {
  //    qwe.create(Person("sad", 666))
  //    print("created")
  //  }

}

object Main extends App {

  println("scala main object")

  SpringApplication.run(classOf[Main])

  //
  //  new Main() with Service {
  //    override def run(): Unit = print("lin")
  //  }.test()
  //


}
