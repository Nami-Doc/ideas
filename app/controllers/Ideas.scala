package controllers

import play.api._
import play.api.mvc._
import controllers.tools._

object Ideas extends Controller {
  def index = Action { implicit request =>
    Ok(Render.withStds("index.jade"))
  }
}