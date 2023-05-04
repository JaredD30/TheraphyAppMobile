package pe.edu.upc.digitalholics.theraphy.model

data class Patient(
    val id: String,
    val firstName: String,
    val lastName: String,
    val age: String,
    val birthdayDate: String,
    val email: String,
    val appointmentQuantity: String,
    val photoUrl: String
)
