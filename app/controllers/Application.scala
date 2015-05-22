package controllers

import java.io.{InputStreamReader, BufferedReader}
import java.net.URL

import play.api.mvc._

object Application extends Controller {

  def  getHtml: String = {

    val oracle = new URL("http://www.oracle.com/")
    val in = new BufferedReader(
      new InputStreamReader(oracle.openStream()))
                 var html=""
    var inputLine = ""
    while (inputLine != null){
      html += inputLine
    inputLine = in.readLine()
    in.close()
    }
    html
  }

  def index = Action {

    Ok(views.html.index(getHtml))
  }



}