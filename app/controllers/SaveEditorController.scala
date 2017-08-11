package controllers

import java.nio.file.Paths
import javax.inject._

//import models.VaultSave
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
//import views.html.saveEditor
import scala.io.Source._
import scala.concurrent.{ExecutionContext, Future}



@Singleton
class SaveEditorController @Inject()(cc: ControllerComponents)(implicit ec: ExecutionContext) extends AbstractController(cc) {

  def loadPage(): Action[AnyContent] = Action.async {
    Future.successful(Ok(""))
    //    Future.successful(Ok(saveEditor(VaultSave())))
  }

  def submitPlayerFile() = Action(parse.multipartFormData) {
    request =>
      request.body.file("playerSave").map{
        playerSave =>
          val source = fromFile(playerSave.ref.path.toString)
          try println(source.mkString) finally source.close()
          Ok("File uploaded")
      }.getOrElse{
        BadRequest("BLEGH")
      }
  }

//  def handleFileAsString(temporaryFileCreator: TemporaryFileCreator): FilePartHandler[String] = {
//    case FileInfo(partName, fileName, contentType) =>
//      val tempFile = temporaryFileCreator.create("multipartBody", "asTemporaryFile")
//      Accumulator(FileIO.toPath(tempFile.path)).map { _ =>
//        FilePart(partName, filename, contentType, tempFile)
//      }
//  }
//
//  def handleFilePartAsTemporaryFile(temporaryFileCreator: TemporaryFileCreator): FilePartHandler[TemporaryFile] = {
//    case FileInfo(partName, filename, contentType) =>
//      val tempFile = temporaryFileCreator.create("multipartBody", "asTemporaryFile")
//      Accumulator(FileIO.toPath(tempFile.path)).map { _ =>
//        FilePart(partName, filename, contentType, tempFile)
//      }
//  }

//
//  def handleFilePartAsByteArray: FilePartHandler[FilePart[Array[Byte]]] =
//    {
//      case FileInfo(partName, filename, contentType) =>
//        // simply write the data to the a ByteArrayOutputStream
//        Iteratee.fold[Array[Byte], ByteArrayOutputStream](
//          new ByteArrayOutputStream()) { (os, data) =>
//          os.write(data)
//          os
//        }.mapDone { os =>
//          os.close()
//          os.toByteArray
//        }
//    }
}
