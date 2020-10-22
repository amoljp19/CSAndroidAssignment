# Android Assignment CS

This repository contains a sample app that implements **MVVM + RecyclerView + Retrofit + Dagger-Hilt + Coroutines + Moshi + Glide** using **Kotlin**.

## The app has following packages:

1. **di:** It contains the files required by Dagger
2. **model:** It contains all data model classes
3. **network:** It contains all networking ralated classes and interfaces
4. **repository:** It contains repository classes
5. **ui:** View classes along with their corresponding ViewModel.
6. **utils:** Utility classes.

## Tech stack & Open-source libraries

1. Minimum SDK level 23
2. Kotlin based + Coroutines for asynchronous.
3. JetPack
   - LiveData - notify domain layer data to views.
   - Lifecycle - dispose of observing data when lifecycle state changes.
   - ViewModel - UI related data holder, lifecycle aware.
4. Architecture
   - MVVM Architecture (View -. ViewModel - Model)
5. Repository pattern
6. Hilt - dependency injection, With Hilt, you get a better runtime performance and compile-time correctness, scalability and Android Studio support also Google recommends Hilt for Android apps.
7. Retrofit2 - construct the REST APIs.
8. Moshi codegen- modern JSON library for Android, faster and most Kotlin-friendly library you can use to parse JSON files
9. OkHttp3 - implementing interceptor, logging and mocking web server.
10. Glide - loading images.





