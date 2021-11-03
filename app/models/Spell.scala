package models


class Spell(newSpellName: String, newManaRequirement: Int,  newEffect: Int, newDuration: Int) {
  private val name = newSpellName
  private val manaRequirement = newManaRequirement
  private val effect = newEffect
  private val duration = newDuration

  def getManaRequirement: Int = manaRequirement
}
