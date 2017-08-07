package DesignPatterns.AdapterPattern

interface MediaPlayer{
    fun play(audioType:String , fileName:String)
}

class AudioPlayer : MediaPlayer{
    override fun play(audioType:String , fileName:String) {
        when(audioType){
            "mp3","MP3" ->   println("MP3 song... playing $fileName")
            "vlc","VLC" ->   MediaAdapter(audioType).play(audioType,fileName)
            "mp4","MP4" ->   MediaAdapter(audioType).play(audioType,fileName)
            else -> println("Invalid audio type.....")
        }

    }
}