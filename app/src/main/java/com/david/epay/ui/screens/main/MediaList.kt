package com.david.epay.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.david.epay.domain.model.Coordinate
import com.david.epay.domain.model.Recipe

@ExperimentalFoundationApi
@Composable
fun MediaList(
    onClick: (Recipe)
    //,modifier: Modifier = Modifier
) {
    /*
    LazyVerticalGrid(
        cells = GridCells.Adaptive(dimensionResource(10.dp),
        contentPadding = PaddingValues(4.dp),
        modifier = modifier
    ) {
        items(getMedia()) {
            MediaListItem(
                recipe = it,
                onClick = { onClick(it) },
                modifier = Modifier.padding(4.dp)
            )
        }
    }

     */
}

@Composable
fun MediaListItem(
    recipe: Recipe,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.clickable { onClick() }
    ) {
        Column {
            //Thumb(mediaItem)
            Title(recipe)
        }
    }
}

@Composable
private fun Title(recipe: Recipe) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.secondary)
            .padding(10.dp)
    ) {
        Text(
            text = recipe.name,
            style = MaterialTheme.typography.h6
        )
    }
}

@Preview
@Composable
fun MediaListItemPreview() {
    val mediaItem = Recipe("Recipe example", "Item 1", "", Coordinate(36.26577,-92.54324))
    MediaListItem(recipe = mediaItem, onClick = {})
}