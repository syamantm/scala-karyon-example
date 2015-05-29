package com.syamantak.scala.karyon.server

import io.netty.buffer.ByteBuf
import io.netty.handler.codec.http.HttpResponseStatus
import io.reactivex.netty.protocol.http.server.{HttpServerRequest, HttpServerResponse, RequestHandler}
import rx.Observable


/**
 * @author syamantak
 */
class HelloHandler extends RequestHandler[ByteBuf, ByteBuf] {
  override def handle(request: HttpServerRequest[ByteBuf], response: HttpServerResponse[ByteBuf]): Observable[Void] = {
    request.getUri.endsWith("hello") match {
      case true => response.writeString("Hello from Scala")
      case _ => response.setStatus(HttpResponseStatus.NOT_FOUND)
    }
    response.close(true)
  }
}

object HelloHandler {
  def apply(): HelloHandler = new HelloHandler
}
