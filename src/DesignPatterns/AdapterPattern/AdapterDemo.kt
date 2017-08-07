package DesignPatterns.AdapterPattern

fun main(args: Array<String>) {
    AudioPlayer().play("mp3","song1")
    AudioPlayer().play("mp4","song2")
    AudioPlayer().play("vlc","song3")
}