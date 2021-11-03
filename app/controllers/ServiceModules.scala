package controllers

import services.{FishingService, MapService}

class ServiceModules(
                      val fishingService: FishingService,
                      val mapService: MapService
                    )
