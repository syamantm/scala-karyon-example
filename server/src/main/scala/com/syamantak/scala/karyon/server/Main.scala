package com.syamantak.scala.karyon.server

import netflix.adminresources.resources.KaryonWebAdminModule
import netflix.karyon.health.AlwaysHealthyHealthCheck
import netflix.karyon.servo.KaryonServoModule
import netflix.karyon.{Karyon, KaryonBootstrapModule, ShutdownModule}


/**
 * @author : syamantak
 */
object Main extends App {

  Karyon.forRequestHandler(8080, HelloHandler(),
    new KaryonBootstrapModule(new AlwaysHealthyHealthCheck),
    Karyon.toBootstrapModule(classOf[KaryonWebAdminModule]),
    ShutdownModule.asBootstrapModule,
    KaryonServoModule.asBootstrapModule
  ).startAndWaitTillShutdown
}
