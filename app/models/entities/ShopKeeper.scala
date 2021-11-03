package models.entities

import models.util.Coordinate

class ShopKeeper() extends Actor {
  def isAlive: Boolean = true
  def position: Coordinate = new Coordinate(1, 0)
  def name: String = "Shopkeeper"
}
