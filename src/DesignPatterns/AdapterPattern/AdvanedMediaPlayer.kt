package DesignPatterns.AdapterPattern

interface AdvanedMediaPlayer{
    fun playVLC(fileName:String)
    fun playMP4(fileName:String)
}

class MP4Player : AdvanedMediaPlayer{
    override fun playVLC(fileName:String) {  // do nothing
    }

    override fun playMP4(fileName:String) {
        println("MP4 song... playing $fileName")
    }
}

class VLCPlayer : AdvanedMediaPlayer{
    override fun playVLC(fileName:String) {
        println("VLC song... playing $fileName")
    }

    override fun playMP4(fileName:String) {
    }
}