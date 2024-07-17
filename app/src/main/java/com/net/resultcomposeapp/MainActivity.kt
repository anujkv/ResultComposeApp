package com.net.resultcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.net.resultcomposeapp.ui.theme.ResultComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ResultComposeAppTheme {
                ProfileCard()
            }
        }
    }
}

@Composable
fun ProfileCard(){
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column (
            modifier = Modifier.padding(20.dp)
        ){
            Row (
                modifier = Modifier.padding(20.dp),
                horizontalArrangement = Arrangement.Center){
                Image(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    painter = painterResource(id = R.drawable.ic_school_logo),
                    contentDescription = "SchoolPicture" )

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        modifier = Modifier
                            .padding(start = 10.dp, top = 10.dp)
                            .align(Alignment.Start),
                        fontWeight = FontWeight.Bold,
                        text = "Delhi Public School",
                        fontSize = 16.sp,
                        color = Color.Blue
                    )
                    Text(
                        modifier = Modifier.padding(start = 10.dp),
                        text = "R.K Puram, Ashram Road, Delhi")


                }

            }

            /*Performance Profile Start----------*/
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue)
            
            Text(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 8.dp, bottom = 8.dp), fontWeight = FontWeight.Bold,
                text = "Performance Profile",
                fontSize = 18.sp,
                color = Color.Blue,
            )

            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue)

            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    top = 10.dp,
                    bottom = 10.dp
                )){
                Image(
                    modifier = Modifier.size(50.dp),
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = "User Logo")
                Column {
                    Text(
                        modifier = Modifier
                            .padding(start = 10.dp, top = 10.dp)
                            .fillMaxWidth(),
                        fontWeight = FontWeight.Bold,
                        color = Color.Blue,
                        text = "Shreye Sharma",
                        fontSize = 16.sp
                    )

                    Text(
                        modifier = Modifier
                            .padding(start = 10.dp),
                        text = "Class IX - C"
                    )
                }

            }

            Row (
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()){

                Text(
                    modifier = Modifier.weight(0.5f)
                        , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Roll Number")
                Text(
                    modifier = Modifier.weight(0.5f)
                    , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-")
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue)
            Row (
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()){

                Text(
                    modifier = Modifier.weight(0.5f)
                    , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Date of Birth")
                Text(
                    modifier = Modifier.weight(0.5f)
                    , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-")
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue)
            Row (
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()){

                Text(
                    modifier = Modifier.weight(0.5f)
                    , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Blood Group")
                Text(
                    modifier = Modifier.weight(0.5f)
                    , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-")
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue)
            Row (
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()){

                Text(
                    modifier = Modifier.weight(0.5f)
                    , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Contact")
                Text(
                    modifier = Modifier.weight(0.5f)
                    , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-")
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue)
            Row (
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()){

                Text(
                    modifier = Modifier.weight(0.5f)
                    , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Class")
                Text(
                    modifier = Modifier.weight(0.5f)
                    , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-")
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue)
            Row (
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()){

                Text(
                    modifier = Modifier.weight(0.5f)
                    , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Father's Name")
                Text(
                    modifier = Modifier.weight(0.5f)
                    , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-")
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue)
            Row (
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()){

                Text(
                    modifier = Modifier.weight(0.5f)
                    , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Mother's Name")
                Text(
                    modifier = Modifier.weight(0.5f)
                    , fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-")
            }
            /*Performance Profile End----------*/

            /*Academic Profile Start----------*/

            HorizontalDivider(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue)

            Text(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 8.dp, bottom = 8.dp), fontWeight = FontWeight.Bold,
                text = "Academic Profile",
                fontSize = 18.sp,
                color = Color.Blue,
            )

            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue)

            /*Term1 Heading Start----------*/

            Text(
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth(),
                text = "Term I",
                fontSize = 16.sp,
                color = Color.DarkGray,
                fontWeight = FontWeight.Bold
            )
            /*Term1 Heading End----------*/

            /*Term1 CardView(Surface) Start----------*/
            Surface (
                shadowElevation = 5.dp,
                shape = RoundedCornerShape(15.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
                    .background(Color.White),
                color =  Color.Cyan
            ){
                Row(
                    modifier = Modifier
                        .padding(15.dp)
                        .fillMaxWidth()
                ){
                    Text(
                        text = "Subject",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(0.3f))
                    Text(
                        text = "Qtr 1",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(0.2f))
                    Text(
                        text = "Qtr 2",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(0.2f))
                    Text(
                        text = "Term 1",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(0.2f))
                }
                /*Term1 Subject List Start----------*/
                subjectList()
                /*Term1 Subject List End----------*/

                /*Term1 Subject End----------*/


            }

            /*Academic Profile Start----------*/
            /*Term1 CardView(Surface) End----------*/
        }

    }
}

data class Subject(val subject:String, val qtr1:String, val qtr2:String, val term:String)

@Composable
fun subjectList(): List<Subject> {
    return listOf(
        Subject("Maths", "60","72","65"),
        Subject("Maths", "60","72","65"),
        Subject("Maths", "60","72","65"),
        Subject("Maths", "60","72","65"),
        Subject("Maths", "60","72","65")
    )
    
}


@Preview
@Composable
fun ProfileCardPreview(){
    ProfileCard()
}
