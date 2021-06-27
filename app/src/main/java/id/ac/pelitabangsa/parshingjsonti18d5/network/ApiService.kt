package id.ac.pelitabangsa.parshingjsonti18d5.network


import id.ac.pelitabangsa.parshingjsonti18d5.model.ResponseUser
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    //Menampilkan user dengan query
    @GET("api/users")
    fun getListUsers(@Query("page") page: String): retrofit2.Call<ResponseUser>
}