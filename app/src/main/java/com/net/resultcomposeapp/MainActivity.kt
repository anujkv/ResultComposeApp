package com.net.resultcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
                CustomToolbar(
                    title = stringResource(id = R.string.app_name),
                    onBackClick = { finish() }
                )
//                ProfileCard()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomToolbar(
    title: String,
    onBackClick: () -> Unit
) {
    Scaffold(
        topBar = {
    TopAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.horizontalGradient(
                    listOf(Color(0xFF00BCD4), Color(0xFF3F51B5))
                )
            ),
        title = {
            Text(
                text = title,
                color = Color.White,
                style = MaterialTheme.typography.titleLarge
            )
        },
        navigationIcon = {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_back),
                contentDescription = "Back",
                tint = Color.White,
                modifier = Modifier
                    .clickable(onClick = onBackClick)
                    .padding(16.dp)
            )
        },
        colors = androidx.compose.material3.TopAppBarDefaults.smallTopAppBarColors(
            containerColor = Color.Transparent // Use transparent to let gradient show
        )
    )
        }
            ){
            innerPadding ->
        innerPadding.calculateTopPadding()
        ProfileCard()
    }
}

@Composable
fun SetGPA(value: String) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 20.dp, end = 20.dp), ){
        Text(text = "GPA", fontSize = 16.sp, fontWeight = FontWeight.Bold,
            textAlign = TextAlign.End,
            modifier = Modifier
                .weight(0.8f)
                .align(Alignment.CenterVertically)
                .padding(end = 20.dp))
        Text(text = value, fontSize = 16.sp, fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .weight(0.2f)
                .align(Alignment.CenterVertically))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileCard() {

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 80.dp, bottom = 50.dp),
        color = MaterialTheme.colorScheme.background
    ) {
        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
                .verticalScroll(scrollState)
            ,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier.padding(20.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(CircleShape),
                    painter = painterResource(id = R.drawable.ic_school_logo),
                    contentDescription = "SchoolPicture"
                )

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
                        text = "R.K Puram, Ashram Road, Delhi"
                    )
                }
            }

            /*Performance Profile Start----------*/
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue
            )

            Text(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 8.dp, bottom = 8.dp),
                fontWeight = FontWeight.Bold,
                text = "Performance Profile",
                fontSize = 18.sp,
                color = Color.Blue,
            )

            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 20.dp,
                        top = 10.dp,
                        bottom = 10.dp
                    )
            ) {
                Image(
                    modifier = Modifier.size(50.dp),
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = "User Logo"
                )
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

            Row(
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {

                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Roll Number"
                )
                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-"
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue
            )
            Row(
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {

                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Date of Birth"
                )
                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-"
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue
            )
            Row(
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {

                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Blood Group"
                )
                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-"
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue
            )
            Row(
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {

                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Contact"
                )
                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-"
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue
            )
            Row(
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {

                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Class"
                )
                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-"
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue
            )
            Row(
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {

                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Father's Name"
                )
                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-"
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue
            )
            Row(
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
                    .fillMaxWidth()
            ) {

                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "Mother's Name"
                )
                Text(
                    modifier = Modifier.weight(0.5f), fontWeight = FontWeight.Bold,
                    color = Color.DarkGray,
                    text = "-"
                )
            }
            /*Performance Profile End----------*/

            /*Academic Profile Start----------*/

            HorizontalDivider(
                modifier = Modifier
                    .padding(top = 20.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue
            )

            Text(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 8.dp, bottom = 8.dp),
                fontWeight = FontWeight.Bold,
                text = "Academic Profile",
                fontSize = 18.sp,
                color = Color.Blue,
            )

            HorizontalDivider(
                modifier = Modifier
                    .padding(2.dp)
                    .height(2.dp)
                    .fillMaxWidth(),
                color = Color.Blue
            )
            ShowTerm("Term I")
            SetGPA(value = "9.45")
            ShowTerm("Term II")
            SetGPA(value = "9.45")
            ShowTerm("Final Term")
            SetGPA(value = "9.45")

            SetRemarks(remarks = stringResource(id = R.string.remarks))
            /*Academic Profile End----------*/

            SetPrincipleSignature(principle = stringResource(id = R.string.principle_signature))
        }

    }

}

@Composable
fun SetPrincipleSignature(principle: String) {
    Text(
        modifier = Modifier
            .padding(start = 10.dp, top = 10.dp, bottom = 10.dp)
            .fillMaxWidth(),
        text = "- $principle",
        fontSize = 16.sp,
        color = Color.DarkGray,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun SetRemarks(remarks: String) {
    Text(
        text = "Remarks By ClassTeacher",
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        modifier = Modifier
            .padding(start = 20.dp, top = 10.dp, bottom = 10.dp)
            .fillMaxWidth()
    )
    Surface (modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth(),
        color = Color.Magenta,
        shape = RoundedCornerShape(15.dp), shadowElevation = 15.dp){
            Text(text = remarks, modifier = Modifier.padding(20.dp), color = Color.Red)
    }
}

@Composable
fun ShowTerm(term: String) {
    Text(
        modifier = Modifier
            .padding(start = 10.dp, top = 10.dp, bottom = 10.dp)
            .fillMaxWidth(),
        text = term,
        fontSize = 16.sp,
        color = Color.DarkGray,
        fontWeight = FontWeight.Bold
    )

    Surface(
        shadowElevation = 5.dp,
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .background(Color.White),
        color = Color.Cyan
    ) {
        Column {

            Row(
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Subject",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(0.3f)
                )
                Text(
                    text = "Qtr 1",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(0.2f)
                )
                Text(
                    text = "Qtr 2",
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(0.2f)
                )
                Text(
                    text = term,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(0.2f)
                )
            }
            ShowSubjectList(subjectList())
        }
    }
}

@Composable
fun ShowSubjectList(subjectList: List<Subject>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .requiredHeight(270.dp),
        userScrollEnabled = false,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        items(subjectList.size) { item ->
            println(getColor(item))
            SubjectItem(subjectList[item])
        }
    }
}

fun getColor(item: Int): Color {
    if (item == 0) {
        return Color.LightGray
    }else if(item%2==0){
        return Color.Cyan
    }else{
        return Color.LightGray

    }
}

@Composable
fun SubjectItem(subject: Subject) {
    Row(
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = subject.subject,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.weight(0.3f)
        )
        Text(
            text = subject.qtr1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(0.2f)
                .padding(start = 5.dp)
        )
        Text(
            text = subject.qtr2,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(0.2f)
                .padding(start = 5.dp)
        )
        Text(
            text = subject.term,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(0.2f)
                .padding(start = 15.dp)
        )
    }
}

data class Subject(val subject: String, val qtr1: String, val qtr2: String, val term: String)

@Composable
fun subjectList(): List<Subject> {
    return listOf(
        Subject("Maths", "60", "72", "65"),
        Subject("English", "60", "72", "65"),
        Subject("Hindi", "60", "72", "65"),
        Subject("Science", "60", "72", "65"),
        Subject("Social Science", "60", "72", "65")
    )

}


@Preview
@Composable
fun ProfileCardPreview() {
    ProfileCard()
}
