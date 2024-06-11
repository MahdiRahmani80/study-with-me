package ir.m3.rahmani.studywithme.payment


import com.google.gson.annotations.SerializedName

data class InAppPurchasePackage(

    @SerializedName("items")
    val items: List<Item?>? = null
) {
    data class Item(
        @SerializedName("credit")
        val credit: Int? = null,
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("price")
        val price: Int? = null,
        @SerializedName("sku")
        val sku: String? = null,
    )
}

fun MyPurchaseInfo.convertToServerPackage(price: Int?): InAppPurchasePackage.Item {
    return InAppPurchasePackage.Item()
}