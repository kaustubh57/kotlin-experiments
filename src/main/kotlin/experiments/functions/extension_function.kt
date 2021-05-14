package experiments.functions

fun main(args: Array<String>) {
    println("Extension function")
    println("---------------")

    val camera = Camera()
    camera.openCamera()
    camera.applyFilter()
    camera.takePicture()
    camera.saveThePic()

}

// extension function for Camera class
fun Camera.applyFilter() {
    println("Gloss filter applied!")
}

class Camera {

    fun openCamera() {
        println("Camera is now opened")
    }

    fun takePicture() {
        println("Picture clicked! Time to Save it!")
    }

    fun saveThePic() {
        println("Picture saved to sdcard/DCIM")
    }
}
