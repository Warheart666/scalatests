package beard.test.service

import beard.test.{CRUD, Rep, Task}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype

import scala.util.Try

trait Service[F[_], T, ID] extends CRUD[F, T, ID]


@stereotype.Service
class TaskService(@Autowired rep: Rep[Task]) extends Service[Try, Task, Long] {
  override def findById(id: Long): Try[Task] = ???

  override def create(entity: Task): Try[Task] = Try {
    rep.create()
  }

  override def update(entity: Task): Try[Task] = ???

  override def delete(id: Long): Boolean = ???
}
