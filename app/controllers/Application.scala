package controllers

import play.api._
import controllers.tools.Render
import play.api.mvc._
import controllers.tools._

object Application extends Controller {

  def index = Action { implicit request =>
    Ok(Render.withStds("index.jade"))
  }

}