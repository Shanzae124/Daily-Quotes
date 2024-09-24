package com.example.dailyquotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailyquotes.data.Dailyquotes
import com.example.dailyquotes.data.dailyquotes
import com.example.dailyquotes.ui.theme.DailyQuotesTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DailyQuotesTheme {
                DailyQuotesApp()
            }
        }
    }
}
@Composable
fun DailyQuotesApp(){
Scaffold(
    topBar = { DailyQuotesTopBar(modifier = Modifier.background(color = MaterialTheme.colors.background)) }
) {
    LazyColumn(
        modifier = Modifier
        .background(MaterialTheme.colors.background)
        .fillMaxSize().fillMaxHeight()
            .wrapContentWidth(Alignment.CenterHorizontally)){
        items(dailyquotes){
        DailyQuotesScreen(dailyquotes = it)
        }
    }
}
}
@Composable
fun DailyQuotesTopBar(modifier: Modifier = Modifier){
    Text(text = stringResource(id = R.string.app_name),
        modifier = modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally),
        style = MaterialTheme.typography.h1    )
}
@Composable
fun DailyQuotesScreen(dailyquotes: Dailyquotes , modifier: Modifier = Modifier){
    var expanded by remember {
        mutableStateOf(false)
    }
    Column(modifier = modifier
        .background(color = MaterialTheme.colors.background)
        .padding(start = 16.dp)
        .fillMaxWidth()
        .fillMaxHeight()
        .animateContentSize(
            animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
            ))) {
        Text(
            text = stringResource(id = dailyquotes.day),
            style = MaterialTheme.typography.h1,
        )
        Image(
            painter = painterResource(id = dailyquotes.imageResourceId),
            contentDescription = null,
            modifier = modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .clip(RoundedCornerShape(24.dp))
        )
        DailyQuotesButton(expanded = expanded, onClick = {expanded = !expanded})
        if(expanded)
            ReadableDailyQuotes(quotes = dailyquotes.stringResourceId)
        Row() {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Previous")
            }
            Spacer(modifier = modifier.weight(1F))
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Next")

            } }
        }
    }


@Composable
fun ReadableDailyQuotes(@StringRes quotes:Int){
    Column() {

    Text(text = "Quote Of the Day",
        style = MaterialTheme.typography.body1
    )
    Text(text = stringResource(id = quotes),
    style = MaterialTheme.typography.body2
        )
}}
@Composable
private fun DailyQuotesButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(onClick = onClick) {
        Icon( imageVector = if(expanded)Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
            tint = MaterialTheme.colors.secondary,
            contentDescription = stringResource(id = R.string.expand_button_content_description),
            modifier = modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
    }
}
@Preview
@Composable
fun DailyQuotesAppPreview(){
    DailyQuotesTheme(darkTheme = false) {
        DailyQuotesApp()
    }
}
