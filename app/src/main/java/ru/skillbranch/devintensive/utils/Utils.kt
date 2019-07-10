package ru.skillbranch.devintensive.utils

import ru.skillbranch.devintensive.models.User

object Utils {
    fun parseFullName(fullName:String?) : Pair<String?,String?> {
        val parts: List<String>? = fullName?.split(" ")
        var firstName = parts?.getOrNull(index = 0) ?: "null"
        var lastName= parts?.getOrNull(index = 1) ?: "null"
        if (firstName=="")
            firstName="null"
        if (lastName=="")
            lastName="null"
        return firstName to lastName
//        return Pair(firstName, lastName)
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
//        firstName?.get(0)  + lastName?.get(0)
        if (firstName=="")
            firstName="null"
        if (lastName=="")
            lastName="null"

        return firstName?.get(0).toString()+ lastName?.get(0).toString()

    }
    fun transliteration(payload: String, divider: String = " "): String {
        TODO("not implemented")
//        val replaces: Array<String> = Array
//            "а": "a",
//            "б": "b",
//            "в": "v",
//            "г": "g",
//            "д": "d",
//            "е": "e",
//            "ё": "e",
//            "ж": "zh",
//            "з": "z",
//            "и": "i",
//            "й": "i",
//            "к": "k",
//            "л": "l",
//            "м": "m",
//            "н": "n",
//            "о": "o",
//            "п": "p",
//            "р": "r",
//            "с": "s",
//            "т": "t",
//            "у": "u",
//            "ф": "f",
//            "х": "h",
//            "ц": "c",
//            "ч": "ch",
//            "ш": "sh",
//            "щ": "sh'",
//            "ъ": "",
//            "ы": "i",
//            "ь": "",
//            "э": "e",
//            "ю": "yu",
//            "я": "ya"
//        ]
    }


}