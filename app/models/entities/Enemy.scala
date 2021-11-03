package models.entities

import models.Inventory
import models.util.Coordinate

final case class Enemy() extends Actor {
  val name: String = "Enemy"
  val isAlive = true
  val position = new Coordinate(0, 1)
}
