package beard.test.controllers

import beard.test.Task
import beard.test.service.Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

import scala.util.Try

@RestController
@RequestMapping(Array("/"))
class TestController(@Autowired private val service: Service[Try, Task, Long]) {

  @GetMapping
  def test(): Unit = {
    val task = Task(1, "agdfjasgdfjhasgdf", 666)
    service.create(task)
  }

}
