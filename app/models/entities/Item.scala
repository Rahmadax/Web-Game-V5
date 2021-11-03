package models.entities

import models.util.Coordinate


class Item extends Entity {
  def position: Coordinate = new Coordinate(1,2)
  def name: String = "test"
}
