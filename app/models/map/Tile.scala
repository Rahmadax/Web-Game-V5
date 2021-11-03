package models.map

sealed trait Tile {
  def traversalTime: Int
  def visibleHexColour: String
  def exploredHexColour: String
}

object TileTypeList {
  case object Wall extends Tile {
    val traversalTime: Int = Int.MaxValue
    val visibleHexColour: String = "#8178A6"
    val exploredHexColour: String = "#443F59"
  }

  case object Floor extends Tile {
    val traversalTime: Int = 1
    val visibleHexColour: String = "#7A8392"
    val exploredHexColour: String = "#4B5565"
  }

  case object ShallowWater extends Tile {
    val traversalTime: Int = 2
    val visibleHexColour: String = "#0C5DDB"
    val exploredHexColour: String = "#254A83"
  }

  case object DeepWater extends Tile {
    val traversalTime: Int = Int.MaxValue
    val visibleHexColour: String = "#0C5DDB"
    val exploredHexColour: String = "#254A83"
  }

  case object Swamp extends Tile {
    val traversalTime: Int = 3
    val visibleHexColour: String = "#0C5DDB"
    val exploredHexColour: String = "#254A83"
  }

  case object LooseStone extends Tile {
    val traversalTime: Int = Int.MaxValue
    val visibleHexColour: String = "#DE931D"
    val exploredHexColour: String = "#654006"
  }

}
