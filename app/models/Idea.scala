package models

case class Idea(id: Long, name: String, description: String)

object Idea {
  def all: List[Idea] = Nil

  def create(name: String, description: String): Idea = ???

  def remove(id: Long) = ???
}