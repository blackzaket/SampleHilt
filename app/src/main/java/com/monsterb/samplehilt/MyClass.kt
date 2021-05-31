package com.monsterb.samplehilt

import javax.inject.Inject

// 기본 적용 방법
class MyClass @Inject constructor() {
    var name: String = "hi"
    var age: Int = 0
}
