package com.dileva.networking.interceptor


import com.dileva.networking.BuildConfig
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Response

class RequestInterceptor : Interceptor {

    companion object {
        private const val ACCESS_KEY = "access_key"
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val originalUrl = original.url

        val url: HttpUrl = originalUrl.newBuilder()
            .addQueryParameter(ACCESS_KEY, BuildConfig.API_KEY).build()

        val requestBuilder = original.newBuilder().url(url)
        val request = requestBuilder.build()

        return chain.proceed(request)
    }
}