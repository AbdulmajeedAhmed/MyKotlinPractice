package DesignPatterns.BuilderPattern

abstract class ColdDrink: Item{
    override fun packing()= Bottle()
    override abstract fun price(): Float
}