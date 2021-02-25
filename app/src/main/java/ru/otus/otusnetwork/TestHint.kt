package ru.otus.otusnetwork

/*

const val JSON = """[
    {
        "country_name": "Russia",
        "colors": "white, blue, red"
    },
    {
        "country_name": "France",
        "colors": "blue, white, red"
    },
    {
        "country_name": "Germany",
        "colors": "black, red, yellow"
    }
]"""

fun main() {

    val gson = getGson()

    val fromJson = gson.fromJson<List<Flag>>(JSON, object : TypeToken<List<Flag>>() {}.type)

    println(fromJson.toString())
    println(gson.toJson(fromJson))
}

fun getGson() =
    GsonBuilder()
        .setPrettyPrinting()
        .serializeNulls()
        .registerTypeAdapter(Colors::class.java, ColorDeserializer())
        .create()

data class Flag(
    @SerializedName("id") val id: String,
    @SerializedName("country_name") val country: String,
    @SerializedName("colors") val colors: Colors
)

data class Colors(
    val colors: List<String>
)

class ColorDeserializer : JsonDeserializer<Colors>, JsonSerializer<Colors> {
    override fun deserialize(
        json: JsonElement,
        typeOfT: Type,
        context: JsonDeserializationContext
    ): Colors {
        return Colors(json.asString.split(","))
    }

    override fun serialize(
        src: Colors,
        typeOfSrc: Type,
        context: JsonSerializationContext
    ): JsonElement {
        return JsonPrimitive(src.colors.joinToString())
    }

}*/


//https://otus.ru/polls/9682/