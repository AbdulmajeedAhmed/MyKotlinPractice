package DesignPatterns.BuilderPattern

abstract class Burger : Item{
    override fun packing()=Wrapper()
    override abstract fun price(): Float // this is implemented later in the sub classes.
}