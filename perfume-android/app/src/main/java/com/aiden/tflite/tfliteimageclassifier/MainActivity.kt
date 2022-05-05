package com.aiden.tflite.tfliteimageclassifier

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.TextUtils.replace
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.aiden.tflite.tfliteimageclassifier.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater, null, false) }

    private lateinit var tabLayout : TabLayout
    //private lateinit var fragmentManager : FragmentManager



    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 페이지 배경색 정보가 담긴 리스트
        val bgColors: MutableList<Int> = mutableListOf(
            android.R.color.holo_green_light,
            android.R.color.holo_blue_dark
        )

        setContentView(binding.root)


        // 실행가능코드
        // 뷰페이져에 프래그먼트 넣기
        binding.pager.adapter = ViewPagerAdapter(this)

        TabLayoutMediator(binding.tabLayout, binding.pager) {tab, position ->
            when(position) {
                0 -> tab.text = "PERFUME"
                1 -> tab.text = "FAVORITE"
                2 -> tab.text = "ETC"
            }
        }.attach()

        // 버튼 클릭 시 액티비티 전환
        binding.run {
            btnGallery.setOnClickListener {
                startActivity(Intent(this@MainActivity, GalleryActivity::class.java))
            }

            btnHistory.setOnClickListener {
                startActivity(Intent(this@MainActivity, HistoryActivity::class.java))
            }

            btnCamera.setOnClickListener {
                startActivity(Intent(this@MainActivity, CameraActivity::class.java))
            }
        }


        // api
        /*
        tvRainRatio = findViewById(R.id.tvRainRatio)
        tvRainType = findViewById(R.id.tvRainType)
        tvHumidity = findViewById(R.id.tvHumidity)
        tvSky = findViewById(R.id.tvSky)
        tvTemp = findViewById(R.id.tvTemp)
        btnRefresh = findViewById(R.id.btnRefresh)

        // nx, ny지점의 날씨 가져와서 설정하기
        setWeather(nx, ny)

        // <새로고침> 버튼 누를 때 날씨 정보 다시 가져오기
        btnRefresh.setOnClickListener {
            setWeather(nx, ny)
        }*/

    }

    /*
    fun setWeather(nx : String, ny : String) {
        // 준비 단계 : base_date(발표 일자), base_time(발표 시각)
        // 현재 날짜, 시간 정보 가져오기
        val cal = Calendar.getInstance()
        base_date = SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(cal.time) // 현재 날짜
        val time = SimpleDateFormat("HH", Locale.getDefault()).format(cal.time) // 현재 시간
        // API 가져오기 적당하게 변환
        base_time = getTime(time)
        // 동네예보  API는 3시간마다 현재시간+4시간 뒤의 날씨 예보를 알려주기 때문에
        // 현재 시각이 00시가 넘었다면 어제 예보한 데이터를 가져와야함
        if (base_time >= "2000") {
            cal.add(Calendar.DATE, -1).toString()
            base_date = SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(cal.time)
        }

        // 날씨 정보 가져오기
        // (응답 자료 형식-"JSON", 한 페이지 결과 수 = 10, 페이지 번호 = 1, 발표 날싸, 발표 시각, 예보지점 좌표)
        val call = ApiObject.retrofitService.GetWeather("JSON", 10, 1, base_date, base_time, nx, ny)

        // 비동기적으로 실행하기
        call.enqueue(object : retrofit2.Callback<WEATHER> {
            // 응답 성공 시
            override fun onResponse(call: Call<WEATHER>, response: Response<WEATHER>) {
                if (response.isSuccessful) {
                    // 날씨 정보 가져오기
                    var it: List<ITEM> = response.body()!!.response.body.items.item

                    var rainRatio = ""      // 강수 확률
                    var rainType = ""       // 강수 형태
                    var humidity = ""       // 습도
                    var sky = ""            // 하능 상태
                    var temp = ""           // 기온
                    for (i in 0..9) {
                        when(it[i].category) {
                            "POP" -> rainRatio = it[i].fcstValue    // 강수 기온
                            "PTY" -> rainType = it[i].fcstValue     // 강수 형태
                            "REH" -> humidity = it[i].fcstValue     // 습도
                            "SKY" -> sky = it[i].fcstValue          // 하늘 상태
                            "T3H" -> temp = it[i].fcstValue         // 기온
                            else -> continue
                        }

                    }
                    // 날씨 정보 텍스트뷰에 보이게 하기
                    setWeather(rainRatio, rainType, humidity, sky, temp)

                    // 토스트 띄우기
                    Toast.makeText(applicationContext, it[0].fcstDate + ", " + it[0].fcstTime + "의 날씨 정보입니다.", Toast.LENGTH_SHORT).show()
                }
            }

            // 응답 실패 시
            override fun onFailure(call: Call<WEATHER>, t: Throwable) {
                Log.d("api fail", t.message.toString())
            }
        })
    }

    // 텍스트 뷰에 날씨 정보 보여주기
    fun setWeather(rainRatio : String, rainType : String, humidity : String, sky : String, temp : String) {
        // 강수 확률
        tvRainRatio.text = rainRatio + "%"
        // 강수 형태
        var result = ""
        when(rainType) {
            "0" -> result = "없음"
            "1" -> result = "비"
            "2" -> result = "비/눈"
            "3" -> result = "눈"
            "4" -> result = "소나기"
            "5" -> result = "빗방울"
            "6" -> result = "빗방울/눈날림"
            "7" -> result = "눈날림"
            else -> "오류"
        }
        tvRainType.text = result
        // 습도
        tvHumidity.text = humidity + "%"
        // 하능 상태
        result = ""
        when(sky) {
            "1" -> result = "맑음"
            "3" -> result = "구름 많음"
            "4" -> result = "흐림"
            else -> "오류"
        }
        tvSky.text = result
        // 온도
        tvTemp.text = temp + "°"
    }

    // 시간 설정하기
    // 동네 예보 API는 3시간마다 현재시각+4시간 뒤의 날씨 예보를 보여줌
    // 따라서 현재 시간대의 날씨를 알기 위해서는 아래와 같은 과정이 필요함. 자세한 내용은 함께 제공된 파일 확인
    fun getTime(time : String) : String {
        var result = ""
        when(time) {
            in "00".."02" -> result = "2000"    // 00~02
            in "03".."05" -> result = "2300"    // 03~05
            in "06".."08" -> result = "0200"    // 06~08
            in "09".."11" -> result = "0500"    // 09~11
            in "12".."14" -> result = "0800"    // 12~14
            in "15".."17" -> result = "1100"    // 15~17
            in "18".."20" -> result = "1400"    // 18~20
            else -> result = "1700"             // 21~23
        }
        return result
    }*/
}