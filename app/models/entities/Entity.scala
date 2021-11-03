package models.entities

import models.Inventory
import models.util.Coordinate

trait Entity {
  def position: Coordinate
  def name: String
}