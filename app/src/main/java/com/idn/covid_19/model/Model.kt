package com.idn.covid_19.adapter

data class AllCountries (val Global: World, val Countries: List<Countries>)

//paras ganteng

data class World (
    val TotalConfirmed: String = "",
    val TotalDeaths: String = "",
    val TotalRecovered: String = ""
)

data class Countries(
    val Country: String = "",
    val CountryCode: String = "",
    val Slug: String = "",
    val NewConfirmed: String = "",
    val NewDeaths: String = "",
    val TotalDeaths: String = "",
    val NewRecovered: String = "",
    val TotalRecovered: String = "",
    val TotalConfirmed: String = "",
    val Date: String = ""
)

data class InfoCountry(
    val Confirmed: String = "",
    val Recovered: String = "",
    val Deaths: String = "",
    val Active: String = "",
    val Date: String = ""
)


