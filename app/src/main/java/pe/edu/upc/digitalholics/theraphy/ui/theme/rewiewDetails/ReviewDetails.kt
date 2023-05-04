package pe.edu.upc.digitalholics.theraphy.ui.theme.rewiewDetails


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.upc.digitalholics.theraphy.R


@Composable
fun PhysiotherapistProfile() {

    val videos = 45
    val appointments = 45

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        //Text("Physiotherapist's Profile", fontWeight = FontWeight.Bold)
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = { /* Go back */ },
                modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Go back"
                )
            }
            Text(
                text = "Physiotherapist's Profile",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )
        }
        Image(
            painter = painterResource(R.drawable.physiotherapist),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(230.dp)
                .align(CenterHorizontally)

        )
        Text("Dr. Cristhian Gomez", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            if (appointments > 20) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_groups_24),
                        contentDescription = "Appointments",
                        tint = Color.Gray,
                        modifier = Modifier.size(24.dp)
                    )
                    Text("20+", color = Color.Gray, fontWeight = FontWeight.Bold)
                }
            } else {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_groups_24),
                        contentDescription = "Appointments",
                        tint = Color.Gray,
                        modifier = Modifier.size(24.dp)
                    )
                    Text("$appointments", color = Color.Gray, fontWeight = FontWeight.Bold)
                }
            }
            if (videos > 15) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_video_library_24),
                        contentDescription = "Videos",
                        tint = Color.Gray,
                        modifier = Modifier.size(24.dp)
                    )
                    Text("15+", color = Color.Gray, fontWeight = FontWeight.Bold)
                }
            } else {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_video_library_24),
                        contentDescription = "Videos",
                        tint = Color.Gray,
                        modifier = Modifier.size(24.dp)
                    )
                    Text("$videos", color = Color.Gray, fontWeight = FontWeight.Bold)
                }
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(R.drawable.baseline_star_24),
                    contentDescription = "Stars",
                    tint = Color.Gray,
                    modifier = Modifier.size(24.dp)
                )
                Text("4.5", color = Color.Gray, fontWeight = FontWeight.Bold)
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text("Reviews", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(10.dp))
        Column {
            PatientReview(
                "Jhon Doe",
                R.drawable.patient1,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            )
            Spacer(modifier = Modifier.height(8.dp))
            PatientReview(
                "Will Smith",
                R.drawable.patient2,
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
            )
        }
        Spacer(modifier = Modifier.height(45.dp))
        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { /* Add review */ },
                modifier = Modifier.align(Alignment.CenterStart)
            ) {
                Text("Add Review")
            }
            Button(
                onClick = { /* Make appointment */ },
                modifier = Modifier.align(Alignment.CenterEnd)
            ) {
                Text("Make Appointment")
            }
        }

        Spacer(modifier = Modifier.height(25.dp))

        Box(modifier = Modifier
            .fillMaxWidth()
            .border(3.dp, Color.Magenta),contentAlignment = Alignment.Center
        ) {
            Row(modifier = Modifier.padding(1.dp)) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = null)
                }
                Spacer(modifier = Modifier.width(30.dp))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.AccountBox, contentDescription = null)
                }
                Spacer(modifier = Modifier.width(30.dp))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Info, contentDescription = null)
                }
                Spacer(modifier = Modifier.width(30.dp))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.List, contentDescription = null)
                }
                Spacer(modifier = Modifier.width(30.dp))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Face, contentDescription = null)
                }
            }
        }

    }

}

@Composable
fun PatientReview(name: String, image: Int, comment: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(image),
            contentDescription = "Patient Picture",
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(name, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(4.dp))
            Text(comment)
        }
    }
}


