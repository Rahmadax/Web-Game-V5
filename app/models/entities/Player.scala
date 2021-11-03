package models.entities

import models.Inventory
import models.util.Coordinate

final case class Player(position: Coordinate, isAlive: Boolean, inventory: Inventory) extends Actor {
  val name: String = "Player"
}
