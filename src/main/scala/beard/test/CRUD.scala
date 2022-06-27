package beard.test

trait CRUD[F[O], T, ID] {

  def findById(id: ID): F[T]

  def create(entity: T): F[Long]

  def update(entity: T): F[T]

  def delete(id: ID): Boolean


}
