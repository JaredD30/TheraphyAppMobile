package pe.edu.upc.digitalholics.theraphy.model

data class Review(

    val id: String,
    val stars: String,
    val description: String,
    val patient: Patient,
    val physiotherapist: Physiotherapist

)

