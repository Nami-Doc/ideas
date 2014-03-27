package controllers

import play.api._
import play.api.mvc._
import models._
import play.api.data._
import play.api.data.Forms._

object Ideas extends Controller {
  def index = Action {
    val form = Form(
      "title" -> nonEmptyText
    )

    Ok(views.html.ideas.index(ideas = Idea.all, ideaForm = form))
  }

  def create = TODO

  def remove(id: Long) = Action {
    Redirect(routes.Ideas.index())
  }
}