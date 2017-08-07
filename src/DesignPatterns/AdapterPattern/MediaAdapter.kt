package DesignPatterns.AdapterPattern

class MediaAdapter() : MediaPlayer{
    var advancedMediaPlayer:AdvanedMediaPlayer?=null

    constructor(audioType:String):this(){
        when(audioType){
            "vlc","VLC" ->  advancedMediaPlayer = VLCPlayer()
            "mp4","MP4" ->  advancedMediaPlayer = MP4Player()
        }
    }
    override fun play(audioType:String , fileName:String) {
        when(audioType){
            "vlc","VLC" ->  advancedMediaPlayer?.playVLC(fileName)
            "mp4","MP4" ->  advancedMediaPlayer?.playMP4(fileName)
        }
    }
}