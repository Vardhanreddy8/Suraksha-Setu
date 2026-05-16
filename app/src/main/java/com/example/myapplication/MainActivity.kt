package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SafetyDashboard(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun SafetyDashboard(modifier: Modifier = Modifier) {
    val contacts = listOf(
        SafetyContact("Police", "100", "Emergency response"),
        SafetyContact("Ambulance", "108", "Medical emergency"),
        SafetyContact("Women Helpline", "1091", "Safety support")
    )

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF6F8FB))
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item { HeaderSection() }
        item { EmergencyAction() }
        item {
            Text(
                text = "Quick Help",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF18212F)
            )
        }
        items(contacts) { contact ->
            ContactRow(contact = contact)
        }
        item { SafetyChecklist() }
    }
}

@Composable
private fun HeaderSection() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            text = "Suraksha Setu",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0F766E)
        )
        Text(
            text = "A safety companion for emergency contact access, check-ins, and quick response support.",
            fontSize = 16.sp,
            color = Color(0xFF5C677A)
        )
    }
}

@Composable
private fun EmergencyAction() {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color(0xFFE6F5F2)),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(18.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "Emergency Alert",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0F4F49)
            )
            Text(
                text = "Share your current status with trusted contacts and keep emergency numbers ready.",
                color = Color(0xFF335C59)
            )
            Button(onClick = { }) {
                Text("Send Safety Alert")
            }
        }
    }
}

@Composable
private fun ContactRow(contact: SafetyContact) {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Surface(
                modifier = Modifier
                    .size(46.dp)
                    .clip(CircleShape),
                color = Color(0xFF0F766E)
            ) {
                Text(
                    text = contact.number,
                    modifier = Modifier.padding(10.dp),
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp
                )
            }
            Column {
                Text(
                    text = contact.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF18212F)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = contact.description,
                    color = Color(0xFF5C677A)
                )
            }
        }
    }
}

@Composable
private fun SafetyChecklist() {
    Card(
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(
                text = "Safety Checklist",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF18212F)
            )
            ChecklistItem("Keep location services enabled")
            ChecklistItem("Add at least two trusted contacts")
            ChecklistItem("Use emergency numbers only when needed")
        }
    }
}

@Composable
private fun ChecklistItem(text: String) {
    Row {
        Text(text = "-", color = Color(0xFF0F766E), fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text, color = Color(0xFF5C677A))
    }
}

private data class SafetyContact(
    val name: String,
    val number: String,
    val description: String
)

@Preview(showBackground = true)
@Composable
fun SafetyDashboardPreview() {
    MyApplicationTheme {
        SafetyDashboard()
    }
}
