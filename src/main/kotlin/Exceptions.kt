import java.io.DataInputStream
import java.io.FileInputStream

fun main() {
    uncheckedExceptions()
}


// Only  In Java Checked exception -> Compile time exceptions (Compile must you put try catch  even if exception not happen )

//Unchecked exception -> Runtime exceptions

//Java has Checked exception and Unchecked exception
//Kotlin has Unchecked exception only

/*

  finally {
  code in finally will execute even if app is crashing

  //Stream will be closed in finally
  }

 */
fun uncheckedExceptions() {

    val input = try {
        DataInputStream(FileInputStream("")).readUTF()
    } catch (e: Exception) {
        "Error"

    } finally {
        "inside finally".println()
    }
input.println()
}
