package id.ac.pelitabangsa.parshingjsonti18d5

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import id.ac.pelitabangsa.parshingjsonti18d5.model.DataItem
import id.ac.pelitabangsa.parshingjsonti18d5.model.ResponseUser
import id.ac.pelitabangsa.parshingjsonti18d5.network.ApiConfig
import retrofit2.Call

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: UserAdaptor

    override fun onCreate(savedInstanceState: Bundle? {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = UserAdaptor(mutableListOf())

        rv_user.setHasFixedSize(true)
        rv_user.LayoutManager = LinearLayoutManager( this)
        rv_user.adapter = adapter
        getUser()
    }

    private fun getUser(){
        val client = ApiConfig.getApiService().getListUsers( "1")
        override fun onResponse(call: Call<ResponseUser>, response: retrofit2.Response<ResponseUser>) {
            if (response.isSuccessful){
                val dataArray = response.body()?.Data as List<DataItem>
                for (data in dataArray) {
                    adapter.addusser(data)
                }
            }

        }
    override fun onFailure(call: Call<ResponseUser>, t: Throwable){
        Toast.makeText(this@MainActivity, t.message, Toast.LENGTH_SHORT).show()
        t.printStackTrace()
    })
    }