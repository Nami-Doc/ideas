package controllers

import play.api._
import controllers.tools.Render
import play.api.mvc._
import models._
import play.api.data._
import play.api.data.Forms._

object Ideas extends Controller {
  def index = Action { implicit request =>
    val form = Form(
      "title" -> nonEmptyText
    )

    Ok(Render.withStds("ideas/index.jade",
      'ideas -> Idea.all,
      'form -> form
    ))
  }

  def create = TODO

  def remove(id: Long) = Action { implicit request =>
    Redirect(routes.Ideas.index())
  }
}