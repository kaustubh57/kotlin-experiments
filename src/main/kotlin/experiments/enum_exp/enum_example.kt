package experiments.enum_exp

import java.util.*

fun main() {
    val myLanguage: Language = Language.valueOf("en_GB")
    if (myLanguage === Language.English) {
        println("Yes, I know, you understand English!")
    }
}

enum class Language(vararg values: String) {
    English("english", "eng", "en", "en_GB", "en_US"),
    German("german", "de", "ge"),
    Croatian(
        "croatian",
        "hr",
        "cro"
    ),
    Russian("russian");

    val values: List<String> = listOf(*values)

}

enum class Type(val value: Int) {
    A(1),
    B(2),
    C(3);

    //    companion object {
//        val map: MutableMap<Int, Type> = HashMap()
//
//        init {
//            for (i in Type.values()) {
//                map[i.value] = i
//            }
//        }
//
//        fun fromInt(type: Int?): Type? {
//            return map[type]
//        }
//    }
//    companion object {
//        private val map = Type.values().associateBy(Type::value)
//        fun fromInt(type: Int) = map[type]
//    }

    companion object {
        private val VALUES = values()
        fun getByValue(value: Int) = VALUES.firstOrNull { it.value == value }
    }
}
