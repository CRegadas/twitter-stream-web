package controllers

import play.api._
import play.api.mvc._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


class Application extends Controller {

  def index = Action.async {
    Future {
      Ok(views.html.index())
    }

  }

}
