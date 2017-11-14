import scala.collection.mutable

case object FileExistsException

trait Files {
  var name: String
  var permission: Int
}

class File(var name: String) extends Files {
  override var permission: Int = 644
  var content: Option[String] = Some("")
}

class Directory(var name: String) extends Files {
  override var permission: Int = 755
  var files: mutable.HashMap[String, Files] = mutable.HashMap[String, Files]()

  def add(file: Files) = {
    if (files.contains(file.name)) {
      throw new Exception
    } else {
      files.put(file.name, file)
    }
  }

  def exists(fileName: String) = files.contains(fileName)

}

class FileSystem {
  var currentPath = "/"
  var files: mutable.HashMap[String, Files] = mutable.HashMap[String, Files]()

  def touch(fileName: String) = {
    if (files.contains(currentPath + fileName)) {
      throw new Exception
    } else {
      val file = new File(fileName)
      files.put(currentPath + file.name, file)
    }
  }

  def mkdir(path: String, dirName: String) = {
    files.put(path + dirName, new Directory(dirName))
  }

  def cd(path: String) = {
    currentPath = path
  }

  def ls(path: Option[String] = Some("/")): mutable.Map[String, Files] = path match {
    case Some(rootpath) if rootpath == "/" => files
    case Some(userpath) => if (files.contains(userpath)) {
      files(userpath).asInstanceOf[Directory].files
    } else {
      files
    }
  }
}

val fileSystem = new FileSystem

fileSystem.touch("HelloWorld")
fileSystem.mkdir("/", "folder")
fileSystem.ls(Some("/folder"))





