package controllers

import enums.CardinalDirection
import models.entities.Player
import models.GameState
import models.saves.GameSaves
import play.api.mvc._
import services.{FishingService, MapService, VerificationService}

import javax.inject.{Inject, Singleton}

@Singleton
class GameController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  var gameState: GameState = init()
  val serviceModules: ServiceModules = initServiceModules()

  val verificationController: VerificationService = new VerificationService
  val saveFiles: GameSaves = new GameSaves()

  def getGameStateController: GameState = {
    gameState
  }

  def changeSaveController(saveName: String): Unit = {
    gameState = saveFiles.getSave(saveName)
  }

  def playerMoveController(cardinalDirection: CardinalDirection.Direction): Unit = {
    gameState.moveAction(cardinalDirection)
    gameState.performNpcActions()
  }

  def useItemController(inventoryIndex: Int): Unit = {

  }

  def createNewPlayerController(name: String): Player = {
    new Player(name)
  }

  def test(): Action[AnyContent] = {
    println("Hello this is a test")
    Action.apply(
      Ok.apply("Hi there"))
  }

  private def init(): GameState = {
    val newTestPlayer = new Player(
      "Fred"
    )

    gameState
  }

  private def initServiceModules(): ServiceModules = {
    new ServiceModules(
      fishingService = new FishingService(),
      mapService = new MapService()
    )
  }

}
