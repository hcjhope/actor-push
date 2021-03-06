package im.actor.push.controllers

import play.api.libs.json.{JsValue, Json}
import play.api.mvc.Results._
import play.api.mvc._
import play.mvc.Controller

class SubscriberController extends Controller {
  def subscribe = Action { request =>

    def channelId = "actor.subs-" + java.util.UUID.randomUUID.toString

    val result: JsValue = Json.obj(
      "endpoint" -> s"tcp://lab2.81port.com:1883/",
      "topic" -> s"$channelId",
      "push_endpoint" -> s"https://push.actor.im/push/"
    )

    Ok(result)
  }
}