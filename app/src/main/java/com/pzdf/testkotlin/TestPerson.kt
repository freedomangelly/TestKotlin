package com.pzdf.testkotlin

import android.os.Parcel
import android.os.Parcelable

class TestPerson() : Person(), Parcelable{
    constructor(parcel: Parcel) : this() {
    }

    constructor(age:Int,name:String) : this() {
        super.name=name
        super.age=age
    }


    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TestPerson> {
        override fun createFromParcel(parcel: Parcel): TestPerson {
            return TestPerson(parcel)
        }

        override fun newArray(size: Int): Array<TestPerson?> {
            return arrayOfNulls(size)
        }
    }

}