package com.pzdf.testkotlin

open class Person() {
    open var age=0;
    open var name=""

    constructor(age:Int,name:String) : this() {
        this.age=age
        this.name=name
    }

}