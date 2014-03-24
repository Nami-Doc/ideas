package controllers

import play.api._
import controllers.tools.Render
import play.api.mvc._
import models._

object Ideas extends Controller {
  def index = Action { implicit request =>
    Ok(Render.withStds("ideas/index.jade",
      'ideas -> Idea.all
    ))
  }

  def create = TODO

  def remove(id: Long) = Action { implicit request =>
    Redirect(routes.Ideas.index())
  }
}