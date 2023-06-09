package com.dileva.networking.model

import com.squareup.moshi.Json

data class FixerResponse(
    @Json(name = "success") val success: Boolean,
    @Json(name = "timestamp") val timestamp: Long?,
    @Json(name = "base") val base: String?,
    @Json(name = "date") val date: String,
    @Json(name = "rates") val rates: RatesResponse
)

/**
 * Json generated class
 */
data class RatesResponse(
    @Json(name = "AED") val AED: Double? = null,
    @Json(name = "AFN") val AFN: Double? = null,
    @Json(name = "ALL") val ALL: Double? = null,
    @Json(name = "AMD") val AMD: Double? = null,
    @Json(name = "ANG") val ANG: Double? = null,
    @Json(name = "AOA") val AOA: Double? = null,
    @Json(name = "ARS") val ARS: Double? = null,
    @Json(name = "AUD") val AUD: Double? = null,
    @Json(name = "AWG") val AWG: Double? = null,
    @Json(name = "AZN") val AZN: Double? = null,
    @Json(name = "BAM") val BAM: Double? = null,
    @Json(name = "BBD") val BBD: Double? = null,
    @Json(name = "BDT") val BDT: Double? = null,
    @Json(name = "BGN") val BGN: Double? = null,
    @Json(name = "BHD") val BHD: Double? = null,
    @Json(name = "BIF") val BIF: Double? = null,
    @Json(name = "BMD") val BMD: Double? = null,
    @Json(name = "BND") val BND: Double? = null,
    @Json(name = "BOB") val BOB: Double? = null,
    @Json(name = "BRL") val BRL: Double? = null,
    @Json(name = "BSD") val BSD: Double? = null,
    @Json(name = "BTC") val BTC: Double? = null,
    @Json(name = "BTN") val BTN: Double? = null,
    @Json(name = "BWP") val BWP: Double? = null,
    @Json(name = "BYN") val BYN: Double? = null,
    @Json(name = "BYR") val BYR: Double? = null,
    @Json(name = "BZD") val BZD: Double? = null,
    @Json(name = "CAD") val CAD: Double? = null,
    @Json(name = "CDF") val CDF: Double? = null,
    @Json(name = "CHF") val CHF: Double? = null,
    @Json(name = "CLF") val CLF: Double? = null,
    @Json(name = "CLP") val CLP: Double? = null,
    @Json(name = "CNY") val CNY: Double? = null,
    @Json(name = "COP") val COP: Double? = null,
    @Json(name = "CRC") val CRC: Double? = null,
    @Json(name = "CUC") val CUC: Double? = null,
    @Json(name = "CUP") val CUP: Double? = null,
    @Json(name = "CVE") val CVE: Double? = null,
    @Json(name = "CZK") val CZK: Double? = null,
    @Json(name = "DJF") val DJF: Double? = null,
    @Json(name = "DKK") val DKK: Double? = null,
    @Json(name = "DOP") val DOP: Double? = null,
    @Json(name = "DZD") val DZD: Double? = null,
    @Json(name = "EGP") val EGP: Double? = null,
    @Json(name = "ERN") val ERN: Double? = null,
    @Json(name = "ETB") val ETB: Double? = null,
    @Json(name = "EUR") val EUR: Double? = null,
    @Json(name = "FJD") val FJD: Double? = null,
    @Json(name = "FKP") val FKP: Double? = null,
    @Json(name = "GBP") val GBP: Double? = null,
    @Json(name = "GEL") val GEL: Double? = null,
    @Json(name = "GGP") val GGP: Double? = null,
    @Json(name = "GHS") val GHS: Double? = null,
    @Json(name = "GIP") val GIP: Double? = null,
    @Json(name = "GMD") val GMD: Double? = null,
    @Json(name = "GNF") val GNF: Double? = null,
    @Json(name = "GTQ") val GTQ: Double? = null,
    @Json(name = "GYD") val GYD: Double? = null,
    @Json(name = "HKD") val HKD: Double? = null,
    @Json(name = "HNL") val HNL: Double? = null,
    @Json(name = "HRK") val HRK: Double? = null,
    @Json(name = "HTG") val HTG: Double? = null,
    @Json(name = "HUF") val HUF: Double? = null,
    @Json(name = "IDR") val IDR: Double? = null,
    @Json(name = "ILS") val ILS: Double? = null,
    @Json(name = "IMP") val IMP: Double? = null,
    @Json(name = "INR") val INR: Double? = null,
    @Json(name = "IQD") val IQD: Double? = null,
    @Json(name = "IRR") val IRR: Double? = null,
    @Json(name = "ISK") val ISK: Double? = null,
    @Json(name = "JEP") val JEP: Double? = null,
    @Json(name = "JMD") val JMD: Double? = null,
    @Json(name = "JOD") val JOD: Double? = null,
    @Json(name = "JPY") val JPY: Double? = null,
    @Json(name = "KES") val KES: Double? = null,
    @Json(name = "KGS") val KGS: Double? = null,
    @Json(name = "KHR") val KHR: Double? = null,
    @Json(name = "KMF") val KMF: Double? = null,
    @Json(name = "KPW") val KPW: Double? = null,
    @Json(name = "KRW") val KRW: Double? = null,
    @Json(name = "KWD") val KWD: Double? = null,
    @Json(name = "KYD") val KYD: Double? = null,
    @Json(name = "KZT") val KZT: Double? = null,
    @Json(name = "LAK") val LAK: Double? = null,
    @Json(name = "LBP") val LBP: Double? = null,
    @Json(name = "LKR") val LKR: Double? = null,
    @Json(name = "LRD") val LRD: Double? = null,
    @Json(name = "LSL") val LSL: Double? = null,
    @Json(name = "LTL") val LTL: Double? = null,
    @Json(name = "LVL") val LVL: Double? = null,
    @Json(name = "LYD") val LYD: Double? = null,
    @Json(name = "MAD") val MAD: Double? = null,
    @Json(name = "MDL") val MDL: Double? = null,
    @Json(name = "MGA") val MGA: Double? = null,
    @Json(name = "MKD") val MKD: Double? = null,
    @Json(name = "MMK") val MMK: Double? = null,
    @Json(name = "MNT") val MNT: Double? = null,
    @Json(name = "MOP") val MOP: Double? = null,
    @Json(name = "MRO") val MRO: Double? = null,
    @Json(name = "MUR") val MUR: Double? = null,
    @Json(name = "MVR") val MVR: Double? = null,
    @Json(name = "MWK") val MWK: Double? = null,
    @Json(name = "MXN") val MXN: Double? = null,
    @Json(name = "MYR") val MYR: Double? = null,
    @Json(name = "MZN") val MZN: Double? = null,
    @Json(name = "NAD") val NAD: Double? = null,
    @Json(name = "NGN") val NGN: Double? = null,
    @Json(name = "NIO") val NIO: Double? = null,
    @Json(name = "NOK") val NOK: Double? = null,
    @Json(name = "NPR") val NPR: Double? = null,
    @Json(name = "NZD") val NZD: Double? = null,
    @Json(name = "OMR") val OMR: Double? = null,
    @Json(name = "PAB") val PAB: Double? = null,
    @Json(name = "PEN") val PEN: Double? = null,
    @Json(name = "PGK") val PGK: Double? = null,
    @Json(name = "PHP") val PHP: Double? = null,
    @Json(name = "PKR") val PKR: Double? = null,
    @Json(name = "PLN") val PLN: Double? = null,
    @Json(name = "PYG") val PYG: Double? = null,
    @Json(name = "QAR") val QAR: Double? = null,
    @Json(name = "RON") val RON: Double? = null,
    @Json(name = "RSD") val RSD: Double? = null,
    @Json(name = "RUB") val RUB: Double? = null,
    @Json(name = "RWF") val RWF: Double? = null,
    @Json(name = "SAR") val SAR: Double? = null,
    @Json(name = "SBD") val SBD: Double? = null,
    @Json(name = "SCR") val SCR: Double? = null,
    @Json(name = "SDG") val SDG: Double? = null,
    @Json(name = "SEK") val SEK: Double? = null,
    @Json(name = "SGD") val SGD: Double? = null,
    @Json(name = "SHP") val SHP: Double? = null,
    @Json(name = "SLL") val SLL: Double? = null,
    @Json(name = "SOS") val SOS: Double? = null,
    @Json(name = "SRD") val SRD: Double? = null,
    @Json(name = "STD") val STD: Double? = null,
    @Json(name = "SVC") val SVC: Double? = null,
    @Json(name = "SYP") val SYP: Double? = null,
    @Json(name = "SZL") val SZL: Double? = null,
    @Json(name = "THB") val THB: Double? = null,
    @Json(name = "TJS") val TJS: Double? = null,
    @Json(name = "TMT") val TMT: Double? = null,
    @Json(name = "TND") val TND: Double? = null,
    @Json(name = "TOP") val TOP: Double? = null,
    @Json(name = "TRY") val TRY: Double? = null,
    @Json(name = "TTD") val TTD: Double? = null,
    @Json(name = "TWD") val TWD: Double? = null,
    @Json(name = "TZS") val TZS: Double? = null,
    @Json(name = "UAH") val UAH: Double? = null,
    @Json(name = "UGX") val UGX: Double? = null,
    @Json(name = "USD") val USD: Double? = null,
    @Json(name = "UYU") val UYU: Double? = null,
    @Json(name = "UZS") val UZS: Double? = null,
    @Json(name = "VEF") val VEF: Double? = null,
    @Json(name = "VND") val VND: Double? = null,
    @Json(name = "VUV") val VUV: Double? = null,
    @Json(name = "WST") val WST: Double? = null,
    @Json(name = "XAF") val XAF: Double? = null,
    @Json(name = "XAG") val XAG: Double? = null,
    @Json(name = "XAU") val XAU: Double? = null,
    @Json(name = "XCD") val XCD: Double? = null,
    @Json(name = "XDR") val XDR: Double? = null,
    @Json(name = "XOF") val XOF: Double? = null,
    @Json(name = "XPF") val XPF: Double? = null,
    @Json(name = "YER") val YER: Double? = null,
    @Json(name = "ZAR") val ZAR: Double? = null,
    @Json(name = "ZMK") val ZMK: Double? = null,
    @Json(name = "ZMW") val ZMW: Double? = null,
    @Json(name = "ZWL") val ZWL: Double? = null
) {
    /**
     * Multi-cursor formatted list
     */
    fun toList() = listOf(
        "AED" to AED,
        "AFN" to AFN,
        "ALL" to ALL,
        "AMD" to AMD,
        "ANG" to ANG,
        "AOA" to AOA,
        "ARS" to ARS,
        "AUD" to AUD,
        "AWG" to AWG,
        "AZN" to AZN,
        "BAM" to BAM,
        "BBD" to BBD,
        "BDT" to BDT,
        "BGN" to BGN,
        "BHD" to BHD,
        "BIF" to BIF,
        "BMD" to BMD,
        "BND" to BND,
        "BOB" to BOB,
        "BRL" to BRL,
        "BSD" to BSD,
        "BTC" to BTC,
        "BTN" to BTN,
        "BWP" to BWP,
        "BYN" to BYN,
        "BYR" to BYR,
        "BZD" to BZD,
        "CAD" to CAD,
        "CDF" to CDF,
        "CHF" to CHF,
        "CLF" to CLF,
        "CLP" to CLP,
        "CNY" to CNY,
        "COP" to COP,
        "CRC" to CRC,
        "CUC" to CUC,
        "CUP" to CUP,
        "CVE" to CVE,
        "CZK" to CZK,
        "DJF" to DJF,
        "DKK" to DKK,
        "DOP" to DOP,
        "DZD" to DZD,
        "EGP" to EGP,
        "ERN" to ERN,
        "ETB" to ETB,
        "EUR" to EUR,
        "FJD" to FJD,
        "FKP" to FKP,
        "GBP" to GBP,
        "GEL" to GEL,
        "GGP" to GGP,
        "GHS" to GHS,
        "GIP" to GIP,
        "GMD" to GMD,
        "GNF" to GNF,
        "GTQ" to GTQ,
        "GYD" to GYD,
        "HKD" to HKD,
        "HNL" to HNL,
        "HRK" to HRK,
        "HTG" to HTG,
        "HUF" to HUF,
        "IDR" to IDR,
        "ILS" to ILS,
        "IMP" to IMP,
        "INR" to INR,
        "IQD" to IQD,
        "IRR" to IRR,
        "ISK" to ISK,
        "JEP" to JEP,
        "JMD" to JMD,
        "JOD" to JOD,
        "JPY" to JPY,
        "KES" to KES,
        "KGS" to KGS,
        "KHR" to KHR,
        "KMF" to KMF,
        "KPW" to KPW,
        "KRW" to KRW,
        "KWD" to KWD,
        "KYD" to KYD,
        "KZT" to KZT,
        "LAK" to LAK,
        "LBP" to LBP,
        "LKR" to LKR,
        "LRD" to LRD,
        "LSL" to LSL,
        "LTL" to LTL,
        "LVL" to LVL,
        "LYD" to LYD,
        "MAD" to MAD,
        "MDL" to MDL,
        "MGA" to MGA,
        "MKD" to MKD,
        "MMK" to MMK,
        "MNT" to MNT,
        "MOP" to MOP,
        "MRO" to MRO,
        "MUR" to MUR,
        "MVR" to MVR,
        "MWK" to MWK,
        "MXN" to MXN,
        "MYR" to MYR,
        "MZN" to MZN,
        "NAD" to NAD,
        "NGN" to NGN,
        "NIO" to NIO,
        "NOK" to NOK,
        "NPR" to NPR,
        "NZD" to NZD,
        "OMR" to OMR,
        "PAB" to PAB,
        "PEN" to PEN,
        "PGK" to PGK,
        "PHP" to PHP,
        "PKR" to PKR,
        "PLN" to PLN,
        "PYG" to PYG,
        "QAR" to QAR,
        "RON" to RON,
        "RSD" to RSD,
        "RUB" to RUB,
        "RWF" to RWF,
        "SAR" to SAR,
        "SBD" to SBD,
        "SCR" to SCR,
        "SDG" to SDG,
        "SEK" to SEK,
        "SGD" to SGD,
        "SHP" to SHP,
        "SLL" to SLL,
        "SOS" to SOS,
        "SRD" to SRD,
        "STD" to STD,
        "SVC" to SVC,
        "SYP" to SYP,
        "SZL" to SZL,
        "THB" to THB,
        "TJS" to TJS,
        "TMT" to TMT,
        "TND" to TND,
        "TOP" to TOP,
        "TRY" to TRY,
        "TTD" to TTD,
        "TWD" to TWD,
        "TZS" to TZS,
        "UAH" to UAH,
        "UGX" to UGX,
        "USD" to USD,
        "UYU" to UYU,
        "UZS" to UZS,
        "VEF" to VEF,
        "VND" to VND,
        "VUV" to VUV,
        "WST" to WST,
        "XAF" to XAF,
        "XAG" to XAG,
        "XAU" to XAU,
        "XCD" to XCD,
        "XDR" to XDR,
        "XOF" to XOF,
        "XPF" to XPF,
        "YER" to YER,
        "ZAR" to ZAR,
        "ZMK" to ZMK,
        "ZMW" to ZMW,
        "ZWL" to ZWL
    )
}