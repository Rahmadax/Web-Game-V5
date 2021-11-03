package models

import models.entities.{Enemy, Item}
import models.map.TileMap
import models.util.Coordinate

class Scene(newMap: TileMap) {
  private val map: TileMap = newMap
  private val items: Seq[Item] = Seq()
  private val enemies: Seq[Enemy] = Seq()
  private val exploredTileCoordinates: Map[Coordinate, Boolean] = Map()
  private val visibleTileCoordinates: Map[Coordinate, Boolean] = Map() // Subset of above
  private val transitionCoordinateMap: Map[Coordinate, String] = Map()

  def getLivingVisibleEnemies: Seq[Enemy] =
    enemies
      .filter(_.isAlive)
      .filter(visibleTileCoordinates contains _.position )

  def getVisibleItems: Seq[Item] =
    items
      .filter(visibleTileCoordinates contains _.position )

  def getVisibleTileCoordinates: Seq[Coordinate] =
    visibleTileCoordinates.keys.toSeq

  def getExploredTileCoordinates: Seq[Coordinate] =
    exploredTileCoordinates.keys.toSeq

  def getTransitionCoordinate: Seq[Coordinate] =
    transitionCoordinateMap.keys.toSeq

  def findTransitionName(coordinate: Coordinate): String =
    transitionCoordinateMap(coordinate)

}
