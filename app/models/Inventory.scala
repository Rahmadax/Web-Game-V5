package models

import models.entities.Item

class Inventory {
  final val maxItems = 20
  private val items: List[Item] = Array[Item](maxItems)

  def dropItem(index: Int): Unit = {
    items.drop(index)
  }

  def addItem(index: Int, item: Item): Unit = {
    items.insert(index, item)
  }

  private def inventoryIsFull(): Boolean = {
    items.size == maxItems
  }

  private def itemExistsAtIndex(index: Int): Boolean = {
    items(index) != null
  }

  def canChangeBagSize(newMaxItems: Int): Boolean ={
    if (newMaxItems > maxItems) {
      return true
    }

    items.size < newMaxItems
  }

  def getItemGoldValue(index: Int): Int = {
    val item = items(index)
    item.goldValue
  }

}
