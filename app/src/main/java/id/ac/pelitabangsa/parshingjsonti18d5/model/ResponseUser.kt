package id.ac.pelitabangsa.parshingjsonti18d5.model

import com.google.gson.annotations.SerializedName

data class ResponseUser(
        @field:SerializedName("Page")
        val Page: Int? = null,

        @field:SerializedName("Per_Page")
        val Per_Page: Int? = null,

        @field:SerializedName("Total")
        val Total: Int? = null,

        @field:SerializedName("Total_Pages")
        val TotalPages: Int? = null,

        @field:SerializedName("Data")
        val Data: List<DataItem>? = null
)
